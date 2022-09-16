package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.comment.image.ImageGalleryActivity;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: xpd  reason: default package */
/* loaded from: classes4.dex */
public final class xpd implements abv {
    final /* synthetic */ xpe a;

    public xpd(xpe xpeVar) {
        this.a = xpeVar;
    }

    @Override // defpackage.abv
    public final void a(Context context) {
        xpe xpeVar = this.a;
        if (!xpeVar.a) {
            xpeVar.a = true;
            Object lI = xpeVar.lI();
            ImageGalleryActivity imageGalleryActivity = (ImageGalleryActivity) xpeVar;
            dwq dwqVar = (dwq) lI;
            imageGalleryActivity.b = (xrw) dwqVar.a.a.ay.get();
            imageGalleryActivity.c = (xqj) dwqVar.a.a.aA.get();
        }
    }
}
