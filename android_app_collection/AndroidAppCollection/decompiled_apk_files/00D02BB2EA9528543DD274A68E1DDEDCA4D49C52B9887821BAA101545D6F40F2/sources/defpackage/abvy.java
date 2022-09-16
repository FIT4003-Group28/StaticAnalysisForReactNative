package defpackage;

import com.google.ar.core.ImageMetadata;
import java.util.List;
/* compiled from: PG */
/* renamed from: abvy  reason: default package */
/* loaded from: classes.dex */
public class abvy implements abpx {
    public final List<dqer> a;
    public final btvo b;
    public final djrm c;
    public final bsmd d;
    public final abse e;
    private final akpm f;
    private final String g;
    private final cjtd h;
    private final jic i;
    private final gga j;
    private final efg k;
    @dzsi
    private final acwt l;

    public abvy(btvo btvoVar, akpm akpmVar, bsmd bsmdVar, gga ggaVar, efg efgVar, djrm djrmVar, ddho ddhoVar, @dzsi acwt acwtVar, abse abseVar) {
        dcdc f;
        this.b = btvoVar;
        this.e = abseVar;
        this.l = acwtVar;
        cjta b = cjtd.b();
        b.d = ddhoVar;
        b.g(djrmVar.q);
        if ((djrmVar.a & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0) {
            ddes bZ = ddet.D.bZ();
            ddgn bZ2 = ddgo.c.bZ();
            int i = djrmVar.r;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ddgo ddgoVar = (ddgo) bZ2.b;
            ddgoVar.a |= 1;
            ddgoVar.b = i;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddet ddetVar = (ddet) bZ.b;
            ddgo bK = bZ2.bK();
            bK.getClass();
            ddetVar.j = bK;
            ddetVar.a |= 128;
            b.s(bZ.bK());
        }
        this.h = b.a();
        this.f = akpmVar;
        ckqc ckqcVar = ckqc.FULLY_QUALIFIED;
        String str = null;
        if ((djrmVar.a & 256) != 0) {
            str = djrmVar.k;
            ckqcVar = ckqc.FIFE;
        } else if (djrmVar.e.size() > 0) {
            ily ilyVar = new ily();
            ilyVar.E(djrmVar.e.get(0));
            dwfl bJ = ilyVar.d().bJ();
            if (bJ != null && (bJ.a & 128) != 0) {
                str = bJ.h;
                ckqcVar = jfv.b(bJ);
            }
        }
        this.i = new jic(str, ckqcVar, cqta.f(), 250);
        if ((djrmVar.a & 256) == 0) {
            if (djrmVar.e.size() == 0) {
                f = dcdc.e();
            } else {
                dqeq bZ3 = dqer.c.bZ();
                String str2 = djrmVar.e.get(0).g;
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dqer dqerVar = (dqer) bZ3.b;
                str2.getClass();
                dqerVar.a |= 1;
                dqerVar.b = str2;
                f = dcdc.f(bZ3.bK());
            }
        } else {
            f = dcdc.e();
        }
        this.a = f;
        this.c = djrmVar;
        this.d = bsmdVar;
        this.j = ggaVar;
        this.k = efgVar;
        this.g = djrmVar.b;
    }

    @Override // defpackage.igw
    public Boolean a() {
        return igv.a();
    }

    @Override // defpackage.abpx
    public String b() {
        return this.g;
    }

    @Override // defpackage.abpx
    public jic c() {
        return this.i;
    }

    @Override // defpackage.abpx
    public cqkl d(final cjqm cjqmVar) {
        dhjx dhjxVar;
        acwt acwtVar = this.l;
        if (acwtVar != null) {
            acwtVar.a();
        }
        abse abseVar = this.e;
        if ((abseVar.a & 2) != 0) {
            dhjxVar = abseVar.c;
            if (dhjxVar == null) {
                dhjxVar = dhjx.f;
            }
        } else {
            dhjxVar = null;
        }
        abfe.a(dhjxVar, this.f, this.j, this.k, new Runnable(this, cjqmVar) { // from class: abvx
            private final abvy a;
            private final cjqm b;

            {
                this.a = this;
                this.b = cjqmVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                abvy abvyVar = this.a;
                bsmc a = abvyVar.d.a(abvyVar.c, this.b);
                if (!abvyVar.a.isEmpty()) {
                    a.a = abvyVar.a;
                }
                if ((abvyVar.e.a & 4) != 0 && abvyVar.b.getEnableFeatureParameters().aZ) {
                    a.b = dbsg.i(abvyVar.e.d);
                }
                a.a();
            }
        });
        return cqkl.a;
    }

    @Override // defpackage.abpx
    public cjtd e() {
        return this.h;
    }
}
