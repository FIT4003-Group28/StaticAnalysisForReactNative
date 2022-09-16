package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: xlg  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class xlg implements DialogInterface.OnDismissListener {
    public final /* synthetic */ xli a;
    private final /* synthetic */ int b;

    public /* synthetic */ xlg(xli xliVar, int i) {
        this.b = i;
        this.a = xliVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = this.b;
        if (i == 0) {
            this.a.j();
        } else if (i == 1) {
            this.a.j();
        } else {
            this.a.j();
        }
    }
}
