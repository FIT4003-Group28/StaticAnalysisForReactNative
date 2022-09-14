package defpackage;
/* compiled from: PG */
/* renamed from: lfl  reason: default package */
/* loaded from: classes7.dex */
public final class lfl<T> extends btrh<T> {
    private final int d;

    public lfl(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            lfh lfhVar = (lfh) this.a;
            alhw alhwVar = (alhw) obj;
            if (!lfhVar.a.g || alhwVar.a != alje.LAST_FINGER_UP) {
                return;
            }
            lfk lfkVar = lfhVar.a;
            lfkVar.g = false;
            lfkVar.c.a();
            return;
        }
        lfh lfhVar2 = (lfh) this.a;
        alhl alhlVar = (alhl) obj;
        lfk lfkVar2 = lfhVar2.a;
        if (!lfkVar2.g) {
            lfkVar2.c.b();
            lfhVar2.a.b.u();
        }
        lfhVar2.a.g = true;
    }
}
