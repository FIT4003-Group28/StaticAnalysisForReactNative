package defpackage;

import android.content.Context;
import dagger.internal.Factory;
/* compiled from: PG */
/* renamed from: cxad  reason: default package */
/* loaded from: classes5.dex */
public final class cxad implements Factory<cxac> {
    private final dzsj<cwze> a;
    private final dzsj<Context> b;

    public cxad(dzsj<cwze> dzsjVar, dzsj<Context> dzsjVar2) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
    }

    @Override // defpackage.dzsj
    /* renamed from: b */
    public final cxac a() {
        return new cxac(this.a, (Context) ((dxjd) this.b).a);
    }
}
