package defpackage;
/* compiled from: PG */
/* renamed from: cbcm  reason: default package */
/* loaded from: classes4.dex */
public final class cbcm<T> extends btrh<T> {
    private final int d;

    public cbcm(Class<?> cls, T t) {
        super(cls, t);
        this.d = 1;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                ily ilyVar = new ily();
                ilyVar.q(((alhk) obj).a.S());
                ((cbcl) this.a).g(ilyVar.d(), true);
                return;
            }
            brco brcoVar = (brco) obj;
            ((cbcl) this.a).q(null, false);
            return;
        }
        cbcl cbclVar = (cbcl) this.a;
        alho alhoVar = (alho) obj;
        if (!cbclVar.aD) {
            return;
        }
        alaq alaqVar = alhoVar.a;
        if (!(alaqVar instanceof alap)) {
            return;
        }
        alap alapVar = (alap) alaqVar;
        if (!akqi.d(alapVar.g)) {
            return;
        }
        ily ilyVar2 = new ily();
        ilyVar2.q(alhoVar.a.l().S());
        ilyVar2.i(alapVar);
        cbclVar.g(ilyVar2.d(), false);
    }

    public cbcm(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }
}
