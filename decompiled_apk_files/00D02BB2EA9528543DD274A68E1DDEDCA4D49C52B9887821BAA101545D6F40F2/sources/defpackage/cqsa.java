package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqsa  reason: default package */
/* loaded from: classes.dex */
public final class cqsa extends cqsg {
    final /* synthetic */ cqtv a;
    final /* synthetic */ Float b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqsa(Object[] objArr, cqtv cqtvVar, Float f) {
        super(objArr);
        this.a = cqtvVar;
        this.b = f;
    }

    @Override // defpackage.cqtv
    public final float a(Context context) {
        cqtv cqtvVar = this.a;
        if (cqtvVar != null) {
            return cqtvVar.a(context) * this.b.floatValue();
        }
        return 0.0f;
    }
}
