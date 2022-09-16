package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: icx  reason: default package */
/* loaded from: classes3.dex */
public final class icx {
    public final Map a = new HashMap();

    public static asov b(asov asovVar, aspb aspbVar) {
        if (aspbVar != null) {
            if ((asovVar.b & 2) != 0) {
                aspb b = aspb.b(asovVar.d);
                if (b == null) {
                    b = aspb.LIKE;
                }
                if (aspbVar.equals(b)) {
                    return asovVar;
                }
            }
            aopc aopcVar = (aopc) asovVar.mo52toBuilder();
            aopcVar.copyOnWrite();
            asov asovVar2 = (asov) aopcVar.instance;
            asovVar2.d = aspbVar.e;
            asovVar2.b |= 2;
            if (aspbVar == aspb.LIKE) {
                int i = asovVar.b;
                if ((i & 16) != 0 && (i & 8) != 0) {
                    arag aragVar = asovVar.g;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                    aopcVar.copyOnWrite();
                    asov asovVar3 = (asov) aopcVar.instance;
                    aragVar.getClass();
                    asovVar3.f = aragVar;
                    asovVar3.b |= 8;
                    arag aragVar2 = asovVar.f;
                    if (aragVar2 == null) {
                        aragVar2 = arag.a;
                    }
                    aopcVar.copyOnWrite();
                    asov asovVar4 = (asov) aopcVar.instance;
                    aragVar2.getClass();
                    asovVar4.h = aragVar2;
                    asovVar4.b |= 32;
                    aopcVar.copyOnWrite();
                    asov asovVar5 = (asov) aopcVar.instance;
                    asovVar5.g = null;
                    asovVar5.b &= -17;
                }
                c(aopcVar, asovVar);
            } else if (aspbVar == aspb.INDIFFERENT) {
                d(aopcVar, asovVar);
                c(aopcVar, asovVar);
            } else if (aspbVar == aspb.DISLIKE) {
                d(aopcVar, asovVar);
                int i2 = asovVar.b;
                if ((i2 & 512) != 0 && (i2 & 256) != 0) {
                    arag aragVar3 = asovVar.k;
                    if (aragVar3 == null) {
                        aragVar3 = arag.a;
                    }
                    aopcVar.copyOnWrite();
                    asov asovVar6 = (asov) aopcVar.instance;
                    aragVar3.getClass();
                    asovVar6.j = aragVar3;
                    asovVar6.b |= 256;
                    arag aragVar4 = asovVar.j;
                    if (aragVar4 == null) {
                        aragVar4 = arag.a;
                    }
                    aopcVar.copyOnWrite();
                    asov asovVar7 = (asov) aopcVar.instance;
                    aragVar4.getClass();
                    asovVar7.m = aragVar4;
                    asovVar7.b |= 1024;
                    aopcVar.copyOnWrite();
                    asov asovVar8 = (asov) aopcVar.instance;
                    asovVar8.k = null;
                    asovVar8.b &= -513;
                }
            }
            return (asov) aopcVar.mo39build();
        }
        return asovVar;
    }

    public static void c(aopc aopcVar, asov asovVar) {
        int i = asovVar.b;
        if ((i & 1024) == 0 || (i & 256) == 0) {
            return;
        }
        arag aragVar = asovVar.m;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        aopcVar.copyOnWrite();
        asov asovVar2 = (asov) aopcVar.instance;
        aragVar.getClass();
        asovVar2.j = aragVar;
        asovVar2.b |= 256;
        arag aragVar2 = asovVar.j;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        aopcVar.copyOnWrite();
        asov asovVar3 = (asov) aopcVar.instance;
        aragVar2.getClass();
        asovVar3.k = aragVar2;
        asovVar3.b |= 512;
        aopcVar.copyOnWrite();
        asov asovVar4 = (asov) aopcVar.instance;
        asovVar4.m = null;
        asovVar4.b &= -1025;
    }

    public static void d(aopc aopcVar, asov asovVar) {
        int i = asovVar.b;
        if ((i & 32) == 0 || (i & 8) == 0) {
            return;
        }
        arag aragVar = asovVar.h;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        aopcVar.copyOnWrite();
        asov asovVar2 = (asov) aopcVar.instance;
        aragVar.getClass();
        asovVar2.f = aragVar;
        asovVar2.b |= 8;
        arag aragVar2 = asovVar.f;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        aopcVar.copyOnWrite();
        asov asovVar3 = (asov) aopcVar.instance;
        aragVar2.getClass();
        asovVar3.g = aragVar2;
        asovVar3.b |= 16;
        aopcVar.copyOnWrite();
        asov asovVar4 = (asov) aopcVar.instance;
        asovVar4.h = null;
        asovVar4.b &= -33;
    }

    public final asov a(asov asovVar) {
        if (asovVar == null || (asovVar.b & 1) == 0) {
            return asovVar;
        }
        aspc aspcVar = asovVar.c;
        if (aspcVar == null) {
            aspcVar = aspc.a;
        }
        if ((aspcVar.b & 1) == 0) {
            return asovVar;
        }
        return b(asovVar, (aspb) this.a.get(aspcVar.c));
    }
}
