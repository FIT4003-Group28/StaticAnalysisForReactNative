package defpackage;
/* compiled from: PG */
/* renamed from: acnb  reason: default package */
/* loaded from: classes2.dex */
final class acnb implements Runnable {
    final /* synthetic */ cpny a;
    final /* synthetic */ acmy b;

    public acnb(cpny cpnyVar, acmy acmyVar) {
        this.a = cpnyVar;
        this.b = acmyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        acnd.d(this.a, this.b);
    }
}
