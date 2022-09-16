package defpackage;

import android.os.IBinder;
/* compiled from: PG */
/* renamed from: arr  reason: default package */
/* loaded from: classes2.dex */
final class arr implements Runnable {
    final /* synthetic */ aru a;
    final /* synthetic */ arv b;
    private final /* synthetic */ int c;

    public arr(aru aruVar, arv arvVar) {
        this.a = aruVar;
        this.b = arvVar;
    }

    public arr(aru aruVar, arv arvVar, int i) {
        this.c = i;
        this.a = aruVar;
        this.b = arvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            IBinder a = this.b.a();
            ara araVar = (ara) this.a.a.c.remove(a);
            if (araVar == null) {
                return;
            }
            a.unlinkToDeath(araVar, 0);
            return;
        }
        ara araVar2 = (ara) this.a.a.c.remove(this.b.a());
        if (araVar2 == null) {
            return;
        }
        araVar2.f.a().unlinkToDeath(araVar2, 0);
    }
}
