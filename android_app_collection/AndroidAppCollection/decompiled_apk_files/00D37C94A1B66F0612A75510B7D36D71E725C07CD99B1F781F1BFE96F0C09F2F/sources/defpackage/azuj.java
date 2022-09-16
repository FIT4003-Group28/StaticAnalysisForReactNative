package defpackage;
/* compiled from: PG */
/* renamed from: azuj  reason: default package */
/* loaded from: classes2.dex */
public final class azuj {
    public final Object a;
    public final azsc b;
    public final Object c;
    public final Throwable d;
    public final aztz e;

    public azuj(Object obj, aztz aztzVar, Throwable th) {
        this.a = obj;
        this.e = aztzVar;
        this.b = null;
        this.c = null;
        this.d = th;
    }

    public /* synthetic */ azuj(Object obj, aztz aztzVar, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : aztzVar, (i & 16) != 0 ? null : th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azuj)) {
            return false;
        }
        azuj azujVar = (azuj) obj;
        if (!azst.c(this.a, azujVar.a) || !azst.c(this.e, azujVar.e)) {
            return false;
        }
        azsc azscVar = azujVar.b;
        if (!azst.c(null, null)) {
            return false;
        }
        Object obj2 = azujVar.c;
        return azst.c(null, null) && azst.c(this.d, azujVar.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        int i = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        aztz aztzVar = this.e;
        int hashCode2 = (hashCode + (aztzVar == null ? 0 : aztzVar.hashCode())) * 29791;
        Throwable th = this.d;
        if (th != null) {
            i = th.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.e + ", onCancellation=" + ((Object) null) + ", idempotentResume=" + ((Object) null) + ", cancelCause=" + this.d + ')';
    }
}
