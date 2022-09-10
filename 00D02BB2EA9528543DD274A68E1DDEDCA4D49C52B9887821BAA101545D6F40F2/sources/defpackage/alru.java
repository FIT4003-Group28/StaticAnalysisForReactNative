package defpackage;

import android.graphics.Bitmap;
import android.util.LongSparseArray;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alru  reason: default package */
/* loaded from: classes.dex */
public final class alru implements also {
    private final alrv a;
    private final LongSparseArray<allt> b = new LongSparseArray<>();
    private final alrt c;

    public alru(alrv alrvVar) {
        this.a = alrvVar;
        this.c = new alrt(alrvVar);
    }

    @Override // defpackage.akvx
    public final akuh a(long j) {
        allt alltVar;
        synchronized (this) {
            alltVar = this.b.get(j);
            if (alltVar == null) {
                alltVar = new allt((int) j, this.c);
                this.b.put(j, alltVar);
            }
        }
        return alltVar;
    }

    @Override // defpackage.akvx
    public final aktg b(dmqx dmqxVar) {
        return alrv.b;
    }

    @Override // defpackage.akvx
    public final akuh c(Bitmap bitmap) {
        return alrv.c;
    }

    @Override // defpackage.akvx
    public final void d(akuh akuhVar) {
    }

    @Override // defpackage.akvx
    public final int e() {
        return 2;
    }

    @Override // defpackage.alxa
    public final alxp f(long j) {
        return this.a.p(j);
    }

    @Override // defpackage.alxa
    public final alxp g(int i) {
        return alxp.e;
    }

    @Override // defpackage.alxa
    public final alxp h(int i) {
        alrv alrvVar = this.a;
        return alrvVar.o(i, alrvVar.x());
    }
}
