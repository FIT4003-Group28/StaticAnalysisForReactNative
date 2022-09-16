package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: amaq  reason: default package */
/* loaded from: classes.dex */
public final class amaq {
    public final Intent a;

    public amaq() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static amaq a(Intent intent) {
        return new amaq(intent);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof amaq)) {
            return false;
        }
        return this.a.equals(((amaq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("SelectorContext{intent=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public amaq(Intent intent) {
        if (intent != null) {
            this.a = intent;
            return;
        }
        throw new NullPointerException("Null intent");
    }
}
