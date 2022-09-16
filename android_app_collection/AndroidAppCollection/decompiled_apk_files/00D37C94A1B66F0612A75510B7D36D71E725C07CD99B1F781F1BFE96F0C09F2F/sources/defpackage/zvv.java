package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: zvv  reason: default package */
/* loaded from: classes4.dex */
final class zvv implements View.OnClickListener {
    final /* synthetic */ zvw a;
    final /* synthetic */ zvx b;

    public zvv(zvx zvxVar, zvw zvwVar) {
        this.b = zvxVar;
        this.a = zvwVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zvx zvxVar = this.b;
        zvxVar.d.e.c((zvu) zvxVar.e.get(this.a.b()));
    }
}
