package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bgnh  reason: default package */
/* loaded from: classes3.dex */
public final class bgnh extends jmv {
    final /* synthetic */ bgni a;
    private final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgnh(bgni bgniVar, String str, int i) {
        super(i);
        this.a = bgniVar;
        this.b = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        bgni bgniVar = this.a;
        cjqm i = bgniVar.b.i(bgniVar.d);
        cbzb c = cbzc.c();
        ((cbyz) c).a = i.a().f();
        this.a.a.a().a(this.b, c.a());
    }
}
