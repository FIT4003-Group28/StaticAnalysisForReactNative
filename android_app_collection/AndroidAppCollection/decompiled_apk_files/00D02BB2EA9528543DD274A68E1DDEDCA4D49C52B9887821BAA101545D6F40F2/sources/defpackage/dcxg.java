package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: dcxg  reason: default package */
/* loaded from: classes5.dex */
public final class dcxg implements Serializable {
    public static final List<dcve> a;
    public final int b;
    public final int c;
    public final int d = 1;
    public final int e;

    static {
        a().a();
        dccx F = dcdc.F();
        for (int i = 0; i < 6; i++) {
            F.g(new dcve(dcvf.a(i)));
        }
        a = F.f();
    }

    public dcxg(dcxc dcxcVar) {
        this.b = dcxcVar.a;
        this.c = dcxcVar.b;
        this.e = dcxcVar.d;
    }

    public static dcxc a() {
        return new dcxc();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dcxg) {
            dcxg dcxgVar = (dcxg) obj;
            if (this.b == dcxgVar.b && this.c == dcxgVar.c) {
                int i = dcxgVar.d;
                if (this.e == dcxgVar.e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), 1, Integer.valueOf(this.e)});
    }
}
