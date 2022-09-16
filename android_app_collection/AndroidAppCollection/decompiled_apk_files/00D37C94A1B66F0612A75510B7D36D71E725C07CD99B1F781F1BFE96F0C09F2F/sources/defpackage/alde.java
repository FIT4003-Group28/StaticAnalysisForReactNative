package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.net.Uri;
import android.os.CancellationSignal;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import java.io.FileNotFoundException;
/* compiled from: PG */
/* renamed from: alde  reason: default package */
/* loaded from: classes.dex */
final class alde implements aldk {
    public static final String[] a = {"_id"};

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bitmap b(ContentResolver contentResolver, Uri uri, Point point) {
        try {
            Bitmap documentThumbnail = DocumentsContract.getDocumentThumbnail(contentResolver, uri, point, new CancellationSignal());
            if (documentThumbnail != null) {
                return documentThumbnail;
            }
            if (point.x <= 96 && point.y <= 96) {
                return e(contentResolver, uri, 3, new BitmapFactory.Options());
            }
            return e(contentResolver, uri, 1, new BitmapFactory.Options());
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static avuy d(String str) {
        aopa createBuilder = avuy.a.createBuilder();
        aopa createBuilder2 = auok.a.createBuilder();
        createBuilder2.copyOnWrite();
        auok auokVar = (auok) createBuilder2.instance;
        str.getClass();
        auokVar.b |= 1;
        auokVar.c = str;
        createBuilder.copyOnWrite();
        avuy avuyVar = (avuy) createBuilder.instance;
        auok auokVar2 = (auok) createBuilder2.mo39build();
        auokVar2.getClass();
        avuyVar.c = auokVar2;
        avuyVar.b |= 1;
        return (avuy) createBuilder.mo39build();
    }

    private static Bitmap e(ContentResolver contentResolver, Uri uri, int i, BitmapFactory.Options options) {
        Cursor query = contentResolver.query(uri, a, null, null, null);
        if (query == null) {
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("Content resolver did not recognize ");
            sb.append(valueOf);
            throw new FileNotFoundException(sb.toString());
        } else if (!query.moveToFirst()) {
            String valueOf2 = String.valueOf(uri);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 30);
            sb2.append("No content resolver entry for ");
            sb2.append(valueOf2);
            throw new FileNotFoundException(sb2.toString());
        } else {
            try {
                long j = query.getLong(query.getColumnIndexOrThrow("_id"));
                if (query.moveToNext()) {
                    String valueOf3 = String.valueOf(uri);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 47);
                    sb3.append("Multiple content resolver entries returned for ");
                    sb3.append(valueOf3);
                    throw new AssertionError(sb3.toString());
                }
                return MediaStore.Video.Thumbnails.getThumbnail(contentResolver, j, i, options);
            } finally {
                query.close();
            }
        }
    }

    @Override // defpackage.aldk
    public final Bitmap a(ContentResolver contentResolver, Uri uri, Point point) {
        return b(contentResolver, uri, point);
    }

    @Override // defpackage.aldk
    public final avuy c(String str, String str2) {
        return d(str);
    }
}
