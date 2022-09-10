package com.google.android.libraries.onegoogle.accountmenu.gmshead;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class GoogleOwnersProviderModelUpdater extends GmsheadAccountsModelUpdater {
    private final cwlw f;
    private final cwgc g;

    public GoogleOwnersProviderModelUpdater(cvzg<cwfm> cvzgVar, cwfx cwfxVar, cwfy cwfyVar, cwlw cwlwVar) {
        super(cvzgVar, cwfxVar, cwfyVar);
        this.f = cwlwVar;
        cwfs cwfsVar = this.e;
        cwfsVar.getClass();
        this.g = new cwgc(cwfsVar);
    }

    @Override // com.google.android.libraries.onegoogle.accountmenu.gmshead.GmsheadAccountsModelUpdater
    protected final void g() {
        this.f.c(this.g);
    }

    @Override // com.google.android.libraries.onegoogle.accountmenu.gmshead.GmsheadAccountsModelUpdater
    protected final void h() {
        this.f.d(this.g);
    }
}
