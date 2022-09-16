package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: tl  reason: default package */
/* loaded from: classes4.dex */
public final class tl implements Runnable {
    final /* synthetic */ tq a;
    private final to b;

    public tl(tq tqVar, to toVar) {
        this.a = tqVar;
        this.b = toVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sd sdVar;
        sf sfVar = this.a.c;
        if (sfVar != null && (sdVar = sfVar.b) != null) {
            sdVar.O(sfVar);
        }
        View view = (View) this.a.f;
        if (view != null && view.getWindowToken() != null && this.b.i()) {
            this.a.k = this.b;
        }
        this.a.m = null;
    }
}
