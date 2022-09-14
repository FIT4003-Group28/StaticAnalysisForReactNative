package ezvcard.parameter;
/* loaded from: classes.dex */
public class Pid {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f5554a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f5555b;

    public Pid(Integer num, Integer num2) {
        if (num == null) {
            throw new NullPointerException("Local ID must not be null.");
        }
        this.f5554a = num;
        this.f5555b = num2;
    }

    public static Pid a(String str) {
        String substring;
        int indexOf = str.indexOf(46);
        Integer num = null;
        if (indexOf < 0) {
            substring = null;
        } else {
            String substring2 = str.substring(0, indexOf);
            substring = indexOf == str.length() + (-1) ? null : str.substring(indexOf + 1);
            str = substring2;
        }
        Integer valueOf = Integer.valueOf(str);
        if (substring != null) {
            num = Integer.valueOf(substring);
        }
        return new Pid(valueOf, num);
    }

    public String toString() {
        if (this.f5555b == null) {
            return Integer.toString(this.f5554a.intValue());
        }
        return this.f5554a + "." + this.f5555b;
    }

    public int hashCode() {
        return (((this.f5555b == null ? 0 : this.f5555b.hashCode()) + 31) * 31) + this.f5554a.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Pid pid = (Pid) obj;
        if (this.f5555b == null) {
            if (pid.f5555b != null) {
                return false;
            }
        } else if (!this.f5555b.equals(pid.f5555b)) {
            return false;
        }
        return this.f5554a.equals(pid.f5554a);
    }
}
