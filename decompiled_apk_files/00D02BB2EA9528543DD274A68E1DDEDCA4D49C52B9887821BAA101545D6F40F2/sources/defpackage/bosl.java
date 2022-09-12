package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bosl  reason: default package */
/* loaded from: classes3.dex */
public final class bosl implements Runnable {
    final /* synthetic */ cjqm a;
    final /* synthetic */ bosn b;

    public bosl(bosn bosnVar, cjqm cjqmVar) {
        this.b = bosnVar;
        this.a = cjqmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.l(this.a);
    }
}
