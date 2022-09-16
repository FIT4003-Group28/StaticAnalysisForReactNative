package defpackage;

import android.content.Context;
import android.graphics.Paint;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: gqw  reason: default package */
/* loaded from: classes3.dex */
public final class gqw extends cyr {
    @dfs(a = 13)
    grk a;
    @dfs(a = 3)
    boolean b;
    Integer c;

    public gqw() {
        super("ClipTimeIndex");
    }

    @Override // defpackage.czb
    protected final int F() {
        return 3;
    }

    @Override // defpackage.czb
    protected final Object L(Context context) {
        return new grw(context);
    }

    @Override // defpackage.czb
    protected final void S(cyv cyvVar, Object obj) {
        grw grwVar = (grw) obj;
        grk grkVar = this.a;
        boolean z = this.b;
        int intValue = this.c.intValue();
        Context context = cyvVar.b;
        Paint paint = new Paint();
        paint.setTextSize(context.getResources().getDisplayMetrics().scaledDensity * 12.0f);
        paint.setTypeface(ajgo.ROBOTO_REGULAR.c(context));
        paint.setColor(zhn.d(context, R.attr.ytTextPrimary));
        paint.setAntiAlias(true);
        grwVar.a = paint;
        grwVar.f = z;
        grwVar.e = intValue;
        grkVar.o = grwVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void V(cyv cyvVar) {
        dcz dczVar = new dcz();
        dczVar.a = Integer.valueOf(gre.a(cyvVar.b));
        this.c = (Integer) dczVar.a;
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
        gqw gqwVar = (gqw) cyrVar;
        if (this.k == gqwVar.k) {
            return true;
        }
        grk grkVar = this.a;
        if (grkVar == null ? gqwVar.a != null : !grkVar.equals(gqwVar.a)) {
            return false;
        }
        return this.b == gqwVar.b;
    }

    @Override // defpackage.cyr, defpackage.dan
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((cyr) obj);
    }

    @Override // defpackage.cyr
    public final /* bridge */ /* synthetic */ cyr j() {
        gqw gqwVar = (gqw) super.j();
        gqwVar.c = null;
        return gqwVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cyr
    public final void p(cyr cyrVar) {
        this.c = ((gqw) cyrVar).c;
    }
}
