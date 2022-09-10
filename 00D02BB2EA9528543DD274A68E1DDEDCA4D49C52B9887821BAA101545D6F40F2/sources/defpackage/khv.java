package defpackage;
/* compiled from: PG */
/* renamed from: khv  reason: default package */
/* loaded from: classes7.dex */
public final class khv<T> extends btrh<T> {
    private final int d;

    public khv(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        baab o;
        if (this.d != 0) {
            khs khsVar = (khs) this.a;
            azrf azrfVar = (azrf) obj;
            if (khsVar.a.i != khx.STARRED_PLACES) {
                return;
            }
            khsVar.a.m();
            return;
        }
        khs khsVar2 = (khs) this.a;
        azrb azrbVar = (azrb) obj;
        if (azrbVar.b != 2) {
            return;
        }
        baad baadVar = azrbVar.a;
        baab baabVar = null;
        if (baadVar != null || !azrbVar.a()) {
            o = baadVar != null ? baadVar.o() : null;
        } else {
            o = baab.STARRED_PLACES;
        }
        khx khxVar = khx.FAVORITE_PLACES;
        int ordinal = khsVar2.a.i.ordinal();
        if (ordinal == 0) {
            baabVar = baab.FAVORITES;
        } else if (ordinal == 1) {
            baabVar = baab.WANT_TO_GO;
        } else if (ordinal == 2) {
            baabVar = baab.STARRED_PLACES;
        }
        if (o != null && baabVar != null && baabVar != o) {
            return;
        }
        khsVar2.a.m();
    }
}
