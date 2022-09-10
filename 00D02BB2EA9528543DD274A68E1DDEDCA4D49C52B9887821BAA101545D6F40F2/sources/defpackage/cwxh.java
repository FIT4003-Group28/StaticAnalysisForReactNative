package defpackage;

import android.content.Context;
import dagger.internal.Factory;
/* compiled from: PG */
/* renamed from: cwxh  reason: default package */
/* loaded from: classes5.dex */
public final class cwxh implements Factory<cwxg> {
    private final dzsj<cwwz> a;
    private final dzsj<Context> b;

    public cwxh(dzsj<cwwz> dzsjVar, dzsj<Context> dzsjVar2) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        return new cwxg(cqau.b(), dxjc.c(this.a), (Context) ((dxjd) this.b).a);
    }
}
