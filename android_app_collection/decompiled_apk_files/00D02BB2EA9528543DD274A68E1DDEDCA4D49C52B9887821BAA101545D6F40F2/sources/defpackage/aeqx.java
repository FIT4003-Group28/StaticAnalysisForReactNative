package defpackage;
/* compiled from: PG */
/* renamed from: aeqx  reason: default package */
/* loaded from: classes2.dex */
final class aeqx implements Runnable {
    final /* synthetic */ aerz a;
    final /* synthetic */ aeqy b;

    public aeqx(aeqy aeqyVar, aerz aerzVar) {
        this.b = aeqyVar;
        this.a = aerzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.b.b);
    }
}
