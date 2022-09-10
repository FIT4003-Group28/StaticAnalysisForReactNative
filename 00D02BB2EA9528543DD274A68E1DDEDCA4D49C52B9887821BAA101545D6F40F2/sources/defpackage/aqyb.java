package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aqyb  reason: default package */
/* loaded from: classes.dex */
public final class aqyb {
    private static final dcdn<aqya, bvjk> a = dcdn.l(aqya.FIGURE_EIGHT, bvjk.fb, aqya.AR_CAMERA, bvjk.fc);
    private static final dcdn<aqya, bvjk> b = dcdn.l(aqya.FIGURE_EIGHT, bvjk.fd, aqya.AR_CAMERA, bvjk.fe);
    private final dcdn<aqya, Long> c;
    private final dcdn<aqya, Integer> d;
    private final cqat e;
    private final bvjj f;
    private final btvo g;

    public aqyb(cqat cqatVar, bvjj bvjjVar, btvo btvoVar) {
        this.e = cqatVar;
        this.f = bvjjVar;
        this.g = btvoVar;
        duno compassCalibrationParameters = btvoVar.getCompassCalibrationParameters();
        this.c = dcdn.l(aqya.FIGURE_EIGHT, Long.valueOf(TimeUnit.SECONDS.toMillis(compassCalibrationParameters.b)), aqya.AR_CAMERA, Long.valueOf(TimeUnit.SECONDS.toMillis(compassCalibrationParameters.d)));
        this.d = dcdn.l(aqya.FIGURE_EIGHT, Integer.valueOf(compassCalibrationParameters.c), aqya.AR_CAMERA, Integer.valueOf(compassCalibrationParameters.e));
    }

    public final boolean a(int i, boolean z, aqya aqyaVar) {
        boolean z2 = this.g.getLocationParameters().c || this.g.getCompassCalibrationParameters().a;
        if (!z && z2 && i != -1 && i < 3) {
            bvjk bvjkVar = a.get(aqyaVar);
            Long l = this.c.get(aqyaVar);
            dbsk.s(bvjkVar);
            dbsk.s(l);
            if (this.e.b() > this.f.w(bvjkVar, 0L) + l.longValue()) {
                bvjk bvjkVar2 = b.get(aqyaVar);
                Integer num = this.d.get(aqyaVar);
                dbsk.s(bvjkVar2);
                dbsk.s(num);
                if (this.f.s(bvjkVar2, 0) < num.intValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b(aqya aqyaVar) {
        bvjk bvjkVar = a.get(aqyaVar);
        dbsk.s(bvjkVar);
        this.f.Z(bvjkVar, this.e.b());
        bvjk bvjkVar2 = b.get(aqyaVar);
        dbsk.s(bvjkVar2);
        this.f.W(bvjkVar2, this.f.s(bvjkVar2, 0) + 1);
    }
}
