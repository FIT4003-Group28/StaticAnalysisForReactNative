package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: azgl  reason: default package */
/* loaded from: classes3.dex */
final class azgl implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ azgm b;

    public azgl(azgm azgmVar, List list) {
        this.b = azgmVar;
        this.a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.a(this.a);
    }
}
