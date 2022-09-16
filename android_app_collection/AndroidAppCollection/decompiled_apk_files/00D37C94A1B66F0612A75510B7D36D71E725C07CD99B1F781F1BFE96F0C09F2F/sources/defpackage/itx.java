package defpackage;
/* compiled from: PG */
/* renamed from: itx  reason: default package */
/* loaded from: classes3.dex */
public final class itx {
    public aqya a;

    public itx(aqya aqyaVar) {
        c(aqyaVar);
    }

    public final awar a() {
        aqyb aqybVar = this.a.h;
        if (aqybVar == null) {
            aqybVar = aqyb.a;
        }
        awar awarVar = aqybVar.e;
        return awarVar == null ? awar.a : awarVar;
    }

    public final void b(awar awarVar) {
        aopc aopcVar = (aopc) this.a.mo52toBuilder();
        aqyb aqybVar = this.a.h;
        if (aqybVar == null) {
            aqybVar = aqyb.a;
        }
        aopa mo52toBuilder = aqybVar.mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        aqyb aqybVar2 = (aqyb) mo52toBuilder.instance;
        awarVar.getClass();
        aqybVar2.e = awarVar;
        aqybVar2.b |= 64;
        aopcVar.copyOnWrite();
        aqya aqyaVar = (aqya) aopcVar.instance;
        aqyb aqybVar3 = (aqyb) mo52toBuilder.mo39build();
        aqybVar3.getClass();
        aqyaVar.h = aqybVar3;
        aqyaVar.b |= 128;
        this.a = (aqya) aopcVar.mo39build();
    }

    public final void c(aqya aqyaVar) {
        this.a = aqyaVar;
        aqyb aqybVar = aqyaVar.h;
        if (aqybVar == null) {
            aqybVar = aqyb.a;
        }
        aqxo.y((aqybVar.b & 64) != 0);
    }

    public final byte[] d() {
        return a().D.I();
    }

    public final int e() {
        awas awasVar = a().x;
        if (awasVar == null) {
            awasVar = awas.a;
        }
        int Z = awwc.Z(awasVar.b);
        if (Z == 0) {
            return 1;
        }
        return Z;
    }
}
