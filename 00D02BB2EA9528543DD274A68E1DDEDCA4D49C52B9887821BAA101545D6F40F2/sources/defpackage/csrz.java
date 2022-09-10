package defpackage;
/* compiled from: PG */
/* renamed from: csrz  reason: default package */
/* loaded from: classes5.dex */
public final class csrz {
    private final dbty<cspn> a;
    private final cspk b;
    private final csnj c;

    public csrz(dbty dbtyVar, csnj csnjVar, cspk cspkVar) {
        this.a = dbud.a(dbtyVar);
        this.c = csnjVar;
        this.b = cspkVar;
    }

    private final cspa e() {
        csoz bZ = cspa.e.bZ();
        String str = ((cspl) this.b).b;
        if (str != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            cspa cspaVar = (cspa) bZ.b;
            str.getClass();
            cspaVar.a |= 16;
            cspaVar.d = str;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cspa cspaVar2 = (cspa) bZ.b;
        cspaVar2.a |= 2;
        cspaVar2.b = 1;
        String str2 = ((cspl) this.b).a;
        cspa cspaVar3 = (cspa) bZ.b;
        str2.getClass();
        cspaVar3.a |= 4;
        cspaVar3.c = str2;
        return bZ.bK();
    }

    public final void a(boolean z) {
        c(1001, z);
    }

    public final void b(boolean z) {
        c(1002, z);
    }

    public final void c(int i, boolean z) {
        if (!this.c.a(0L)) {
            return;
        }
        cspn a = this.a.a();
        csoy bZ = cspb.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cspb cspbVar = (cspb) bZ.b;
        cspbVar.a |= 32;
        cspbVar.d = 0;
        cspa e = e();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cspb cspbVar2 = (cspb) bZ.b;
        e.getClass();
        cspbVar2.e = e;
        cspbVar2.a |= 64;
        cspg bZ2 = csph.d.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        csph csphVar = (csph) bZ2.b;
        csphVar.a |= 1;
        csphVar.b = z;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cspb cspbVar3 = (cspb) bZ.b;
        csph bK = bZ2.bK();
        bK.getClass();
        cspbVar3.c = bK;
        cspbVar3.b = 1;
        a.a(i, bZ.bK());
    }

    public final void d(int i, boolean z) {
        if (!this.c.a(0L)) {
            return;
        }
        cspn a = this.a.a();
        csoy bZ = cspb.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cspb cspbVar = (cspb) bZ.b;
        cspbVar.a |= 32;
        cspbVar.d = 0;
        cspa e = e();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cspb cspbVar2 = (cspb) bZ.b;
        e.getClass();
        cspbVar2.e = e;
        cspbVar2.a |= 64;
        cspg bZ2 = csph.d.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        csph csphVar = (csph) bZ2.b;
        int i2 = csphVar.a | 1;
        csphVar.a = i2;
        csphVar.b = true;
        csphVar.a = i2 | 2;
        csphVar.c = z;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cspb cspbVar3 = (cspb) bZ.b;
        csph bK = bZ2.bK();
        bK.getClass();
        cspbVar3.c = bK;
        cspbVar3.b = 1;
        a.a(i, bZ.bK());
    }
}
