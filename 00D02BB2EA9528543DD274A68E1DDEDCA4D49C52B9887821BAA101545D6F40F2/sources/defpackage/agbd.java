package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: agbd  reason: default package */
/* loaded from: classes2.dex */
public final class agbd implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ View b;
    final /* synthetic */ View c;
    final /* synthetic */ View d;
    final /* synthetic */ ahac e;
    final /* synthetic */ agbj f;

    public agbd(agbj agbjVar, View view, View view2, View view3, View view4, ahac ahacVar) {
        this.f = agbjVar;
        this.a = view;
        this.b = view2;
        this.c = view3;
        this.d = view4;
        this.e = ahacVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        agbj agbjVar = this.f;
        View view = this.b;
        View view2 = this.c;
        View view3 = this.d;
        final ahac ahacVar = this.e;
        agbjVar.f(true, view, view2, view3, new Runnable(this, ahacVar) { // from class: agbc
            private final agbd a;
            private final ahac b;

            {
                this.a = this;
                this.b = ahacVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                agbd agbdVar = this.a;
                ahac ahacVar2 = this.b;
                ahacVar2.s(null);
                cqkx.p(ahacVar2.u());
                agbdVar.f.c.a().b();
                agbdVar.f.m = false;
            }
        });
        agbi agbiVar = this.f.e;
        if (agbiVar != null) {
            agbiVar.b();
        }
    }
}
