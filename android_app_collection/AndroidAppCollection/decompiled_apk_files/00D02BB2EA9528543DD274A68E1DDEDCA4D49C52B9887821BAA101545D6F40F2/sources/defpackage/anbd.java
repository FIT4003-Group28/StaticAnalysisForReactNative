package defpackage;
/* compiled from: PG */
/* renamed from: anbd  reason: default package */
/* loaded from: classes2.dex */
public final class anbd {
    public static void a(dmpk dmpkVar, ilo iloVar, int i, boolean z) {
        dmlm dmlmVar = (dmlm) dmpkVar.h(dmnl.G);
        dmlm b = b(iloVar, i, z);
        dsqp dsqpVar = (dsqp) b.cu(5);
        dsqpVar.bC(b);
        dmll dmllVar = (dmll) dsqpVar;
        if (!dmlmVar.d.isEmpty()) {
            String str = ((dmlm) dmllVar.b).c;
            if (dmllVar.c) {
                dmllVar.bF();
                dmllVar.c = false;
            }
            dmlm dmlmVar2 = (dmlm) dmllVar.b;
            str.getClass();
            dmlmVar2.a |= 4;
            dmlmVar2.d = str;
        }
        int i2 = dmlmVar.e;
        if (i2 > 0) {
            if (dmllVar.c) {
                dmllVar.bF();
                dmllVar.c = false;
            }
            dmlm dmlmVar3 = (dmlm) dmllVar.b;
            dmlmVar3.a |= 8;
            dmlmVar3.e = i2;
        }
        int i3 = dmlmVar.f;
        if (i3 > 0) {
            if (dmllVar.c) {
                dmllVar.bF();
                dmllVar.c = false;
            }
            dmlm dmlmVar4 = (dmlm) dmllVar.b;
            dmlmVar4.a |= 16;
            dmlmVar4.f = i3;
        }
        akxf.y(dmpkVar, dmllVar.bK());
    }

    public static dmlm b(ilo iloVar, int i, boolean z) {
        cjtd bY = iloVar.bY();
        String str = bY != null ? bY.d : null;
        dmll bZ = dmlm.g.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmlm dmlmVar = (dmlm) bZ.b;
        int i2 = dmlmVar.a | 8;
        dmlmVar.a = i2;
        dmlmVar.e = i;
        if (str != null) {
            str.getClass();
            i2 |= 2;
            dmlmVar.a = i2;
            dmlmVar.c = str;
        }
        if (z) {
            if (str != null) {
                str.getClass();
                i2 |= 4;
                dmlmVar.a = i2;
                dmlmVar.d = str;
            }
            dmlmVar.a = i2 | 16;
            dmlmVar.f = i;
        }
        return bZ.bK();
    }
}
