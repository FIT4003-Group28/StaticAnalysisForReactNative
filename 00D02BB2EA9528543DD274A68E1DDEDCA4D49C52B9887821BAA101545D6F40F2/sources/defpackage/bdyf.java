package defpackage;
/* compiled from: PG */
/* renamed from: bdyf  reason: default package */
/* loaded from: classes3.dex */
public final class bdyf<T> extends btrh<T> {
    private final int d;

    public bdyf(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            bdyd bdydVar = (bdyd) this.a;
            alhx alhxVar = (alhx) obj;
            if (!bdydVar.m || bdydVar.k.l().L() != jjn.COLLAPSED) {
                return;
            }
            bdydVar.k.B(jjn.HIDDEN);
            bdydVar.l.b();
            return;
        }
        bdyd bdydVar2 = (bdyd) this.a;
        alhl alhlVar = (alhl) obj;
        if (!bdydVar2.m || bdydVar2.k.l().L() != jjn.COLLAPSED) {
            return;
        }
        bdydVar2.k.B(jjn.HIDDEN);
        bdydVar2.l.b();
    }
}
