package defpackage;
/* compiled from: PG */
/* renamed from: abvc  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class abvc implements Runnable {
    public final /* synthetic */ abvj a;
    private final /* synthetic */ int b;

    public /* synthetic */ abvc(abvj abvjVar, int i) {
        this.b = i;
        this.a = abvjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            this.a.c();
            return;
        }
        abvj abvjVar = this.a;
        abvjVar.i = false;
        abvjVar.j = false;
    }
}
