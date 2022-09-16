package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: xpx  reason: default package */
/* loaded from: classes4.dex */
public final class xpx {
    private final Context a;
    private final afts b;

    public xpx(Context context, afts aftsVar) {
        this.a = context;
        this.b = aftsVar;
    }

    public final void a(Uri uri, xpw xpwVar) {
        ylr.b();
        try {
            Drawable drawable = (Drawable) this.b.b(anek.c(vfq.b(this.a, uri)));
            if (xpwVar == null) {
                return;
            }
            xpwVar.a(drawable);
        } catch (IOException | zhy e) {
            zep.d("Failed to load image", e);
        }
    }
}
