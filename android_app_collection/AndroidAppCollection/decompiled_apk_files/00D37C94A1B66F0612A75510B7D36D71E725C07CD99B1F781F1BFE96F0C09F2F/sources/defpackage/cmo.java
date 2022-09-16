package defpackage;

import android.content.res.AssetManager;
/* compiled from: PG */
/* renamed from: cmo  reason: default package */
/* loaded from: classes2.dex */
public final class cmo implements cnr, cmn {
    private final AssetManager a;
    private final /* synthetic */ int b;

    public cmo(AssetManager assetManager) {
        this.a = assetManager;
    }

    public cmo(AssetManager assetManager, int i) {
        this.b = i;
        this.a = assetManager;
    }

    @Override // defpackage.cnr
    public final void d() {
    }

    @Override // defpackage.cmn
    public final cil a(AssetManager assetManager, String str) {
        if (this.b == 0) {
            return new cja(assetManager, str);
        }
        return new cis(assetManager, str);
    }

    @Override // defpackage.cnr
    public final cnq c(cny cnyVar) {
        if (this.b == 0) {
            return new cmp(this.a, this);
        }
        return new cmp(this.a, this);
    }
}
