package defpackage;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.provider.MediaStore;
/* compiled from: PG */
/* renamed from: jdb  reason: default package */
/* loaded from: classes7.dex */
public final class jdb implements jcx {
    private final jda a;
    private final Application b;

    public jdb(jda jdaVar, Application application) {
        this.a = jdaVar;
        this.b = application;
    }

    @Override // defpackage.jcx
    public final boolean a(Uri uri) {
        String uri2 = uri.toString();
        if (uri2.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || uri2.startsWith(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI.toString()) || uri2.endsWith(".jpg") || uri2.endsWith(".png")) {
            return true;
        }
        String type = this.b.getContentResolver().getType(uri);
        if (type == null) {
            return false;
        }
        return type.equals("image/jpeg") || type.equals("image/png");
    }

    @Override // defpackage.jcx
    public final void b(Context context, Uri uri, int i, int i2, jcr jcrVar) {
        this.a.a(context, uri, i, i2, jcrVar);
    }
}
