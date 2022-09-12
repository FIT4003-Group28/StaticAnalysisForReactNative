package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
/* compiled from: PG */
/* renamed from: cbo  reason: default package */
/* loaded from: classes.dex */
public final class cbo implements caq, cbp {
    private final ContentResolver a;

    public cbo(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    @Override // defpackage.caq
    public final cap<Uri, ParcelFileDescriptor> a(caz cazVar) {
        return new cbr(this);
    }

    @Override // defpackage.caq
    public final void b() {
    }

    @Override // defpackage.cbp
    public final buj<ParcelFileDescriptor> c(Uri uri) {
        return new bur(this.a, uri);
    }
}
