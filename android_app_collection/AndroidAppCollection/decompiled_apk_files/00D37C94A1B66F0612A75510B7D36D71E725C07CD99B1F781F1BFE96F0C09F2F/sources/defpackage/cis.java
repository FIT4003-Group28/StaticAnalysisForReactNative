package defpackage;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
/* compiled from: PG */
/* renamed from: cis  reason: default package */
/* loaded from: classes2.dex */
public final class cis extends cii {
    public cis(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // defpackage.cil
    public final Class a() {
        return ParcelFileDescriptor.class;
    }

    @Override // defpackage.cii
    protected final /* bridge */ /* synthetic */ Object f(AssetManager assetManager, String str) {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }

    @Override // defpackage.cii
    protected final /* bridge */ /* synthetic */ void g(Object obj) {
        ((ParcelFileDescriptor) obj).close();
    }
}
