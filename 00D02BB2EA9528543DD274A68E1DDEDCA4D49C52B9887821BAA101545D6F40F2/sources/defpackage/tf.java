package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: tf  reason: default package */
/* loaded from: classes7.dex */
public final class tf implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ List b;
    final /* synthetic */ int c;
    final /* synthetic */ th d;

    public tf(th thVar, List list, List list2, int i) {
        this.d = thVar;
        this.a = list;
        this.b = list2;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.c.execute(new te(this, tx.a(new td(this))));
    }
}
