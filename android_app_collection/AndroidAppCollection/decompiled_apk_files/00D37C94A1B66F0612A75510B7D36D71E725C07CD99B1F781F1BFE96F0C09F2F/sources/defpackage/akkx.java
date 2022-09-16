package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: akkx  reason: default package */
/* loaded from: classes.dex */
public final class akkx implements View.OnLayoutChangeListener {
    final /* synthetic */ View a;
    final /* synthetic */ argj b;
    final /* synthetic */ Object c;
    final /* synthetic */ aklc d;

    public akkx(aklc aklcVar, View view, argj argjVar, Object obj) {
        this.d = aklcVar;
        this.a = view;
        this.b = argjVar;
        this.c = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.d.a(this.a)) {
            this.d.b(this.b, this.a, this.c);
            this.a.removeOnLayoutChangeListener(this);
        }
    }
}
