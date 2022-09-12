package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: bjw  reason: default package */
/* loaded from: classes3.dex */
public final class bjw<V> {
    public final V a;
    public final Throwable b;

    public bjw(V v) {
        this.a = v;
        this.b = null;
    }

    public bjw(Throwable th) {
        this.b = th;
        this.a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bjw)) {
            return false;
        }
        bjw bjwVar = (bjw) obj;
        V v = this.a;
        if (v != null && v.equals(bjwVar.a)) {
            return true;
        }
        Throwable th = this.b;
        if (th != null && bjwVar.b != null) {
            return th.toString().equals(this.b.toString());
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
