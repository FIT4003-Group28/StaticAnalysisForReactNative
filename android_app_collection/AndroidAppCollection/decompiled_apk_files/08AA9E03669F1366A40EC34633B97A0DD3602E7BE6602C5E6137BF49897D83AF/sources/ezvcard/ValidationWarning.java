package ezvcard;
/* loaded from: classes.dex */
public class ValidationWarning {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f5462a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5463b;

    public ValidationWarning(int i, Object... objArr) {
        this.f5462a = Integer.valueOf(i);
        this.f5463b = b.INSTANCE.a(i, objArr);
    }

    public Integer a() {
        return this.f5462a;
    }

    public String b() {
        return this.f5463b;
    }

    public String toString() {
        if (this.f5462a == null) {
            return this.f5463b;
        }
        return "(" + this.f5462a + ") " + this.f5463b;
    }
}
