package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: cduz  reason: default package */
/* loaded from: classes4.dex */
public final class cduz extends cduu {
    public final boolean a;
    public final Uri b;
    private final long c;

    public cduz(Uri uri) {
        dzvx.c(uri, "uri");
        this.b = uri;
        this.c = uri.hashCode();
        this.a = cdyq.b(uri);
    }

    @Override // defpackage.cduu
    public final long a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof cduz) && dzvx.d(this.b, ((cduz) obj).b);
        }
        return true;
    }

    public final int hashCode() {
        Uri uri = this.b;
        if (uri != null) {
            return uri.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "CarouselMedia(uri=" + this.b + ")";
    }
}
