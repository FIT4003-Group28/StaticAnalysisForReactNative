package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqsb  reason: default package */
/* loaded from: classes.dex */
public final class cqsb extends cqsg {
    final /* synthetic */ cqtv a;
    final /* synthetic */ cqtv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqsb(Object[] objArr, cqtv cqtvVar, cqtv cqtvVar2) {
        super(objArr);
        this.a = cqtvVar;
        this.b = cqtvVar2;
    }

    @Override // defpackage.cqtv
    public final float a(Context context) {
        return this.a.a(context) - this.b.a(context);
    }
}
