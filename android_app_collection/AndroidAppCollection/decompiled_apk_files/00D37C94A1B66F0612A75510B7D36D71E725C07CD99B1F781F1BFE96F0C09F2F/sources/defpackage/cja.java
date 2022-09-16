package defpackage;

import android.content.res.AssetManager;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: cja  reason: default package */
/* loaded from: classes2.dex */
public final class cja extends cii {
    public cja(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // defpackage.cil
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.cii
    protected final /* bridge */ /* synthetic */ Object f(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }

    @Override // defpackage.cii
    protected final /* bridge */ /* synthetic */ void g(Object obj) {
        ((InputStream) obj).close();
    }
}
