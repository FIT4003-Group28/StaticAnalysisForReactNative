package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cujw  reason: default package */
/* loaded from: classes5.dex */
public final class cujw implements ctsu<cukc> {
    private final Context a;
    private final cukc b;

    public cujw(Context context, cukc cukcVar) {
        this.a = context;
        this.b = cukcVar;
    }

    @Override // defpackage.ctsu
    public final ctsu<cukc> a(String str) {
        Context context = this.a;
        return new cujw(context, new cukc(context, str));
    }

    @Override // defpackage.ctsu
    public final /* bridge */ /* synthetic */ cukc b() {
        return this.b;
    }
}
