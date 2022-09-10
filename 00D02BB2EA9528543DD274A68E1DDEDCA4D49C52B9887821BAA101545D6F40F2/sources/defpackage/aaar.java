package defpackage;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aaar  reason: default package */
/* loaded from: classes2.dex */
public final class aaar {
    public final akzh a;
    private final akpm f;
    private final aadz g;
    public dbsg<akqs> c = dbpy.a;
    public dbsg<akyc> d = dbpy.a;
    public boolean e = true;
    public aaaq b = new aaaq(this);

    public aaar(akpm akpmVar, akzh akzhVar, aadz aadzVar) {
        this.f = akpmVar;
        this.a = akzhVar;
        this.g = aadzVar;
    }

    public final void a(aaco aacoVar) {
        if (this.e && aacoVar.a()) {
            if (aacoVar.a.a()) {
                b();
                return;
            }
            dbsg<akqs> dbsgVar = this.c;
            akqr akqrVar = new akqr();
            if (dbsgVar.a()) {
                akqrVar.d(dbsgVar.b().j());
                akqrVar.d(dbsgVar.b().k());
            }
            dbsg<dilu> b = aacoVar.b();
            if (!b.a()) {
                return;
            }
            for (dhyd dhydVar : b.b().b) {
                dmni dmniVar = dhydVar.e;
                if (dmniVar == null) {
                    dmniVar = dmni.f;
                }
                akqn a = aafr.a(dmniVar);
                if (a == null) {
                    int i = dmniVar.b;
                    dmti dmtiVar = dmti.WORLD_ENCODING_UNKNOWN;
                } else {
                    dmpp dmppVar = dmniVar.e;
                    if (dmppVar == null) {
                        dmppVar = dmpp.b;
                    }
                    for (dmpn dmpnVar : dmppVar.a) {
                        if ((dmpnVar.a & 4) != 0) {
                            try {
                                dmlq dmlqVar = dmpnVar.d;
                                if (dmlqVar == null) {
                                    dmlqVar = dmlq.e;
                                }
                                dmls dmlsVar = dmlqVar.b;
                                if (dmlsVar == null) {
                                    dmlsVar = dmls.c;
                                }
                                akqrVar.d(a.h(dmlsVar.b).S());
                            } catch (IOException unused) {
                            }
                        }
                    }
                }
            }
            if (akqrVar.a()) {
                c(this.b.a());
                return;
            }
            dbsg<akqs> i2 = dbsg.i(akqrVar.b());
            this.c = i2;
            this.d = dbsg.i(akyt.n(i2.b(), 50, 50, 50, 50));
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        c(this.d.c(this.b.a()));
    }

    public final void c(akyc akycVar) {
        this.g.b.d(false);
        this.f.p(akycVar);
    }
}
