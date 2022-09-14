package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqsd  reason: default package */
/* loaded from: classes5.dex */
public final class cqsd extends cqsg {
    final /* synthetic */ cqtv a;
    final /* synthetic */ cqtv b;
    final /* synthetic */ cqtv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqsd(Object[] objArr, cqtv cqtvVar, cqtv cqtvVar2, cqtv cqtvVar3) {
        super(objArr);
        this.a = cqtvVar;
        this.b = cqtvVar2;
        this.c = cqtvVar3;
    }

    @Override // defpackage.cqtv
    public final float a(Context context) {
        return Math.min(this.a.a(context), Math.max(this.b.a(context), this.c.a(context)));
    }
}
