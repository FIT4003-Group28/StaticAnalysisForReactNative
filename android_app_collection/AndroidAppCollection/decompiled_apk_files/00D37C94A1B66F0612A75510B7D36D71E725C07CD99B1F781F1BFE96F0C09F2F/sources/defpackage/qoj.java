package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import com.google.android.gms.cast.framework.media.ImageHints;
/* compiled from: PG */
/* renamed from: qoj  reason: default package */
/* loaded from: classes4.dex */
public final class qoj {
    public qok a;
    public Bitmap b;
    public boolean c;
    public qoi d;
    private final Context e;
    private final ImageHints f;
    private Uri g;

    public qoj(Context context) {
        this(context, new ImageHints(-1, 0, 0));
    }

    private final void c() {
        qok qokVar = this.a;
        if (qokVar != null) {
            qokVar.cancel(true);
            this.a = null;
        }
        this.g = null;
        this.b = null;
        this.c = false;
    }

    public final void a() {
        c();
        this.d = null;
    }

    public final void b(Uri uri) {
        int i;
        if (uri == null) {
            c();
        } else if (uri.equals(this.g)) {
        } else {
            c();
            this.g = uri;
            ImageHints imageHints = this.f;
            int i2 = imageHints.b;
            if (i2 == 0 || (i = imageHints.c) == 0) {
                this.a = new qok(this.e, 0, 0, this);
            } else {
                this.a = new qok(this.e, i2, i, this);
            }
            qok qokVar = this.a;
            qnm.b(qokVar);
            Uri uri2 = this.g;
            qnm.b(uri2);
            qokVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uri2);
        }
    }

    public qoj(Context context, ImageHints imageHints) {
        this.e = context;
        this.f = imageHints;
        c();
    }
}
