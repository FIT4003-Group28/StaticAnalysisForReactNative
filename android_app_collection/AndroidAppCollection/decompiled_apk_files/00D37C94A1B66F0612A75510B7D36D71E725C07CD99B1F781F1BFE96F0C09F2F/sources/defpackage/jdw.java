package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: jdw  reason: default package */
/* loaded from: classes3.dex */
public final class jdw implements DialogInterface.OnClickListener {
    final /* synthetic */ ahdb a;
    private final /* synthetic */ int b;

    public jdw(ahdb ahdbVar) {
        this.a = ahdbVar;
    }

    public /* synthetic */ jdw(ahdb ahdbVar, int i) {
        this.b = i;
        this.a = ahdbVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.b == 0) {
            this.a.a();
        } else {
            this.a.a();
        }
    }
}
