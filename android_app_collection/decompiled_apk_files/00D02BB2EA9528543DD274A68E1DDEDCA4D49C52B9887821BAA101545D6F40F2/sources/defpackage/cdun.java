package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: cdun  reason: default package */
/* loaded from: classes4.dex */
final class cdun extends cdwp {
    private final Uri a;

    public cdun(Uri uri) {
        if (uri != null) {
            this.a = uri;
            return;
        }
        throw new NullPointerException("Null mediaUri");
    }

    @Override // defpackage.cdwp
    public final Uri a() {
        return this.a;
    }

    @Override // defpackage.cdwp
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cdwp) {
            cdwp cdwpVar = (cdwp) obj;
            if (this.a.equals(cdwpVar.a()) && !cdwpVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ 1237;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
        sb.append("Select{mediaUri=");
        sb.append(valueOf);
        sb.append(", selected=");
        sb.append(false);
        sb.append("}");
        return sb.toString();
    }
}
