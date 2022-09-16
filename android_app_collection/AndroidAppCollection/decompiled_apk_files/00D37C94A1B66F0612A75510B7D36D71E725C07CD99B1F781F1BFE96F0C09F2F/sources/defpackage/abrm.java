package defpackage;
/* compiled from: PG */
/* renamed from: abrm  reason: default package */
/* loaded from: classes.dex */
final class abrm implements Runnable {
    final /* synthetic */ abro a;

    public abrm(abro abroVar) {
        this.a = abroVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        abro abroVar = this.a;
        accf accfVar = abroVar.a;
        if (accfVar != null) {
            accfVar.f(abroVar);
        }
    }
}
