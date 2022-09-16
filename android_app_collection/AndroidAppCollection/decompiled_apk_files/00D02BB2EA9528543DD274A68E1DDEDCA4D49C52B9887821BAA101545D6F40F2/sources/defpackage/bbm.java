package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: bbm  reason: default package */
/* loaded from: classes3.dex */
public final class bbm {
    public final Uri a;
    public final boolean b;

    public bbm(Uri uri, boolean z) {
        this.a = uri;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bbm bbmVar = (bbm) obj;
            if (this.b == bbmVar.b && this.a.equals(bbmVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (this.b ? 1 : 0);
    }
}
