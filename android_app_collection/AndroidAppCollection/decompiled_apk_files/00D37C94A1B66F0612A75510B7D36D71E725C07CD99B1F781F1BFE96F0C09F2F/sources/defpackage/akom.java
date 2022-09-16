package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: akom  reason: default package */
/* loaded from: classes.dex */
final class akom implements View.OnClickListener {
    final /* synthetic */ aafo a;
    final /* synthetic */ akoo b;
    final /* synthetic */ akop c;

    public akom(akop akopVar, aafo aafoVar, akoo akooVar) {
        this.c = akopVar;
        this.a = aafoVar;
        this.b = akooVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apzg apzgVar = this.c.c;
        if (apzgVar != null) {
            this.a.c(apzgVar, null);
        }
        this.b.d(this.c.d);
    }
}
