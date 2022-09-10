package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: dfx  reason: default package */
/* loaded from: classes6.dex */
public enum dfx {
    DEFAULT(R.raw.offscreen_indicator_blue, null, true),
    PRIMARY_POI(R.raw.offscreen_indicator_red, Integer.valueOf((int) R.raw.place_white), true),
    ELEVATOR(R.raw.offscreen_indicator_blue, Integer.valueOf((int) R.raw.elevator_white), false),
    ESCALATOR(R.raw.offscreen_indicator_blue, Integer.valueOf((int) R.raw.escalator_white), false),
    STAIRS(R.raw.offscreen_indicator_blue, Integer.valueOf((int) R.raw.stairs_white), false);
    
    @dzsi
    public final Integer f;
    public final int g;
    public final boolean h;

    dfx(int i2, @dzsi Integer num, boolean z) {
        this.g = i2;
        this.f = num;
        this.h = z;
    }

    public static dfx a(dmv dmvVar) {
        if (dmvVar.a().a() == dmq.VENUE_LEVEL_CHANGE) {
            dbsg<dfmg> e = dmvVar.e();
            if (e.a()) {
                dcdn<dfmf, dfx> dcdnVar = dfy.f;
                dfmf b = dfmf.b(e.b().b);
                if (b == null) {
                    b = dfmf.TYPE_UNSPECIFIED;
                }
                if (dcdnVar.containsKey(b)) {
                    dcdn<dfmf, dfx> dcdnVar2 = dfy.f;
                    dfmf b2 = dfmf.b(e.b().b);
                    if (b2 == null) {
                        b2 = dfmf.TYPE_UNSPECIFIED;
                    }
                    dfx dfxVar = dcdnVar2.get(b2);
                    dbsk.s(dfxVar);
                    return dfxVar;
                }
            }
        } else if (dmvVar.a().a() == dmq.PRIMARY_PIN) {
            return PRIMARY_POI;
        }
        return DEFAULT;
    }
}
