package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: jdq  reason: default package */
/* loaded from: classes3.dex */
public final class jdq implements DialogInterface.OnClickListener {
    final /* synthetic */ ahda a;
    private final /* synthetic */ int b;

    public jdq(ahda ahdaVar) {
        this.a = ahdaVar;
    }

    public /* synthetic */ jdq(ahda ahdaVar, int i) {
        this.b = i;
        this.a = ahdaVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.b == 0) {
            this.a.b();
        } else {
            this.a.b();
        }
    }
}
