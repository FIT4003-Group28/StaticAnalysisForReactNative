package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cjxb  reason: default package */
/* loaded from: classes4.dex */
public final class cjxb implements DialogInterface.OnClickListener {
    final /* synthetic */ Intent a;
    final /* synthetic */ cjxd b;

    public cjxb(cjxd cjxdVar, Intent intent) {
        this.b = cjxdVar;
        this.a = intent;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.setFlags(268435456);
        afha a = this.b.b.a();
        Context context = this.b.a;
        Intent intent = this.a;
        String valueOf = String.valueOf(intent.getAction());
        a.F(context, intent, valueOf.length() != 0 ? "Problem while starting activity. action: ".concat(valueOf) : new String("Problem while starting activity. action: "));
    }
}
