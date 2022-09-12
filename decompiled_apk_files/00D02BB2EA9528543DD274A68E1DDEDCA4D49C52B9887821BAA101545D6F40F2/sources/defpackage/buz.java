package defpackage;

import android.content.res.AssetManager;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: buz  reason: default package */
/* loaded from: classes4.dex */
public final class buz extends bug<InputStream> {
    public buz(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // defpackage.buj
    public final Class<InputStream> d() {
        return InputStream.class;
    }

    @Override // defpackage.bug
    protected final /* bridge */ /* synthetic */ InputStream f(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }

    @Override // defpackage.bug
    protected final /* bridge */ /* synthetic */ void g(InputStream inputStream) {
        inputStream.close();
    }
}
