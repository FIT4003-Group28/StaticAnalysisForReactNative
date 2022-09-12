package defpackage;

import android.content.ComponentName;
import java.net.SocketAddress;
/* compiled from: PG */
/* renamed from: dexo  reason: default package */
/* loaded from: classes6.dex */
public final class dexo extends SocketAddress {
    public final ComponentName a;

    private dexo(ComponentName componentName) {
        this.a = componentName;
    }

    public static dexo a(ComponentName componentName) {
        return new dexo(componentName);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dexo) {
            return this.a.equals(((dexo) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("AndroidComponentAddress[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
