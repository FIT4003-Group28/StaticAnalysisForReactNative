package defpackage;
/* compiled from: PG */
/* renamed from: arks  reason: default package */
/* loaded from: classes2.dex */
public final class arks<T> extends btrh<T> {
    public arks(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        crhp crhpVar = (crhp) obj;
        arkr arkrVar = ((arkq) this.a).a;
        if (!crhpVar.d()) {
            arkrVar.a.d(null);
            arkrVar.a.p = arkrVar.b.a();
        } else {
            arkrVar.a.d(crhpVar.e());
        }
        bvrj.UI_THREAD.c();
        if (!arkrVar.c || arkrVar.e == null) {
            return;
        }
        atlq atlqVar = arkrVar.d;
        arkrVar.d = arkrVar.a.a();
        arjt arjtVar = arkrVar.e;
        arjtVar.a.f.g(arkrVar.d, atlqVar);
    }
}
