package defpackage;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SelectImageCellRendererOuterClass;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: xwx  reason: default package */
/* loaded from: classes4.dex */
public final class xwx extends xo implements xqi {
    public final List d = new ArrayList();
    public final xrl e;
    public final aafo f;
    public final xqj g;
    public auqp h;
    final amuk i;
    private final int j;
    private final arid k;

    public xwx(xrl xrlVar, aafo aafoVar, xqj xqjVar, arie arieVar, int i) {
        this.e = xrlVar;
        this.f = aafoVar;
        this.g = xqjVar;
        this.j = i;
        arid aridVar = arieVar.b;
        this.k = aridVar == null ? arid.a : aridVar;
        aunb aunbVar = arieVar.c;
        if ((aunbVar == null ? aunb.a : aunbVar).qn(SelectImageCellRendererOuterClass.selectImageCellRenderer)) {
            aunb aunbVar2 = arieVar.c;
            this.h = (auqp) (aunbVar2 == null ? aunb.a : aunbVar2).qm(SelectImageCellRendererOuterClass.selectImageCellRenderer);
        }
        this.i = amuk.t(xrlVar.e(new xrk() { // from class: xwu
            @Override // defpackage.xrk
            public final void a(xrj xrjVar) {
                xwx xwxVar = xwx.this;
                xwxVar.d.clear();
                xwxVar.d.addAll(xrjVar.a());
                xwxVar.mr();
            }
        }), xrlVar.d(new xri() { // from class: xwt
            @Override // defpackage.xri
            public final void a(xrh xrhVar) {
                xwx xwxVar = xwx.this;
                amuk a = xrhVar.a();
                int size = a.size();
                for (int i2 = 0; i2 < size; i2++) {
                    xrp xrpVar = (xrp) a.get(i2);
                    int i3 = 0;
                    while (true) {
                        if (i3 >= xwxVar.d.size()) {
                            break;
                        } else if (((xrp) xwxVar.d.get(i3)).a.equals(xrpVar.a)) {
                            xwxVar.d.remove(i3);
                            xwxVar.n(i3);
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
        }), xrlVar.c(new xrg() { // from class: xws
            @Override // defpackage.xrg
            public final void a(xrf xrfVar) {
                xwx xwxVar = xwx.this;
                int a = xrfVar.a();
                if (a < 0 || a >= xwxVar.d.size()) {
                    return;
                }
                xwxVar.d.set(a, xrfVar.b());
                xwxVar.ok(a);
            }
        }));
        xqjVar.c(this);
    }

    @Override // defpackage.xo
    public final int b() {
        if (this.h == null) {
            return this.d.size();
        }
        if (!this.d.isEmpty()) {
            return this.d.size() + 1;
        }
        return 0;
    }

    @Override // defpackage.xo
    public final int c(int i) {
        return i == this.d.size() ? 1 : 0;
    }

    @Override // defpackage.xo
    public final yo f(ViewGroup viewGroup, int i) {
        if (i != 0) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.post_select_image_cell, viewGroup, false);
            aovs aovsVar = this.h.e;
            if (aovsVar == null) {
                aovsVar = aovs.a;
            }
            aovr aovrVar = aovsVar.c;
            if (aovrVar == null) {
                aovrVar = aovr.a;
            }
            inflate.setContentDescription(aovrVar.c);
            xww xwwVar = new xww(inflate, this.j);
            TextView textView = xwwVar.t;
            arag aragVar = this.h.b;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            textView.setText(ajgl.b(aragVar));
            TextView textView2 = xwwVar.u;
            arag aragVar2 = this.h.d;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            textView2.setText(ajgl.b(aragVar2));
            zag.k(inflate, inflate.getBackground());
            xwwVar.a.setOnClickListener(new View.OnClickListener() { // from class: xwq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    xwx xwxVar = xwx.this;
                    aafo aafoVar = xwxVar.f;
                    apzg apzgVar = xwxVar.h.c;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    aafoVar.a(apzgVar);
                }
            });
            return xwwVar;
        }
        return new xwv(new xwp(viewGroup.getContext(), this.j, this.k));
    }

    @Override // defpackage.xqi
    public final void g(xrp xrpVar, apoj apojVar) {
        this.e.g(xrpVar);
    }

    @Override // defpackage.xo
    public final void o(yo yoVar, int i) {
        arif arifVar;
        ImageView imageView;
        if (yoVar.f != 0) {
            return;
        }
        xwv xwvVar = (xwv) yoVar;
        xrp xrpVar = (xrp) this.d.get(i);
        xwp xwpVar = xwvVar.t;
        xwpVar.a.setImageDrawable(xrpVar.c);
        Drawable drawable = xrpVar.c;
        if (drawable != null && (arifVar = xrpVar.d) != null && (imageView = xwpVar.a) != null) {
            RectF rectF = new RectF();
            RectF rectF2 = new RectF(0.0f, 0.0f, imageView.getLayoutParams().width, imageView.getLayoutParams().height);
            rectF.set(((float) arifVar.c) * drawable.getIntrinsicWidth(), ((float) arifVar.d) * drawable.getIntrinsicHeight(), ((float) arifVar.e) * drawable.getIntrinsicWidth(), ((float) arifVar.f) * drawable.getIntrinsicHeight());
            Matrix matrix = new Matrix();
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            imageView.setImageMatrix(matrix);
        }
        int i2 = xrpVar.e;
        boolean z = false;
        xwpVar.a.setVisibility(i2 == 3 ? 0 : 4);
        zag.o(xwpVar.b, xwpVar.f != null && i2 == 3);
        zag.o(xwpVar.c, xwpVar.g != null && i2 == 3);
        zag.o(xwpVar.d, i2 == 1);
        View view = xwpVar.e;
        if (i2 == 2) {
            z = true;
        }
        zag.o(view, z);
        if (xrpVar.c == null || xrpVar.d == null) {
            return;
        }
        xwvVar.t.a.setOnClickListener(new xwr(this, xrpVar, 1));
        xwvVar.t.c.setOnClickListener(new xwr(this, xrpVar));
        xwvVar.t.b.setOnClickListener(new xwr(this, xrpVar, 2));
    }

    @Override // defpackage.xo
    public final void p(yo yoVar) {
        if (yoVar.f == 0) {
            xwp xwpVar = ((xwv) yoVar).t;
            xwpVar.a.setImageDrawable(null);
            xwpVar.b.setOnClickListener(null);
            xwpVar.c.setOnClickListener(null);
            xwpVar.a.setOnClickListener(null);
        }
    }

    @Override // defpackage.xqi
    public final void qW(xrp xrpVar) {
    }

    public final void w(xrp xrpVar) {
        this.g.e(xrpVar);
        aafo aafoVar = this.f;
        apzg apzgVar = this.k.b;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aafoVar.a(apzgVar);
    }
}
