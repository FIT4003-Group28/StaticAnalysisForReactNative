package defpackage;
/* compiled from: PG */
/* renamed from: bepg  reason: default package */
/* loaded from: classes3.dex */
public class bepg implements bent {
    private final bwrs<ilo> a;
    private final bmel b;
    private final cjtd c;
    private final boolean[] d;

    public bepg(bmel bmelVar, bwrs<ilo> bwrsVar, boolean[] zArr) {
        this.b = bmelVar;
        this.a = bwrsVar;
        this.d = zArr;
        ilo c = bwrsVar.c();
        cjta c2 = cjtd.c(c == null ? null : c.bZ());
        c2.d = dtxv.aH;
        this.c = c2.a();
    }

    @Override // defpackage.bent
    public cjtd a() {
        return this.c;
    }

    @Override // defpackage.bent
    public cqkl b() {
        this.b.a(this.a);
        return cqkl.a;
    }

    @Override // defpackage.bent
    public Boolean c() {
        return Boolean.valueOf(this.d[0]);
    }
}
