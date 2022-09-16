package defpackage;

import android.view.ViewTreeObserver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dkg  reason: default package */
/* loaded from: classes3.dex */
public final class dkg implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ dlc a;

    public dkg(dlc dlcVar) {
        this.a = dlcVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.y();
        return true;
    }
}
