package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: advy  reason: default package */
/* loaded from: classes2.dex */
public class advy extends adyp {
    private final cjta a;
    private final adys b;

    public advy(adyo adyoVar, int i, View.OnAttachStateChangeListener onAttachStateChangeListener, adys adysVar) {
        super(adyoVar, onAttachStateChangeListener, "", null, null);
        this.b = adysVar;
        this.a = W(null, i);
    }

    @Override // defpackage.adyp, defpackage.advs
    public cqkl H() {
        adyv adyvVar = this.b.a;
        adyvVar.e();
        adyvVar.d(true);
        return cqkl.a;
    }

    @Override // defpackage.adyp, defpackage.advs
    public cjtd N(ddho ddhoVar) {
        return this.a.b(ddhoVar);
    }

    @Override // defpackage.aczr
    public cjtd e() {
        return cjtd.b;
    }
}
