package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import java.net.SocketAddress;
/* compiled from: PG */
/* renamed from: aybz  reason: default package */
/* loaded from: classes2.dex */
public final class aybz extends SocketAddress {
    private static final long serialVersionUID = 0;
    public final Intent a;

    protected aybz(Intent intent) {
        aqxo.q(intent.getComponent() != null, "Missing required component");
        this.a = intent;
    }

    public static aybz b(ComponentName componentName) {
        return new aybz(new Intent("grpc.io.action.BIND").setComponent(componentName));
    }

    public final ComponentName a() {
        return this.a.getComponent();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aybz) {
            return this.a.filterEquals(((aybz) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.filterHashCode();
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
