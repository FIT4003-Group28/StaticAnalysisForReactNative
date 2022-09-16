package defpackage;

import java.util.BitSet;
/* compiled from: PG */
/* renamed from: swi  reason: default package */
/* loaded from: classes4.dex */
public final class swi extends cyp {
    swk a;
    private final String[] e = {"collapsedCommandFuture", "commandResolver", "conversionContext", "drawableRequester", "expandableTextType", "expandedCommandFuture", "logger", "styleRunExtensionConverters", "typefaceProvider"};
    public final BitSet d = new BitSet(9);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c(swi swiVar, cyv cyvVar, swk swkVar) {
        super.w(cyvVar, swkVar);
        swiVar.a = swkVar;
        swiVar.d.clear();
    }

    @Override // defpackage.cyp
    public final /* bridge */ /* synthetic */ cyr a() {
        o(9, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.cyp
    protected final void b(cyr cyrVar) {
        this.a = (swk) cyrVar;
    }
}
