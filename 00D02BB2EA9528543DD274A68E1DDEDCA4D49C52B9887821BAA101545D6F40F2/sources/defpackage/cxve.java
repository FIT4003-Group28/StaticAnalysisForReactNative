package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cxve  reason: default package */
/* loaded from: classes5.dex */
final class cxve implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ cxvi b;

    public cxve(cxvi cxviVar, View view) {
        this.b = cxviVar;
        this.a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.m) {
            this.a.setVisibility(0);
        }
    }
}
