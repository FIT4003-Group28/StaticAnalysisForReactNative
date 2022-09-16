package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: benz  reason: default package */
/* loaded from: classes3.dex */
public abstract class benz implements benu {
    protected final Application a;
    protected final dfzs b;
    public boolean c;
    private final bgyg d;
    private final boolean[] e;
    private final cqss f;
    private final String g;
    private final beny h;
    private boolean i;
    private cjtd j;

    /* JADX INFO: Access modifiers changed from: protected */
    public benz(Application application, dfzs dfzsVar, bgyg bgygVar, cjtd cjtdVar, beny benyVar, boolean[] zArr, String str) {
        this.a = application;
        this.b = dfzsVar;
        this.d = bgygVar;
        this.j = cjtdVar;
        this.h = benyVar;
        this.e = zArr;
        this.g = str;
        this.f = dfzsVar.d != 0 ? ibm.o() : ibm.D();
    }

    @Override // defpackage.benu
    public String d() {
        return this.g;
    }

    @Override // defpackage.benu
    public cqss e() {
        return this.f;
    }

    @Override // defpackage.benu
    public cjtd h() {
        return this.j;
    }

    @Override // defpackage.benu
    @dzsi
    public apoa j() {
        return null;
    }

    @Override // defpackage.benu
    @dzsi
    public cqfc l() {
        if (!this.c) {
            return null;
        }
        bgyg bgygVar = this.d;
        bgye bgyeVar = this.i ? bgye.EXPAND : bgye.COLLAPSE;
        cqjg cqjgVar = bemt.a;
        cqjg cqjgVar2 = bemt.b;
        benx benxVar = new benx(this);
        bgyg.a(bgygVar.a.a(), 1);
        bgyg.a(bgyeVar, 2);
        bgyg.a(cqjgVar, 3);
        bgyg.a(cqjgVar2, 4);
        bgyg.a(benxVar, 5);
        return new bgyf(bgyeVar, cqjgVar, cqjgVar2, benxVar);
    }

    @Override // defpackage.benu
    public Boolean m() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.benu
    public Boolean n() {
        return Boolean.valueOf(this.i);
    }

    @Override // defpackage.benu
    public Boolean o() {
        return Boolean.valueOf(this.e[0]);
    }

    @Override // defpackage.benu
    public cqkl p() {
        if (this.c) {
            return cqkl.a;
        }
        this.c = true;
        boolean z = true ^ this.i;
        this.i = z;
        if (z) {
            beoc beocVar = (beoc) this.h;
            benz benzVar = beocVar.a.q;
            if (this != benzVar) {
                if (benzVar != null) {
                    benzVar.r();
                }
                beocVar.a.q = this;
            }
        }
        cqkx.p(this);
        return cqkl.a;
    }

    public void q(int i) {
        if (this.j.g() == i) {
            return;
        }
        cjta c = cjtd.c(this.j);
        c.i(i);
        this.j = c.a();
        benq k = k();
        if (k == null) {
            return;
        }
        ((beoq) k).r(i);
    }

    public void r() {
        if (this.i) {
            this.c = true;
            this.i = false;
            cqkx.p(this);
        }
    }
}
