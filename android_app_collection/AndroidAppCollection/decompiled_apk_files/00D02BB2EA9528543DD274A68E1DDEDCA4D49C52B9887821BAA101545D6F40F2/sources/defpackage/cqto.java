package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
/* compiled from: PG */
/* renamed from: cqto  reason: default package */
/* loaded from: classes5.dex */
final class cqto extends cqtd {
    final /* synthetic */ cqtd a;
    final /* synthetic */ cqtv b;
    final /* synthetic */ cqtv c;
    final /* synthetic */ cqtv d;
    final /* synthetic */ cqtv e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqto(Object[] objArr, cqtd cqtdVar, cqtv cqtvVar, cqtv cqtvVar2, cqtv cqtvVar3, cqtv cqtvVar4) {
        super(objArr);
        this.a = cqtdVar;
        this.b = cqtvVar;
        this.c = cqtvVar2;
        this.d = cqtvVar3;
        this.e = cqtvVar4;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        return new InsetDrawable(this.a.a(context), this.b.NR(context), this.c.NR(context), this.d.NR(context), this.e.NR(context));
    }
}
