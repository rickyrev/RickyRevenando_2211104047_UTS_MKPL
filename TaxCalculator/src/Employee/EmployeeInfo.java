package EmployeeInfo;

import java.time.LocalDate;

public class EmployeeInfo {
    private String name;
    private LocalDate birthDate;
    private boolean isMarried;
    private int childCount;

    public EmployeeInfo(String name, int year, int month, int day, boolean isMarried, int childCount) {
        this.name = name;
        this.birthDate = LocalDate.of(year, month, day);
        this.isMarried = isMarried;
        this.childCount = childCount;
    }

    // Getter
    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public int getChildCount() {
        return childCount;
    }

    // Setter (jika ingin bisa diubah setelah objek dibuat)
    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public void setChildCount(int childCount) {
        this.childCount = childCount;
    }

    // Tambahan toString() untuk debugging
    @Override
    public String toString() {
        return "EmployeeInfo{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", isMarried=" + isMarried +
                ", childCount=" + childCount +
                '}';
    }
}
