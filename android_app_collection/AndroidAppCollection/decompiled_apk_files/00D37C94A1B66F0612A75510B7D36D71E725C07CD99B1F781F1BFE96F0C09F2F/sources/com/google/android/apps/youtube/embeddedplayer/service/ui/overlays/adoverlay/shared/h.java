package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared;

import android.graphics.Bitmap;
import android.net.Uri;
/* compiled from: PG */
/* loaded from: classes2.dex */
final class h implements yiw {
    final /* synthetic */ i a;

    public h(i iVar) {
        this.a = iVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        String valueOf = String.valueOf((Uri) obj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
        sb.append("Couldn't retrieve thumbnail from [uri=");
        sb.append(valueOf);
        sb.append("]");
        zep.d(sb.toString(), exc);
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Uri uri = (Uri) obj;
        this.a.a.p((Bitmap) obj2);
    }
}
