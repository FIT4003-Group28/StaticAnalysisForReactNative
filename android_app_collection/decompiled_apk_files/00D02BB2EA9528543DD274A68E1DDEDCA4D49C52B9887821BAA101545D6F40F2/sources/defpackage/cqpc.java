package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cqpc  reason: default package */
/* loaded from: classes5.dex */
abstract class cqpc<A, B> implements cqoj {
    public abstract int a();

    public abstract A b();

    public abstract cqpa<B> c();

    public abstract cqom d();

    @Override // defpackage.cqoj
    public final void f(Context context, ds dsVar) {
        c().a(dsVar, a(), (B) d().a(b(), context));
    }
}
