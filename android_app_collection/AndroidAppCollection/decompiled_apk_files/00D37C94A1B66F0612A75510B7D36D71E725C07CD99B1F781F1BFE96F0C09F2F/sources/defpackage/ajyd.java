package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: ajyd  reason: default package */
/* loaded from: classes.dex */
final class ajyd implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ atep b;
    final /* synthetic */ View c;
    final /* synthetic */ Object d;
    final /* synthetic */ acti e;
    final /* synthetic */ ajyh f;

    public ajyd(ajyh ajyhVar, View view, atep atepVar, View view2, Object obj, acti actiVar) {
        this.f = ajyhVar;
        this.a = view;
        this.b = atepVar;
        this.c = view2;
        this.d = obj;
        this.e = actiVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f.a(this.b, this.c, this.d, this.e);
    }
}
