package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: hus  reason: default package */
/* loaded from: classes3.dex */
final class hus implements yiw {
    final /* synthetic */ axbm a;
    final /* synthetic */ hut b;

    public hus(hut hutVar, axbm axbmVar) {
        this.b = hutVar;
        this.a = axbmVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Uri uri = (Uri) obj;
        afus.b(2, 24, "VideoFX: Secondary sticker load failed");
        this.b.b.aH((axbl) this.a.mo52toBuilder());
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Drawable drawable = (Drawable) obj2;
        hut hutVar = this.b;
        hutVar.b.aH(hut.c(this.a, (Uri) obj));
    }
}
