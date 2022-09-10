package defpackage;

import java.io.PrintWriter;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: aiil  reason: default package */
/* loaded from: classes2.dex */
public final class aiil implements aile {
    private final dbsg<eapd> a;
    private final dbsg<dqzl> b;
    private final dbsg<eapd> c;
    private final dcdc<aimw> d;
    private final dbsg<aimw> e;
    private final dbsg<dehn<ajne>> f;

    public aiil(aimt aimtVar, dbsg<dehn<ajne>> dbsgVar) {
        dbsg<eapd> dbsgVar2;
        dbsg<dqzl> dbsgVar3;
        dbsg<aimw> dbsgVar4;
        if ((aimtVar.a & 8) != 0) {
            aimr aimrVar = aimtVar.e;
            dbsgVar2 = dbsg.i(new eapd((aimrVar == null ? aimr.c : aimrVar).b));
        } else {
            dbsgVar2 = dbpy.a;
        }
        if ((aimtVar.a & 2) != 0) {
            dqzl dqzlVar = aimtVar.c;
            dbsgVar3 = dbsg.i(dqzlVar == null ? dqzl.j : dqzlVar);
        } else {
            dbsgVar3 = dbpy.a;
        }
        dbsg<eapd> i = (aimtVar.a & 4) != 0 ? dbsg.i(new eapd(aimtVar.d)) : dbpy.a;
        aimx aimxVar = aimtVar.b;
        aimw aimwVar = (aimxVar == null ? aimx.d : aimxVar).b;
        dcdc f = dcdc.f(aimwVar == null ? aimw.l : aimwVar);
        aimx aimxVar2 = aimtVar.b;
        dcdc<aimw> q = dcdc.q(dcbg.d(f, (aimxVar2 == null ? aimx.d : aimxVar2).c));
        aimx aimxVar3 = aimtVar.b;
        if (((aimxVar3 == null ? aimx.d : aimxVar3).a & 1) != 0) {
            aimx aimxVar4 = aimtVar.b;
            aimw aimwVar2 = (aimxVar4 == null ? aimx.d : aimxVar4).b;
            dbsgVar4 = dbsg.i(aimwVar2 == null ? aimw.l : aimwVar2);
        } else {
            dbsgVar4 = dbpy.a;
        }
        this.a = dbsgVar2;
        this.b = dbsgVar3;
        this.c = i;
        this.d = q;
        this.e = dbsgVar4;
        this.f = dbsgVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dcep<aild> k(aimw aimwVar) {
        dcen N = dcep.N();
        if (!aimwVar.c) {
            N.b(aild.NOT_ELIGIBLE_TO_REPORT_LSV_DISABLED_REPORTING);
        }
        if (aimwVar.i) {
            if (!aimwVar.f || !aimwVar.h) {
                if (aimwVar.j) {
                    N.b(aild.NOT_ELIGIBLE_TO_REPORT_REQUIRES_LOCATION_HISTORY_NOT_REQUIRED_ACKNOWLEDGEMENT);
                } else if (!aimwVar.h) {
                    N.b(aild.NOT_ELIGIBLE_TO_REPORT_LOCATION_HISTORY_NOT_ALLOWED);
                } else {
                    N.b(aild.NOT_ELIGIBLE_TO_REPORT_LOCATION_HISTORY_DISABLED);
                }
            } else {
                return N.f();
            }
        } else if (aimwVar.f && aimwVar.h) {
            return N.f();
        } else {
            if (aimwVar.k) {
                return N.f();
            }
            N.b(aild.NOT_ELIGIBLE_TO_REPORT_REQUIRES_ON_DEVICE_ACKNOWLEDGEMENT);
        }
        return N.f();
    }

    @Override // defpackage.aile
    public final dbsg<eapd> a() {
        return this.a;
    }

    @Override // defpackage.aile
    public final boolean b(eapd eapdVar) {
        if (!this.b.a() || !this.c.a()) {
            return true;
        }
        return eapdVar.w(this.c.b().e(eaow.d(this.b.b().f)));
    }

    @Override // defpackage.aikz
    public final void c(String str, PrintWriter printWriter) {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 28 + String.valueOf(hexString).length());
        sb.append(str);
        sb.append("ReportingConfigurationImpl #");
        sb.append(hexString);
        printWriter.println(sb.toString());
        String valueOf = String.valueOf(str);
        String concat = valueOf.length() != 0 ? "  ".concat(valueOf) : new String("  ");
        if (this.a.a()) {
            String valueOf2 = String.valueOf(this.a.b());
            StringBuilder sb2 = new StringBuilder(String.valueOf(concat).length() + 38 + String.valueOf(valueOf2).length());
            sb2.append(concat);
            sb2.append("lastReceivedOvenfreshRequestTimestamp=");
            sb2.append(valueOf2);
            printWriter.println(sb2.toString());
        }
        if (this.b.a()) {
            String arrays = Arrays.toString(this.b.b().bS());
            StringBuilder sb3 = new StringBuilder(String.valueOf(concat).length() + 28 + String.valueOf(arrays).length());
            sb3.append(concat);
            sb3.append("locationReportingParameters=");
            sb3.append(arrays);
            printWriter.println(sb3.toString());
        }
        if (this.c.a()) {
            String valueOf3 = String.valueOf(this.c.b());
            StringBuilder sb4 = new StringBuilder(String.valueOf(concat).length() + 43 + String.valueOf(valueOf3).length());
            sb4.append(concat);
            sb4.append("locationReportingParametersReceivedInstant=");
            sb4.append(valueOf3);
            printWriter.println(sb4.toString());
        }
        if (this.d.isEmpty()) {
            printWriter.println(String.valueOf(concat).concat("previousStates: None"));
            return;
        }
        printWriter.println(String.valueOf(concat).concat("previousStates:"));
        String valueOf4 = String.valueOf(concat);
        String concat2 = valueOf4.length() != 0 ? "  ".concat(valueOf4) : new String("  ");
        dcdc<aimw> dcdcVar = this.d;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            aimw aimwVar = dcdcVar.get(i);
            if ((aimwVar.a & 1) != 0) {
                String valueOf5 = String.valueOf(new eapd(aimwVar.b));
                StringBuilder sb5 = new StringBuilder(String.valueOf(concat2).length() + 10 + String.valueOf(valueOf5).length());
                sb5.append(concat2);
                sb5.append("timestamp:");
                sb5.append(valueOf5);
                printWriter.println(sb5.toString());
            }
            if ((aimwVar.a & 2) != 0) {
                boolean z = aimwVar.c;
                StringBuilder sb6 = new StringBuilder(String.valueOf(concat2).length() + 30);
                sb6.append(concat2);
                sb6.append("  serverPermitsReporting:");
                sb6.append(z);
                printWriter.println(sb6.toString());
            }
            if ((aimwVar.a & 4) != 0) {
                boolean z2 = aimwVar.d;
                StringBuilder sb7 = new StringBuilder(String.valueOf(concat2).length() + 36);
                sb7.append(concat2);
                sb7.append("  serverPermitsBecomingPrimary:");
                sb7.append(z2);
                printWriter.println(sb7.toString());
            }
            if ((aimwVar.a & 8) != 0) {
                boolean z3 = aimwVar.e;
                StringBuilder sb8 = new StringBuilder(String.valueOf(concat2).length() + 17);
                sb8.append(concat2);
                sb8.append("  isPrimary:");
                sb8.append(z3);
                printWriter.println(sb8.toString());
            }
            if ((aimwVar.a & 16) != 0) {
                boolean z4 = aimwVar.f;
                StringBuilder sb9 = new StringBuilder(String.valueOf(concat2).length() + 27);
                sb9.append(concat2);
                sb9.append("  ulrReportingOptedIn:");
                sb9.append(z4);
                printWriter.println(sb9.toString());
            }
            if ((aimwVar.a & 32) != 0) {
                boolean z5 = aimwVar.g;
                StringBuilder sb10 = new StringBuilder(String.valueOf(concat2).length() + 33);
                sb10.append(concat2);
                sb10.append("  ulrLocationHistoryOptedIn:");
                sb10.append(z5);
                printWriter.println(sb10.toString());
            }
            if ((aimwVar.a & 64) != 0) {
                boolean z6 = aimwVar.h;
                StringBuilder sb11 = new StringBuilder(String.valueOf(concat2).length() + 27);
                sb11.append(concat2);
                sb11.append("  ulrReportingAllowed:");
                sb11.append(z6);
                printWriter.println(sb11.toString());
            }
            if ((aimwVar.a & 128) != 0) {
                boolean z7 = aimwVar.i;
                StringBuilder sb12 = new StringBuilder(String.valueOf(concat2).length() + 43);
                sb12.append(concat2);
                sb12.append("  locationHistoryRequiredForReporting:");
                sb12.append(z7);
                printWriter.println(sb12.toString());
            }
            if ((aimwVar.a & 256) != 0) {
                boolean z8 = aimwVar.j;
                StringBuilder sb13 = new StringBuilder(String.valueOf(concat2).length() + 53);
                sb13.append(concat2);
                sb13.append("  canAcknowledgeLocationHistoryNoLongerRequired:");
                sb13.append(z8);
                printWriter.println(sb13.toString());
            }
            if ((aimwVar.a & 512) != 0) {
                boolean z9 = aimwVar.k;
                StringBuilder sb14 = new StringBuilder(String.valueOf(concat2).length() + 26);
                sb14.append(concat2);
                sb14.append("  onDeviceOptInValid:");
                sb14.append(z9);
                printWriter.println(sb14.toString());
            }
        }
    }

    @Override // defpackage.aile
    public final boolean d() {
        return this.e.a() && this.e.b().e;
    }

    @Override // defpackage.aile
    public final boolean e() {
        return this.f.a() && !this.f.b().isDone();
    }

    @Override // defpackage.aile
    public final dbsg<dehn<ajne>> f() {
        return this.f;
    }

    @Override // defpackage.aile
    public final boolean g() {
        return !h().a();
    }

    @Override // defpackage.aile
    public final dbsg<ailc> h() {
        if (!this.e.a()) {
            return dbsg.i(ailc.d(1, dbpy.a, dbpy.a));
        }
        if (this.e.b().d) {
            return dbpy.a;
        }
        if (this.b.a() && (this.b.b().a & 128) != 0) {
            dqyw dqywVar = this.b.b().i;
            if (dqywVar == null) {
                dqywVar = dqyw.d;
            }
            int i = dqywVar.a;
            if ((i & 1) != 0) {
                dbpy<Object> dbpyVar = dbpy.a;
                dqyr dqyrVar = dqywVar.b;
                if (dqyrVar == null) {
                    dqyrVar = dqyr.b;
                }
                return dbsg.i(ailc.d(3, dbpyVar, dbsg.i(dqyrVar.a)));
            } else if ((i & 4) != 0) {
                dqyt dqytVar = dqywVar.c;
                if (dqytVar == null) {
                    dqytVar = dqyt.b;
                }
                return dbsg.i(ailc.d(4, dbsg.i(dqytVar.a), dbpy.a));
            } else if ((i & 8) != 0) {
                return dbsg.i(ailc.d(5, dbpy.a, dbpy.a));
            }
        }
        return dbsg.i(ailc.d(2, dbpy.a, dbpy.a));
    }

    @Override // defpackage.aile
    public final boolean i() {
        return j().isEmpty();
    }

    @Override // defpackage.aile
    public final dcep<aild> j() {
        if (this.e.a()) {
            return k(this.e.b());
        }
        return dcep.B(aild.UNABLE_TO_DETERMINE_ELIGIBILITY);
    }
}
