package defpackage;

import android.content.res.AssetManager;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: bze  reason: default package */
/* loaded from: classes.dex */
public final class bze<Data> implements cap<Uri, Data> {
    private final AssetManager a;
    private final bzb<Data> b;

    public bze(AssetManager assetManager, bzb<Data> bzbVar) {
        this.a = assetManager;
        this.b = bzbVar;
    }

    @Override // defpackage.cap
    public final /* bridge */ /* synthetic */ boolean a(Uri uri) {
        Uri uri2 = uri;
        return "file".equals(uri2.getScheme()) && !uri2.getPathSegments().isEmpty() && "android_asset".equals(uri2.getPathSegments().get(0));
    }

    @Override // defpackage.cap
    public final /* bridge */ /* synthetic */ cao b(Uri uri, int i, int i2, bua buaVar) {
        Uri uri2 = uri;
        return new cao(new ciy(uri2), this.b.c(this.a, uri2.toString().substring(22)));
    }
}
