package defpackage;
/* compiled from: PG */
/* renamed from: ahks  reason: default package */
/* loaded from: classes2.dex */
final class ahks implements Runnable {
    final /* synthetic */ ahso a;
    final /* synthetic */ ahkv b;

    public ahks(ahkv ahkvVar, ahso ahsoVar) {
        this.b = ahkvVar;
        this.a = ahsoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ahkv ahkvVar = this.b;
        ahkvVar.D = this.a;
        ahsp ahspVar = ahkvVar.j;
        if (ahspVar != null) {
            ahspVar.b(ahkvVar.D);
        }
    }
}
