package defpackage;

import java.util.BitSet;
/* compiled from: PG */
/* renamed from: afon  reason: default package */
/* loaded from: classes.dex */
public final class afon extends cyp {
    afop a;
    private final String[] e = {"asyncImageLoader", "commandResolver", "conversionContext", "entityStoreFactory", "identityProvider", "innerTubeIconResolver", "interactionLogger", "logger", "onBlurCommand", "onChangeCommand", "onFocusCommand", "suggestBottomSheetControllerFactory", "suggestControllerFactory", "suggestEditableTextType", "suggestFetcherFactory", "typefaceProvider", "uiScheduler"};
    public final BitSet d = new BitSet(17);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c(afon afonVar, cyv cyvVar, afop afopVar) {
        super.w(cyvVar, afopVar);
        afonVar.a = afopVar;
        afonVar.d.clear();
    }

    @Override // defpackage.cyp
    public final /* bridge */ /* synthetic */ cyr a() {
        o(17, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.cyp
    protected final void b(cyr cyrVar) {
        this.a = (afop) cyrVar;
    }
}
