package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class c implements yiw {
    final /* synthetic */ e a;
    private final String b;

    public c(e eVar, String str) {
        this.a = eVar;
        zgh.n(str, "videoId cannot be null or empty");
        this.b = str;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Uri uri = (Uri) obj;
        zep.d("Error loading DefaultThumbnailLoader", exc);
        this.a.c();
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Uri uri = (Uri) obj;
        Bitmap bitmap = (Bitmap) obj2;
        e eVar = this.a;
        g gVar = eVar.e;
        String str = this.b;
        boolean e = eVar.e();
        boolean d = this.a.d();
        alyq alyqVar = gVar.a;
        if (alyqVar != null) {
            try {
                Parcel pv = alyqVar.pv();
                dve.g(pv, bitmap);
                pv.writeString(str);
                dve.e(pv, e);
                dve.e(pv, d);
                alyqVar.px(1, pv);
            } catch (RemoteException unused) {
            }
        }
    }
}
