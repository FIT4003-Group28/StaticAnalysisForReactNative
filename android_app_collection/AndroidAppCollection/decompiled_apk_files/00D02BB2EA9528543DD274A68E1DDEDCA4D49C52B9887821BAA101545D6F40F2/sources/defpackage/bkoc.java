package defpackage;
/* compiled from: PG */
/* renamed from: bkoc  reason: default package */
/* loaded from: classes3.dex */
public class bkoc implements bkoa {
    private cjtd a = cjtd.b;
    @dzsi
    private bkob b = null;
    private boolean c = true;

    @Override // defpackage.bkoa
    public cqkl a() {
        bkob bkobVar = this.b;
        if (bkobVar != null) {
            ((bklu) bkobVar).a.j();
        }
        return cqkl.a;
    }

    @Override // defpackage.bkoa
    public Boolean b() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.bkoa
    public cjtd c() {
        return this.a;
    }

    public void d() {
        this.c = false;
    }

    public void e(bkob bkobVar) {
        this.b = bkobVar;
    }

    public void f(bwrs<ilo> bwrsVar) {
        cjtd cjtdVar;
        if (bwrsVar.c() != null) {
            ilo c = bwrsVar.c();
            dbsk.s(c);
            cjta c2 = cjtd.c(c.ca());
            c2.d = dtxv.ay;
            cjtdVar = c2.a();
        } else {
            cjtdVar = cjtd.b;
        }
        this.a = cjtdVar;
    }
}
