package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: bteh  reason: default package */
/* loaded from: classes4.dex */
final class bteh implements DialogInterface.OnCancelListener {
    final /* synthetic */ btem a;

    public bteh(btem btemVar) {
        this.a = btemVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a.ao.i(cjtd.a(dtxw.cB));
    }
}
