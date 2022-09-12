package defpackage;
/* compiled from: PG */
/* renamed from: bsti  reason: default package */
/* loaded from: classes4.dex */
public class bsti implements bstg {
    public boolean a = false;
    @dzsi
    private final jic b;
    private final dbsg<String> c;
    private final dbsg<Runnable> d;

    public bsti(dbsg<String> dbsgVar, dbsg<String> dbsgVar2, dbsg<Runnable> dbsgVar3) {
        this.c = dbsgVar2;
        this.d = dbsgVar3;
        if (dbsgVar.a()) {
            this.b = new jic(dbsgVar.b(), ckqc.FIFE, ibm.i(), 0, new bsth(this));
        } else {
            this.b = null;
        }
    }

    @Override // defpackage.igw
    public Boolean a() {
        return igv.a();
    }

    @Override // defpackage.bstg
    @dzsi
    public String b() {
        if (this.c.a()) {
            if (this.b != null && !e().booleanValue()) {
                return null;
            }
            return this.c.b();
        }
        return null;
    }

    @Override // defpackage.bstg
    @dzsi
    public jic c() {
        return this.b;
    }

    @Override // defpackage.bstg
    public cqkl d() {
        if (this.b == null || e().booleanValue()) {
            if (this.d.a()) {
                this.d.b().run();
            }
            return cqkl.a;
        }
        return cqkl.a;
    }

    @Override // defpackage.bstg
    public Boolean e() {
        boolean z = false;
        if (this.b != null && this.a) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bstg
    @dzsi
    public cjtd f() {
        return null;
    }
}
