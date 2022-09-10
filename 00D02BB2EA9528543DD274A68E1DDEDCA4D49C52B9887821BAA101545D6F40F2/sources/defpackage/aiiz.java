package defpackage;
/* compiled from: PG */
/* renamed from: aiiz  reason: default package */
/* loaded from: classes2.dex */
final class aiiz implements Runnable {
    final /* synthetic */ aija a;

    public aiiz(aija aijaVar) {
        this.a = aijaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b();
        this.a.e = null;
    }
}
