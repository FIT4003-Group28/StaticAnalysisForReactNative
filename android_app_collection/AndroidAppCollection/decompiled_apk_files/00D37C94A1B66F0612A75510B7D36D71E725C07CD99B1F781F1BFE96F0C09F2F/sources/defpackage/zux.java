package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.libraries.youtube.edit.gallery.GalleryActivity;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zux  reason: default package */
/* loaded from: classes4.dex */
public final class zux implements abv {
    final /* synthetic */ zuy a;

    public zux(zuy zuyVar) {
        this.a = zuyVar;
    }

    @Override // defpackage.abv
    public final void a(Context context) {
        zuy zuyVar = this.a;
        if (!zuyVar.p) {
            zuyVar.p = true;
            Object lI = zuyVar.lI();
            GalleryActivity galleryActivity = (GalleryActivity) zuyVar;
            dwq dwqVar = (dwq) lI;
            galleryActivity.b = (aadd) dwqVar.a.K.get();
            galleryActivity.m = (aacz) dwqVar.a.D.get();
            galleryActivity.c = dwqVar.hM();
            galleryActivity.d = (yni) dwqVar.a.y.get();
            galleryActivity.e = (akyh) dwqVar.a.nc.get();
            galleryActivity.f = dwqVar.a.fV();
            galleryActivity.o = (aqxo) dwqVar.a.mO.get();
            galleryActivity.g = (Handler) dwqVar.a.an.get();
            galleryActivity.h = (ankw) dwqVar.a.h.get();
            galleryActivity.n = new akdy();
        }
    }
}
