package defpackage;
/* compiled from: PG */
/* renamed from: blgo  reason: default package */
/* loaded from: classes3.dex */
public final class blgo<T> extends btrh<T> {
    private final int d;

    public blgo(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            bkpe bkpeVar = (bkpe) obj;
            cext cextVar = ((blgl) this.a).a.b;
            if (cextVar == null) {
                return;
            }
            cextVar.t(bkpeVar);
            return;
        }
        blgl blglVar = (blgl) this.a;
        int d = ((cdjh) obj).d();
        int i = d - 1;
        if (d == 0) {
            throw null;
        }
        if (i != 1) {
            return;
        }
        blglVar.a.e();
    }
}
