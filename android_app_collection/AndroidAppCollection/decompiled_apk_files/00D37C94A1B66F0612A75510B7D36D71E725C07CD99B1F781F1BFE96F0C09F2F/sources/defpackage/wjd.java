package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: wjd  reason: default package */
/* loaded from: classes4.dex */
final class wjd implements View.OnClickListener {
    final /* synthetic */ apoj a;
    final /* synthetic */ wjg b;

    public wjd(wjg wjgVar, apoj apojVar) {
        this.b = wjgVar;
        this.a = apojVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        wjf wjfVar = this.b.b;
        if (wjfVar != null) {
            apzg apzgVar = this.a.o;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            wjfVar.aK(apzgVar);
        }
    }
}
