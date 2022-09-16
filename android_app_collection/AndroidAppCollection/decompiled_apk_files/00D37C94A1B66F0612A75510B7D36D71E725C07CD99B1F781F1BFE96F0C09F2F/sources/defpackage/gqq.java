package defpackage;

import android.content.Context;
import android.graphics.Paint;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: gqq  reason: default package */
/* loaded from: classes3.dex */
public final class gqq extends cyr {
    @dfs(a = 13)
    grk a;
    @dfs(a = 3)
    boolean b;
    Integer c;
    Integer d;
    Integer e;
    Paint f;
    Integer g;

    public gqq() {
        super("ClipPlaybackMarker");
    }

    @Override // defpackage.czb
    protected final int F() {
        return 3;
    }

    @Override // defpackage.czb
    protected final Object L(Context context) {
        return new grl(context);
    }

    @Override // defpackage.czb
    protected final void S(cyv cyvVar, Object obj) {
        grl grlVar = (grl) obj;
        grk grkVar = this.a;
        boolean z = this.b;
        int intValue = this.e.intValue();
        int intValue2 = this.g.intValue();
        int intValue3 = this.d.intValue();
        Paint paint = this.f;
        int intValue4 = this.c.intValue();
        grlVar.b = intValue;
        grlVar.c = intValue2;
        grlVar.d = intValue3;
        grlVar.a = paint;
        grlVar.f = intValue4;
        grkVar.s = grlVar;
        grlVar.g = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void V(cyv cyvVar) {
        dcz dczVar = new dcz();
        dcz dczVar2 = new dcz();
        dcz dczVar3 = new dcz();
        dcz dczVar4 = new dcz();
        dcz dczVar5 = new dcz();
        dczVar.a = Integer.valueOf(zew.i(cyvVar.b.getResources().getDisplayMetrics(), 4));
        dczVar2.a = Integer.valueOf(zew.i(cyvVar.b.getResources().getDisplayMetrics(), 4));
        dczVar3.a = Integer.valueOf(zew.i(cyvVar.b.getResources().getDisplayMetrics(), 2));
        Context context = cyvVar.b;
        Paint paint = new Paint();
        paint.setColor(zhn.d(context, R.attr.ytBrandRed));
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        dczVar4.a = paint;
        dczVar5.a = Integer.valueOf(gre.a(cyvVar.b));
        this.e = (Integer) dczVar.a;
        this.g = (Integer) dczVar2.a;
        this.d = (Integer) dczVar3.a;
        this.f = (Paint) dczVar4.a;
        this.c = (Integer) dczVar5.a;
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
        gqq gqqVar = (gqq) cyrVar;
        if (this.k == gqqVar.k) {
            return true;
        }
        grk grkVar = this.a;
        if (grkVar == null ? gqqVar.a != null : !grkVar.equals(gqqVar.a)) {
            return false;
        }
        return this.b == gqqVar.b;
    }

    @Override // defpackage.cyr, defpackage.dan
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((cyr) obj);
    }

    @Override // defpackage.cyr
    public final /* bridge */ /* synthetic */ cyr j() {
        gqq gqqVar = (gqq) super.j();
        gqqVar.c = null;
        gqqVar.d = null;
        gqqVar.e = null;
        gqqVar.f = null;
        gqqVar.g = null;
        return gqqVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cyr
    public final void p(cyr cyrVar) {
        gqq gqqVar = (gqq) cyrVar;
        this.c = gqqVar.c;
        this.d = gqqVar.d;
        this.e = gqqVar.e;
        this.f = gqqVar.f;
        this.g = gqqVar.g;
    }
}
