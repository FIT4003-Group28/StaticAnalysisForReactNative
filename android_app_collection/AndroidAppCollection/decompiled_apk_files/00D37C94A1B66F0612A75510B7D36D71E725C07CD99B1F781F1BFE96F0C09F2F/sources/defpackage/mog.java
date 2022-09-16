package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mog  reason: default package */
/* loaded from: classes3.dex */
public final class mog implements View.OnLayoutChangeListener {
    final /* synthetic */ moh a;
    private final avhn b;
    private final boolean c;

    public mog(moh mohVar, avhn avhnVar, boolean z) {
        this.a = mohVar;
        this.b = avhnVar;
        this.c = z;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.b.removeOnLayoutChangeListener(this);
        this.a.a(this.b, this.c);
    }
}
