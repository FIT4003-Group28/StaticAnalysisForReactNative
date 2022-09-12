package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: iuo  reason: default package */
/* loaded from: classes6.dex */
final class iuo extends cqtd {
    final /* synthetic */ cqtv a;
    final /* synthetic */ cqtv b;
    final /* synthetic */ boolean c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iuo(Object[] objArr, cqtv cqtvVar, cqtv cqtvVar2, boolean z, int i) {
        super(objArr);
        this.a = cqtvVar;
        this.b = cqtvVar2;
        this.c = z;
        this.d = i;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        bvlv f = bvlw.f();
        cqtv cqtvVar = this.a;
        if (cqtvVar != null) {
            ((bvld) f).a = Integer.valueOf(cqtvVar.e(context));
        }
        cqtv cqtvVar2 = this.b;
        if (cqtvVar2 != null) {
            ((bvld) f).b = Integer.valueOf(cqtvVar2.e(context));
        }
        f.b(this.c);
        return bvlo.a().b(context.getResources(), this.d, f.c());
    }
}
