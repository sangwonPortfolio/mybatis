package member.model.vo;

import java.io.Serializable;
import java.sql.Date;

/**
 * @author user1
 *
 */
public class Member implements Serializable{

   /**
    * 
    */
   private static final long serialVersionUID = -4952932019676617041L;
   
   private int mid;
   private String userId;
   private String userPwd;
   private String userName;
   private String phone;
   private String email;
   private String address;
   private String interest;
   private Date enrollDate;
   private Date updateDate;
   private String mStatus;
   public Member() {
      super();
   }
   public Member(int mid, String userId, String userPwd, String userName, String phone, String email, String address,
         String interest, Date enrollDate, Date updateDate, String mStatus) {
      super();
      this.mid = mid;
      this.userId = userId;
      this.userPwd = userPwd;
      this.userName = userName;
      this.phone = phone;
      this.email = email;
      this.address = address;
      this.interest = interest;
      this.enrollDate = enrollDate;
      this.updateDate = updateDate;
      this.mStatus = mStatus;
   }
   public int getMid() {
      return mid;
   }
   public void setMid(int mid) {
      this.mid = mid;
   }
   public String getUserId() {
      return userId;
   }
   public void setUserId(String userId) {
      this.userId = userId;
   }
   public String getUserPwd() {
      return userPwd;
   }
   public void setUserPwd(String userPwd) {
      this.userPwd = userPwd;
   }
   public String getUserName() {
      return userName;
   }
   public void setUserName(String userName) {
      this.userName = userName;
   }
   public String getPhone() {
      return phone;
   }
   public void setPhone(String phone) {
      this.phone = phone;
   }
   public String getEmail() {
      return email;
   }
   public void setEmail(String email) {
      this.email = email;
   }
   public String getAddress() {
      return address;
   }
   public void setAddress(String address) {
      this.address = address;
   }
   public String getInterest() {
      return interest;
   }
   public void setInterest(String interest) {
      this.interest = interest;
   }
   public Date getEnrollDate() {
      return enrollDate;
   }
   public void setEnrollDate(Date enrollDate) {
      this.enrollDate = enrollDate;
   }
   public Date getUpdateDate() {
      return updateDate;
   }
   public void setUpdateDate(Date updateDate) {
      this.updateDate = updateDate;
   }
   public String getmStatus() {
      return mStatus;
   }
   public void setmStatus(String mStatus) {
      this.mStatus = mStatus;
   }
   public static long getSerialversionuid() {
      return serialVersionUID;
   }
   @Override
   public String toString() {
      return "Member [mid=" + mid + ", userId=" + userId + ", userPwd=" + userPwd + ", userName=" + userName
            + ", phone=" + phone + ", email=" + email + ", address=" + address + ", interest=" + interest
            + ", enrollDate=" + enrollDate + ", updateDate=" + updateDate + ", mStatus=" + mStatus + "]";
   }
   

}