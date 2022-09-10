package defpackage;
/* compiled from: PG */
/* renamed from: crsj  reason: default package */
/* loaded from: classes5.dex */
public final class crsj<T> extends btrh<T> {
    private final int d;

    public crsj(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            crsi crsiVar = (crsi) this.a;
            crhm crhmVar = (crhm) obj;
            if (!crhmVar.a) {
                return;
            }
            crsiVar.a = crhmVar.b;
            return;
        }
        crsi crsiVar2 = (crsi) this.a;
        crhp crhpVar = (crhp) obj;
        if (!crhpVar.d() || crsiVar2.b != null) {
            return;
        }
        crsiVar2.b = crhpVar.e().g().a;
    }
}
