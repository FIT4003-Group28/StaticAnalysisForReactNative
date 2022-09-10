package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cdpl  reason: default package */
/* loaded from: classes4.dex */
public class cdpl extends dbrh<docm, dmbo> {
    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ docm b(dmbo dmboVar) {
        dmbo dmboVar2 = dmboVar;
        doch bZ = docm.i.bZ();
        if ((dmboVar2.a & 1) != 0) {
            String str = dmboVar2.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            docm docmVar = (docm) bZ.b;
            str.getClass();
            docmVar.a |= 1;
            docmVar.b = str;
        }
        if ((dmboVar2.a & 2) != 0) {
            String str2 = dmboVar2.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            docm docmVar2 = (docm) bZ.b;
            str2.getClass();
            docmVar2.a |= 2;
            docmVar2.c = str2;
        }
        if ((dmboVar2.a & 4) != 0) {
            boolean z = dmboVar2.d;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            docm docmVar3 = (docm) bZ.b;
            docmVar3.a |= 4;
            docmVar3.d = z;
        }
        if ((dmboVar2.a & 8) != 0) {
            String str3 = dmboVar2.e;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            docm docmVar4 = (docm) bZ.b;
            str3.getClass();
            docmVar4.a |= 8;
            docmVar4.e = str3;
        }
        if ((dmboVar2.a & 16) != 0) {
            String str4 = dmboVar2.f;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            docm docmVar5 = (docm) bZ.b;
            str4.getClass();
            docmVar5.a |= 16;
            docmVar5.f = str4;
        }
        if ((dmboVar2.a & 32) != 0) {
            String str5 = dmboVar2.g;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            docm docmVar6 = (docm) bZ.b;
            str5.getClass();
            docmVar6.a |= 32;
            docmVar6.g = str5;
        }
        if ((dmboVar2.a & 64) != 0) {
            dbrh<dmbn, docl> k = cdpt.d().k();
            dmbn dmbnVar = dmboVar2.h;
            if (dmbnVar == null) {
                dmbnVar = dmbn.d;
            }
            docl NV = k.NV(dmbnVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            docm docmVar7 = (docm) bZ.b;
            NV.getClass();
            docmVar7.h = NV;
            docmVar7.a |= 64;
        }
        return bZ.bK();
    }

    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ dmbo c(docm docmVar) {
        docm docmVar2 = docmVar;
        dmbj bZ = dmbo.i.bZ();
        if ((docmVar2.a & 1) != 0) {
            String str = docmVar2.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dmbo dmboVar = (dmbo) bZ.b;
            str.getClass();
            dmboVar.a |= 1;
            dmboVar.b = str;
        }
        if ((docmVar2.a & 2) != 0) {
            String str2 = docmVar2.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dmbo dmboVar2 = (dmbo) bZ.b;
            str2.getClass();
            dmboVar2.a |= 2;
            dmboVar2.c = str2;
        }
        if ((docmVar2.a & 4) != 0) {
            boolean z = docmVar2.d;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dmbo dmboVar3 = (dmbo) bZ.b;
            dmboVar3.a |= 4;
            dmboVar3.d = z;
        }
        if ((docmVar2.a & 8) != 0) {
            String str3 = docmVar2.e;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dmbo dmboVar4 = (dmbo) bZ.b;
            str3.getClass();
            dmboVar4.a |= 8;
            dmboVar4.e = str3;
        }
        if ((docmVar2.a & 16) != 0) {
            String str4 = docmVar2.f;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dmbo dmboVar5 = (dmbo) bZ.b;
            str4.getClass();
            dmboVar5.a |= 16;
            dmboVar5.f = str4;
        }
        if ((docmVar2.a & 32) != 0) {
            String str5 = docmVar2.g;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dmbo dmboVar6 = (dmbo) bZ.b;
            str5.getClass();
            dmboVar6.a |= 32;
            dmboVar6.g = str5;
        }
        if ((docmVar2.a & 64) != 0) {
            dbrh<docl, dmbn> d = cdpt.d();
            docl doclVar = docmVar2.h;
            if (doclVar == null) {
                doclVar = docl.d;
            }
            dmbn NV = d.NV(doclVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dmbo dmboVar7 = (dmbo) bZ.b;
            NV.getClass();
            dmboVar7.h = NV;
            dmboVar7.a |= 64;
        }
        return bZ.bK();
    }
}
