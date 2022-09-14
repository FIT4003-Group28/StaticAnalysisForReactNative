package defpackage;

import android.content.Context;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: wm  reason: default package */
/* loaded from: classes7.dex */
public final class wm extends vr {
    final /* synthetic */ wt d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wm(wt wtVar, Context context, wb wbVar, View view) {
        super(context, wbVar, view, false);
        this.d = wtVar;
        if (!wbVar.k.o()) {
            View view2 = wtVar.g;
            this.a = view2 == null ? (View) wtVar.f : view2;
        }
        h(wtVar.o);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.vr
    public final void f() {
        this.d.m = null;
        super.f();
    }
}
