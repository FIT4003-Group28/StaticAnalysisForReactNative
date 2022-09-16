package defpackage;

import com.google.android.apps.youtube.app.common.ui.pip.DefaultPipController;
/* compiled from: PG */
/* renamed from: gct  reason: default package */
/* loaded from: classes3.dex */
final class gct implements adny {
    final /* synthetic */ DefaultPipController a;

    public gct(DefaultPipController defaultPipController) {
        this.a = defaultPipController;
    }

    @Override // defpackage.adny
    public final void j(adnt adntVar) {
    }

    @Override // defpackage.adny
    public final void k(adnt adntVar) {
        DefaultPipController defaultPipController = this.a;
        if (!defaultPipController.t) {
            return;
        }
        defaultPipController.t = false;
        defaultPipController.k(new gcr(defaultPipController, 4));
    }

    @Override // defpackage.adny
    public final void l(adnt adntVar) {
        DefaultPipController defaultPipController = this.a;
        if (defaultPipController.t) {
            return;
        }
        defaultPipController.t = true;
        defaultPipController.k(new gcr(defaultPipController, 5));
    }
}
