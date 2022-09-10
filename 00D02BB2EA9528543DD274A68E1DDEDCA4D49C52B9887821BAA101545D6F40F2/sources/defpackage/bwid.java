package defpackage;
/* compiled from: PG */
/* renamed from: bwid  reason: default package */
/* loaded from: classes4.dex */
public class bwid implements bwhu {
    private final akfa a;

    public bwid(akfa akfaVar) {
        this.a = akfaVar;
    }

    @Override // defpackage.bwhu
    public String a() {
        btlu j = this.a.j();
        return j == null ? "" : dbsj.e(j.v());
    }

    @Override // defpackage.bwhu
    public String b() {
        return dbsj.e(this.a.o());
    }

    @Override // defpackage.bwhu
    public jic c() {
        btlu j = this.a.j();
        return new jic(j == null ? null : j.i, ckqc.FIFE_MONOGRAM_CIRCLE_CROP, 2131232998);
    }

    @Override // defpackage.bwhy
    public cqrp d() {
        return bwgq.a;
    }

    @Override // defpackage.bwhy
    public Boolean e() {
        return false;
    }
}
