package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.internal.Factory;
/* compiled from: PG */
/* renamed from: cxes  reason: default package */
/* loaded from: classes5.dex */
public final class cxes implements Factory<cxer> {
    private final dzsj<Context> a;
    private final dzsj<SharedPreferences> b;

    public cxes(dzsj<Context> dzsjVar, dzsj<SharedPreferences> dzsjVar2) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
    }

    @Override // defpackage.dzsj
    /* renamed from: b */
    public final cxer a() {
        return new cxer((Context) ((dxjd) this.a).a, this.b);
    }
}
