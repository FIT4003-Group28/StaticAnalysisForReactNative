package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: vje  reason: default package */
/* loaded from: classes4.dex */
public final class vje extends vkn {
    private final Context a;
    private final vkm b;
    private final vkm c;
    private final Object d = new Object();
    private String e;

    public vje(vjd vjdVar) {
        this.b = new vjj(vjdVar.c);
        this.a = vjdVar.a;
        this.c = vjdVar.b;
    }

    public static vjd q(Context context) {
        return new vjd(context);
    }

    private final void s() {
        if (this.c != null) {
            return;
        }
        throw new vjn("Android backend cannot perform remote operations without a remote backend");
    }

    private final boolean t(Uri uri) {
        return !TextUtils.isEmpty(uri.getAuthority()) && !this.a.getPackageName().equals(uri.getAuthority());
    }

    @Override // defpackage.vkn, defpackage.vkm
    public final File c(Uri uri) {
        String str;
        if (!t(uri)) {
            File c = uwv.c(uri, this.a);
            if (!sre.e(this.a)) {
                synchronized (this.d) {
                    if (this.e == null) {
                        this.e = uwv.d(this.a).getAbsolutePath();
                    }
                    str = this.e;
                }
                if (!c.getAbsolutePath().startsWith(str)) {
                    throw new vjn("Cannot access credential-protected data from direct boot");
                }
            }
            return c;
        }
        throw new IOException("operation is not permitted in other authorities.");
    }

    @Override // defpackage.vkn, defpackage.vkm
    public final InputStream d(Uri uri) {
        if (!t(uri)) {
            return this.b.d(p(uri));
        }
        s();
        return this.c.d(uri);
    }

    @Override // defpackage.vkm
    public final String h() {
        return "android";
    }

    @Override // defpackage.vkn, defpackage.vkm
    public final boolean m(Uri uri) {
        if (!t(uri)) {
            return this.b.m(p(uri));
        }
        s();
        return this.c.m(uri);
    }

    @Override // defpackage.vkn
    protected final Uri o(Uri uri) {
        try {
            vjf a = vjg.a(this.a);
            a.b(uri.getPath());
            return a.a();
        } catch (IllegalArgumentException e) {
            throw new vjt(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.vkn
    public final Uri p(Uri uri) {
        if (t(uri)) {
            throw new vjt("Operation across authorities is not allowed.");
        }
        File c = c(uri);
        Uri.Builder path = new Uri.Builder().scheme("file").authority("").path("/");
        amuf f = amuk.f();
        path.path(c.getAbsolutePath());
        return uxe.i(path, f);
    }

    @Override // defpackage.vkn
    protected final vkm r() {
        return this.b;
    }
}
