package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: btd  reason: default package */
/* loaded from: classes2.dex */
public final class btd implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ bte b;

    public btd(bte bteVar, List list) {
        this.b = bteVar;
        this.a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (bsm bsmVar : this.a) {
            bsmVar.a(this.b.d);
        }
    }
}
