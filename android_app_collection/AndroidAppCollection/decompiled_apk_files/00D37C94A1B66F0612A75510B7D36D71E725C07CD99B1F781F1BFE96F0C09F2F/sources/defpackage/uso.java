package defpackage;
/* compiled from: PG */
/* renamed from: uso  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class uso implements Runnable {
    public final /* synthetic */ usu a;
    private final /* synthetic */ int b;

    public /* synthetic */ uso(usu usuVar) {
        this.a = usuVar;
    }

    public /* synthetic */ uso(usu usuVar, int i) {
        this.b = i;
        this.a = usuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            usq usqVar = (usq) this.a.mJ();
            if (usqVar == null) {
                return;
            }
            usqVar.d(3, "");
            return;
        }
        this.a.p();
    }
}
