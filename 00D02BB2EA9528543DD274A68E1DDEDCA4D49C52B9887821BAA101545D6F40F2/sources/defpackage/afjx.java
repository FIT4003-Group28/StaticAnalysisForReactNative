package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: afjx  reason: default package */
/* loaded from: classes2.dex */
final class afjx implements Runnable {
    final /* synthetic */ DialogInterface.OnClickListener a;
    final /* synthetic */ afjy b;

    public afjx(afjy afjyVar, DialogInterface.OnClickListener onClickListener) {
        this.b = afjyVar;
        this.a = onClickListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ppw.b(this.b.b, this.a, null);
    }
}
