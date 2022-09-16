package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: abmq  reason: default package */
/* loaded from: classes.dex */
public abstract class abmq implements ajru {
    protected final ajxz a;
    protected final aafo b;
    protected final View c;
    protected final TextView d;
    protected final TextView e;
    protected final ImageView f;
    protected final ViewGroup g;

    public abmq(Context context, aafo aafoVar, ajxz ajxzVar) {
        this.b = aafoVar;
        this.a = ajxzVar;
        View inflate = View.inflate(context, d(), null);
        this.c = inflate;
        this.d = j();
        this.e = i();
        this.f = h();
        this.g = g();
        Resources resources = inflate.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(e());
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.live_chat_metadata_horizontal_margin);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(f(), -2);
        marginLayoutParams.topMargin = dimensionPixelOffset;
        marginLayoutParams.bottomMargin = dimensionPixelOffset;
        marginLayoutParams.leftMargin = dimensionPixelOffset2;
        marginLayoutParams.rightMargin = dimensionPixelOffset2;
        inflate.setLayoutParams(marginLayoutParams);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    protected abstract int d();

    protected abstract int e();

    protected abstract int f();

    protected abstract ViewGroup g();

    protected abstract ImageView h();

    protected abstract TextView i();

    protected abstract TextView j();

    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0105 A[ORIG_RETURN, RETURN] */
    @Override // defpackage.ajru
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void oK(defpackage.ajrs r6, java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abmq.oK(ajrs, java.lang.Object):void");
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        ViewGroup viewGroup = this.g;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
    }
}
