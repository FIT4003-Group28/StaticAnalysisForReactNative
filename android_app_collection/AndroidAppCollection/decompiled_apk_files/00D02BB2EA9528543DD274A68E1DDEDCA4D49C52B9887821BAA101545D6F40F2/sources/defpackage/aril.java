package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aril  reason: default package */
/* loaded from: classes2.dex */
public final class aril implements View.OnClickListener {
    final /* synthetic */ jkf a;
    final /* synthetic */ ff b;

    public aril(jkf jkfVar, ff ffVar) {
        this.a = jkfVar;
        this.b = ffVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        jkj l = this.a.l();
        if (!l.A(jjn.COLLAPSED) || l.L() == jjn.COLLAPSED) {
            this.b.g().e();
        } else {
            this.a.B(jjn.COLLAPSED);
        }
    }
}
