package defpackage;

import android.os.SystemClock;
/* compiled from: PG */
/* renamed from: csak  reason: default package */
/* loaded from: classes5.dex */
final class csak extends dyfe {
    public final Object a = new Object();
    public final cxaj b;
    public boolean c;
    public int d;
    public int e;

    public csak(cxaj cxajVar) {
        this.b = cxajVar;
    }

    @Override // defpackage.dyfe
    public final void a() {
        synchronized (this.a) {
            if (!this.c) {
                cxaj cxajVar = this.b;
                cxajVar.b = SystemClock.elapsedRealtime() - cxajVar.a;
            }
        }
    }

    @Override // defpackage.dyje
    public final void b(long j) {
        synchronized (this.a) {
            this.e += (int) j;
        }
    }

    @Override // defpackage.dyje
    public final void c(long j) {
        synchronized (this.a) {
            this.d += (int) j;
        }
    }
}
