package defpackage;

import java.util.BitSet;
/* compiled from: PG */
/* renamed from: wxh  reason: default package */
/* loaded from: classes4.dex */
public final class wxh extends cyp {
    wxi a;
    private final String[] e = {"activeViewDisplayContainerType", "activeViewMonitor", "child", "commandExtensionResolver"};
    public final BitSet d = new BitSet(4);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c(wxh wxhVar, cyv cyvVar, wxi wxiVar) {
        super.w(cyvVar, wxiVar);
        wxhVar.a = wxiVar;
        wxhVar.d.clear();
    }

    @Override // defpackage.cyp
    public final /* bridge */ /* synthetic */ cyr a() {
        o(4, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.cyp
    protected final void b(cyr cyrVar) {
        this.a = (wxi) cyrVar;
    }
}
