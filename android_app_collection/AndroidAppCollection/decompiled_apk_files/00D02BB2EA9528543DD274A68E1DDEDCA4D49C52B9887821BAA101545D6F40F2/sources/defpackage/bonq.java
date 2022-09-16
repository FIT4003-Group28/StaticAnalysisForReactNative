package defpackage;
/* compiled from: PG */
/* renamed from: bonq  reason: default package */
/* loaded from: classes3.dex */
final class bonq implements booe {
    final /* synthetic */ bonr a;

    public bonq(bonr bonrVar) {
        this.a = bonrVar;
    }

    @Override // defpackage.booe
    public final void a(boof boofVar) {
        if (!this.a.k().booleanValue() || !boofVar.p().booleanValue() || boofVar.t()) {
            this.a.c.remove(boofVar.a());
        } else {
            this.a.c.add(boofVar.a());
        }
        cqkx.p(this.a);
    }
}
