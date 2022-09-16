package defpackage;

import java.io.Serializable;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: alvj  reason: default package */
/* loaded from: classes2.dex */
public final class alvj implements Serializable {
    public final int a;
    private final int b;
    private final int c;
    private final int d;

    private alvj(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.a = i4;
    }

    public static alvj a(dndc dndcVar) {
        int i = dndcVar.a;
        int i2 = (i & 2) != 0 ? dndcVar.c : -1;
        int i3 = (i & 4) != 0 ? dndcVar.d : -1;
        int i4 = (i & 8) != 0 ? dndcVar.e : -1;
        int a = dndf.a(dndcVar.b);
        if (a == 0) {
            a = 1;
        }
        return new alvj(i2, i3, i4, a - 1);
    }

    public final dnbv b() {
        dndb bZ = dndc.f.bZ();
        int i = this.b;
        if (i != -1) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dndc dndcVar = (dndc) bZ.b;
            dndcVar.a |= 2;
            dndcVar.c = i;
        }
        int i2 = this.c;
        if (i2 != -1) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dndc dndcVar2 = (dndc) bZ.b;
            dndcVar2.a |= 4;
            dndcVar2.d = i2;
        }
        int i3 = this.d;
        if (i3 != -1) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dndc dndcVar3 = (dndc) bZ.b;
            dndcVar3.a |= 8;
            dndcVar3.e = i3;
        }
        int a = dndf.a(this.a);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dndc dndcVar4 = (dndc) bZ.b;
        int i4 = a - 1;
        if (a != 0) {
            dndcVar4.b = i4;
            dndcVar4.a |= 1;
            dnbu bZ2 = dnbv.c.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dnbv dnbvVar = (dnbv) bZ2.b;
            dndc bK = bZ.bK();
            bK.getClass();
            dnbvVar.b = bK;
            dnbvVar.a |= 1;
            return bZ2.bK();
        }
        throw null;
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alvj)) {
            return false;
        }
        alvj alvjVar = (alvj) obj;
        return this.b == alvjVar.b && this.c == alvjVar.c && this.d == alvjVar.d && this.a == alvjVar.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.a)});
    }

    public final String toString() {
        dbsb d = dbsc.d(alvj.class.getSimpleName());
        d.f("adsResponseId", this.b);
        d.f("textAdIndex", this.c);
        d.f("textAdLocationIndex", this.d);
        d.f("adType", this.a);
        return d.toString();
    }
}
