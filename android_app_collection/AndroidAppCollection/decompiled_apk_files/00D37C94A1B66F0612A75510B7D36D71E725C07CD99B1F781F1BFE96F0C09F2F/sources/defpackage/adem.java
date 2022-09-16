package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: adem  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class adem implements DialogInterface.OnClickListener {
    public final /* synthetic */ aden a;
    private final /* synthetic */ int b;

    public /* synthetic */ adem(aden adenVar, int i) {
        this.b = i;
        this.a = adenVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.b == 0) {
            aden adenVar = this.a;
            adenVar.ae.a();
            adenVar.dismiss();
            return;
        }
        this.a.ku();
    }
}
