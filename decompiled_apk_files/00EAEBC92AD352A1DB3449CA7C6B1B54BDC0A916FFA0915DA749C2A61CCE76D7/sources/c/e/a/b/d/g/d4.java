package c.e.a.b.d.g;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d4 {

    /* renamed from: a  reason: collision with root package name */
    private final j4 f4101a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f4102b;

    private d4(int i) {
        this.f4102b = new byte[i];
        this.f4101a = j4.a(this.f4102b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ d4(int i, u3 u3Var) {
        this(i);
    }

    public final v3 a() {
        this.f4101a.b();
        return new f4(this.f4102b);
    }

    public final j4 b() {
        return this.f4101a;
    }
}
