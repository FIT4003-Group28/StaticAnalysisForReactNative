package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: azqg  reason: default package */
/* loaded from: classes2.dex */
public final class azqg implements Serializable {
    public final Throwable a;

    public azqg(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof azqg) && azst.c(this.a, ((azqg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.a + ')';
    }
}
