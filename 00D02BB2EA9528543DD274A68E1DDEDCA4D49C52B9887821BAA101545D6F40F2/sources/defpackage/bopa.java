package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bopa  reason: default package */
/* loaded from: classes3.dex */
final class bopa implements cqfc {
    final /* synthetic */ bopc a;

    public bopa(bopc bopcVar) {
        this.a = bopcVar;
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        view.setAlpha(1.0f);
        view.animate().setDuration(200L).setInterpolator(irf.c).alpha(0.0f).withEndAction(new booz(this)).start();
    }
}
