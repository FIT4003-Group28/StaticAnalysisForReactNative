package defpackage;
/* compiled from: PG */
/* renamed from: asxn  reason: default package */
/* loaded from: classes2.dex */
public final class asxn<T> extends btrh<T> {
    private final int d;

    public asxn(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            azre azreVar = (azre) obj;
            ((asxm) this.a).u();
            return;
        }
        asxm asxmVar = (asxm) this.a;
        crhp crhpVar = (crhp) obj;
        if (crhpVar.f()) {
            ((aszl) asxmVar.a).l = crhpVar.g();
        } else {
            aszl aszlVar = (aszl) asxmVar.a;
            aszlVar.l = null;
            aszlVar.e = null;
        }
        asxmVar.u();
        if (crhpVar.d()) {
            asxmVar.e.n();
        } else if (crhpVar.f()) {
        } else {
            asxmVar.e.q();
        }
    }
}
