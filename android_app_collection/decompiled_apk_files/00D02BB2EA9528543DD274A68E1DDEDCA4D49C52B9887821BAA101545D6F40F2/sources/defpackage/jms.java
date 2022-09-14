package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: jms  reason: default package */
/* loaded from: classes7.dex */
final class jms extends jmv {
    final /* synthetic */ cjqy a;
    final /* synthetic */ ddho b;
    final /* synthetic */ Runnable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jms(int i, cjqy cjqyVar, ddho ddhoVar, Runnable runnable) {
        super(i);
        this.a = cjqyVar;
        this.b = ddhoVar;
        this.c = runnable;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.i(cjtd.a(this.b));
        this.c.run();
    }
}
