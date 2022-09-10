package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: aois  reason: default package */
/* loaded from: classes2.dex */
final class aois implements DialogInterface.OnClickListener {
    final /* synthetic */ dwfl a;
    final /* synthetic */ aoit b;

    public aois(aoit aoitVar, dwfl dwflVar) {
        this.b = aoitVar;
        this.a = dwflVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.b.aT();
        if (i == -1) {
            this.b.a.e(this.a);
            this.b.Nw(new angi(this.a.q));
        }
    }
}
