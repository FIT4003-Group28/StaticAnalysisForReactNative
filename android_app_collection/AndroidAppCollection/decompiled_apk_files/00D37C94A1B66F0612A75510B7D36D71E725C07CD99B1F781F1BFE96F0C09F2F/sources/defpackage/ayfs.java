package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayfs  reason: default package */
/* loaded from: classes2.dex */
public final class ayfs implements Runnable {
    final /* synthetic */ ayjs a;
    private final /* synthetic */ int b;

    public ayfs(ayjs ayjsVar) {
        this.a = ayjsVar;
    }

    public ayfs(ayjs ayjsVar, int i) {
        this.b = i;
        this.a = ayjsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.a(false);
        } else if (i == 1) {
            this.a.a(true);
        } else {
            ayiq ayiqVar = (ayiq) this.a;
            aqxo.z(ayiqVar.a.A.get(), "Channel must have been shut down");
            ayji ayjiVar = ayiqVar.a;
            ayjiVar.C = true;
            ayjiVar.l(false);
            ayiqVar.a.g();
            ayiqVar.a.h();
        }
    }
}
