package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: xsj  reason: default package */
/* loaded from: classes4.dex */
final class xsj implements View.OnClickListener {
    final /* synthetic */ aqca a;
    final /* synthetic */ xmd b;
    final /* synthetic */ xsl c;

    public xsj(xsl xslVar, aqca aqcaVar, xmd xmdVar) {
        this.c = xslVar;
        this.a = aqcaVar;
        this.b = xmdVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.c.b.g(this.a, this.b);
    }
}
