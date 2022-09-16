package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: bxt  reason: default package */
/* loaded from: classes2.dex */
public final class bxt {
    public final Object a;
    public final Throwable b;

    public bxt(Object obj) {
        this.a = obj;
        this.b = null;
    }

    public bxt(Throwable th) {
        this.b = th;
        this.a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxt)) {
            return false;
        }
        bxt bxtVar = (bxt) obj;
        Object obj2 = this.a;
        if (obj2 != null && obj2.equals(bxtVar.a)) {
            return true;
        }
        Throwable th = this.b;
        if (th != null && bxtVar.b != null) {
            return th.toString().equals(this.b.toString());
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
