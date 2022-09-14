package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: crxs  reason: default package */
/* loaded from: classes5.dex */
public final class crxs extends dars {
    public final InputStream a;

    public crxs(crxu crxuVar, Uri uri) {
        this.a = crxuVar.a.getContentResolver().openInputStream(uri);
    }

    @Override // defpackage.darx
    public final long a() {
        try {
            return this.a.available();
        } catch (IOException unused) {
            return 0L;
        }
    }

    @Override // defpackage.darx
    public final boolean b() {
        return true;
    }

    @Override // defpackage.dars
    public final InputStream c() {
        return this.a;
    }
}
