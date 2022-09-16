package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: xxc  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class xxc implements DialogInterface.OnCancelListener {
    public final /* synthetic */ azeh a;
    private final /* synthetic */ int b;

    public /* synthetic */ xxc(azeh azehVar, int i) {
        this.b = i;
        this.a = azehVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i = this.b;
        if (i == 0) {
            this.a.c();
        } else if (i == 1) {
            this.a.c();
        } else if (i == 2) {
            this.a.c();
        } else {
            this.a.c();
        }
    }
}
