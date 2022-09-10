package defpackage;
/* compiled from: PG */
/* renamed from: awem  reason: default package */
/* loaded from: classes3.dex */
final class awem implements Runnable {
    final /* synthetic */ awet a;

    public awem(awet awetVar) {
        this.a = awetVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.i.setVisibility(0);
        this.a.q = true;
    }
}
