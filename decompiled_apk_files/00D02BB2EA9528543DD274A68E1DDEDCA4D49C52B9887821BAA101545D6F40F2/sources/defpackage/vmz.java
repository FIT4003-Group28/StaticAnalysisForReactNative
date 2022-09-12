package defpackage;
/* compiled from: PG */
/* renamed from: vmz  reason: default package */
/* loaded from: classes7.dex */
public final class vmz {
    private static final dcdc<vnu> a = dcdc.j(vnu.h(dqvj.DRIVE), vnu.h(dqvj.TRANSIT), vnu.h(dqvj.WALK), vnu.h(dqvj.TAXI), vnu.h(dqvj.BICYCLE));
    private static final dcdc<vnu> b = dcdc.k(vnu.h(dqvj.DRIVE), vnu.h(dqvj.TWO_WHEELER), vnu.h(dqvj.TRANSIT), vnu.h(dqvj.WALK), vnu.h(dqvj.TAXI), vnu.h(dqvj.BICYCLE));
    private final qeg c;

    static {
        dcdc.l(vnu.h(dqvj.DRIVE), vnu.h(dqvj.TWO_WHEELER), vnu.h(dqvj.TRANSIT), vnu.h(dqvj.WALK), vnu.h(dqvj.TAXI), vnu.h(dqvj.BICYCLE), vnu.h(dqvj.FLY));
    }

    public vmz(qeg qegVar) {
        this.c = qegVar;
    }

    public final dcdc<vnu> a() {
        return this.c.b() ? b : a;
    }
}
