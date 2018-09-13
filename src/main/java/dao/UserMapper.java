package dao;

import entity.User;
import entity.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_user
     *
     * @mbg.generated Thu Sep 13 10:42:15 CST 2018
     */
    long countByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_user
     *
     * @mbg.generated Thu Sep 13 10:42:15 CST 2018
     */
    int deleteByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_user
     *
     * @mbg.generated Thu Sep 13 10:42:15 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_user
     *
     * @mbg.generated Thu Sep 13 10:42:15 CST 2018
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_user
     *
     * @mbg.generated Thu Sep 13 10:42:15 CST 2018
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_user
     *
     * @mbg.generated Thu Sep 13 10:42:15 CST 2018
     */
    List<User> selectByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_user
     *
     * @mbg.generated Thu Sep 13 10:42:15 CST 2018
     */
    User selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_user
     *
     * @mbg.generated Thu Sep 13 10:42:15 CST 2018
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_user
     *
     * @mbg.generated Thu Sep 13 10:42:15 CST 2018
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_user
     *
     * @mbg.generated Thu Sep 13 10:42:15 CST 2018
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_user
     *
     * @mbg.generated Thu Sep 13 10:42:15 CST 2018
     */
    int updateByPrimaryKey(User record);
}