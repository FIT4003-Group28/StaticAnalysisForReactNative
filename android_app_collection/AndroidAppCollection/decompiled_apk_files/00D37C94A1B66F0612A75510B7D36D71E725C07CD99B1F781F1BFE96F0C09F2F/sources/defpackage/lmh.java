package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: lmh  reason: default package */
/* loaded from: classes3.dex */
final class lmh implements DialogInterface.OnClickListener {
    final /* synthetic */ Intent a;
    final /* synthetic */ lmj b;

    public lmh(lmj lmjVar, Intent intent) {
        this.b = lmjVar;
        this.a = intent;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.b.a.startActivity(this.a);
    }
}
