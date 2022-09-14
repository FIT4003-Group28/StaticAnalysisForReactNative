package c.d.h.b;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private boolean f2972a;

    /* renamed from: b  reason: collision with root package name */
    private int f2973b;

    /* renamed from: c  reason: collision with root package name */
    private int f2974c;

    public c() {
        a();
    }

    public void a() {
        this.f2972a = false;
        this.f2973b = 4;
        c();
    }

    public void a(boolean z) {
        this.f2972a = z;
    }

    public void b() {
        this.f2974c++;
    }

    public void c() {
        this.f2974c = 0;
    }

    public boolean d() {
        return this.f2972a && this.f2974c < this.f2973b;
    }
}
