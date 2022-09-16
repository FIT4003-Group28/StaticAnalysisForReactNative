package defpackage;
/* compiled from: PG */
/* renamed from: jck  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jck implements Runnable {
    public final /* synthetic */ jcq a;
    public final /* synthetic */ agqh b;
    private final /* synthetic */ int c;

    public /* synthetic */ jck(jcq jcqVar, agqh agqhVar) {
        this.a = jcqVar;
        this.b = agqhVar;
    }

    public /* synthetic */ jck(jcq jcqVar, agqh agqhVar, int i) {
        this.c = i;
        this.a = jcqVar;
        this.b = agqhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            this.a.b(new jbs(this.b), "Error updating entities for OfflinePlaylistSyncEvent.");
        } else {
            this.a.b(new jbs(this.b, 1), "Error updating entities for OfflinePlaylistAddEvent.");
        }
    }
}
