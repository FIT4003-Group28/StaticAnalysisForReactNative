package defpackage;
/* compiled from: PG */
/* renamed from: kyf  reason: default package */
/* loaded from: classes7.dex */
public final class kyf<T> extends btrh<T> {
    private final int d;

    public kyf(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            ((kyd) this.a).a.b.a(ldm.e(((alhk) obj).a.S()), true);
            return;
        }
        alho alhoVar = (alho) obj;
        kye kyeVar = ((kyd) this.a).a;
        if (!kyeVar.d) {
            return;
        }
        alaq alaqVar = alhoVar.a;
        if (alaqVar instanceof alap) {
            kyeVar.b.a(ldm.d((alap) alaqVar), false);
        } else if (!(alaqVar instanceof alav)) {
        } else {
            kyeVar.c.a((alav) alaqVar);
        }
    }
}
