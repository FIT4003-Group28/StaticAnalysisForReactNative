package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cezc  reason: default package */
/* loaded from: classes4.dex */
public final class cezc implements Runnable {
    private final area a;
    private final akzh b;

    public cezc(area areaVar, akzh akzhVar) {
        this.a = areaVar;
        this.b = akzhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.q = ceze.l(this.b);
    }
}
