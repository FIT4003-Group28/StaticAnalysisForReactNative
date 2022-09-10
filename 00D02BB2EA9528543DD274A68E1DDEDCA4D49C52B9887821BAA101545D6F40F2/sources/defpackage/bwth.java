package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bwth  reason: default package */
/* loaded from: classes4.dex */
final class bwth implements View.OnClickListener {
    final /* synthetic */ bwtr a;

    public bwth(bwtr bwtrVar) {
        this.a = bwtrVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        bwsq bwsqVar = this.a.b;
        if (bwsqVar != null) {
            bwsqVar.h();
        }
    }
}
