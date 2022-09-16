package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
/* compiled from: PG */
/* renamed from: ox  reason: default package */
/* loaded from: classes7.dex */
public final class ox extends ClickableSpan {
    private final int a;
    private final pc b;
    private final int c;

    public ox(int i, pc pcVar, int i2) {
        this.a = i;
        this.b = pcVar;
        this.c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        pc pcVar = this.b;
        pcVar.a.performAction(this.c, bundle);
    }
}
