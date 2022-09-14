package c.e.a.b.d.e;
/* loaded from: classes.dex */
public enum o3 implements s3 {
    OOB_REQ_TYPE_UNSPECIFIED(0),
    PASSWORD_RESET(1),
    OLD_EMAIL_AGREE(2),
    NEW_EMAIL_ACCEPT(3),
    VERIFY_EMAIL(4),
    RECOVER_EMAIL(5),
    EMAIL_SIGNIN(6),
    VERIFY_AND_CHANGE_EMAIL(7),
    REVERT_SECOND_FACTOR_ADDITION(8);
    

    /* renamed from: b  reason: collision with root package name */
    private final int f3968b;

    static {
        new t3<o3>() { // from class: c.e.a.b.d.e.p3
        };
    }

    o3(int i) {
        this.f3968b = i;
    }

    public final int a() {
        return this.f3968b;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + o3.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f3968b + " name=" + name() + '>';
    }
}
