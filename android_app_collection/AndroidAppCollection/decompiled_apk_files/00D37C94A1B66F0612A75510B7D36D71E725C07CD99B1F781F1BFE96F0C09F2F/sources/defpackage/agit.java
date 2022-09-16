package defpackage;
/* compiled from: PG */
/* renamed from: agit  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class agit implements Runnable {
    public final /* synthetic */ agiv a;
    private final /* synthetic */ int b;

    public /* synthetic */ agit(agiv agivVar, int i) {
        this.b = i;
        this.a = agivVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.g();
        } else {
            this.a.e();
        }
    }
}
