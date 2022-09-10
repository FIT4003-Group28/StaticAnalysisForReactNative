package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: cbq  reason: default package */
/* loaded from: classes.dex */
public final class cbq implements caq, cbp {
    private final ContentResolver a;

    public cbq(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    @Override // defpackage.caq
    public final cap<Uri, InputStream> a(caz cazVar) {
        return new cbr(this);
    }

    @Override // defpackage.caq
    public final void b() {
    }

    @Override // defpackage.cbp
    public final buj<InputStream> c(Uri uri) {
        return new bva(this.a, uri);
    }
}
