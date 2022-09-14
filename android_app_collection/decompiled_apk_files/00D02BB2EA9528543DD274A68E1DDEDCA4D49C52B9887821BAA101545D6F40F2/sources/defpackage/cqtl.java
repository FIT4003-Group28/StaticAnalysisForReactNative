package defpackage;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqtl  reason: default package */
/* loaded from: classes5.dex */
public final class cqtl extends cqtd {
    final /* synthetic */ cqtd a;
    final /* synthetic */ cqtv b;
    final /* synthetic */ cqtv c;
    final /* synthetic */ cqtv d;
    final /* synthetic */ cqss e;
    final /* synthetic */ Boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqtl(Object[] objArr, cqtd cqtdVar, cqtv cqtvVar, cqtv cqtvVar2, cqtv cqtvVar3, cqss cqssVar, Boolean bool) {
        super(objArr);
        this.a = cqtdVar;
        this.b = cqtvVar;
        this.c = cqtvVar2;
        this.d = cqtvVar3;
        this.e = cqssVar;
        this.f = bool;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        return new BitmapDrawable(context.getResources(), cqlt.a(this.a.a(context), this.b.e(context), this.c.NR(context), this.d.NR(context), ((cqta) this.e).a, this.f.booleanValue()));
    }
}
