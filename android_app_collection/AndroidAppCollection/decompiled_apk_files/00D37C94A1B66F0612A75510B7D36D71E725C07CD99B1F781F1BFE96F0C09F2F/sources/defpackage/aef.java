package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: aef  reason: default package */
/* loaded from: classes.dex */
final class aef implements DialogInterface.OnClickListener {
    final /* synthetic */ aei a;

    public aef(aei aeiVar) {
        this.a = aeiVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.ag.q(true);
    }
}
