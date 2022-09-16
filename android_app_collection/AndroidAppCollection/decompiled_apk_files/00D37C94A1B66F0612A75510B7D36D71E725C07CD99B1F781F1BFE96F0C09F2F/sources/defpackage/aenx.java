package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: aenx  reason: default package */
/* loaded from: classes.dex */
public final class aenx {
    public final String a;
    public final int b;
    public final Uri c;

    public aenx(String str, int i, Uri uri) {
        this.a = str;
        this.b = i;
        this.c = uri;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aenx)) {
            return false;
        }
        aenx aenxVar = (aenx) obj;
        return this.a.equals(aenxVar.a) && this.b == aenxVar.b && akzj.f(this.c, aenxVar.c);
    }

    public final int hashCode() {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 50);
        sb.append("PrewarmedHostInfo openedHost(");
        sb.append(str);
        sb.append("), rttMs(");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
