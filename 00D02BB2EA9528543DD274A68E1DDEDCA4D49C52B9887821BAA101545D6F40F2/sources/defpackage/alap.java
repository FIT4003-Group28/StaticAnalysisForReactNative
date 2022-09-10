package defpackage;
/* compiled from: PG */
/* renamed from: alap  reason: default package */
/* loaded from: classes2.dex */
public final class alap extends alau {
    @dzsi
    public final bvrt<dmol> a;
    @dzsi
    public final alvj b;
    @dzsi
    public final alxk c;
    @dzsi
    public final dndr d;
    @dzsi
    public final Long e;
    @dzsi
    public final altw f;
    @dzsi
    public final akqi g;
    @dzsi
    public final bvrt<dmmq> h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final akqq n;
    @dzsi
    public final String o;
    @dzsi
    public final decq p;
    @dzsi
    private final bvrt<dmng> s;
    @dzsi
    private final bvrt<dnbc> t;

    public alap(String str, akra akraVar, akqq akqqVar, @dzsi dmol dmolVar, @dzsi alvj alvjVar, @dzsi alxk alxkVar, @dzsi dmng dmngVar, @dzsi dndr dndrVar, @dzsi Long l, @dzsi altw altwVar, @dzsi akqi akqiVar, @dzsi dnbc dnbcVar, @dzsi dmmq dmmqVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, @dzsi String str2, @dzsi decq decqVar, @dzsi cjqm cjqmVar) {
        super(str, akraVar, cjqmVar);
        this.n = akqqVar;
        this.b = alvjVar;
        this.c = alxkVar;
        this.s = bvrt.a(dmngVar);
        this.a = bvrt.a(dmolVar);
        this.d = dndrVar;
        this.e = l;
        this.f = altwVar;
        this.g = akqiVar;
        this.t = bvrt.a(dnbcVar);
        this.h = bvrt.a(dmmqVar);
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = z5;
        this.o = str2;
        this.p = decqVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.alaq a(defpackage.dmpn r27, defpackage.akra r28, defpackage.dbsg<defpackage.cjqm> r29) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alap.a(dmpn, akra, dbsg):alaq");
    }

    public static alap b(String str, akra akraVar, akqi akqiVar, dbsg<cjqm> dbsgVar) {
        return new alap(str, akraVar, akraVar.S(), null, null, null, null, null, null, null, akqiVar, null, null, false, false, false, false, false, null, null, dbsgVar.f());
    }

    @dzsi
    public final dnbc c() {
        return (dnbc) bvrt.f(this.t, (dssr) dnbc.c.cu(7), dnbc.c);
    }

    public final String toString() {
        String sb;
        String str = this.q;
        String valueOf = String.valueOf(this.r);
        String valueOf2 = String.valueOf(this.n);
        String valueOf3 = String.valueOf(this.a);
        String valueOf4 = String.valueOf(this.b);
        String valueOf5 = String.valueOf(this.c);
        String valueOf6 = String.valueOf(this.s);
        String valueOf7 = String.valueOf(this.d);
        String valueOf8 = String.valueOf(this.e);
        String valueOf9 = String.valueOf(this.f);
        String valueOf10 = String.valueOf(this.g);
        dnbc c = c();
        if (c == null) {
            sb = "";
        } else {
            dnpo dnpoVar = c.b;
            if (dnpoVar == null) {
                dnpoVar = dnpo.t;
            }
            String str2 = dnpoVar.b;
            dnpo dnpoVar2 = c.b;
            if (dnpoVar2 == null) {
                dnpoVar2 = dnpo.t;
            }
            int i = dnpoVar2.p;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 63);
            sb2.append("logged_feature: { fprint: ");
            sb2.append(str2);
            sb2.append(",establishment_type_id: ");
            sb2.append(i);
            sb2.append(" }");
            sb = sb2.toString();
        }
        boolean z = this.i;
        boolean z2 = this.j;
        boolean z3 = this.m;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(valueOf4).length();
        int length6 = String.valueOf(valueOf5).length();
        int length7 = String.valueOf(valueOf6).length();
        int length8 = String.valueOf(valueOf7).length();
        int length9 = String.valueOf(valueOf8).length();
        int length10 = String.valueOf(valueOf9).length();
        StringBuilder sb3 = new StringBuilder(length + 57 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + String.valueOf(valueOf10).length() + String.valueOf(sb).length());
        sb3.append("ClickablePoi(");
        sb3.append(str);
        sb3.append(", ");
        sb3.append(valueOf);
        sb3.append(", ");
        sb3.append(valueOf2);
        sb3.append(", ");
        sb3.append(valueOf3);
        sb3.append(", ");
        sb3.append(valueOf4);
        sb3.append(", ");
        sb3.append(valueOf5);
        sb3.append(", ");
        sb3.append(valueOf6);
        sb3.append(", ");
        sb3.append(valueOf7);
        sb3.append(", ");
        sb3.append(valueOf8);
        sb3.append(", ");
        sb3.append(valueOf9);
        sb3.append(", ");
        sb3.append(valueOf10);
        sb3.append(", ");
        sb3.append(sb);
        sb3.append(", ");
        sb3.append(z);
        sb3.append(", ");
        sb3.append(z2);
        sb3.append(", ");
        sb3.append(z3);
        sb3.append(")");
        return sb3.toString();
    }
}
