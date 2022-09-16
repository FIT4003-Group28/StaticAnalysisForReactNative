package defpackage;
/* compiled from: PG */
/* renamed from: bcaz  reason: default package */
/* loaded from: classes3.dex */
public class bcaz {
    public static final bcba a(bbtw bbtwVar, dwfl dwflVar, String str) {
        bcba bcbaVar = new bcba();
        bcbd bZ = bcbe.f.bZ();
        boolean z = bbtwVar == bbtw.SEND_TO_SERVER_IMMEDIATELY;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bcbe bcbeVar = (bcbe) bZ.b;
        int i = bcbeVar.a | 2;
        bcbeVar.a = i;
        bcbeVar.c = z;
        dwflVar.getClass();
        bcbeVar.d = dwflVar;
        int i2 = i | 4;
        bcbeVar.a = i2;
        str.getClass();
        bcbeVar.a = i2 | 8;
        bcbeVar.e = str;
        bcbaVar.B(bvrs.d(bZ.bK()));
        return bcbaVar;
    }
}
