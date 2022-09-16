package defpackage;
/* compiled from: PG */
/* renamed from: ytk  reason: default package */
/* loaded from: classes7.dex */
public final class ytk<T> extends btrh<T> {
    private final int d;

    public ytk(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            yth ythVar = (yth) this.a;
            alhw alhwVar = (alhw) obj;
            if (!ythVar.d || alhwVar.a != alje.LAST_FINGER_UP) {
                return;
            }
            ythVar.c();
            ythVar.d = false;
            return;
        }
        yth ythVar2 = (yth) this.a;
        alhl alhlVar = (alhl) obj;
        if (ythVar2.d) {
            return;
        }
        ythVar2.e();
        ythVar2.d = true;
    }
}
