package defpackage;
/* compiled from: PG */
/* renamed from: ascr  reason: default package */
/* loaded from: classes2.dex */
final class ascr implements Runnable {
    final /* synthetic */ bwsh a;
    final /* synthetic */ dwfl b;
    final /* synthetic */ ilo c;

    public ascr(bwsh bwshVar, dwfl dwflVar, ilo iloVar) {
        this.a = bwshVar;
        this.b = dwflVar;
        this.c = iloVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.e(this.b, null, this.c);
    }
}
