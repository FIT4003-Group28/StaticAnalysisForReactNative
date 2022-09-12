package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: abvn  reason: default package */
/* loaded from: classes2.dex */
public class abvn implements abpn {
    public static final /* synthetic */ int e = 0;
    private static final izf<abiu> f = new iwe(dcdc.e());
    @dzsi
    public final acwt a;
    public final abwj b;
    public final absg c;
    private final abfa g;
    private final dxio<abfb> h;
    private final akpm i;
    private final abvd j;
    private final abvi k;
    private final cjqy l;
    private Boolean m = false;
    private dcep<String> n = dcmr.a;
    private dcep<String> o = dcmr.a;
    private izf<abiu> p = f;
    private dcdc<abom> q = dcdc.e();
    public dcdc<abom> d = dcdc.e();
    private String r = "";

    public abvn(abfa abfaVar, dxio<abfb> dxioVar, akpm akpmVar, abvd abvdVar, abvi abviVar, abwj abwjVar, cjqy cjqyVar, @dzsi acwt acwtVar, absg absgVar) {
        this.a = acwtVar;
        this.g = abfaVar;
        this.h = dxioVar;
        this.i = akpmVar;
        this.j = abvdVar;
        this.k = abviVar;
        this.b = abwjVar;
        this.l = cjqyVar;
        this.c = absgVar;
        i(null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0143 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean i(@defpackage.dzsi defpackage.djrs r19, @defpackage.dzsi defpackage.djrs r20) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abvn.i(djrs, djrs):boolean");
    }

    private static dcep<String> j(@dzsi djrs djrsVar) {
        return dcbg.b(djrsVar.a).s(abvl.a).B();
    }

    @Override // defpackage.izf
    public List<abom> Pd() {
        return this.q;
    }

    @Override // defpackage.abpn
    public boolean b(@dzsi djrs djrsVar, @dzsi djrs djrsVar2) {
        boolean i = i(djrsVar, djrsVar2);
        if (i) {
            cqkx.p(this);
        }
        return i;
    }

    @Override // defpackage.abpn
    public String c() {
        return this.r;
    }

    @Override // defpackage.abpn
    public Boolean d() {
        if (!h().Pd().isEmpty()) {
            return false;
        }
        return this.m;
    }

    @Override // defpackage.abpn
    public cqkl e() {
        if (!Pd().isEmpty() && !Pd().get(0).m().booleanValue()) {
            this.a.a();
            akpm akpmVar = this.i;
            this.h.a().i(dpsv.DINING, 3, dcdc.e(), akpmVar.Y(akpmVar.n()));
        }
        return cqkl.a;
    }

    @Override // defpackage.abpn
    public abpm f() {
        return new abvm(this);
    }

    @Override // defpackage.abpn
    public cjtd g() {
        return cjtd.a(this.c == absg.AREA_EXPLORE ? dtxj.cR : dtxr.aL);
    }

    @Override // defpackage.abpn
    public izf<abiu> h() {
        return !this.g.c() ? f : this.p;
    }
}
