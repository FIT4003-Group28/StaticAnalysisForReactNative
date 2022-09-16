package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
/* compiled from: PG */
/* renamed from: atpg  reason: default package */
/* loaded from: classes2.dex */
final class atpg extends cqtd {
    private final cqtd a;
    private final cqrp b;
    private final cqrp c;
    private final cqss d;

    public atpg(cqtd cqtdVar, cqrp cqrpVar, cqrp cqrpVar2, cqss cqssVar) {
        super(new Object[]{cqtdVar, cqrpVar, cqrpVar2, cqssVar});
        this.a = cqtdVar;
        this.b = cqrpVar;
        this.c = cqrpVar2;
        this.d = cqssVar;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        atpf atpfVar = new atpf(this.c.e(context), this.d.b(context));
        int NR = this.b.NR(context);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.a.a(context), atpfVar});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908301);
        layerDrawable.setLayerInset(0, NR, NR, NR, NR);
        return layerDrawable;
    }
}
