package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.apps.gmm.directions.maneuvers.Maneuvers$Maneuver;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: atnv  reason: default package */
/* loaded from: classes2.dex */
public final class atnv extends TextView {
    private final bvsx a;
    @dzsi
    private Maneuvers$Maneuver b;
    private int c;
    private float d;
    private float e;
    private float f;

    public atnv(Context context) {
        super(context);
        this.b = null;
        this.c = -1;
        this.d = 1.8f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.a = new bvsx(context.getResources());
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(atnv.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> b(atnw atnwVar) {
        return cqjv.i(atnl.NEXT_TURN_TEXT_VIEW_STYLE, atnwVar, atnk.a);
    }

    private final void c() {
        Spannable e;
        Drawable j = vrv.j(this.b, this.c);
        if (j == null) {
            setText("");
            return;
        }
        float f = this.e;
        if (f > 0.0f) {
            float f2 = this.f;
            if (f2 > 0.0f) {
                e = this.a.f(j, f, f2);
                bvsu c = this.a.c(R.string.DA_THEN);
                c.a(e);
                setText(c.c());
            }
        }
        e = this.a.e(j, this.d);
        bvsu c2 = this.a.c(R.string.DA_THEN);
        c2.a(e);
        setText(c2.c());
    }

    public void setColor(int i) {
        this.c = i;
        c();
    }

    public void setManeuver(@dzsi Maneuvers$Maneuver maneuvers$Maneuver) {
        this.b = maneuvers$Maneuver;
        c();
    }

    public void setStyle(atnw atnwVar) {
        float f = atnwVar.a;
        if (f > 0.0f) {
            this.d = f;
            this.e = 0.0f;
            this.f = 0.0f;
        } else {
            cqtv cqtvVar = atnwVar.b;
            if (cqtvVar != null && atnwVar.c != null) {
                this.e = cqtvVar.e(getContext());
                this.f = atnwVar.c.e(getContext());
            }
        }
        c();
    }

    public atnv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = null;
        this.c = -1;
        this.d = 1.8f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.a = new bvsx(context.getResources());
    }
}
