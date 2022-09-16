package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ncz  reason: default package */
/* loaded from: classes3.dex */
public final class ncz {
    private final String a;
    private final String b;

    public ncz(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ncz) {
            ncz nczVar = (ncz) obj;
            if (akzj.f(this.a, nczVar.a) && akzj.f(this.b, nczVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
