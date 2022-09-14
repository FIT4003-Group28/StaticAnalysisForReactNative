package defpackage;

import android.net.Uri;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: amdy  reason: default package */
/* loaded from: classes.dex */
public final class amdy implements cap<Uri, InputStream> {
    private final cap<cac, InputStream> a;
    private final akfa b = ((akfb) btsr.a(akfb.class)).rK();

    public amdy(cap<cac, InputStream> capVar) {
        this.a = capVar;
    }

    public static final boolean c(Uri uri) {
        String scheme = uri.getScheme();
        return scheme != null && dbqa.e("https", scheme) && dsnn.a(uri.toString());
    }

    @Override // defpackage.cap
    public final /* bridge */ /* synthetic */ boolean a(Uri uri) {
        return c(uri);
    }

    @Override // defpackage.cap
    public final /* bridge */ /* synthetic */ cao<InputStream> b(Uri uri, int i, int i2, bua buaVar) {
        btue btueVar;
        cac cacVar;
        Uri uri2 = uri;
        String str = null;
        if (!c(uri2)) {
            return null;
        }
        if (btlu.i(this.b.j()) != btlt.GOOGLE) {
            return this.a.b(new cac(uri2.toString()), i, i2, buaVar);
        }
        try {
            btueVar = this.b.y("oauth2:https://www.googleapis.com/auth/photos.image.readonly");
        } catch (IllegalStateException unused) {
            btueVar = null;
        }
        String uri3 = uri2.toString();
        if (btueVar != null) {
            str = btueVar.e();
        }
        if (str != null) {
            cae caeVar = new cae();
            caeVar.b(String.format("Bearer %s", str));
            cacVar = new cac(uri3, caeVar.a());
        } else {
            cacVar = new cac(uri3);
        }
        return this.a.b(cacVar, i, i2, buaVar);
    }
}
