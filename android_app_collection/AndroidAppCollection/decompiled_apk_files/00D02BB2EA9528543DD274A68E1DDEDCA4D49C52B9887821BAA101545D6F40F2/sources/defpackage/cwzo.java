package defpackage;

import dagger.internal.Factory;
/* compiled from: PG */
/* renamed from: cwzo  reason: default package */
/* loaded from: classes5.dex */
public final class cwzo implements Factory<cwzn> {
    private final dzsj<cwrb> a;
    private final dzsj<dehq> b;

    public cwzo(dzsj<cwrb> dzsjVar, dzsj<dehq> dzsjVar2) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        return new cwzn(this.a.a(), this.b.a());
    }
}
