package defpackage;

import android.net.Uri;
import com.google.android.apps.gmm.ugc.post.photo.AutoValue_MediaData;
import com.google.android.apps.gmm.ugc.post.photo.MediaData;
/* compiled from: PG */
/* renamed from: cdue  reason: default package */
/* loaded from: classes4.dex */
public final class cdue extends cdyf {
    public Uri a;
    public dbsg<String> b;
    public dbsg<String> c;
    public dbsg<Integer> d;
    public dbsg<Integer> e;
    public dbsg<Integer> f;
    public int g;

    public cdue() {
        this.b = dbpy.a;
        this.c = dbpy.a;
        this.d = dbpy.a;
        this.e = dbpy.a;
        this.f = dbpy.a;
    }

    public cdue(MediaData mediaData) {
        this.b = dbpy.a;
        this.c = dbpy.a;
        this.d = dbpy.a;
        this.e = dbpy.a;
        this.f = dbpy.a;
        this.a = mediaData.a();
        this.b = mediaData.b();
        this.g = mediaData.h();
        this.c = mediaData.c();
        this.d = mediaData.d();
        this.e = mediaData.e();
        this.f = mediaData.f();
    }

    @Override // defpackage.cdyf
    public final void b(dbsg<String> dbsgVar) {
        this.c = dbsgVar;
    }

    @Override // defpackage.cdyf
    public final MediaData a() {
        String str = this.a == null ? " uri" : "";
        if (this.g == 0) {
            str = str.concat(" source");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new AutoValue_MediaData(this.a, this.b, this.g, this.c, this.d, this.e, this.f);
    }
}
