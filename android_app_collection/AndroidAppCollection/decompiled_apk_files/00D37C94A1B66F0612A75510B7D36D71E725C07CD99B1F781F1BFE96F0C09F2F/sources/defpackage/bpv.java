package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: bpv  reason: default package */
/* loaded from: classes2.dex */
public final class bpv {
    public final Uri a;
    public final boolean b;

    public bpv(Uri uri, boolean z) {
        this.a = uri;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bpv bpvVar = (bpv) obj;
            if (this.b == bpvVar.b && this.a.equals(bpvVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (this.b ? 1 : 0);
    }
}
