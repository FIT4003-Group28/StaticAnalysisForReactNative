package defpackage;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
/* compiled from: PG */
/* renamed from: aldt  reason: default package */
/* loaded from: classes.dex */
final class aldt implements aldk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bitmap b(Uri uri, Point point) {
        String queryParameter = uri.getQueryParameter("camera_roll");
        File file = (queryParameter == null || queryParameter.isEmpty()) ? null : new File(queryParameter);
        if (file == null) {
            return null;
        }
        int i = 1;
        if (point.x <= 96 && point.y <= 96) {
            i = 3;
        }
        String absolutePath = file.getAbsolutePath();
        if (!TextUtils.isEmpty(absolutePath)) {
            return ThumbnailUtils.createVideoThumbnail(absolutePath, i);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static avuy d(String str, String str2) {
        aopa createBuilder = avuy.a.createBuilder();
        aopa createBuilder2 = auok.a.createBuilder();
        createBuilder2.copyOnWrite();
        auok auokVar = (auok) createBuilder2.instance;
        str.getClass();
        auokVar.b |= 1;
        auokVar.c = str;
        auok auokVar2 = (auok) createBuilder2.mo39build();
        aqsf aqsfVar = aqsf.a;
        File file = new File(str2, "video_edit_proto");
        if (file.exists()) {
            aqsfVar = (aqsf) aopi.parseFrom(aqsf.a, anhe.h(file), aoos.b());
        }
        if (aqsfVar.b.size() != 1) {
            createBuilder.copyOnWrite();
            avuy avuyVar = (avuy) createBuilder.instance;
            auokVar2.getClass();
            avuyVar.c = auokVar2;
            avuyVar.b |= 1;
        } else {
            aopa createBuilder3 = aqsd.a.createBuilder();
            createBuilder3.copyOnWrite();
            aqsd aqsdVar = (aqsd) createBuilder3.instance;
            auokVar2.getClass();
            aqsdVar.c = auokVar2;
            aqsdVar.b = 2;
            aqsd aqsdVar2 = (aqsd) createBuilder3.mo39build();
            aopa mo52toBuilder = ((aqsc) aqsfVar.b.get(0)).mo52toBuilder();
            mo52toBuilder.copyOnWrite();
            aqsc aqscVar = (aqsc) mo52toBuilder.instance;
            aqsdVar2.getClass();
            aqscVar.c = aqsdVar2;
            aqscVar.b |= 1;
            aqsc aqscVar2 = (aqsc) mo52toBuilder.mo39build();
            aopa mo52toBuilder2 = aqsfVar.mo52toBuilder();
            mo52toBuilder2.copyOnWrite();
            aqsf aqsfVar2 = (aqsf) mo52toBuilder2.instance;
            aqscVar2.getClass();
            aqsfVar2.a();
            aqsfVar2.b.set(0, aqscVar2);
            createBuilder.copyOnWrite();
            avuy avuyVar2 = (avuy) createBuilder.instance;
            aqsf aqsfVar3 = (aqsf) mo52toBuilder2.mo39build();
            aqsfVar3.getClass();
            avuyVar2.d = aqsfVar3;
            avuyVar2.b = 2 | avuyVar2.b;
        }
        return (avuy) createBuilder.mo39build();
    }

    @Override // defpackage.aldk
    public final Bitmap a(ContentResolver contentResolver, Uri uri, Point point) {
        return b(uri, point);
    }

    @Override // defpackage.aldk
    public final avuy c(String str, String str2) {
        return d(str, str2);
    }
}
