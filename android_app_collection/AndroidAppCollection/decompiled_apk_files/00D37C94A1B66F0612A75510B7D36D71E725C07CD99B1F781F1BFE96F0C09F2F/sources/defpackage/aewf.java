package defpackage;
/* compiled from: PG */
/* renamed from: aewf  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aewf implements Runnable {
    public final /* synthetic */ aewx a;
    public final /* synthetic */ afbi b;
    private final /* synthetic */ int c;

    public /* synthetic */ aewf(aewx aewxVar, afbi afbiVar) {
        this.a = aewxVar;
        this.b = afbiVar;
    }

    public /* synthetic */ aewf(aewx aewxVar, afbi afbiVar, int i) {
        this.c = i;
        this.a = aewxVar;
        this.b = afbiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            this.a.ad(this.b);
        } else {
            this.a.aj(this.b, true);
        }
    }
}
