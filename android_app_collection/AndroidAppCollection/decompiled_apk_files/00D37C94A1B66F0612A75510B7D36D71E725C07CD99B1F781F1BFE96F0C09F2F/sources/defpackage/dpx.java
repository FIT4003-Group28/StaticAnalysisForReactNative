package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dpx  reason: default package */
/* loaded from: classes3.dex */
public final class dpx extends dqw {
    private final dql b;

    public dpx(dql dqlVar) {
        this.b = dqlVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.dqw, defpackage.dqz
    public final dqz kr(String str, dpu dpuVar, List list) {
        char c;
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            dqt.l("getEventName", 0, list);
            return new drc(this.b.b.d());
        } else if (c == 1) {
            dqt.l("getParamValue", 1, list);
            return dqt.d(this.b.b.c(dpuVar.b((dqz) list.get(0)).i()));
        } else if (c == 2) {
            dqt.l("getParams", 0, list);
            Map e = this.b.b.e();
            dqw dqwVar = new dqw();
            for (String str2 : e.keySet()) {
                dqwVar.r(str2, dqt.d(e.get(str2)));
            }
            return dqwVar;
        } else if (c == 3) {
            dqt.l("getTimestamp", 0, list);
            return new dqr(Double.valueOf(this.b.b.a()));
        } else if (c == 4) {
            dqt.l("setEventName", 1, list);
            dqz b = dpuVar.b((dqz) list.get(0));
            if (f.equals(b) || g.equals(b)) {
                throw new IllegalArgumentException("Illegal event name");
            }
            this.b.b.f(b.i());
            return new drc(b.i());
        } else {
            if (c == 5) {
                dqt.l("setParamValue", 2, list);
                String i = dpuVar.b((dqz) list.get(0)).i();
                dqz b2 = dpuVar.b((dqz) list.get(1));
                this.b.b.g(i, dqt.i(b2));
                return b2;
            }
            return super.kr(str, dpuVar, list);
        }
    }
}
