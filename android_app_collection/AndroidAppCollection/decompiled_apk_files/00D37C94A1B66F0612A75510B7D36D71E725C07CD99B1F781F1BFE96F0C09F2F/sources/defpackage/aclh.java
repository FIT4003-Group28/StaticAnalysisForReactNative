package defpackage;
/* compiled from: PG */
/* renamed from: aclh  reason: default package */
/* loaded from: classes.dex */
final class aclh implements Runnable {
    final /* synthetic */ acli a;

    public aclh(acli acliVar) {
        this.a = acliVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        acli acliVar = this.a;
        acliVar.b.o(acliVar.a - 1);
    }
}
