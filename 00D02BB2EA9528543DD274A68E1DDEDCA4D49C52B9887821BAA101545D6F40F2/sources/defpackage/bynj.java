package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bynj  reason: default package */
/* loaded from: classes4.dex */
public final class bynj implements amfq {
    final /* synthetic */ bynq a;

    public bynj(bynq bynqVar) {
        this.a = bynqVar;
    }

    @Override // defpackage.amfq
    public final void a(final amfu amfuVar) {
        if (!this.a.d.a()) {
            return;
        }
        this.a.c.b(new Runnable(this, amfuVar) { // from class: byni
            private final bynj a;
            private final amfu b;

            {
                this.a = this;
                this.b = amfuVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bynj bynjVar = this.a;
                amfu amfuVar2 = this.b;
                bynjVar.a.j = bynw.d(amfuVar2);
                cqkx.p(bynjVar.a);
            }
        }, bvrj.UI_THREAD);
    }
}
