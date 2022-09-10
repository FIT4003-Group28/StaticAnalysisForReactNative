package defpackage;

import android.content.Context;
import dagger.internal.Factory;
/* compiled from: PG */
/* renamed from: clfn  reason: default package */
/* loaded from: classes5.dex */
public final class clfn implements Factory<clfm> {
    private final dzsj<Context> a;
    private final dzsj<clfj> b;

    public clfn(dzsj<Context> dzsjVar, dzsj<clfj> dzsjVar2) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        return new clfm((Context) ((dxjd) this.a).a, ((clfk) this.b).a());
    }
}
