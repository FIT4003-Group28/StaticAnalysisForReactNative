package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: cosr  reason: default package */
/* loaded from: classes5.dex */
final class cosr extends cosl {
    final /* synthetic */ Activity a;
    final /* synthetic */ cosa b;
    final /* synthetic */ cost c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cosr(cost costVar, Activity activity, cosa cosaVar) {
        super(costVar.a);
        this.c = costVar;
        this.a = activity;
        this.b = cosaVar;
    }

    @Override // defpackage.cosl
    public final void a() {
        this.c.a.f.m(cobb.b(this.a), this.b, this.g);
    }
}
