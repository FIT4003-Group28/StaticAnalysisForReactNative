package defpackage;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
/* compiled from: PG */
/* renamed from: buq  reason: default package */
/* loaded from: classes4.dex */
public final class buq extends bug<ParcelFileDescriptor> {
    public buq(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // defpackage.buj
    public final Class<ParcelFileDescriptor> d() {
        return ParcelFileDescriptor.class;
    }

    @Override // defpackage.bug
    protected final /* bridge */ /* synthetic */ ParcelFileDescriptor f(AssetManager assetManager, String str) {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }

    @Override // defpackage.bug
    protected final /* bridge */ /* synthetic */ void g(ParcelFileDescriptor parcelFileDescriptor) {
        parcelFileDescriptor.close();
    }
}
