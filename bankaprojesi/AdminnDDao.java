package com.ecodation.bankaprojesi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AdminnDDao implements IdaaooImplement<AdmiinnDtoo> {

	@Override
	public void create(AdmiinnDtoo dto) {
		// TODO Auto-generated method stub
		try (Connection connection = getInterfaceConnection()) {
			String sql = "insert admins (admin_name,admin_surname,admin_password,admin_email) values (?,?,?,?); ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, dto.getAdminName());
			preparedStatement.setString(2, dto.getAdminSurname());
			preparedStatement.setString(3, dto.getAdminPassword());
			preparedStatement.setString(4, dto.getAdminEmail());
			int rowsEfected = preparedStatement.executeUpdate();
			if (rowsEfected > 0) {
				System.out.println(AdmiinnDtoo.class + " Ba�ar�l� bir �ekilde eklendi.");
			} else {
				System.out.println("AdminDto eklemede s�k�nt� var .....");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(AdmiinnDtoo dto) {
		// TODO Auto-generated method stub
		try (Connection connection = getInterfaceConnection()) {
			String sql = "update admins set admin_name=?,admin_surname=?,admin_password=?,admin_email=? where admin_id=? ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, dto.getAdminName());
			preparedStatement.setString(2, dto.getAdminSurname());
			preparedStatement.setString(3, dto.getAdminPassword());
			preparedStatement.setString(4, dto.getAdminEmail());
			preparedStatement.setInt(5, dto.getAdminId());
			int rowsEfected = preparedStatement.executeUpdate();
			if (rowsEfected > 0) {
				System.out.println(AdmiinnDtoo.class + " Ba�ar�l� bir �ekilde g�ncellendi.");
			} else {
				System.out.println("AdminDto g�ncelleme s�k�nt� var .....");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(AdmiinnDtoo dto) {
		// TODO Auto-generated method stub
		try (Connection connection = getInterfaceConnection()) {
			String sql = "delete from  admins  where admin_id=? ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, dto.getAdminId());
			int rowsEfected = preparedStatement.executeUpdate();
			if (rowsEfected > 0) {
				System.out.println(AdmiinnDtoo.class + " Ba�ar�l� bir �ekilde silindi.");
			} else {
				System.out.println("AdminDto silmede s�k�nt� var .....");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<AdmiinnDtoo> list() {
		AdmiinnDtoo adminDto;
		ArrayList<AdmiinnDtoo> list = new ArrayList<AdmiinnDtoo>();
		try (Connection connection = getInterfaceConnection()) {
			String sql = "select * from  admins";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				adminDto = new AdmiinnDtoo();
				adminDto.setAdminId(resultSet.getInt("admin_id"));
				adminDto.setAdminName(resultSet.getString("admin_name"));
				adminDto.setAdminSurname(resultSet.getString("admin_surname"));
				adminDto.setAdminEmail(resultSet.getString("admin_email"));
				adminDto.setAdminPassword(resultSet.getString("admin_password"));
				adminDto.setTarih(resultSet.getDate("creation_date"));
				list.add(adminDto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public static void main(String[] args) {
		AdminnDDao dao = new AdminnDDao();

		// AdmiinnDtoo dto = new AdmiinnDtoo(1, "Nese", "erevciler", "dfge",
		// "alim.9567@göail.com");
		// dao.create(dto);
		// AdmiinnDtoo dto1 = new AdmiinnDtoo(2, "MERYEM", "Erbil", "sifre",
		// "nese.9567@gmail.com");
		// dao.create(dto1);

		// AdmiinnDtoo dto2 = new AdmiinnDtoo(2, "Nese", "erbil", "sifrem",
		// "nese.9567@gmail.com");
		// dto2.setAdminId(2);
		// dao.update(dto2);

		AdmiinnDtoo dto = new AdmiinnDtoo();
		dto.setAdminId(2);
		dao.delete(dto);

		// listeleme
		for (AdmiinnDtoo temp : dao.list()) {
			System.out.println(temp);
		}

	}

}
