package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cqpb  reason: default package */
/* loaded from: classes5.dex */
abstract class cqpb<T> implements cqoj {
    public abstract int a();

    public abstract T b();

    public abstract cqpa<T> c();

    @Override // defpackage.cqoj
    public final void f(Context context, ds dsVar) {
        c().a(dsVar, a(), b());
    }
}
