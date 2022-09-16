package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: bazr  reason: default package */
/* loaded from: classes3.dex */
final class bazr implements DialogInterface.OnClickListener {
    final /* synthetic */ bazw a;

    public bazr(bazw bazwVar) {
        this.a = bazwVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        bazw bazwVar = this.a;
        long g = bazwVar.e.g();
        bazwVar.a.x().e(g, new bazs(bazwVar, g));
    }
}
