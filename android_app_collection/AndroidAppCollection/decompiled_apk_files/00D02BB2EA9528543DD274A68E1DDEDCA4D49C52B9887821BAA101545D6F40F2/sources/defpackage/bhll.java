package defpackage;
/* compiled from: PG */
/* renamed from: bhll  reason: default package */
/* loaded from: classes3.dex */
public final class bhll<T> extends btrh<T> {
    private final int d;

    public bhll(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            bhlk bhlkVar = (bhlk) this.a;
            alhw alhwVar = (alhw) obj;
            if (!bhlk.d(bhlkVar.c()) || !bhlkVar.h || alhwVar.a != alje.LAST_FINGER_UP) {
                return;
            }
            bhlkVar.b(true, true);
            bhlkVar.h = false;
            return;
        }
        bhlk bhlkVar2 = (bhlk) this.a;
        alhl alhlVar = (alhl) obj;
        if (!bhlk.d(bhlkVar2.c()) || bhlkVar2.h) {
            return;
        }
        if (bhlk.a.hasStarted() && !bhlk.a.hasEnded()) {
            return;
        }
        bhlkVar2.b(false, true);
        bhlkVar2.h = true;
    }
}
