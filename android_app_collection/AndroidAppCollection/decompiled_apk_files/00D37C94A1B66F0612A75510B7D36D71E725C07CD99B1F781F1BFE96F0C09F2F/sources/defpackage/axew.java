package defpackage;
/* compiled from: PG */
/* renamed from: axew  reason: default package */
/* loaded from: classes2.dex */
public final class axew implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ axfc b;

    public axew(axfc axfcVar, String str) {
        this.b = axfcVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        axeu axeuVar = this.b.h;
        if (axeuVar != null) {
            axeuVar.c(this.a);
        }
    }
}
