package defpackage;

import android.content.Context;
import android.graphics.Paint;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: gqm  reason: default package */
/* loaded from: classes3.dex */
public final class gqm extends cyr {
    @dfs(a = 13)
    grk a;
    @dfs(a = 3)
    boolean b;
    Integer c;
    Integer d;
    Integer e;
    Integer f;
    Integer g;
    Integer v;
    Paint w;
    Paint x;
    Paint y;

    public gqm() {
        super("ClipBounds");
    }

    @Override // defpackage.czb
    protected final int F() {
        return 3;
    }

    @Override // defpackage.czb
    protected final Object L(Context context) {
        return new gre(context);
    }

    @Override // defpackage.czb
    protected final void S(cyv cyvVar, Object obj) {
        gre greVar = (gre) obj;
        grk grkVar = this.a;
        boolean z = this.b;
        int intValue = this.e.intValue();
        int intValue2 = this.d.intValue();
        int intValue3 = this.c.intValue();
        int intValue4 = this.v.intValue();
        int intValue5 = this.f.intValue();
        int intValue6 = this.g.intValue();
        Paint paint = this.y;
        Paint paint2 = this.x;
        Paint paint3 = this.w;
        greVar.p = grkVar;
        greVar.v = z;
        greVar.a = intValue;
        greVar.b = intValue2;
        greVar.c = intValue3;
        greVar.d = intValue4;
        greVar.e = intValue5;
        greVar.f = intValue6;
        greVar.g = paint;
        greVar.h = paint2;
        greVar.i = paint3;
        grkVar.r = greVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void V(cyv cyvVar) {
        dcz dczVar = new dcz();
        dcz dczVar2 = new dcz();
        dcz dczVar3 = new dcz();
        dcz dczVar4 = new dcz();
        dcz dczVar5 = new dcz();
        dcz dczVar6 = new dcz();
        dcz dczVar7 = new dcz();
        dcz dczVar8 = new dcz();
        dcz dczVar9 = new dcz();
        dczVar.a = Integer.valueOf(gre.a(cyvVar.b));
        dczVar2.a = Integer.valueOf(zew.i(cyvVar.b.getResources().getDisplayMetrics(), 48));
        dczVar3.a = Integer.valueOf(zew.i(cyvVar.b.getResources().getDisplayMetrics(), 4));
        dczVar4.a = Integer.valueOf(zew.i(cyvVar.b.getResources().getDisplayMetrics(), 2));
        dczVar5.a = Integer.valueOf(zew.i(cyvVar.b.getResources().getDisplayMetrics(), 24));
        dczVar6.a = Integer.valueOf(zew.i(cyvVar.b.getResources().getDisplayMetrics(), 1));
        Context context = cyvVar.b;
        Paint paint = new Paint();
        paint.setColor(zhn.d(context, R.attr.ytCallToAction));
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        dczVar7.a = paint;
        Context context2 = cyvVar.b;
        Paint paint2 = new Paint();
        paint2.setColor(zhn.d(context2, R.attr.ytThemedOverlayBackground));
        paint2.setStyle(Paint.Style.FILL);
        dczVar8.a = paint2;
        Context context3 = cyvVar.b;
        Paint paint3 = new Paint();
        paint3.setColor(zhn.d(context3, R.attr.ytStaticWhite));
        paint3.setStyle(Paint.Style.FILL);
        paint3.setAntiAlias(true);
        dczVar9.a = paint3;
        this.e = (Integer) dczVar.a;
        this.d = (Integer) dczVar2.a;
        this.c = (Integer) dczVar3.a;
        this.v = (Integer) dczVar4.a;
        this.f = (Integer) dczVar5.a;
        this.g = (Integer) dczVar6.a;
        this.y = (Paint) dczVar7.a;
        this.x = (Paint) dczVar8.a;
        this.w = (Paint) dczVar9.a;
    }

    @Override // defpackage.czb
    public final int aj() {
        return 3;
    }

    @Override // defpackage.cyr
    public final boolean e(cyr cyrVar) {
        if (this == cyrVar) {
            return true;
        }
        if (cyrVar == null || getClass() != cyrVar.getClass()) {
            return false;
        }
        gqm gqmVar = (gqm) cyrVar;
        if (this.k == gqmVar.k) {
            return true;
        }
        grk grkVar = this.a;
        if (grkVar == null ? gqmVar.a != null : !grkVar.equals(gqmVar.a)) {
            return false;
        }
        return this.b == gqmVar.b;
    }

    @Override // defpackage.cyr, defpackage.dan
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((cyr) obj);
    }

    @Override // defpackage.cyr
    public final /* bridge */ /* synthetic */ cyr j() {
        gqm gqmVar = (gqm) super.j();
        gqmVar.c = null;
        gqmVar.d = null;
        gqmVar.e = null;
        gqmVar.f = null;
        gqmVar.g = null;
        gqmVar.v = null;
        gqmVar.w = null;
        gqmVar.x = null;
        gqmVar.y = null;
        return gqmVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cyr
    public final void p(cyr cyrVar) {
        gqm gqmVar = (gqm) cyrVar;
        this.c = gqmVar.c;
        this.d = gqmVar.d;
        this.e = gqmVar.e;
        this.f = gqmVar.f;
        this.g = gqmVar.g;
        this.v = gqmVar.v;
        this.w = gqmVar.w;
        this.x = gqmVar.x;
        this.y = gqmVar.y;
    }
}
