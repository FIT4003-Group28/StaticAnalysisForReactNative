package com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.remoteloaded;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.apps.youtube.embeddedplayer.service.model.BitmapKey;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class f implements yiw {
    private final /* synthetic */ int a;

    public f() {
    }

    public f(int i) {
        this.a = i;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        if (this.a == 0) {
            BitmapKey bitmapKey = (BitmapKey) obj;
        } else {
            Uri uri = (Uri) obj;
        }
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        if (this.a == 0) {
            BitmapKey bitmapKey = (BitmapKey) obj;
            Bitmap bitmap = (Bitmap) obj2;
            return;
        }
        Uri uri = (Uri) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
    }
}
