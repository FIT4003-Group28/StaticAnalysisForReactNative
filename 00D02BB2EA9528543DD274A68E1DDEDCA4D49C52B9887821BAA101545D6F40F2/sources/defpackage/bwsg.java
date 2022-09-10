package defpackage;
/* compiled from: PG */
/* renamed from: bwsg  reason: default package */
/* loaded from: classes4.dex */
public final class bwsg<T> extends btrh<T> {
    private final int d;

    public bwsg(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        int i = this.d;
        if (i == 0) {
            ((bwse) this.a).a((alih) obj);
        } else if (i != 1) {
            bwse bwseVar = (bwse) this.a;
            alhx alhxVar = (alhx) obj;
            if (!bwseVar.a.a.getStreetViewLayerParameters().a || bwseVar.a.b.a().l().d(afwm.THREE_DIMENSIONAL)) {
                return;
            }
            bwsf bwsfVar = bwseVar.a;
            if (bwsfVar.h) {
                return;
            }
            if (alhxVar.a >= bwsfVar.a.getStreetViewLayerParameters().b) {
                if (bwseVar.a.i()) {
                    return;
                }
                bwseVar.a.j();
                bwseVar.a.h = false;
            } else if (!bwseVar.a.i()) {
            } else {
                bwseVar.a.j();
                bwseVar.a.h = false;
            }
        } else {
            ((bwse) this.a).b((alij) obj);
        }
    }
}
