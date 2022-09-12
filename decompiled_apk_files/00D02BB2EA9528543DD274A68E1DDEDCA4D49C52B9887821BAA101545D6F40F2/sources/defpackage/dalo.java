package defpackage;

import android.content.Context;
import dagger.internal.Factory;
/* compiled from: PG */
/* renamed from: dalo  reason: default package */
/* loaded from: classes5.dex */
public final class dalo implements Factory<Context> {
    private final daln a;

    public dalo(daln dalnVar) {
        this.a = dalnVar;
    }

    @Override // defpackage.dzsj
    /* renamed from: b */
    public final Context a() {
        Context context = this.a.a;
        dxjg.f(context);
        return context;
    }
}
