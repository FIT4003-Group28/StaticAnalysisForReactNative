package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ajni  reason: default package */
/* loaded from: classes.dex */
public final class ajni implements View.OnLayoutChangeListener {
    public boolean a;
    final /* synthetic */ ajnj b;
    private yyr c;
    private final int d;

    public ajni(ajnj ajnjVar, boolean z, int i) {
        this.b = ajnjVar;
        c(z);
        this.d = i;
    }

    public final void a(yyr yyrVar) {
        this.c = yyrVar;
        this.b.a.addOnLayoutChangeListener(this);
    }

    public final void b() {
        if (!this.a) {
            this.b.a.removeOnLayoutChangeListener(this);
        }
        this.c = null;
    }

    public final void c(boolean z) {
        if (this.a == z) {
            return;
        }
        this.a = z;
        if (z) {
            a(null);
        } else if (this.c != null) {
        } else {
            this.b.a.removeOnLayoutChangeListener(this);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ajnj ajnjVar = this.b;
        ajnjVar.d(this.c, this.a ? null : ajnjVar.d, this.d);
    }
}
