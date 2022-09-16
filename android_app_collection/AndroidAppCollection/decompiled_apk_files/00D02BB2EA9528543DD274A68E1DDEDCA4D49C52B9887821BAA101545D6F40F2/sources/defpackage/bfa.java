package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bfa  reason: default package */
/* loaded from: classes3.dex */
public final class bfa implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ bfb b;

    public bfa(bfb bfbVar, List list) {
        this.b = bfbVar;
        this.a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (bej bejVar : this.a) {
            bejVar.a(this.b.d);
        }
    }
}
