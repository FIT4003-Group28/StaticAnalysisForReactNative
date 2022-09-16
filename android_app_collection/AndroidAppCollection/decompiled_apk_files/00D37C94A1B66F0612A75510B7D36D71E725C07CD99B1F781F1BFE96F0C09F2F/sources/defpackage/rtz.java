package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: rtz  reason: default package */
/* loaded from: classes4.dex */
public final class rtz implements qsm {
    public static final rtz a = new rtz();
    private final boolean b = false;
    private final boolean c = false;
    private final String d = null;
    private final boolean e = false;
    private final boolean i = false;
    private final String g = null;
    private final String h = null;
    private final Long j = null;
    private final Long k = null;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rtz)) {
            return false;
        }
        rtz rtzVar = (rtz) obj;
        boolean z = rtzVar.b;
        boolean z2 = rtzVar.c;
        String str = rtzVar.d;
        if (tnk.j(null, null)) {
            boolean z3 = rtzVar.e;
            boolean z4 = rtzVar.i;
            String str2 = rtzVar.g;
            if (tnk.j(null, null)) {
                String str3 = rtzVar.h;
                if (tnk.j(null, null)) {
                    Long l = rtzVar.j;
                    if (tnk.j(null, null)) {
                        Long l2 = rtzVar.k;
                        if (tnk.j(null, null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{false, false, null, false, false, null, null, null, null});
    }
}
