package defpackage;
/* compiled from: PG */
/* renamed from: dyno  reason: default package */
/* loaded from: classes6.dex */
final class dyno implements Runnable {
    final /* synthetic */ dynv a;

    public dyno(dynv dynvVar) {
        this.a = dynvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d.d();
    }
}
