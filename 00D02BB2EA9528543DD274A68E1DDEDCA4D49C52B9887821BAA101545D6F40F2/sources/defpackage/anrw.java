package defpackage;

import android.content.DialogInterface;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anrw  reason: default package */
/* loaded from: classes2.dex */
public final class anrw implements DialogInterface.OnClickListener {
    final /* synthetic */ anry a;

    public anrw(anry anryVar) {
        this.a = anryVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            anry anryVar = this.a;
            anryVar.p.i(anryVar.R(dtyi.bJ));
            anry anryVar2 = this.a;
            int i2 = true != anryVar2.H() ? 1 : 2;
            angp angpVar = anryVar2.o;
            dvay dvayVar = anryVar2.g;
            dpop dpopVar = anryVar2.i.a().e;
            if (dpopVar == null) {
                dpopVar = dpop.d;
            }
            angpVar.q(dvayVar, i2, dpopVar, dbpy.a, true);
        }
    }
}
