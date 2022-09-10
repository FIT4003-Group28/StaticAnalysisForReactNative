package defpackage;

import android.content.Context;
import dagger.internal.Factory;
/* compiled from: PG */
/* renamed from: clic  reason: default package */
/* loaded from: classes5.dex */
public final class clic implements Factory<clib> {
    private final dzsj<Context> a;

    public clic(dzsj<Context> dzsjVar) {
        this.a = dzsjVar;
    }

    @Override // defpackage.dzsj
    /* renamed from: b */
    public final clib a() {
        return new clib((Context) ((dxjd) this.a).a, clgx.b().intValue());
    }
}
