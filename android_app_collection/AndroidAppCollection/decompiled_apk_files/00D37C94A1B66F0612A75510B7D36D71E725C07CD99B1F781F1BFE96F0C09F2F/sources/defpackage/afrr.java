package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afrr  reason: default package */
/* loaded from: classes.dex */
public final class afrr implements View.OnLayoutChangeListener {
    final /* synthetic */ afrs a;
    private final avhn b;

    public afrr(afrs afrsVar, avhn avhnVar) {
        this.a = afrsVar;
        this.b = avhnVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.b.removeOnLayoutChangeListener(this);
        this.a.a(this.b);
    }
}
