package defpackage;
/* compiled from: PG */
/* renamed from: basv  reason: default package */
/* loaded from: classes3.dex */
class basv implements baql {
    private final jic a;
    private cqrp b = cqrp.c(dcyn.a);
    private Integer c = 0;

    public basv(String str) {
        this.a = new jic(str, ckqc.FIFE, ibl.i(), 250, new basu());
    }

    @Override // defpackage.baql
    public jic a() {
        return this.a;
    }

    @Override // defpackage.baql
    public cqtv b() {
        return this.b;
    }

    @Override // defpackage.baql
    public void c(int i) {
        this.b = cqrp.c(i);
    }

    @Override // defpackage.baql
    public Integer d() {
        return this.c;
    }

    @Override // defpackage.baql
    public void e(int i) {
        this.c = Integer.valueOf(i);
    }
}
