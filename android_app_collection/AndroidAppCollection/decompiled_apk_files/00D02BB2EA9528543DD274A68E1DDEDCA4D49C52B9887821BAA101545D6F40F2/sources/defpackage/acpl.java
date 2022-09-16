package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: acpl  reason: default package */
/* loaded from: classes2.dex */
public final class acpl extends ImageView {
    private static final acpj b = new acpk();
    private final bsa a;
    private acpj c;
    private final chw d;
    @dzsi
    private String e;
    private boolean f;

    public acpl(Context context) {
        super(context);
        this.c = b;
        this.d = new chw();
        this.a = brc.d(context);
    }

    public void setImageUrl(@dzsi String str) {
        this.e = str;
        if (str == null) {
            this.e = null;
            this.a.k(this);
            setImageDrawable(null);
        }
        a();
    }

    public void setImageUrlFormatter(acpj acpjVar) {
        this.c = acpjVar;
        a();
    }

    public void setLoadImage(boolean z) {
        this.f = z;
        a();
    }

    public void setPlaceholder(int i) {
        this.d.p(i);
        a();
    }

    final void a() {
        if (!this.f) {
            return;
        }
        String str = this.e;
        this.a.i(str == null ? null : this.c.a(str, this)).e(this.d).h(this);
    }

    public void setPlaceholder(@dzsi Drawable drawable) {
        this.d.o(drawable);
        a();
    }

    public acpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = b;
        this.d = new chw();
        this.a = brc.d(context);
    }
}
