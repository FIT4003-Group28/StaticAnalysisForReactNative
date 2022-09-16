package defpackage;
/* compiled from: PG */
/* renamed from: aeye  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aeye implements Runnable {
    public final /* synthetic */ afbi a;
    public final /* synthetic */ aegu b;
    private final /* synthetic */ int c;

    public /* synthetic */ aeye(afbi afbiVar, aegu aeguVar) {
        this.a = afbiVar;
        this.b = aeguVar;
    }

    public /* synthetic */ aeye(afbi afbiVar, aegu aeguVar, int i) {
        this.c = i;
        this.a = afbiVar;
        this.b = aeguVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            this.a.b.i("pmqs", new aest(this.b.d()));
            return;
        }
        this.a.b.i("pmqs", new aest(this.b.d()));
    }
}
