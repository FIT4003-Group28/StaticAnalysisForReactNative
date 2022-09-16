package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.ar.core.ImageMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: daev  reason: default package */
/* loaded from: classes5.dex */
public final class daev extends ne {
    final /* synthetic */ daff b;

    public daev(daff daffVar) {
        this.b = daffVar;
    }

    @Override // defpackage.ne
    public final void f(View view, pc pcVar) {
        super.f(view, pcVar);
        pcVar.f(ImageMetadata.SHADING_MODE);
        pcVar.N(true);
    }

    @Override // defpackage.ne
    public final boolean i(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            this.b.d();
            return true;
        }
        return super.i(view, i, bundle);
    }
}
