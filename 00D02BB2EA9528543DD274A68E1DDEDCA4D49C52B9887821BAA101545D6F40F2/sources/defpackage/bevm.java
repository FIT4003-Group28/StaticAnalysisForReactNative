package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DecimalFormat;
import java.text.NumberFormat;
/* compiled from: PG */
/* renamed from: bevm  reason: default package */
/* loaded from: classes3.dex */
public class bevm implements bevj {
    public static final /* synthetic */ int a = 0;
    private static final dcdn<dngf, Integer> b;
    private static final dcdn<dngf, Integer> c;
    private final dngk d;
    private final Context e;
    private final DecimalFormat f;
    private final int h;
    private final int i;
    private final boolean j;
    private final boolean k;
    @dzsi
    private final String l;
    @dzsi
    private final ddho m;
    @dzsi
    private final ddho n;
    @dzsi
    private final ddho o;
    private final cjta g = cjtd.b();
    private final alp p = alp.a();

    static {
        dcdg dcdgVar = new dcdg();
        dcdgVar.f(dngf.J_1772, Integer.valueOf((int) R.string.EV_INFO_CONNECTOR_TYPE_J1772));
        dcdgVar.f(dngf.MENNEKES, Integer.valueOf((int) R.string.EV_INFO_CONNECTOR_TYPE_2));
        dcdgVar.f(dngf.CHADEMO, Integer.valueOf((int) R.string.EV_INFO_CONNECTOR_TYPE_CHADEMO));
        dcdgVar.f(dngf.CCS_COMBO_1, Integer.valueOf((int) R.string.EV_INFO_CONNECTOR_TYPE_SAE_COMBO));
        dcdgVar.f(dngf.CCS_COMBO_2, Integer.valueOf((int) R.string.EV_INFO_CONNECTOR_TYPE_CCS_COMBO_2));
        dcdgVar.f(dngf.DEPRECATED_TESLA_ROADSTER, Integer.valueOf((int) R.string.EV_INFO_CONNECTOR_TYPE_TESLA_ROADSTER));
        dngf dngfVar = dngf.DEPRECATED_TESLA_S_HPWC;
        Integer valueOf = Integer.valueOf((int) R.string.EV_INFO_CONNECTOR_TYPE_TESLA);
        dcdgVar.f(dngfVar, valueOf);
        dcdgVar.f(dngf.TESLA, valueOf);
        dcdgVar.f(dngf.GB_T, Integer.valueOf((int) R.string.EV_INFO_CONNECTOR_TYPE_GB_T));
        dcdgVar.f(dngf.WALL_OUTLET, Integer.valueOf((int) R.string.EV_INFO_CONNECTOR_TYPE_WALL));
        b = dcdgVar.b();
        dcdg dcdgVar2 = new dcdg();
        dcdgVar2.f(dngf.J_1772, Integer.valueOf((int) R.raw.car_only_ic_connector_j1772));
        dcdgVar2.f(dngf.MENNEKES, Integer.valueOf((int) R.raw.car_only_ic_connector_type_2));
        dcdgVar2.f(dngf.CHADEMO, Integer.valueOf((int) R.raw.car_only_ic_connector_chademo));
        dcdgVar2.f(dngf.CCS_COMBO_1, Integer.valueOf((int) R.raw.car_only_ic_connector_ccs_1));
        dcdgVar2.f(dngf.CCS_COMBO_2, Integer.valueOf((int) R.raw.car_only_ic_connector_ccs_2));
        dcdgVar2.f(dngf.TESLA, Integer.valueOf((int) R.raw.car_only_ic_connector_supercharger));
        dcdgVar2.f(dngf.WALL_OUTLET, Integer.valueOf((int) R.raw.car_only_ic_connector_wall_b));
        c = dcdgVar2.b();
    }

    public bevm(dngk dngkVar, Context context, int i, boolean z, boolean z2, @dzsi String str, @dzsi String str2, @dzsi ddho ddhoVar, @dzsi ddho ddhoVar2, @dzsi ddho ddhoVar3) {
        int i2;
        this.e = context;
        this.k = z;
        this.m = ddhoVar;
        this.n = ddhoVar2;
        this.o = ddhoVar3;
        this.d = dngkVar;
        this.l = str;
        this.f = (DecimalFormat) NumberFormat.getNumberInstance(context.getResources().getConfiguration().locale);
        boolean z3 = true;
        final boolean z4 = z2 && !dngkVar.g.isEmpty();
        if (z4) {
            i2 = r(dngkVar, bevk.a);
        } else {
            i2 = dngkVar.h;
        }
        this.h = i2;
        if (z) {
            if (!dngkVar.g.isEmpty()) {
                for (dngc dngcVar : dngkVar.g) {
                    int a2 = dnfy.a(dngcVar.a);
                    if (a2 != 0) {
                        if (a2 == 1) {
                        }
                    }
                }
                this.j = z3;
                this.i = r(this.d, new dbsl(z4) { // from class: bevl
                    private final boolean a;

                    {
                        this.a = z4;
                    }

                    @Override // defpackage.dbsl
                    public final boolean a(Object obj) {
                        int a3;
                        int a4;
                        boolean z5 = this.a;
                        dngc dngcVar2 = (dngc) obj;
                        int i3 = bevm.a;
                        return (!z5 || (a4 = dngb.a(dngcVar2.b)) == 0 || a4 != 3) && (a3 = dnfy.a(dngcVar2.a)) != 0 && a3 == 2;
                    }
                });
                cjta cjtaVar = this.g;
                cjtaVar.i(i);
                cjtaVar.g(str2);
                return;
            }
            z3 = false;
            this.j = z3;
            this.i = r(this.d, new dbsl(z4) { // from class: bevl
                private final boolean a;

                {
                    this.a = z4;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    int a3;
                    int a4;
                    boolean z5 = this.a;
                    dngc dngcVar2 = (dngc) obj;
                    int i3 = bevm.a;
                    return (!z5 || (a4 = dngb.a(dngcVar2.b)) == 0 || a4 != 3) && (a3 = dnfy.a(dngcVar2.a)) != 0 && a3 == 2;
                }
            });
            cjta cjtaVar2 = this.g;
            cjtaVar2.i(i);
            cjtaVar2.g(str2);
            return;
        }
        this.j = false;
        this.i = 0;
    }

    private static int r(dngk dngkVar, dbsl<dngc> dbslVar) {
        int i = 0;
        for (dngc dngcVar : dngkVar.g) {
            if (dbslVar.a(dngcVar)) {
                i++;
            }
        }
        return i;
    }

    @Override // defpackage.bevj
    public String a() {
        dngk dngkVar = this.d;
        int i = dngkVar.a;
        if ((i & 2) == 0) {
            if ((i & 1) == 0) {
                return "";
            }
            Context context = this.e;
            dcdn<dngf, Integer> dcdnVar = b;
            dngf b2 = dngf.b(this.d.b);
            if (b2 == null) {
                b2 = dngf.UNKNOWN_CONNECTOR_TYPE;
            }
            return context.getString(dcdnVar.getOrDefault(b2, Integer.valueOf((int) R.string.EV_INFO_CONNECTOR_TYPE_UNKNOWN)).intValue());
        }
        return dngkVar.c;
    }

    @Override // defpackage.bevj
    public Integer b() {
        return Integer.valueOf(this.h);
    }

    @Override // defpackage.bevj
    public Boolean c() {
        return Boolean.valueOf((this.d.a & 4) != 0);
    }

    @Override // defpackage.bevj
    public Boolean d() {
        return Boolean.valueOf((this.d.a & 16) != 0);
    }

    @Override // defpackage.bevj
    public String e() {
        dngk dngkVar = this.d;
        if ((dngkVar.a & 4) != 0) {
            return this.e.getString(R.string.EV_INFO_CHARGING_SPEED_KILOWATT, this.p.b(this.f.format(Float.valueOf(new BigDecimal(dngkVar.d).round(new MathContext(3)).floatValue()))));
        }
        return "";
    }

    @Override // defpackage.bevj
    public Boolean f() {
        return Boolean.valueOf((this.d.a & 8) != 0);
    }

    @Override // defpackage.bevj
    public jic g() {
        return new jic(this.d.e, ckqc.FULLY_QUALIFIED, 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
        if (r0.equals("NZ") != false) goto L17;
     */
    @Override // defpackage.bevj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.cqtd h() {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bevm.h():cqtd");
    }

    @Override // defpackage.bevj
    public Boolean i() {
        return Boolean.valueOf((this.d.a & 64) != 0);
    }

    @Override // defpackage.bevj
    public String j() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.p.b(a()));
        if (c().booleanValue()) {
            sb.append(" · ");
            sb.append(this.p.b(e()));
        }
        return sb.toString();
    }

    @Override // defpackage.bevj
    public String k() {
        dngj dngjVar = this.d.i;
        if (dngjVar == null) {
            dngjVar = dngj.b;
        }
        return dngjVar.a;
    }

    @Override // defpackage.bevj
    public String l() {
        StringBuilder sb = new StringBuilder();
        if (c().booleanValue()) {
            sb.append(e());
        }
        if (d().booleanValue()) {
            if (sb.length() != 0) {
                sb.append(" · ");
            }
            sb.append(q());
        }
        return sb.toString();
    }

    @Override // defpackage.bevj
    public Boolean m() {
        return Boolean.valueOf(this.j);
    }

    @Override // defpackage.bevj
    public Integer n() {
        return Integer.valueOf(this.i);
    }

    @Override // defpackage.bevj
    public String o() {
        if (this.j) {
            return this.e.getResources().getQuantityString(R.plurals.EV_INFO_NUM_AVAILABLE_PORTS_ACCESSIBILITY, b().intValue(), n(), b());
        }
        return this.e.getResources().getQuantityString(R.plurals.EV_INFO_TOTAL_PORTS_ACCESSIBILITY, b().intValue(), b());
    }

    @Override // defpackage.bevj
    public cjtd p() {
        if (!this.k) {
            return cjtd.b;
        }
        if (this.j) {
            cjta cjtaVar = this.g;
            cjtaVar.d = this.m;
            return cjtaVar.a();
        } else if (this.i > 0) {
            cjta cjtaVar2 = this.g;
            cjtaVar2.d = this.o;
            return cjtaVar2.a();
        } else {
            cjta cjtaVar3 = this.g;
            cjtaVar3.d = this.n;
            return cjtaVar3.a();
        }
    }

    public String q() {
        dngk dngkVar = this.d;
        if ((dngkVar.a & 16) != 0) {
            int a2 = dngh.a(dngkVar.f);
            if (a2 == 0) {
                a2 = 1;
            }
            int i = a2 - 1;
            if (i == 1) {
                return this.e.getString(R.string.EV_INFO_CHARGING_COST_FREE);
            }
            return i != 2 ? "" : this.e.getString(R.string.EV_INFO_CHARGING_COST_PAID);
        }
        return "";
    }
}
