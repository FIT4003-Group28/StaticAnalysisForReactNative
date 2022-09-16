package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: crfj  reason: default package */
/* loaded from: classes5.dex */
public class crfj {
    public static final dcdn<crfh, Integer> a;
    public final crfk b;
    @dzsi
    public final String c;
    @dzsi
    public final amsv d;
    public final crfi e;
    @dzsi
    public final amut f;
    public final int g;
    @dzsi
    public crfg h;

    static {
        dcdg dcdgVar = new dcdg();
        dcdgVar.f(crfh.DEFAULT_NONE, -1);
        dcdgVar.f(crfh.PAH_DEE, Integer.valueOf((int) R.raw.da_navigation_chimes_pah_dee));
        dcdgVar.f(crfh.PAH_DUM, Integer.valueOf((int) R.raw.da_navigation_chimes_pah_dum));
        dcdgVar.f(crfh.DRING_DRING, Integer.valueOf((int) R.raw.da_traffic_report_dring_dring));
        dcdgVar.f(crfh.TAH_LAH_LAH, Integer.valueOf((int) R.raw.da_traffic_report_tah_lah_lah));
        dcdgVar.f(crfh.DING_DEE, Integer.valueOf((int) R.raw.da_traffic_report_ding_dee));
        a = dcdgVar.b();
    }

    public crfj(crfi crfiVar, @dzsi amut amutVar, String str, @dzsi String str2, @dzsi amsv amsvVar, @dzsi dspd dspdVar, int i) {
        this.e = crfiVar;
        this.f = amutVar;
        this.g = i;
        this.b = new crff(str, dspdVar);
        this.c = str2;
        this.d = amsvVar;
    }

    public static crfj a(amut amutVar, String str, @dzsi amsv amsvVar, @dzsi dspd dspdVar) {
        crfi crfiVar = crfi.UNKNOWN;
        doxu doxuVar = doxu.PREPARE;
        int ordinal = amutVar.a.ordinal();
        if (ordinal == 0) {
            crfiVar = crfi.PREPARE;
        } else if (ordinal == 1) {
            crfiVar = crfi.ACT;
        } else if (ordinal == 2) {
            dpec dpecVar = amutVar.a().a;
            if (dpecVar != null) {
                dqvj c = dqvj.c(dpecVar.b);
                if (c == null) {
                    c = dqvj.DRIVE;
                }
                if (c == dqvj.WALK) {
                    crfiVar = crfi.OTHER;
                }
            }
            crfiVar = crfi.SUCCESS;
        } else if (ordinal == 3) {
            crfiVar = crfi.OTHER_WITH_LOCALIZED_NAME;
        }
        return new crfj(crfiVar, amutVar, str, null, amsvVar, dspdVar, -1);
    }

    public static crfj b(crfi crfiVar, String str, int i) {
        return new crfj(crfiVar, null, str, null, null, null, i);
    }

    public static crfj c(crfi crfiVar, String str, @dzsi amsv amsvVar) {
        return new crfj(crfiVar, null, str, null, amsvVar, null, -1);
    }

    public static crfj d(crfi crfiVar, String str) {
        return new crfj(crfiVar, null, str, null, null, null, -1);
    }

    public final String e() {
        return ((crff) this.b).a;
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof crfj)) {
            return false;
        }
        return ((crfj) obj).b.equals(this.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.c();
        b.b("type", this.e);
        b.b("uri", this.c);
        b.b("structuredSpokenText", this.b);
        b.b("cannedMessage", this.d);
        return b.toString();
    }
}
