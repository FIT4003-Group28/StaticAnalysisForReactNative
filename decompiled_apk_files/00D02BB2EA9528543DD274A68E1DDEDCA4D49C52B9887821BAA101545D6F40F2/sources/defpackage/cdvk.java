package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: cdvk  reason: default package */
/* loaded from: classes4.dex */
public final class cdvk extends cdyl {
    public int a;
    public final Uri b;

    public cdvk(Uri uri) {
        dzvx.c(uri, "uri");
        this.b = uri;
        this.a = -1;
    }

    public final int a() {
        return this.a + 1;
    }

    public final boolean b() {
        return this.a >= 0;
    }

    @Override // defpackage.cdyl
    public final boolean c(cdyl cdylVar) {
        if (dzvx.d(this, cdylVar)) {
            int i = this.a;
            if (true != (cdylVar instanceof cdvk)) {
                cdylVar = null;
            }
            cdvk cdvkVar = (cdvk) cdylVar;
            return cdvkVar != null && i == cdvkVar.a;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof cdvk) && dzvx.d(this.b, ((cdvk) obj).b);
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
        return "GalleryMedia(uri=" + this.b + ")";
    }
}
