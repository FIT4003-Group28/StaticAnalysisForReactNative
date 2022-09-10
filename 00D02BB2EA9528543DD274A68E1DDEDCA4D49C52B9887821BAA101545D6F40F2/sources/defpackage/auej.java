package defpackage;

import com.google.android.apps.maps.R;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: auej  reason: default package */
/* loaded from: classes2.dex */
public final class auej {
    @dzsi
    public static Integer a(dkxc dkxcVar) {
        int i;
        dqkr dqkrVar = dqkr.UNKNOWN_INCIDENT_TYPE;
        dkxe dkxeVar = dkxe.UNKNOWN_USER_INCIDENT_TYPE;
        dkxc dkxcVar2 = dkxc.UNKNOWN_LABEL;
        switch (dkxcVar.ordinal()) {
            case 1:
                i = R.string.REPORT_INCIDENT_PROMPT_ACCIDENT;
                break;
            case 2:
                i = R.string.REPORT_INCIDENT_PROMPT_CAMERA;
                break;
            case 3:
                i = R.string.REPORT_INCIDENT_PROMPT_SPEED_TRAP;
                break;
            case 4:
                i = R.string.REPORT_INCIDENT_PROMPT_JAM;
                break;
            case 5:
                i = R.string.REPORT_INCIDENT_PROMPT_CONSTRUCTION;
                break;
            case 6:
                i = R.string.REPORT_INCIDENT_PROMPT_LANE_CLOSURE;
                break;
            case 7:
                i = R.string.REPORT_INCIDENT_PROMPT_DISABLED_VEHICLE;
                break;
            case 8:
                i = R.string.REPORT_INCIDENT_PROMPT_OBJECT_ON_ROAD;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i);
    }

    @dzsi
    public static dqkr b(dkxe dkxeVar) {
        dqkr dqkrVar = dqkr.UNKNOWN_INCIDENT_TYPE;
        dkxe dkxeVar2 = dkxe.UNKNOWN_USER_INCIDENT_TYPE;
        dkxc dkxcVar = dkxc.UNKNOWN_LABEL;
        switch (dkxeVar.ordinal()) {
            case 1:
                return dqkr.INCIDENT_CRASH;
            case 2:
                return dqkr.INCIDENT_FIXED_CAMERA;
            case 3:
                return dqkr.INCIDENT_MOBILE_CAMERA;
            case 4:
                return dqkr.INCIDENT_SUSPECTED_JAM;
            case 5:
                return dqkr.INCIDENT_CONSTRUCTION;
            case 6:
                return dqkr.INCIDENT_LANE_CLOSURE;
            case 7:
                return dqkr.INCIDENT_STALLED_VEHICLE;
            case 8:
                return dqkr.INCIDENT_OBJECT_ON_ROAD;
            case 9:
            default:
                return null;
            case 10:
                return dqkr.INCIDENT_SUSPECTED_CLOSURE;
        }
    }

    public static List<dkxf> c(btvo btvoVar) {
        final HashSet hashSet = new HashSet();
        return dcbg.b(btvoVar.getUgcParameters().N()).o(auef.a).o(new dbsl(hashSet) { // from class: aueg
            private final Set a;

            {
                this.a = hashSet;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                Set set = this.a;
                dkxf dkxfVar = (dkxf) obj;
                dkxe b = dkxe.b(dkxfVar.b);
                if (b == null) {
                    b = dkxe.UNKNOWN_USER_INCIDENT_TYPE;
                }
                if (set.contains(b)) {
                    return false;
                }
                dkxe b2 = dkxe.b(dkxfVar.b);
                if (b2 == null) {
                    b2 = dkxe.UNKNOWN_USER_INCIDENT_TYPE;
                }
                set.add(b2);
                return true;
            }
        }).z();
    }

    @dzsi
    public static dkxf d(btvo btvoVar, dqkr dqkrVar) {
        for (dkxf dkxfVar : c(btvoVar)) {
            dkxe b = dkxe.b(dkxfVar.b);
            if (b == null) {
                b = dkxe.UNKNOWN_USER_INCIDENT_TYPE;
            }
            if (dqkrVar == b(b)) {
                return dkxfVar;
            }
        }
        return null;
    }

    public static boolean e(@dzsi akfa akfaVar) {
        btlu j;
        return (akfaVar == null || (j = akfaVar.j()) == null || !j.u()) ? false : true;
    }
}
