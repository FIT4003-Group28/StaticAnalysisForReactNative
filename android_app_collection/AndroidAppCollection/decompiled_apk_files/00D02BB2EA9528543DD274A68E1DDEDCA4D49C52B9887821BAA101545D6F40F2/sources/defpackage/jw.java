package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jw  reason: default package */
/* loaded from: classes.dex */
public final class jw implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ jx b;

    public jw(jx jxVar, int i) {
        this.b = jxVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b(this.a);
    }
}
