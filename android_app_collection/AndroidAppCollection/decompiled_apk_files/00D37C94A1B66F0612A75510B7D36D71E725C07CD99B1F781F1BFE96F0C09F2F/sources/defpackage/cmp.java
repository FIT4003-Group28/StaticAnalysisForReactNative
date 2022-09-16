package defpackage;

import android.content.res.AssetManager;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: cmp  reason: default package */
/* loaded from: classes2.dex */
public final class cmp implements cnq {
    private final AssetManager a;
    private final cmn b;

    public cmp(AssetManager assetManager, cmn cmnVar) {
        this.a = assetManager;
        this.b = cmnVar;
    }

    @Override // defpackage.cnq
    public final /* bridge */ /* synthetic */ cnp a(Object obj, int i, int i2, cic cicVar) {
        Uri uri = (Uri) obj;
        return new cnp(new cup(uri), this.b.a(this.a, uri.toString().substring(22)));
    }

    @Override // defpackage.cnq
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        Uri uri = (Uri) obj;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
