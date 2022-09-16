package defpackage;

import android.os.SystemClock;
/* compiled from: PG */
/* renamed from: uyq  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class uyq implements Runnable {
    public final /* synthetic */ uyu a;
    private final /* synthetic */ int b;

    public /* synthetic */ uyq(uyu uyuVar) {
        this.a = uyuVar;
    }

    public /* synthetic */ uyq(uyu uyuVar, int i) {
        this.b = i;
        this.a = uyuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            uys.c(this.a);
        } else if (i == 1) {
            uys.b(this.a);
        } else if (i == 2) {
            uyu uyuVar = this.a;
            uwp.f();
            if (uyuVar.b.j != 0) {
                return;
            }
            uyuVar.b.j = SystemClock.elapsedRealtime();
            uyuVar.b.m.j = true;
        } else {
            uyu uyuVar2 = this.a;
            uwp.f();
            if (uyuVar2.b.i != 0) {
                return;
            }
            uyuVar2.b.i = SystemClock.elapsedRealtime();
            uyuVar2.b.m.i = true;
        }
    }
}
