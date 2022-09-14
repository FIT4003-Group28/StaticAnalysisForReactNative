package defpackage;

import android.app.Activity;
import android.view.View;
/* compiled from: PG */
/* renamed from: cisr  reason: default package */
/* loaded from: classes4.dex */
final class cisr extends jmv {
    final /* synthetic */ ciss a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cisr(ciss cissVar, int i) {
        super(i);
        this.a = cissVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        afha a = this.a.c.a();
        ciss cissVar = this.a;
        Activity activity = cissVar.a;
        chva chvaVar = cissVar.b;
        a.k(activity, cjxr.w(chvaVar.b == 7 ? (String) chvaVar.c : ""), 1);
    }
}
