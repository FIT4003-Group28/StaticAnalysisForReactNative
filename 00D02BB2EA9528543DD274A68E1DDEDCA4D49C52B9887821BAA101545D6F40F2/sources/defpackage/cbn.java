package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: cbn  reason: default package */
/* loaded from: classes.dex */
public final class cbn implements caq, cbp {
    private final ContentResolver a;

    public cbn(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    @Override // defpackage.caq
    public final cap<Uri, AssetFileDescriptor> a(caz cazVar) {
        return new cbr(this);
    }

    @Override // defpackage.caq
    public final void b() {
    }

    @Override // defpackage.cbp
    public final buj<AssetFileDescriptor> c(Uri uri) {
        return new buf(this.a, uri);
    }
}
