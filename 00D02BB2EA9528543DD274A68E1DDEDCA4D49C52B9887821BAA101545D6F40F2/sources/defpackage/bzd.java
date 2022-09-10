package defpackage;

import android.content.res.AssetManager;
import android.net.Uri;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: bzd  reason: default package */
/* loaded from: classes.dex */
public final class bzd implements caq, bzb {
    private final AssetManager a;

    public bzd(AssetManager assetManager) {
        this.a = assetManager;
    }

    @Override // defpackage.caq
    public final cap<Uri, InputStream> a(caz cazVar) {
        return new bze(this.a, this);
    }

    @Override // defpackage.caq
    public final void b() {
    }

    @Override // defpackage.bzb
    public final buj<InputStream> c(AssetManager assetManager, String str) {
        return new buz(assetManager, str);
    }
}
