package defpackage;

import android.content.Context;
import dagger.internal.Factory;
/* compiled from: PG */
/* renamed from: cwut  reason: default package */
/* loaded from: classes5.dex */
public final class cwut implements Factory<cwus> {
    private final dzsj<Context> a;

    public cwut(dzsj<Context> dzsjVar) {
        this.a = dzsjVar;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        return new cwus((Context) ((dxjd) this.a).a);
    }
}
