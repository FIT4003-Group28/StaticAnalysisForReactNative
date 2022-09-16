package defpackage;

import java.util.Iterator;
import java.util.concurrent.CancellationException;
/* compiled from: PG */
/* renamed from: algl  reason: default package */
/* loaded from: classes.dex */
final class algl implements ankb {
    final /* synthetic */ String a;
    final /* synthetic */ algq b;

    public algl(algq algqVar, String str) {
        this.b = algqVar;
        this.a = str;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        if (this.b.h(this.a) != 3 || (th instanceof CancellationException)) {
            return;
        }
        Iterator it = this.b.b.iterator();
        while (it.hasNext()) {
            ((algp) it.next()).p(this.a);
        }
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.b.d(this.a, (alhe) obj);
    }
}
