package defpackage;
/* compiled from: PG */
/* renamed from: ealr  reason: default package */
/* loaded from: classes6.dex */
final class ealr implements Runnable {
    final /* synthetic */ eamn a;
    final /* synthetic */ int b;

    public ealr(eamn eamnVar, int i) {
        this.a = eamnVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.onStatus(this.b);
    }
}
