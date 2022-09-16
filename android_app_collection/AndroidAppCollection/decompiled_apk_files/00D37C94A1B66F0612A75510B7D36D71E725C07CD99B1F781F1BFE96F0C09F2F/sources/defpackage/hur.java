package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: hur  reason: default package */
/* loaded from: classes3.dex */
final class hur implements yiw {
    final /* synthetic */ axaj a;
    final /* synthetic */ hut b;

    public hur(hut hutVar, axaj axajVar) {
        this.b = hutVar;
        this.a = axajVar;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Uri uri = (Uri) obj;
        afus.b(2, 24, "VideoFX: Secondary sticker load failed");
        this.b.b.aR(this.a.mo52toBuilder());
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Drawable drawable = (Drawable) obj2;
        hut hutVar = this.b;
        axaj axajVar = this.a;
        axbl c = hut.c(axajVar.c(), (Uri) obj);
        aopa mo52toBuilder = axajVar.mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        ((axaj) mo52toBuilder.instance).e((axbm) c.mo39build());
        hutVar.b.aR(mo52toBuilder);
    }
}
