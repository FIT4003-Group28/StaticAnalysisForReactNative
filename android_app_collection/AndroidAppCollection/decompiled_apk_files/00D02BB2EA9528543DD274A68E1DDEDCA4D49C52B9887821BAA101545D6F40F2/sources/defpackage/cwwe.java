package defpackage;

import android.content.Context;
import dagger.internal.Factory;
/* compiled from: PG */
/* renamed from: cwwe  reason: default package */
/* loaded from: classes5.dex */
public final class cwwe implements Factory<cwwd> {
    private final dzsj<Context> a;

    public cwwe(dzsj<Context> dzsjVar) {
        this.a = dzsjVar;
    }

    @Override // defpackage.dzsj
    /* renamed from: b */
    public final cwwd a() {
        return new cwwd((Context) ((dxjd) this.a).a);
    }
}
