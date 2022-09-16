package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;
/* compiled from: PG */
/* renamed from: abmy  reason: default package */
/* loaded from: classes.dex */
final class abmy extends ClickableSpan {
    final /* synthetic */ ClickableSpan a;
    final /* synthetic */ abmz b;

    public abmy(abmz abmzVar, ClickableSpan clickableSpan) {
        this.b = abmzVar;
        this.a = clickableSpan;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.b.t = true;
        this.a.onClick(view);
    }
}
