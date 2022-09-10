package defpackage;

import android.content.Context;
import dagger.internal.Factory;
/* compiled from: PG */
/* renamed from: clfk  reason: default package */
/* loaded from: classes5.dex */
public final class clfk implements Factory<clfj> {
    private final dzsj<Context> a;

    public clfk(dzsj<Context> dzsjVar) {
        this.a = dzsjVar;
    }

    @Override // defpackage.dzsj
    /* renamed from: b */
    public final clfj a() {
        return new clfj((Context) ((dxjd) this.a).a, clih.b(), clii.b());
    }
}
