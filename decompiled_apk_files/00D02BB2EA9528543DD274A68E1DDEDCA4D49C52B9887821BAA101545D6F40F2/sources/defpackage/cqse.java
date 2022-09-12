package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqse  reason: default package */
/* loaded from: classes5.dex */
public final class cqse extends cqsg {
    final /* synthetic */ cqtv a;
    final /* synthetic */ cqtv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqse(Object[] objArr, cqtv cqtvVar, cqtv cqtvVar2) {
        super(objArr);
        this.a = cqtvVar;
        this.b = cqtvVar2;
    }

    @Override // defpackage.cqtv
    public final float a(Context context) {
        return Math.min(this.a.a(context), this.b.a(context));
    }
}
