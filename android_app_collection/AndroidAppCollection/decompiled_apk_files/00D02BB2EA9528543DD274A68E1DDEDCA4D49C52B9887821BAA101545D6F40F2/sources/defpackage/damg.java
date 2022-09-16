package defpackage;

import android.content.Context;
import dagger.internal.Factory;
/* compiled from: PG */
/* renamed from: damg  reason: default package */
/* loaded from: classes5.dex */
public final class damg implements Factory<damf> {
    private final dzsj<Context> a;

    public damg(dzsj<Context> dzsjVar) {
        this.a = dzsjVar;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        return new damf(((dalo) this.a).a());
    }
}
