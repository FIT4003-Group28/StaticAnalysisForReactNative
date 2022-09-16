package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
/* compiled from: PG */
/* renamed from: mc  reason: default package */
/* loaded from: classes3.dex */
public final class mc extends ClickableSpan {
    private final int a;
    private final mh b;
    private final int c;

    public mc(int i, mh mhVar, int i2) {
        this.a = i;
        this.b = mhVar;
        this.c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        mh mhVar = this.b;
        mhVar.b.performAction(this.c, bundle);
    }
}
