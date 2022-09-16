package defpackage;
/* compiled from: PG */
/* renamed from: gcy  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gcy implements Runnable {
    public final /* synthetic */ gdn a;
    private final /* synthetic */ int b;

    public /* synthetic */ gcy(gdn gdnVar, int i) {
        this.b = i;
        this.a = gdnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            aiap aiapVar = this.a.c;
            if (aiapVar == null) {
                return;
            }
            aiapVar.a();
            return;
        }
        aiap aiapVar2 = this.a.c;
        if (aiapVar2 == null) {
            return;
        }
        aiapVar2.b();
    }
}
