package defpackage;
/* compiled from: PG */
/* renamed from: ajlw  reason: default package */
/* loaded from: classes2.dex */
public final class ajlw {
    public final cjqy a;
    public final cqat b;
    private final btvo c;

    public ajlw(cjqy cjqyVar, cqat cqatVar, btvo btvoVar) {
        this.a = cjqyVar;
        this.b = cqatVar;
        this.c = btvoVar;
    }

    public static ddpn a(String str) {
        ddpn bZ = ddpz.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddpz ddpzVar = (ddpz) bZ.b;
        str.getClass();
        int i = ddpzVar.a | 1;
        ddpzVar.a = i;
        ddpzVar.d = str;
        ddpzVar.a = i | 2;
        ddpzVar.e = 0L;
        return bZ;
    }

    public final boolean b() {
        return this.c.getLocationSharingParameters().F;
    }

    public final void c(String str, int i) {
        if (b()) {
            cjqy cjqyVar = this.a;
            cjtk[] cjtkVarArr = new cjtk[1];
            cqat cqatVar = this.b;
            ddpn a = a(str);
            ddpw bZ = ddpy.c.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddpy ddpyVar = (ddpy) bZ.b;
            ddpyVar.b = i - 1;
            ddpyVar.a |= 1;
            if (a.c) {
                a.bF();
                a.c = false;
            }
            ddpz ddpzVar = (ddpz) a.b;
            ddpy bK = bZ.bK();
            ddpz ddpzVar2 = ddpz.f;
            bK.getClass();
            ddpzVar.c = bK;
            ddpzVar.b = 7;
            cjtkVarArr[0] = new ajlv(cqatVar, a, this.a.G());
            cjqyVar.u(cjtkVarArr);
        }
    }
}
