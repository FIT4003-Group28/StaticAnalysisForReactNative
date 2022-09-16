package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.video.media.VideoMetaData;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: hjb  reason: default package */
/* loaded from: classes3.dex */
public final class hjb {
    public final Context a;
    public final eo b;
    public final Executor c;
    public final hkg d;
    public zxh e;
    public hja f;
    public VideoMetaData g;
    public vvp h;

    public hjb(Executor executor, dt dtVar, hkg hkgVar) {
        this.a = dtVar;
        this.b = dtVar.getSupportFragmentManager();
        this.c = executor;
        this.d = hkgVar;
    }

    public static VideoMetaData a(Context context, Uri uri) {
        vry a = vrz.a();
        a.c(true);
        a.b(true);
        a.d(true);
        return vsa.b(context, uri, a.a());
    }
}
