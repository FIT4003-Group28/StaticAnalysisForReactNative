package defpackage;
/* compiled from: PG */
/* renamed from: bixz  reason: default package */
/* loaded from: classes3.dex */
public class bixz implements biwp, bega {
    private static final dcqe a = dcqe.c("bixz");
    private final bydq b;
    private boolean c = false;
    private CharSequence d = "";
    private cjtd e = cjtd.b;

    public bixz(bydq bydqVar) {
        this.b = bydqVar;
    }

    @Override // defpackage.biwp
    public Boolean a() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.biwp
    public CharSequence b() {
        return this.d;
    }

    @Override // defpackage.biwp
    public cjtd c() {
        return this.e;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        cjtd cjtdVar;
        ilo c = bwrsVar.c();
        if (c == null) {
            bvoo.h("Placemark should not be null", new Object[0]);
            return;
        }
        boolean ao = c.ao();
        this.c = ao;
        this.d = ao ? this.b.a(c.al()) : "";
        if (this.c) {
            cjta c2 = cjtd.c(c.a());
            c2.d = dtxy.mx;
            cjtdVar = c2.a();
        } else {
            cjtdVar = cjtd.b;
        }
        this.e = cjtdVar;
    }

    @Override // defpackage.bega
    public void u() {
        this.c = false;
        this.e = cjtd.b;
        this.d = "";
    }

    @Override // defpackage.bega
    public Boolean w() {
        return a();
    }
}
