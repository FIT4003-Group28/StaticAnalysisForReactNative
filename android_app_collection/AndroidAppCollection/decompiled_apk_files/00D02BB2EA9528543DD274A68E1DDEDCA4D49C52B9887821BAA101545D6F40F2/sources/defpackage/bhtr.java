package defpackage;
/* compiled from: PG */
/* renamed from: bhtr  reason: default package */
/* loaded from: classes3.dex */
public class bhtr implements cqkp, bega {
    public final akpm a;
    public final avik b;
    @dzsi
    public bwrs<ilo> c;
    private final bvrb d;

    public bhtr(akpm akpmVar, bvrb bvrbVar, avik avikVar) {
        this.a = akpmVar;
        this.d = bvrbVar;
        this.b = avikVar;
    }

    public Boolean a() {
        return Boolean.valueOf(this.c.c().aS());
    }

    public cqkl b() {
        this.d.a(new bhtq(this), bvrj.UI_THREAD, 10L);
        return cqkl.a;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        this.c = bwrsVar;
    }

    @Override // defpackage.bega
    public void u() {
        this.c = null;
    }

    @Override // defpackage.bega
    public Boolean w() {
        return a();
    }
}
