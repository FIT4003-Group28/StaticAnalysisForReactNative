package c.d.h.a.a.i;
/* loaded from: classes.dex */
public class c extends c.d.j.l.a {

    /* renamed from: a  reason: collision with root package name */
    private String f2932a;

    /* renamed from: b  reason: collision with root package name */
    private final b f2933b;

    public c(String str, b bVar) {
        this.f2933b = bVar;
        c(str);
    }

    @Override // c.d.j.l.a, c.d.j.n.m0
    public void a(String str, String str2, boolean z) {
        b bVar = this.f2933b;
        if (bVar != null) {
            bVar.a(this.f2932a, d.a(str2), z, str2);
        }
    }

    public void c(String str) {
        this.f2932a = str;
    }
}
