package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: cchh  reason: default package */
/* loaded from: classes4.dex */
final class cchh implements DialogInterface.OnClickListener {
    final /* synthetic */ cchj a;

    public cchh(cchj cchjVar) {
        this.a = cchjVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.a.bg()) {
            this.a.J().g().e();
            this.a.c.k(null, dkcp.CONTRIBUTE);
        }
    }
}
