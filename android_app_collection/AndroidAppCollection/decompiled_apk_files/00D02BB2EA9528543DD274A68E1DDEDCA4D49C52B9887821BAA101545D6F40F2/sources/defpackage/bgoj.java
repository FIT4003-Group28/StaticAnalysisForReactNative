package defpackage;
/* compiled from: PG */
/* renamed from: bgoj  reason: default package */
/* loaded from: classes3.dex */
public class bgoj implements bgnn {
    private final diov a;
    private final jic b;
    @dzsi
    private final Runnable c;
    @dzsi
    private final acli d;

    public bgoj(dipk dipkVar, boolean z, @dzsi Runnable runnable, int i) {
        diov diovVar = dipkVar.m.get(0);
        this.a = diovVar;
        this.b = new jic(diovVar.b, ckqc.FIFE_SMART_CROP_MERGE, ibm.i(), 250);
        this.c = runnable;
        int a = dgbq.a(diovVar.a);
        if (a == 0 || a != 3) {
            this.d = null;
            return;
        }
        ddho ddhoVar = z ? dtxy.jv : dtxy.jK;
        aclh aclhVar = new aclh();
        aclhVar.a = ddhoVar;
        aclhVar.c = dipkVar.q;
        this.d = aclhVar.a();
    }

    @Override // defpackage.bgnn
    @dzsi
    public String a() {
        return this.a.b;
    }

    @Override // defpackage.bgnn
    public jic b() {
        return this.b;
    }

    @Override // defpackage.bgnn
    public Boolean c() {
        int a = dgbq.a(this.a.a);
        boolean z = false;
        if (a != 0 && a == 3) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bgnn
    public cqkl d() {
        if (c().booleanValue()) {
            this.c.run();
        }
        return cqkl.a;
    }

    @Override // defpackage.bgnn
    @dzsi
    public acli e() {
        return this.d;
    }
}
