package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.util.Log;
import j$.util.Objects;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bff  reason: default package */
/* loaded from: classes2.dex */
public final class bff extends AsyncTask {
    public final Bitmap a;
    public final Uri b;
    final /* synthetic */ bfl c;
    private int d;
    private long e;

    public bff(bfl bflVar) {
        this.c = bflVar;
        MediaDescriptionCompat mediaDescriptionCompat = bflVar.F;
        Uri uri = null;
        Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.c;
        if (bfl.u(bitmap)) {
            Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
            bitmap = null;
        }
        this.a = bitmap;
        MediaDescriptionCompat mediaDescriptionCompat2 = bflVar.F;
        this.b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.d : uri;
    }

    private final InputStream a(Uri uri) {
        InputStream openInputStream;
        String lowerCase = uri.getScheme().toLowerCase();
        if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || "file".equals(lowerCase)) {
            openInputStream = this.c.e.getContentResolver().openInputStream(uri);
        } else {
            URLConnection openConnection = new URL(uri.toString()).openConnection();
            openConnection.setConnectTimeout(bfl.b);
            openConnection.setReadTimeout(bfl.b);
            openInputStream = openConnection.getInputStream();
        }
        if (openInputStream == null) {
            return null;
        }
        return new BufferedInputStream(openInputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00db  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.InputStream] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r10) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bff.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bfl bflVar = this.c;
        bflVar.G = null;
        if (!Objects.equals(bflVar.H, this.a) || !Objects.equals(this.c.I, this.b)) {
            bfl bflVar2 = this.c;
            bflVar2.H = this.a;
            bflVar2.K = bitmap;
            bflVar2.I = this.b;
            bflVar2.L = this.d;
            boolean z = true;
            bflVar2.f141J = true;
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = this.e;
            bfl bflVar3 = this.c;
            if (uptimeMillis - j <= 120) {
                z = false;
            }
            bflVar3.o(z);
        }
    }

    @Override // android.os.AsyncTask
    protected final void onPreExecute() {
        this.e = SystemClock.uptimeMillis();
        this.c.nd();
    }
}
