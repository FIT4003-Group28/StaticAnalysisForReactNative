package defpackage;

import android.content.Context;
import dagger.internal.Factory;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cwtd  reason: default package */
/* loaded from: classes5.dex */
public final class cwtd implements Factory<cwtc> {
    private final dzsj<Context> a;
    private final dzsj<cwrb> b;
    private final dzsj<dehq> c;
    private final dzsj<cwuc> d;
    private final dzsj<Set<cwwr>> e;
    private final dzsj<cwrk> f;

    public cwtd(dzsj<Context> dzsjVar, dzsj<cwrb> dzsjVar2, dzsj<dehq> dzsjVar3, dzsj<cwuc> dzsjVar4, dzsj<Set<cwwr>> dzsjVar5, dzsj<cwrk> dzsjVar6) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
        this.c = dzsjVar3;
        this.d = dzsjVar4;
        this.e = dzsjVar5;
        this.f = dzsjVar6;
    }

    @Override // defpackage.dzsj
    /* renamed from: b */
    public final cwtc a() {
        return new cwtc((Context) ((dxjd) this.a).a, this.b.a(), this.c, this.d, this.e, this.f);
    }
}
