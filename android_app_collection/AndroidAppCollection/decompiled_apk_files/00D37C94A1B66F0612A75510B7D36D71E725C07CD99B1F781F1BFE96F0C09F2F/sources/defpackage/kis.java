package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kis  reason: default package */
/* loaded from: classes3.dex */
public final class kis implements View.OnClickListener {
    final /* synthetic */ kiv a;
    private final int b;

    public kis(kiv kivVar, int i) {
        this.a = kivVar;
        this.b = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        kiv kivVar = this.a;
        int i = this.b;
        boolean z = !view.isSelected();
        kivVar.i(i, z);
        if (kivVar.e) {
            if (z) {
                int i2 = kivVar.f;
                if (i < i2) {
                    kivVar.i(i2, false);
                } else {
                    for (int i3 = 0; i3 < kivVar.f; i3++) {
                        kivVar.i(i3, false);
                    }
                }
            }
            kivVar.m();
            return;
        }
        kivVar.e();
    }
}
