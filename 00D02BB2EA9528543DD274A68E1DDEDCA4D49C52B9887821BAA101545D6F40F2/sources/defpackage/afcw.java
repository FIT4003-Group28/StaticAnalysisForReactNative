package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: afcw  reason: default package */
/* loaded from: classes2.dex */
final class afcw implements DialogInterface.OnClickListener {
    final /* synthetic */ Intent a;
    final /* synthetic */ Context b;
    final /* synthetic */ afdd c;

    public afcw(afdd afddVar, Intent intent, Context context) {
        this.c = afddVar;
        this.a = intent;
        this.b = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.setFlags(268435456);
        afha a = this.c.s.a();
        Context context = this.b;
        Intent intent = this.a;
        String valueOf = String.valueOf(intent.getAction());
        a.F(context, intent, valueOf.length() != 0 ? "Problem while starting activity. action: ".concat(valueOf) : new String("Problem while starting activity. action: "));
    }
}
