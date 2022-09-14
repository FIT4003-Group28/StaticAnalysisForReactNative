package defpackage;

import dagger.internal.Factory;
/* compiled from: PG */
/* renamed from: cwvc  reason: default package */
/* loaded from: classes5.dex */
public final class cwvc implements Factory<cwvb> {
    private final dzsj<String> a;
    private final dzsj<cwwd> b;
    private final dzsj<cwvf> c;

    public cwvc(dzsj<String> dzsjVar, dzsj<cwwd> dzsjVar2, dzsj<cwvf> dzsjVar3) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
        this.c = dzsjVar3;
    }

    @Override // defpackage.dzsj
    /* renamed from: b */
    public final cwvb a() {
        return new cwvb(this.a.a(), ((cwwe) this.b).a(), cqau.b(), this.c);
    }
}
