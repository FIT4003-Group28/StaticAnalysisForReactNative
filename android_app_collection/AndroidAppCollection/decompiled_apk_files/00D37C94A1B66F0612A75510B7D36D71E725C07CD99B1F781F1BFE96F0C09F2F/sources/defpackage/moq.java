package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: moq  reason: default package */
/* loaded from: classes3.dex */
final class moq implements View.OnLayoutChangeListener {
    final /* synthetic */ mor a;
    private final avhn b;

    public moq(mor morVar, avhn avhnVar) {
        this.a = morVar;
        this.b = avhnVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.a.h.getWidth() > 0) {
            this.a.h.removeOnLayoutChangeListener(this);
            mor morVar = this.a;
            morVar.j = null;
            morVar.g(this.b);
        }
    }
}
