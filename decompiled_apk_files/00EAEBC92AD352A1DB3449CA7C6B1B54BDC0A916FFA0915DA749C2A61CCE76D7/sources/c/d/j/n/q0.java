package c.d.j.n;

import java.util.Map;
/* loaded from: classes.dex */
public abstract class q0<T> extends c.d.d.b.e<T> {

    /* renamed from: c  reason: collision with root package name */
    private final k<T> f3537c;

    /* renamed from: d  reason: collision with root package name */
    private final m0 f3538d;

    /* renamed from: e  reason: collision with root package name */
    private final String f3539e;

    /* renamed from: f  reason: collision with root package name */
    private final String f3540f;

    public q0(k<T> kVar, m0 m0Var, String str, String str2) {
        this.f3537c = kVar;
        this.f3538d = m0Var;
        this.f3539e = str;
        this.f3540f = str2;
        this.f3538d.a(this.f3540f, this.f3539e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.d.d.b.e
    public void a(Exception exc) {
        m0 m0Var = this.f3538d;
        String str = this.f3540f;
        m0Var.a(str, this.f3539e, exc, m0Var.a(str) ? b(exc) : null);
        this.f3537c.a(exc);
    }

    protected Map<String, String> b(Exception exc) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.d.d.b.e
    public void b(T t) {
        m0 m0Var = this.f3538d;
        String str = this.f3540f;
        m0Var.a(str, this.f3539e, m0Var.a(str) ? c(t) : null);
        this.f3537c.a(t, 1);
    }

    protected Map<String, String> c(T t) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.d.d.b.e
    public void c() {
        m0 m0Var = this.f3538d;
        String str = this.f3540f;
        m0Var.b(str, this.f3539e, m0Var.a(str) ? d() : null);
        this.f3537c.a();
    }

    protected Map<String, String> d() {
        return null;
    }
}
