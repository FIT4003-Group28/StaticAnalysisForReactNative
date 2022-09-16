package defpackage;
/* compiled from: PG */
/* renamed from: quk  reason: default package */
/* loaded from: classes4.dex */
public final class quk implements Runnable {
    final /* synthetic */ qul a;

    public quk(qul qulVar) {
        this.a = qulVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qsn qsnVar = this.a.a.b;
        qsnVar.f(String.valueOf(qsnVar.getClass().getName()).concat(" disconnecting because it was signed out."));
    }
}
