package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: ovg  reason: default package */
/* loaded from: classes4.dex */
final class ovg implements Runnable {
    final /* synthetic */ IOException a;
    final /* synthetic */ ovj b;

    public ovg(ovj ovjVar, IOException iOException) {
        this.b = ovjVar;
        this.a = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ovj ovjVar = this.b;
        ovjVar.c.b(ovjVar.b, this.a);
    }
}
