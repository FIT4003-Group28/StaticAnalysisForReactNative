package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: ajnu  reason: default package */
/* loaded from: classes.dex */
final class ajnu extends ctr {
    final /* synthetic */ yiw a;
    final /* synthetic */ Uri b;

    public ajnu(yiw yiwVar, Uri uri) {
        this.a = yiwVar;
        this.b = uri;
    }

    @Override // defpackage.ctz
    public final void a(Drawable drawable) {
    }

    @Override // defpackage.ctz
    public final /* bridge */ /* synthetic */ void b(Object obj, cug cugVar) {
        this.a.b(this.b, (Bitmap) obj);
    }

    @Override // defpackage.ctr, defpackage.ctz
    public final void e(Drawable drawable) {
        yiw yiwVar = this.a;
        Uri uri = this.b;
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Load failed: ");
        sb.append(valueOf);
        yiwVar.a(uri, new ckq(sb.toString()));
    }
}
