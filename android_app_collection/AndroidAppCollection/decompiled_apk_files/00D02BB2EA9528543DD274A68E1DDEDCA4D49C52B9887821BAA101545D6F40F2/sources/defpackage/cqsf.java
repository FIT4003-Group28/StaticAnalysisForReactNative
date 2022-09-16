package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqsf  reason: default package */
/* loaded from: classes.dex */
public final class cqsf extends cqsg {
    final /* synthetic */ cqtv a;
    final /* synthetic */ cqtv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqsf(Object[] objArr, cqtv cqtvVar, cqtv cqtvVar2) {
        super(objArr);
        this.a = cqtvVar;
        this.b = cqtvVar2;
    }

    @Override // defpackage.cqtv
    public final float a(Context context) {
        return Math.max(this.a.a(context), this.b.a(context));
    }
}
