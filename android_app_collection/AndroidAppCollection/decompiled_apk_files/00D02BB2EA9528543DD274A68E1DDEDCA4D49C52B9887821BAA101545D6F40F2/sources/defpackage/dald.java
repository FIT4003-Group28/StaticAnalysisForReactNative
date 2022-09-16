package defpackage;

import android.content.Context;
import dagger.internal.Factory;
/* compiled from: PG */
/* renamed from: dald  reason: default package */
/* loaded from: classes5.dex */
public final class dald implements Factory<dalc> {
    private final dzsj<Context> a;

    public dald(dzsj<Context> dzsjVar) {
        this.a = dzsjVar;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        return new dalc(((dalo) this.a).a());
    }
}
