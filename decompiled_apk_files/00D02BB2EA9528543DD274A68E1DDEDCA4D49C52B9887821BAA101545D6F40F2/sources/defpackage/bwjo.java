package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bwjo  reason: default package */
/* loaded from: classes4.dex */
final class bwjo implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ bwjw b;

    public bwjo(List list, bwjw bwjwVar) {
        this.a = list;
        this.b = bwjwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (bwnq bwnqVar : this.a) {
            this.b.a(bwnqVar);
        }
    }
}
