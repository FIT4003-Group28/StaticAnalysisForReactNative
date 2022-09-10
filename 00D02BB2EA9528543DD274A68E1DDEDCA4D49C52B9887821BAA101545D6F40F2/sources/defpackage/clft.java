package defpackage;

import android.content.Context;
import dagger.internal.Factory;
/* compiled from: PG */
/* renamed from: clft  reason: default package */
/* loaded from: classes5.dex */
public final class clft implements Factory<clgq> {
    private final dzsj<Context> a;
    private final dzsj<clgu> b;

    public clft(dzsj<Context> dzsjVar, dzsj<clgu> dzsjVar2) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
    }

    @Override // defpackage.dzsj
    /* renamed from: b */
    public final clgq a() {
        return new clfy((Context) ((dxjd) this.a).a, this.b.a(), clfs.b());
    }
}
