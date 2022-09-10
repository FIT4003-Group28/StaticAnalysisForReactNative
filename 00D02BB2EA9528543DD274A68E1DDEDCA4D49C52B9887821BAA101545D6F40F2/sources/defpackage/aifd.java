package defpackage;
/* compiled from: PG */
/* renamed from: aifd  reason: default package */
/* loaded from: classes2.dex */
final class aifd extends akvn<aktd> {
    final /* synthetic */ aifk a;

    public aifd(aifk aifkVar) {
        this.a = aifkVar;
    }

    @Override // defpackage.akvo
    public final /* bridge */ /* synthetic */ void x(Object obj) {
        dbsk.b(((aktd) obj) == this.a.a, "Renderable should only listen to clicks on itself.");
        Runnable runnable = this.a.e;
        if (runnable != null) {
            runnable.run();
        }
    }
}
