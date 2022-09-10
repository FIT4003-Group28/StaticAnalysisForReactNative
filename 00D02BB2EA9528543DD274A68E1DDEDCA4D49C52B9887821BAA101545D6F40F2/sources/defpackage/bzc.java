package defpackage;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
/* compiled from: PG */
/* renamed from: bzc  reason: default package */
/* loaded from: classes.dex */
public final class bzc implements caq, bzb {
    private final AssetManager a;

    public bzc(AssetManager assetManager) {
        this.a = assetManager;
    }

    @Override // defpackage.caq
    public final cap<Uri, ParcelFileDescriptor> a(caz cazVar) {
        return new bze(this.a, this);
    }

    @Override // defpackage.caq
    public final void b() {
    }

    @Override // defpackage.bzb
    public final buj<ParcelFileDescriptor> c(AssetManager assetManager, String str) {
        return new buq(assetManager, str);
    }
}
