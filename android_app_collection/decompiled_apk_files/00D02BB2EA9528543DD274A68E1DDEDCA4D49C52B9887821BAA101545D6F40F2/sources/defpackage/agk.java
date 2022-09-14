package defpackage;
/* compiled from: PG */
/* renamed from: agk  reason: default package */
/* loaded from: classes.dex */
public final class agk implements agc {
    final /* synthetic */ agl a;
    private final agj b;

    public agk(agl aglVar, agj agjVar) {
        this.a = aglVar;
        this.b = agjVar;
    }

    @Override // defpackage.agc
    public final void b() {
        this.a.a.remove(this.b);
        this.b.c(this);
    }
}
