package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ahjt  reason: default package */
/* loaded from: classes.dex */
public final class ahjt {
    public volatile ahjs a;
    public volatile ahjs b;
    public volatile ahjs c;

    public ahjt() {
        this.a = ahjs.UNKNOWN;
        this.b = ahjs.UNKNOWN;
        this.c = ahjs.UNKNOWN;
    }

    public ahjt(ahjt ahjtVar) {
        this.a = ahjtVar.a;
        this.b = ahjtVar.b;
        this.c = ahjtVar.c;
    }

    public static int e(ahjs ahjsVar) {
        ahjs ahjsVar2 = ahjs.UNKNOWN;
        int ordinal = ahjsVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return 3;
            }
            if (ordinal == 3) {
                return 4;
            }
            return ordinal != 4 ? 1 : 5;
        }
        return 2;
    }

    public final boolean a() {
        return c(ahjs.ENABLED);
    }

    public final boolean b() {
        if (c(ahjs.DISABLED_BY_SETTING)) {
            dcdc g = dcdc.g(ahjs.DISABLED_BY_SETTING, ahjs.HARDWARE_MISSING);
            return g.contains(this.a) && g.contains(this.c) && g.contains(this.b);
        }
        return false;
    }

    public final boolean c(ahjs ahjsVar) {
        return this.a == ahjsVar || this.c == ahjsVar || this.b == ahjsVar;
    }

    public final ddmw d() {
        ddmv bZ = ddmw.l.bZ();
        int e = e(this.a);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddmw ddmwVar = (ddmw) bZ.b;
        ddmwVar.b = e - 1;
        ddmwVar.a |= 1;
        int e2 = e(this.b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddmw ddmwVar2 = (ddmw) bZ.b;
        ddmwVar2.c = e2 - 1;
        ddmwVar2.a |= 2;
        int e3 = e(this.c);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddmw ddmwVar3 = (ddmw) bZ.b;
        ddmwVar3.d = e3 - 1;
        ddmwVar3.a |= 4;
        return bZ.bK();
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof ahjt)) {
            ahjt ahjtVar = (ahjt) obj;
            if (this.a == ahjtVar.a && this.b == ahjtVar.b && this.c == ahjtVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        return "GmmLocationControllerState[gps = " + this.a + ", cell = " + this.b + ", wifi = " + this.c + "]";
    }
}
