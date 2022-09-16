package defpackage;

import android.content.Context;
import dagger.internal.Factory;
/* compiled from: PG */
/* renamed from: damd  reason: default package */
/* loaded from: classes5.dex */
public final class damd implements Factory<damc> {
    private final dzsj<Context> a;

    public damd(dzsj<Context> dzsjVar) {
        this.a = dzsjVar;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        return new damc(((dalo) this.a).a());
    }
}
