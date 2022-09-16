package defpackage;

import java.util.LinkedHashSet;
/* compiled from: PG */
/* renamed from: dyrl  reason: default package */
/* loaded from: classes6.dex */
final class dyrl implements Runnable {
    final /* synthetic */ dyro a;
    final /* synthetic */ dyrp b;

    public dyrl(dyrp dyrpVar, dyro dyroVar) {
        this.b = dyrpVar;
        this.a = dyroVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.a.get() == dyrz.g) {
            dyrz dyrzVar = this.b.b;
            if (dyrzVar.w == null) {
                dyrzVar.w = new LinkedHashSet();
                dyrz dyrzVar2 = this.b.b;
                dyrzVar2.R.a(dyrzVar2.x, true);
            }
            this.b.b.w.add(this.a);
            return;
        }
        this.a.j();
    }
}
