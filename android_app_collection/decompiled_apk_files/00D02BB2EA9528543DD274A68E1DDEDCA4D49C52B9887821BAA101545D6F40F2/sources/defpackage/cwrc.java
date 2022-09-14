package defpackage;

import android.content.Context;
import dagger.internal.Factory;
/* compiled from: PG */
/* renamed from: cwrc  reason: default package */
/* loaded from: classes5.dex */
public final class cwrc implements Factory<cwrb> {
    private final dzsj<Context> a;

    public cwrc(dzsj<Context> dzsjVar) {
        this.a = dzsjVar;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        return new cwrb((Context) ((dxjd) this.a).a);
    }
}
