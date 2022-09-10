package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: cukq  reason: default package */
/* loaded from: classes5.dex */
public final class cukq implements cukr {
    @Override // defpackage.cukr
    public final Bitmap a(Context context, Uri uri, int i, int i2) {
        try {
            brw<Bitmap> g = brc.d(context).g();
            g.j(uri);
            return g.e(new chw().t(cco.a, 100).A(cdi.c, new ccv(), true)).d(i, i2).get();
        } catch (InterruptedException | ExecutionException unused) {
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
            sb.append("Glide was unable to load image.");
            sb.append(valueOf);
            sb.toString();
            cstl.a("GlideUriLoader");
            return null;
        }
    }
}
