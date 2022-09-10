package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cwbw  reason: default package */
/* loaded from: classes5.dex */
public final class cwbw implements aa<Boolean> {
    final /* synthetic */ cwby a;
    private final int b;

    public cwbw(cwby cwbyVar, int i) {
        this.a = cwbyVar;
        this.b = i;
    }

    @Override // defpackage.aa
    public final /* bridge */ /* synthetic */ void m(Boolean bool) {
        if (bool.booleanValue()) {
            this.a.g.c(Integer.valueOf(this.b));
        } else {
            this.a.g.e(Integer.valueOf(this.b));
        }
    }
}
