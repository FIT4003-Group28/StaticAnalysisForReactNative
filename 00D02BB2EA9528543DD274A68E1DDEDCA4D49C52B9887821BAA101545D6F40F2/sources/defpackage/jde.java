package defpackage;

import android.content.Context;
import android.net.Uri;
import android.provider.MediaStore;
/* compiled from: PG */
/* renamed from: jde  reason: default package */
/* loaded from: classes7.dex */
public final class jde implements jcx {
    private final jda a;

    public jde(jda jdaVar) {
        this.a = jdaVar;
    }

    @Override // defpackage.jcx
    public final boolean a(Uri uri) {
        String uri2 = uri.toString();
        return uri2.startsWith(MediaStore.Video.Media.EXTERNAL_CONTENT_URI.toString()) || uri2.startsWith(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI.toString());
    }

    @Override // defpackage.jcx
    public final void b(Context context, Uri uri, int i, int i2, jcr jcrVar) {
        long j;
        Uri uri2;
        dbsk.a("content".equals(uri.getScheme()));
        try {
            btou btouVar = new btou(context, uri, "_id");
            j = ((Integer) btouVar.g(btouVar.b("_id")).c(0)).intValue();
            btouVar.close();
        } catch (btnx unused) {
            j = 0;
        }
        MediaStore.Video.Thumbnails.getThumbnail(context.getContentResolver(), j, 1, null);
        btop h = btoq.h();
        h.b("_data");
        h.c("video_id = ?");
        h.d(Long.toString(j));
        try {
            btou btouVar2 = new btou(context, MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, h.a());
            Uri uri3 = (Uri) btouVar2.g(btouVar2.a("_data")).h(jdc.a).h(jdd.a).f();
            btouVar2.close();
            uri2 = uri3;
        } catch (btnx unused2) {
            uri2 = null;
        }
        this.a.a(context, uri2, i, i2, jcrVar);
    }
}
