package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: aclo  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aclo implements View.OnClickListener {
    public final /* synthetic */ aclr a;
    private final /* synthetic */ int b;

    public /* synthetic */ aclo(aclr aclrVar, int i) {
        this.b = i;
        this.a = aclrVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            aclr aclrVar = this.a;
            aclrVar.a.c(aclrVar);
            return;
        }
        this.a.b.ae();
    }
}
