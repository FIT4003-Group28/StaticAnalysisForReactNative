package defpackage;

import android.content.Context;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: gqo  reason: default package */
/* loaded from: classes3.dex */
public final class gqo extends cyr {
    @dfs(a = 13)
    grk a;
    Integer b;

    public gqo() {
        super("ClipDurationText");
    }

    @Override // defpackage.czb
    protected final int F() {
        return 3;
    }

    @Override // defpackage.czb
    protected final Object L(Context context) {
        return new TextView(context);
    }

    @Override // defpackage.czb
    protected final void S(cyv cyvVar, Object obj) {
        TextView textView = (TextView) obj;
        int intValue = this.b.intValue();
        grk grkVar = this.a;
        Context context = cyvVar.b;
        grkVar.p = textView;
        textView.setTextSize(12.0f);
        textView.setTypeface(ajgo.ROBOTO_REGULAR.c(context));
        textView.setTextColor(intValue);
        textView.setGravity(17);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void V(cyv cyvVar) {
        dcz dczVar = new dcz();
        dczVar.a = Integer.valueOf(zhn.d(cyvVar.b, R.attr.ytTextSecondary));
        this.b = (Integer) dczVar.a;
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
        gqo gqoVar = (gqo) cyrVar;
        if (this.k == gqoVar.k) {
            return true;
        }
        grk grkVar = this.a;
        return grkVar == null ? gqoVar.a == null : grkVar.equals(gqoVar.a);
    }

    @Override // defpackage.cyr, defpackage.dan
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((cyr) obj);
    }

    @Override // defpackage.cyr
    public final /* bridge */ /* synthetic */ cyr j() {
        gqo gqoVar = (gqo) super.j();
        gqoVar.b = null;
        return gqoVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cyr
    public final void p(cyr cyrVar) {
        this.b = ((gqo) cyrVar).b;
    }
}
