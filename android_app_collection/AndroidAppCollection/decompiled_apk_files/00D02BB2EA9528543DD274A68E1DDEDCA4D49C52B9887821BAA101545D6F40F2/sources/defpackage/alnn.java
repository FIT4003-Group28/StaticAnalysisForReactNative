package defpackage;

import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: alnn  reason: default package */
/* loaded from: classes2.dex */
final class alnn implements aktx {
    final dbsl<dmpn> a;
    final alnr b;
    final alno c;
    @dzsi
    final dmrt d;
    final /* synthetic */ alns e;

    public alnn(alns alnsVar, dbsl<dmpn> dbslVar, alnr alnrVar) {
        this(alnsVar, dbslVar, alnrVar, null);
    }

    @Override // defpackage.aktx
    @dzsi
    public final dmrt a() {
        return this.d;
    }

    @Override // defpackage.aktx
    public final aktw b(dmpn dmpnVar, int i, float f) {
        dmyo dmyoVar;
        alno alnoVar = this.c;
        double floor = Math.floor(f);
        alnoVar.a = dmpnVar;
        alnoVar.b = i;
        alnoVar.c = (int) floor;
        synchronized (this.e) {
            dmyoVar = this.e.h;
        }
        return this.b.a(dmpnVar, this.c, dmyoVar);
    }

    @Override // defpackage.aktx
    @dzsi
    public final aktw c() {
        alnr alnrVar = this.b;
        if (alnrVar.c != null) {
            dmpk dmpkVar = (dmpk) dmpn.r.bZ();
            dmlp bZ = dmlq.e.bZ();
            dmls a = akxh.a(alnrVar.b);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dmlq dmlqVar = (dmlq) bZ.b;
            a.getClass();
            dmlqVar.b = a;
            dmlqVar.a |= 1;
            if (dmpkVar.c) {
                dmpkVar.bF();
                dmpkVar.c = false;
            }
            dmpn dmpnVar = (dmpn) dmpkVar.b;
            dmlq bK = bZ.bK();
            bK.getClass();
            dmpnVar.d = bK;
            dmpnVar.a |= 4;
            if (dmpkVar.c) {
                dmpkVar.bF();
                dmpkVar.c = false;
            }
            dmpn dmpnVar2 = (dmpn) dmpkVar.b;
            dmpnVar2.a |= 32;
            dmpnVar2.g = 1;
            dmpe dmpeVar = (dmpe) dmph.f.bZ();
            dmpeVar.c(alnrVar.c);
            if (dmpeVar.c) {
                dmpeVar.bF();
                dmpeVar.c = false;
            }
            dmph dmphVar = (dmph) dmpeVar.b;
            dmphVar.e = 1;
            dmphVar.a |= 4;
            if (dmpkVar.c) {
                dmpkVar.bF();
                dmpkVar.c = false;
            }
            dmpn dmpnVar3 = (dmpn) dmpkVar.b;
            dmph dmphVar2 = (dmph) dmpeVar.bK();
            dmphVar2.getClass();
            dmpnVar3.b = dmphVar2;
            dmpnVar3.a |= 1;
            akuq j = akxf.j(dmpkVar);
            if (j.c) {
                j.bF();
                j.c = false;
            }
            akus akusVar = (akus) j.b;
            akus akusVar2 = akus.o;
            akusVar.a |= 4096;
            akusVar.d = true;
            dmpkVar.k(akvj.a, j.bK());
            dsqv<dmpn, akus> dsqvVar = akvj.a;
            akuq bZ2 = akus.o.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            akus akusVar3 = (akus) bZ2.b;
            akusVar3.a |= ImageMetadata.LENS_APERTURE;
            akusVar3.j = true;
            dmpkVar.k(dsqvVar, bZ2.bK());
            return new aktw((dmpn) dmpkVar.bK(), ((alrv) alnrVar.d.d).i.e(), alns.a, true);
        }
        return alns.k;
    }

    @Override // defpackage.aktx
    public final boolean d(dmpn dmpnVar) {
        return this.a.a(dmpnVar);
    }

    public alnn(alns alnsVar, dbsl<dmpn> dbslVar, @dzsi alnr alnrVar, dmrt dmrtVar) {
        this.e = alnsVar;
        this.c = new alno(alnsVar);
        this.a = dbslVar;
        this.b = alnrVar;
        this.d = dmrtVar;
    }
}
