package defpackage;
/* compiled from: PG */
/* renamed from: cxih  reason: default package */
/* loaded from: classes5.dex */
public final class cxih {
    private final dbty<cxgi> a;
    private final cxgq b;
    private final dsmc c;
    private final csnj d;

    public cxih(dbty dbtyVar, csnj csnjVar, cxgq cxgqVar, dsmc dsmcVar) {
        this.a = dbud.a(dbtyVar);
        this.d = csnjVar;
        this.b = cxgqVar;
        this.c = dsmcVar;
    }

    public static cxih a(final cxgj cxgjVar, csnj csnjVar, cxgq cxgqVar, cxgg cxggVar) {
        cxgjVar.getClass();
        dbty dbtyVar = new dbty(cxgjVar) { // from class: cxig
            private final cxgj a;

            {
                this.a = cxgjVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return new cxgi(this.a.a);
            }
        };
        dsmb bZ = dsmc.d.bZ();
        cxgh cxghVar = (cxgh) cxggVar;
        String str = cxghVar.a;
        String str2 = cxghVar.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("#");
        sb.append(str2);
        String sb2 = sb.toString();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dsmc dsmcVar = (dsmc) bZ.b;
        sb2.getClass();
        int i = dsmcVar.a | 1;
        dsmcVar.a = i;
        dsmcVar.b = sb2;
        dsmcVar.a = i | 2;
        dsmcVar.c = 1;
        return new cxih(dbtyVar, csnjVar, cxgqVar, bZ.bK());
    }

    public final void b(int i, long j, dskf dskfVar) {
        c(i, false, j, dskfVar, null, null, null);
    }

    public final void c(int i, boolean z, long j, dskf dskfVar, dsld dsldVar, Boolean bool, Boolean bool2) {
        if (!this.b.c()) {
            return;
        }
        long d = this.b.d();
        if (!this.d.a(d)) {
            return;
        }
        dslb bZ = dsle.h.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dsle dsleVar = (dsle) bZ.b;
        int i2 = dsleVar.a | 1;
        dsleVar.a = i2;
        dsleVar.b = z;
        int i3 = i2 | 4;
        dsleVar.a = i3;
        dsleVar.d = j;
        if (dskfVar != null) {
            dsleVar.c = dskfVar.w;
            i3 |= 2;
            dsleVar.a = i3;
        }
        if (dsldVar != null) {
            dsleVar.e = dsldVar.e;
            dsleVar.a = i3 | 8;
        }
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dsle dsleVar2 = (dsle) bZ.b;
            dsleVar2.a |= 16;
            dsleVar2.f = booleanValue;
        }
        if (bool2 != null) {
            boolean booleanValue2 = bool2.booleanValue();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dsle dsleVar3 = (dsle) bZ.b;
            dsleVar3.a |= 32;
            dsleVar3.g = booleanValue2;
        }
        cxgi a = this.a.a();
        dsma bZ2 = dsmd.f.bZ();
        int i4 = (int) d;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dsmd dsmdVar = (dsmd) bZ2.b;
        int i5 = dsmdVar.a | 64;
        dsmdVar.a = i5;
        dsmdVar.d = i4;
        dsmc dsmcVar = this.c;
        dsmcVar.getClass();
        dsmdVar.e = dsmcVar;
        dsmdVar.a = i5 | 128;
        dsle bK = bZ.bK();
        bK.getClass();
        dsmdVar.c = bK;
        dsmdVar.b = 8;
        a.b(i, bZ2.bK());
    }
}
