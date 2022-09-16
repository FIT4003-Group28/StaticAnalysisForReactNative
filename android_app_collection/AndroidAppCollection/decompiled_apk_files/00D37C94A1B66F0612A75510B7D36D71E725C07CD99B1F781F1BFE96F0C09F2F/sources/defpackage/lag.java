package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lag  reason: default package */
/* loaded from: classes3.dex */
public final class lag implements View.OnClickListener {
    final /* synthetic */ awea a;
    final /* synthetic */ laj b;

    public lag(laj lajVar, awea aweaVar) {
        this.b = lajVar;
        this.a = aweaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        awea aweaVar = this.a;
        if ((aweaVar.b & 16) != 0) {
            aafo aafoVar = this.b.a;
            apzg apzgVar = aweaVar.g;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, null);
        }
    }
}
