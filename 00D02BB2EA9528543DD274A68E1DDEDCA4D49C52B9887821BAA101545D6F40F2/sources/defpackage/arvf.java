package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
/* compiled from: PG */
/* renamed from: arvf  reason: default package */
/* loaded from: classes2.dex */
class arvf implements arye {
    final /* synthetic */ arvh a;
    private final MediaDescriptionCompat b;
    private final boolean c;
    @dzsi
    private final cqtd d;
    @dzsi
    private final jic e;

    public arvf(arvh arvhVar, MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem, boolean z) {
        this.a = arvhVar;
        MediaDescriptionCompat mediaDescriptionCompat = mediaBrowserCompat$MediaItem.b;
        this.b = mediaDescriptionCompat;
        this.c = z;
        this.d = arvh.C(mediaDescriptionCompat.c);
        Uri uri = mediaDescriptionCompat.d;
        this.e = uri == null ? null : arvh.D(uri.toString());
    }

    @Override // defpackage.aryl
    @dzsi
    public cqtd a() {
        return this.d;
    }

    @Override // defpackage.aryl
    @dzsi
    public jic b() {
        return this.e;
    }

    @Override // defpackage.aryl
    public Boolean c() {
        return false;
    }

    @Override // defpackage.arye
    public CharSequence d() {
        CharSequence charSequence = this.b.b;
        return charSequence == null ? "" : charSequence;
    }

    @Override // defpackage.arye
    public cqkl e() {
        super/*arxa*/.am(arwz.SELECT_NEW_BROWSE_ITEM);
        String str = this.b.a;
        synchronized (this.a) {
            mg mgVar = this.a.d;
            if (mgVar != null && str != null) {
                mgVar.b(str, new Bundle());
            }
        }
        if (this.c) {
            this.a.Y();
        }
        return cqkl.a;
    }
}
