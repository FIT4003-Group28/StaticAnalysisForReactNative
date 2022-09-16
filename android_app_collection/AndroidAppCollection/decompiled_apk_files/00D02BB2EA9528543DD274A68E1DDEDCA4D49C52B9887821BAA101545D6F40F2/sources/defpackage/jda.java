package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: jda  reason: default package */
/* loaded from: classes7.dex */
public final class jda {
    private final Executor a;

    public jda(Executor executor) {
        this.a = executor;
    }

    public final void a(final Context context, @dzsi final Uri uri, int i, int i2, jcr jcrVar) {
        if (uri == null || i == 0 || i2 == 0) {
            jcrVar.a(null);
            return;
        }
        final jcz jczVar = new jcz(i, i2, jcrVar);
        this.a.execute(new Runnable(context, uri, jczVar) { // from class: jcy
            private final Context a;
            private final Uri b;
            private final cih c;

            {
                this.a = context;
                this.b = uri;
                this.c = jczVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = this.a;
                Uri uri2 = this.b;
                cih cihVar = this.c;
                brw<Bitmap> g = brc.d(context2).g();
                g.j(uri2);
                g.i(cihVar);
            }
        });
    }
}
