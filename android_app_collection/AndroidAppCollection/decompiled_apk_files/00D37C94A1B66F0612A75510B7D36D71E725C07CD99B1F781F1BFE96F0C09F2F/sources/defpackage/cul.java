package defpackage;

import android.view.View;
import android.view.animation.AnimationUtils;
/* compiled from: PG */
/* renamed from: cul  reason: default package */
/* loaded from: classes3.dex */
public final class cul implements cug {
    private final hcx a;

    public cul(hcx hcxVar, byte[] bArr) {
        this.a = hcxVar;
    }

    @Override // defpackage.cug
    public final void a(cuf cufVar) {
        View n = cufVar.n();
        n.clearAnimation();
        n.startAnimation(AnimationUtils.loadAnimation(n.getContext(), this.a.a));
    }
}
