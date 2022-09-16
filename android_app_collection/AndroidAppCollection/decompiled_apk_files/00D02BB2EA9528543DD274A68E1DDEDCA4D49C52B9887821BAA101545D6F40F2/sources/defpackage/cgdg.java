package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: cgdg  reason: default package */
/* loaded from: classes4.dex */
final class cgdg implements DialogInterface.OnClickListener {
    final /* synthetic */ cgdv a;

    public cgdg(cgdv cgdvVar) {
        this.a = cgdvVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            if (this.a.e.D().isEmpty() || this.a.e.F().isEmpty()) {
                dwsn b = this.a.ad.b();
                if (b != null) {
                    this.a.bu(b);
                    return;
                } else {
                    this.a.bt(true);
                    return;
                }
            }
            this.a.bt(false);
        }
    }
}
