package defpackage;

import android.net.Uri;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aeko  reason: default package */
/* loaded from: classes.dex */
public final class aeko implements Runnable {
    private final afjm a;
    private final Uri b;
    private final aant c;

    public aeko(afjm afjmVar, Uri uri, aant aantVar) {
        afms.a(afjmVar);
        this.a = afjmVar;
        afms.a(uri);
        this.b = uri;
        this.c = aantVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String authority;
        Uri.Builder appendQueryParameter = this.b.buildUpon().appendQueryParameter("owc", "yes").appendQueryParameter("pvi", "0").appendQueryParameter("pai", "0");
        if (this.c.get().aS() && (authority = this.b.getAuthority()) != null) {
            appendQueryParameter = appendQueryParameter.authority(aeny.e(authority));
        }
        asy asyVar = new asy(appendQueryParameter.build());
        asv a = this.a.a();
        try {
            a.h(asyVar);
        } catch (IOException unused) {
        } finally {
            pxi.I(a);
        }
    }
}
