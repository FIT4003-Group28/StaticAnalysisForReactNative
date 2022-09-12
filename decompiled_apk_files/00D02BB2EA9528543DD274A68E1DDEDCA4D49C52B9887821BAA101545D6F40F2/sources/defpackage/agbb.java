package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: agbb  reason: default package */
/* loaded from: classes2.dex */
public final class agbb implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ View b;
    final /* synthetic */ View c;
    final /* synthetic */ View d;
    final /* synthetic */ agbj e;

    public agbb(agbj agbjVar, View view, View view2, View view3, View view4) {
        this.e = agbjVar;
        this.a = view;
        this.b = view2;
        this.c = view3;
        this.d = view4;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        agbi agbiVar = this.e.e;
        if (agbiVar != null) {
            agbiVar.a();
        }
        this.e.f(false, this.b, this.c, this.d, new Runnable(this) { // from class: agba
            private final agbb a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.e.m = false;
            }
        });
    }
}
