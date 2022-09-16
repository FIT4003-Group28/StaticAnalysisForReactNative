package defpackage;

import java.util.BitSet;
/* compiled from: PG */
/* renamed from: svc  reason: default package */
/* loaded from: classes4.dex */
public final class svc extends cyp {
    sve a;
    private final String[] e = {"commandResolver", "conversionContext", "editableTextType", "logger", "onBlurCommandFuture", "onChangeCommandFuture", "onClearCommandFuture", "onFocusCommandFuture", "onTextInputActionCommandFuture", "styleRunExtensionConverters", "typefaceProvider"};
    public final BitSet d = new BitSet(11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c(svc svcVar, cyv cyvVar, sve sveVar) {
        super.w(cyvVar, sveVar);
        svcVar.a = sveVar;
        svcVar.d.clear();
    }

    @Override // defpackage.cyp
    public final /* bridge */ /* synthetic */ cyr a() {
        o(11, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.cyp
    protected final void b(cyr cyrVar) {
        this.a = (sve) cyrVar;
    }
}
