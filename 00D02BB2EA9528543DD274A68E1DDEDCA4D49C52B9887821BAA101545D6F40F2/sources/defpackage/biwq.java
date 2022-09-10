package defpackage;
/* compiled from: PG */
/* renamed from: biwq  reason: default package */
/* loaded from: classes3.dex */
public class biwq implements biwd, bega {
    private final biwr a;
    private final bhjr b;
    private final bmgu c;
    private final bmfg d;
    private final boolean e;
    private cjtd f = cjtd.b;
    @dzsi
    private bmgs g;
    private boolean h;

    public biwq(biws biwsVar, bhjr bhjrVar, bmgu bmguVar, bmfg bmfgVar) {
        ff ffVar = (ff) ((dxjd) biwsVar.a).a;
        biws.a(ffVar, 1);
        btvo a = biwsVar.b.a();
        biws.a(a, 2);
        cjqy a2 = biwsVar.c.a();
        biws.a(a2, 3);
        begg a3 = biwsVar.d.a();
        biws.a(a3, 4);
        this.a = new biwr(ffVar, a, a2, a3);
        this.b = bhjrVar;
        this.c = bmguVar;
        this.d = bmfgVar;
        this.e = bmfg.a();
    }

    @Override // defpackage.biwd
    public cjtd b() {
        return this.f;
    }

    @Override // defpackage.biwd
    @dzsi
    public bmgs c() {
        return this.g;
    }

    @Override // defpackage.biwd
    public Boolean d() {
        return Boolean.valueOf(this.h);
    }

    @Override // defpackage.biwd
    /* renamed from: e */
    public biwr a() {
        return this.a;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        this.a.t(bwrsVar);
        this.b.t(bwrsVar);
        ilo c = bwrsVar.c();
        dbsk.s(c);
        cjta c2 = cjtd.c(c.bZ());
        c2.d = dtxy.hk;
        this.f = c2.a();
        cjta c3 = cjtd.c(c.bZ());
        c3.d = dtxy.ih;
        if (this.e) {
            boolean c4 = this.d.c(c, 3);
            this.h = c4;
            if (!c4) {
                return;
            }
            this.g = this.c.a(bwrsVar, bmfa.ADDRESS, c3.a());
        }
    }

    @Override // defpackage.bega
    public void u() {
        this.a.u();
        this.b.u();
        this.h = false;
        this.g = null;
    }

    @Override // defpackage.bega
    public Boolean w() {
        return true;
    }
}
