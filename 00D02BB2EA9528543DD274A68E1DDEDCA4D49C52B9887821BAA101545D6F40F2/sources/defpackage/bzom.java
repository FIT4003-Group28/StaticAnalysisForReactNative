package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bzom  reason: default package */
/* loaded from: classes4.dex */
public final class bzom implements View.OnClickListener {
    final /* synthetic */ bzoo a;

    public bzom(bzoo bzooVar) {
        this.a = bzooVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.b.i(bzoo.c());
        bzmn bzmnVar = this.a.e;
        if (bzmnVar != null) {
            bzmnVar.PK();
        }
    }
}
