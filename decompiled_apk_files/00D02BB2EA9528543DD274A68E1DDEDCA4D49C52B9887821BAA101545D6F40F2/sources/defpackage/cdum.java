package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: cdum  reason: default package */
/* loaded from: classes4.dex */
final class cdum extends cdwm {
    private final Uri a;
    private final String b;

    public cdum(Uri uri, String str) {
        if (uri != null) {
            this.a = uri;
            if (str != null) {
                this.b = str;
                return;
            }
            throw new NullPointerException("Null caption");
        }
        throw new NullPointerException("Null mediaUri");
    }

    @Override // defpackage.cdwm
    public final Uri a() {
        return this.a;
    }

    @Override // defpackage.cdwm
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cdwm) {
            cdwm cdwmVar = (cdwm) obj;
            if (this.a.equals(cdwmVar.a()) && this.b.equals(cdwmVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34 + str.length());
        sb.append("ChangeCaption{mediaUri=");
        sb.append(valueOf);
        sb.append(", caption=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
