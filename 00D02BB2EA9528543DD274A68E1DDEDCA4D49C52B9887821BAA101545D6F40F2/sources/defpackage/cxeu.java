package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.internal.Factory;
/* compiled from: PG */
/* renamed from: cxeu  reason: default package */
/* loaded from: classes5.dex */
public final class cxeu implements Factory<cxet> {
    private final dzsj<Context> a;
    private final dzsj<SharedPreferences> b;

    public cxeu(dzsj<Context> dzsjVar, dzsj<SharedPreferences> dzsjVar2) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
    }

    @Override // defpackage.dzsj
    /* renamed from: b */
    public final cxet a() {
        return new cxet((Context) ((dxjd) this.a).a, cqau.b(), this.b);
    }
}
