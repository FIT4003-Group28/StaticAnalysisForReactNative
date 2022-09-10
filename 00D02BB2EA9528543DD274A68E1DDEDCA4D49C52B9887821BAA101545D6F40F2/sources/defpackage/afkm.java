package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: afkm  reason: default package */
/* loaded from: classes2.dex */
final class afkm implements Runnable {
    final /* synthetic */ DialogInterface.OnClickListener a;
    final /* synthetic */ DialogInterface.OnCancelListener b;
    final /* synthetic */ afkn c;

    public afkm(afkn afknVar, DialogInterface.OnClickListener onClickListener, DialogInterface.OnCancelListener onCancelListener) {
        this.c = afknVar;
        this.a = onClickListener;
        this.b = onCancelListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ppw.b(this.c.b, this.a, this.b);
    }
}
