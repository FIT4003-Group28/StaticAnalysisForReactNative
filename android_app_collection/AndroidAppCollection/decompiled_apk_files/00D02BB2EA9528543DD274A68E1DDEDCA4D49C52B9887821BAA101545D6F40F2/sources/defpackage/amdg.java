package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: amdg  reason: default package */
/* loaded from: classes.dex */
public final class amdg implements amch {
    private final amda c;
    private final cqat d;
    private final dwwg e;
    private static final dcqe b = dcqe.c("amdg");
    static final long a = TimeUnit.DAYS.toMillis(45);

    public amdg(amda amdaVar, cqat cqatVar, dwwg dwwgVar) {
        this.c = amdaVar;
        this.d = cqatVar;
        this.e = dwwgVar;
    }

    @Override // defpackage.amch
    @dzsi
    public final alxs a(String str) {
        amyt d;
        dmwb dmwbVar;
        amyu bZ = amyv.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        amyv amyvVar = (amyv) bZ.b;
        str.getClass();
        amyvVar.a |= 2;
        amyvVar.c = str;
        amyv amyvVar2 = (amyv) bZ.b;
        amyvVar2.b = 2;
        amyvVar2.a |= 1;
        amyv bK = bZ.bK();
        try {
            d = this.c.d(bK);
        } catch (amcx | IOException unused) {
        }
        if (d == null) {
            return null;
        }
        amyx amyxVar = d.a;
        if (amyxVar == null) {
            amyxVar = amyx.f;
        }
        if (amyxVar.c.equals("1")) {
            dmwbVar = dmwb.MULTIZOOM_STYLE_TABLE;
        } else {
            amyx amyxVar2 = d.a;
            if (amyxVar2 == null) {
                amyxVar2 = amyx.f;
            }
            if (amyxVar2.c.equals("2")) {
                dmwbVar = dmwb.COMPACT_MULTIZOOM_STYLE_TABLE;
            } else {
                amyx amyxVar3 = d.a;
                if (amyxVar3 == null) {
                    amyxVar3 = amyx.f;
                }
                if (amyxVar3.c.equals("3")) {
                    dmwbVar = dmwb.COMPACT_MULTIZOOM_STYLE_TABLE_WITH_INLINING;
                } else {
                    amyx amyxVar4 = d.a;
                    if (amyxVar4 == null) {
                        amyxVar4 = amyx.f;
                    }
                    String str2 = amyxVar4.c;
                    this.c.e(bK);
                    return null;
                }
            }
        }
        try {
            byte[] G = d.b.G();
            amyx amyxVar5 = d.a;
            if (amyxVar5 == null) {
                amyxVar5 = amyx.f;
            }
            long j = amyxVar5.e;
            if (j != 0) {
                return alxz.g(anak.b(G, G.length, (int) j), dmwbVar, this.e);
            }
        } catch (IOException unused2) {
        }
        try {
            this.c.e(bK);
        } catch (amcx unused3) {
        }
        return null;
    }

    @Override // defpackage.amch
    public final boolean b(String str) {
        try {
            amda amdaVar = this.c;
            amyu bZ = amyv.d.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            amyv amyvVar = (amyv) bZ.b;
            amyvVar.b = 2;
            int i = amyvVar.a | 1;
            amyvVar.a = i;
            str.getClass();
            amyvVar.a = 2 | i;
            amyvVar.c = str;
            return amdaVar.c(bZ.bK());
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // defpackage.amch
    @dzsi
    public final alwz d(String str) {
        amyu bZ = amyv.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        amyv amyvVar = (amyv) bZ.b;
        str.getClass();
        amyvVar.a |= 2;
        amyvVar.c = str;
        amyv amyvVar2 = (amyv) bZ.b;
        amyvVar2.b = 4;
        amyvVar2.a |= 1;
        amyv bK = bZ.bK();
        try {
            amyt d = this.c.d(bK);
            if (d != null) {
                try {
                    byte[] G = d.b.G();
                    amyx amyxVar = d.a;
                    if (amyxVar == null) {
                        amyxVar = amyx.f;
                    }
                    long j = amyxVar.e;
                    if (j != 0) {
                        return alwz.a((dmnn) ((dssr) dmnn.c.cu(7)).h(new ByteArrayInputStream(anak.b(G, G.length, (int) j))));
                    }
                } catch (IOException unused) {
                }
                this.c.e(bK);
            }
        } catch (amcx | IOException unused2) {
        }
        return null;
    }

    @Override // defpackage.amch
    public final boolean e(String str) {
        try {
            amda amdaVar = this.c;
            amyu bZ = amyv.d.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            amyv amyvVar = (amyv) bZ.b;
            amyvVar.b = 4;
            int i = amyvVar.a | 1;
            amyvVar.a = i;
            str.getClass();
            amyvVar.a = i | 2;
            amyvVar.c = str;
            return amdaVar.c(bZ.bK());
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // defpackage.amch
    public final boolean f(String str, byte[] bArr) {
        int length = bArr.length;
        byte[] a2 = anak.a(bArr, length);
        amyw bZ = amyx.f.bZ();
        amyu bZ2 = amyv.d.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        amyv amyvVar = (amyv) bZ2.b;
        amyvVar.b = 4;
        int i = amyvVar.a | 1;
        amyvVar.a = i;
        str.getClass();
        amyvVar.a = i | 2;
        amyvVar.c = str;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        amyx amyxVar = (amyx) bZ.b;
        amyv bK = bZ2.bK();
        bK.getClass();
        amyxVar.b = bK;
        amyxVar.a |= 1;
        long b2 = this.d.b() + a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        amyx amyxVar2 = (amyx) bZ.b;
        int i2 = amyxVar2.a | 8;
        amyxVar2.a = i2;
        amyxVar2.d = b2;
        amyxVar2.a = i2 | 16;
        amyxVar2.e = length;
        try {
            this.c.f(bZ.bK(), a2);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // defpackage.amch
    public final boolean c(String str, byte[] bArr, dmwb dmwbVar) {
        String str2;
        if (dmwbVar == dmwb.MULTIZOOM_STYLE_TABLE) {
            str2 = "1";
        } else if (dmwbVar == dmwb.COMPACT_MULTIZOOM_STYLE_TABLE) {
            str2 = "2";
        } else if (dmwbVar != dmwb.COMPACT_MULTIZOOM_STYLE_TABLE_WITH_INLINING) {
            bvoo.h("Unsupported style table format %s", dmwbVar);
            return false;
        } else {
            str2 = "3";
        }
        int length = bArr.length;
        byte[] a2 = anak.a(bArr, length);
        amyw bZ = amyx.f.bZ();
        amyu bZ2 = amyv.d.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        amyv amyvVar = (amyv) bZ2.b;
        amyvVar.b = 2;
        int i = amyvVar.a | 1;
        amyvVar.a = i;
        str.getClass();
        amyvVar.a = i | 2;
        amyvVar.c = str;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        amyx amyxVar = (amyx) bZ.b;
        amyv bK = bZ2.bK();
        bK.getClass();
        amyxVar.b = bK;
        amyxVar.a |= 1;
        long b2 = this.d.b() + a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        amyx amyxVar2 = (amyx) bZ.b;
        int i2 = amyxVar2.a | 8;
        amyxVar2.a = i2;
        amyxVar2.d = b2;
        int i3 = i2 | 2;
        amyxVar2.a = i3;
        amyxVar2.c = str2;
        amyxVar2.a = i3 | 16;
        amyxVar2.e = length;
        try {
            this.c.f(bZ.bK(), a2);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
