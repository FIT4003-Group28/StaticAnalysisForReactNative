package defpackage;

import dagger.internal.Factory;
/* compiled from: PG */
/* renamed from: clez  reason: default package */
/* loaded from: classes5.dex */
public final class clez implements Factory<clex> {
    private final dzsj a;
    private final dzsj<clgk> b;
    private final dzsj<clgo> c;

    public clez(dzsj dzsjVar, dzsj<clgk> dzsjVar2, dzsj<clgo> dzsjVar3) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
        this.c = dzsjVar3;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        ((clfr) this.a).a();
        return new clex(((clgl) this.b).a(), ((clgp) this.c).a());
    }
}
