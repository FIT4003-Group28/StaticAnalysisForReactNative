package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cjjk  reason: default package */
/* loaded from: classes4.dex */
public final class cjjk implements View.OnClickListener {
    final /* synthetic */ cjjn a;

    public cjjk(cjjn cjjnVar) {
        this.a = cjjnVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        dzut<dztc> dzutVar = this.a.c;
        if (dzutVar != null) {
            dzutVar.a();
        }
    }
}
