package defpackage;
/* compiled from: PG */
/* renamed from: bgvn  reason: default package */
/* loaded from: classes3.dex */
public class bgvn implements bgvk {
    private final dgck a;
    private final bwrs<ilo> b;
    private final bgvf c;

    public bgvn(bgvf bgvfVar, dgck dgckVar, bwrs<ilo> bwrsVar) {
        dbsk.l(true);
        this.c = bgvfVar;
        this.a = dgckVar;
        this.b = bwrsVar;
    }

    @Override // defpackage.bgvk
    public String a() {
        bgvf bgvfVar = this.c;
        dgcq b = dgcq.b(this.a.a);
        if (b == null) {
            b = dgcq.UNKNOWN_ACTION_TYPE;
        }
        bgvd bgvdVar = bgvfVar.a.get(b);
        return bgvdVar == null ? b.name() : bgvdVar.a();
    }

    @Override // defpackage.bgvk
    public cqkl b() {
        bgvf bgvfVar = this.c;
        dgcq b = dgcq.b(this.a.a);
        if (b == null) {
            b = dgcq.UNKNOWN_ACTION_TYPE;
        }
        bwrs<ilo> bwrsVar = this.b;
        bgvd bgvdVar = bgvfVar.a.get(b);
        if (bgvdVar != null) {
            bgvdVar.c(bwrsVar);
        }
        return cqkl.a;
    }

    @Override // defpackage.bgvk
    public cjtd c() {
        bgvf bgvfVar = this.c;
        dgcq b = dgcq.b(this.a.a);
        if (b == null) {
            b = dgcq.UNKNOWN_ACTION_TYPE;
        }
        bgvd bgvdVar = bgvfVar.a.get(b);
        cjtd cjtdVar = null;
        ddho b2 = bgvdVar == null ? null : bgvdVar.b();
        if (b2 == null) {
            return null;
        }
        ilo iloVar = (ilo) bwrs.b(this.b);
        if (iloVar != null) {
            cjtdVar = iloVar.a();
        }
        cjta c = cjtd.c(cjtdVar);
        c.d = b2;
        return c.a();
    }
}
