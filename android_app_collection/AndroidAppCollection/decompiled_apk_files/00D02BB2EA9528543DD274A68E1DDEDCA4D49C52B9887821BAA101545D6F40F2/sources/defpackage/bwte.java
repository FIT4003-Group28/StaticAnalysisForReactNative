package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bwte  reason: default package */
/* loaded from: classes4.dex */
final class bwte implements Runnable {
    final /* synthetic */ bxdn a;
    final /* synthetic */ bwtr b;

    public bwte(bwtr bwtrVar, bxdn bxdnVar) {
        this.b = bwtrVar;
        this.a = bxdnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cqkx.p(this.a);
        bwtr bwtrVar = this.b;
        View view = bwtrVar.a;
        if (view != null) {
            bwtrVar.ak.b(view);
        }
    }
}
