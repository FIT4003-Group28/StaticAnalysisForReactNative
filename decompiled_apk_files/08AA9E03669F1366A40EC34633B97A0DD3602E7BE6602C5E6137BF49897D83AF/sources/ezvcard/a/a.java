package ezvcard.a;
/* compiled from: CannotParseException.java */
/* loaded from: classes.dex */
public class a extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f5468a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f5469b;

    public a() {
        this(null);
    }

    public a(int i, Object... objArr) {
        this.f5468a = Integer.valueOf(i);
        this.f5469b = objArr;
    }

    public a(String str) {
        this(25, str);
    }

    public Integer a() {
        return this.f5468a;
    }

    public Object[] b() {
        return this.f5469b;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return ezvcard.b.INSTANCE.b(this.f5468a.intValue(), this.f5469b);
    }
}
