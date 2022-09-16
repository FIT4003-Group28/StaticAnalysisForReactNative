package defpackage;
/* compiled from: PG */
/* renamed from: anbg  reason: default package */
/* loaded from: classes2.dex */
public final class anbg extends cjuk implements akvm {
    public final alim a;
    @dzsi
    public final akud b;
    public final dcdc<akud> c;

    public anbg(cqat cqatVar, alim alimVar) {
        this(cqatVar, alimVar, null);
    }

    private static void e(ddhh ddhhVar, dndz dndzVar) {
        dsqv<ddhk, ddet> dsqvVar = ddet.E;
        ddes bZ = ddet.D.bZ();
        deam bZ2 = dean.p.bZ();
        dneb dnebVar = dndzVar.c;
        if (dnebVar == null) {
            dnebVar = dneb.f;
        }
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dean deanVar = (dean) bZ2.b;
        dnebVar.getClass();
        deanVar.k = dnebVar;
        deanVar.a |= 64;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddet ddetVar = (ddet) bZ.b;
        dean bK = bZ2.bK();
        bK.getClass();
        ddetVar.d = bK;
        ddetVar.a |= 2;
        ddhhVar.k(dsqvVar, bZ.bK());
    }

    private static dnpo t(akud akudVar) {
        int i;
        dnpn dnpnVar;
        dmpn a = akudVar.a();
        akuf c = akudVar.c();
        akuf akufVar = akuf.PLACED_FULLY;
        int ordinal = c.ordinal();
        if (ordinal == 0) {
            i = 1;
        } else if (ordinal == 1) {
            i = 2;
        } else if (ordinal == 2) {
            i = 4;
        } else if (ordinal != 3) {
            throw new AssertionError(c);
        } else {
            i = 3;
        }
        akuf c2 = akudVar.c();
        int ordinal2 = c2.ordinal();
        if (ordinal2 == 0 || ordinal2 == 1 || ordinal2 == 2) {
            dnpnVar = dnpn.UNKNOWN_REASON;
        } else if (ordinal2 == 3) {
            dnpnVar = dnpn.TRUMPED;
        } else {
            throw new AssertionError(c2);
        }
        return anar.b(a, i, dnpnVar);
    }

    @Override // defpackage.akvm
    public final akuc a() {
        if (this.b == null) {
            return this.a.g;
        }
        return new anbf(this);
    }

    @Override // defpackage.cjuk
    protected final dwwv b() {
        dwwu bZ = dwwv.g.bZ();
        dcdc<akud> dcdcVar = this.c;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            akud akudVar = dcdcVar.get(i);
            if (anar.a(akudVar.a())) {
                dnpo t = t(akudVar);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dwwv dwwvVar = (dwwv) bZ.b;
                t.getClass();
                dwwvVar.c();
                dwwvVar.d.add(t);
            }
        }
        dhjx dhjxVar = this.a.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwwv dwwvVar2 = (dwwv) bZ.b;
        dhjxVar.getClass();
        dwwvVar2.b = dhjxVar;
        dwwvVar2.a |= 1;
        dplc bZ2 = dpld.d.bZ();
        dplf dplfVar = this.a.c;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dpld dpldVar = (dpld) bZ2.b;
        dpldVar.b = dplfVar.g;
        int i2 = dpldVar.a | 1;
        dpldVar.a = i2;
        dntk dntkVar = this.a.d;
        dntkVar.getClass();
        dpldVar.c = dntkVar;
        dpldVar.a = i2 | 8;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwwv dwwvVar3 = (dwwv) bZ.b;
        dpld bK = bZ2.bK();
        bK.getClass();
        dwwvVar3.c = bK;
        dwwvVar3.a |= 2;
        dpxk dpxkVar = this.a.e;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwwv dwwvVar4 = (dwwv) bZ.b;
        dpxkVar.getClass();
        dwwvVar4.e = dpxkVar;
        int i3 = dwwvVar4.a | 4;
        dwwvVar4.a = i3;
        int i4 = this.a.h;
        dwwvVar4.a = i3 | 8;
        dwwvVar4.f = i4;
        return bZ.bK();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e0, code lost:
        if (r10 != 2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ec, code lost:
        if (r10 == 1) goto L50;
     */
    @Override // defpackage.cjuk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final defpackage.dcdc<defpackage.ddhk> c() {
        /*
            Method dump skipped, instructions count: 956
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anbg.c():dcdc");
    }

    @Override // defpackage.cjuk
    protected final ddhn d() {
        return this.a.a;
    }

    public anbg(cqat cqatVar, alim alimVar, @dzsi akud akudVar) {
        super(cqatVar);
        this.a = alimVar;
        this.b = akudVar;
        dccx F = dcdc.F();
        F.i(alimVar.g.a());
        if (akudVar != null) {
            F.g(akudVar);
        }
        this.c = F.f();
    }
}
