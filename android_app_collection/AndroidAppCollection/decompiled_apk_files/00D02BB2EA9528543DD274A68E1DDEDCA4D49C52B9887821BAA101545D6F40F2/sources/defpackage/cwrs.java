package defpackage;

import dagger.internal.Factory;
/* compiled from: PG */
/* renamed from: cwrs  reason: default package */
/* loaded from: classes5.dex */
public final class cwrs implements Factory<cwrr> {
    private final dzsj<dehq> a;
    private final dzsj<cwrb> b;

    public cwrs(dzsj<dehq> dzsjVar, dzsj<cwrb> dzsjVar2) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        return new cwrr(this.a.a(), this.b.a());
    }
}
