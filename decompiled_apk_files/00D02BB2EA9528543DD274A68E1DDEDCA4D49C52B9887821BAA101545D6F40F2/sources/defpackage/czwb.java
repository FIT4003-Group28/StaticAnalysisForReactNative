package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: czwb  reason: default package */
/* loaded from: classes5.dex */
final class czwb extends ne {
    final /* synthetic */ czwe b;

    public czwb(czwe czweVar) {
        this.b = czweVar;
    }

    @Override // defpackage.ne
    public final void f(View view, pc pcVar) {
        super.f(view, pcVar);
        if (this.b.b) {
            pcVar.f(ImageMetadata.SHADING_MODE);
            pcVar.N(true);
            return;
        }
        pcVar.N(false);
    }

    @Override // defpackage.ne
    public final boolean i(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            czwe czweVar = this.b;
            if (czweVar.b) {
                czweVar.cancel();
                return true;
            }
            i = ImageMetadata.SHADING_MODE;
        }
        return super.i(view, i, bundle);
    }
}
