package defpackage;
/* compiled from: PG */
/* renamed from: cdus  reason: default package */
/* loaded from: classes4.dex */
final class cdus implements Runnable {
    final /* synthetic */ cdut a;
    final /* synthetic */ cdyl b;

    public cdus(cdut cdutVar, cdyl cdylVar) {
        this.a = cdutVar;
        this.b = cdylVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.s.a(((cdvj) this.b).c);
    }
}
