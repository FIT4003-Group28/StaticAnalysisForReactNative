package defpackage;

import android.content.Context;
import dagger.internal.Factory;
/* compiled from: PG */
/* renamed from: cwwu  reason: default package */
/* loaded from: classes5.dex */
public final class cwwu implements Factory<cwwt> {
    private final dzsj<Context> a;
    private final dzsj<dbsg<cwwh>> b;
    private final dzsj<String> c;

    public cwwu(dzsj<Context> dzsjVar, dzsj<dbsg<cwwh>> dzsjVar2, dzsj<String> dzsjVar3) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
        this.c = dzsjVar3;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        return new cwwt((Context) ((dxjd) this.a).a, ((cwsk) this.b).a(), this.c.a());
    }
}
