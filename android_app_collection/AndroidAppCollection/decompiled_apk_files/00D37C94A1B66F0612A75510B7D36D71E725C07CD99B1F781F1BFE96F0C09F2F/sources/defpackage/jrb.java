package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: jrb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jrb implements View.OnClickListener {
    public final /* synthetic */ jrh a;
    private final /* synthetic */ int b;

    public /* synthetic */ jrb(jrh jrhVar, int i) {
        this.b = i;
        this.a = jrhVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            jrh jrhVar = this.a;
            jpd jpdVar = jrhVar.i;
            String str = jrhVar.x;
            zgh.m(str);
            jpdVar.a(str);
            return;
        }
        this.a.o.performClick();
    }
}
