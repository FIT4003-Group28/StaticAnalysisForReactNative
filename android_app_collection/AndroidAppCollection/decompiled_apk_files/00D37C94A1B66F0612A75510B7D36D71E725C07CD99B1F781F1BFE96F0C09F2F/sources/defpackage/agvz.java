package defpackage;
/* compiled from: PG */
/* renamed from: agvz  reason: default package */
/* loaded from: classes.dex */
final class agvz implements Runnable {
    final /* synthetic */ Class a;
    final /* synthetic */ agwa b;

    public agvz(agwa agwaVar, Class cls) {
        this.b = agwaVar;
        this.a = cls;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b(this.a);
    }
}
