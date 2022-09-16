package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: abob  reason: default package */
/* loaded from: classes.dex */
public final class abob implements View.OnClickListener, yyr {
    public final aafo a;
    private final avvh b;
    private final Context c;
    private final abhy d;
    private final ajmr e;
    private final acti f;
    private AlertDialog g;
    private ImageView h;
    private ImageView i;
    private FrameLayout j;
    private Button k;
    private Button l;
    private apoj m;
    private apoj n;

    public abob(avvh avvhVar, Context context, abhy abhyVar, ajmr ajmrVar, aafo aafoVar, acti actiVar) {
        avvhVar.getClass();
        this.b = avvhVar;
        context.getClass();
        this.c = context;
        this.d = abhyVar;
        ajmrVar.getClass();
        this.e = ajmrVar;
        aafoVar.getClass();
        this.a = aafoVar;
        actiVar.getClass();
        this.f = actiVar;
    }

    private final void b(Button button, apoj apojVar) {
        if (apojVar == null) {
            button.setVisibility(8);
            return;
        }
        akbn akbnVar = (akbn) this.d.b.get();
        akbnVar.getClass();
        button.getClass();
        new abhx(akbnVar, button).oK(new ajrs(), apojVar);
        button.setOnClickListener(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abob.a():void");
    }

    @Override // defpackage.yyr
    public final void d(ImageView imageView) {
        ImageView imageView2 = this.h;
        if (imageView == imageView2) {
            imageView2.setVisibility(8);
            this.i.setVisibility(8);
        }
    }

    @Override // defpackage.yyr
    public final void e(ImageView imageView) {
    }

    @Override // defpackage.yyr
    public final void f(ImageView imageView) {
        Drawable drawable;
        ImageView imageView2 = this.h;
        if (imageView == imageView2 && (drawable = imageView2.getDrawable()) != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int width = (this.h.getWidth() - this.h.getPaddingLeft()) - this.h.getPaddingRight();
            int height = (this.h.getHeight() - this.h.getPaddingTop()) - this.h.getPaddingBottom();
            Matrix matrix = new Matrix(this.h.getMatrix());
            float f = intrinsicWidth * height > width * intrinsicHeight ? height / intrinsicHeight : width / intrinsicWidth;
            matrix.setScale(f, f);
            this.h.setScaleType(ImageView.ScaleType.MATRIX);
            this.h.setImageMatrix(matrix);
        }
    }

    @Override // defpackage.yyr
    public final void g() {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apoj apojVar;
        if (view == this.k) {
            apojVar = this.m;
        } else {
            apojVar = view == this.l ? this.n : null;
        }
        if (apojVar != null) {
            amup k = amup.k("com.google.android.libraries.youtube.innertube.endpoint.tag", apojVar);
            int i = apojVar.b;
            if ((i & 16384) != 0) {
                apzg apzgVar = apojVar.o;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                this.a.c(apzgVar, k);
                if (!apzgVar.qn(atno.b)) {
                    apzg f = this.f.f(apzgVar);
                    aopc aopcVar = (aopc) apojVar.mo52toBuilder();
                    aopcVar.copyOnWrite();
                    apoj apojVar2 = (apoj) aopcVar.instance;
                    f.getClass();
                    apojVar2.o = f;
                    apojVar2.b |= 16384;
                    apojVar = (apoj) aopcVar.mo39build();
                }
            } else if ((i & 8192) != 0) {
                aafo aafoVar = this.a;
                apzg apzgVar2 = apojVar.n;
                if (apzgVar2 == null) {
                    apzgVar2 = apzg.a;
                }
                aafoVar.c(apzgVar2, k);
                apzg apzgVar3 = apojVar.n;
                if (apzgVar3 == null) {
                    apzgVar3 = apzg.a;
                }
                if ((apzgVar3.b & 1) != 0) {
                    acti actiVar = this.f;
                    apzg apzgVar4 = apojVar.n;
                    if (apzgVar4 == null) {
                        apzgVar4 = apzg.a;
                    }
                    actiVar.H(3, new acte(apzgVar4.c), null);
                }
            } else if ((i & 32768) != 0) {
                aafo aafoVar2 = this.a;
                apzg apzgVar5 = apojVar.p;
                if (apzgVar5 == null) {
                    apzgVar5 = apzg.a;
                }
                aafoVar2.c(apzgVar5, k);
                apzg apzgVar6 = apojVar.p;
                if (apzgVar6 == null) {
                    apzgVar6 = apzg.a;
                }
                if ((apzgVar6.b & 1) != 0) {
                    acti actiVar2 = this.f;
                    apzg apzgVar7 = apojVar.p;
                    if (apzgVar7 == null) {
                        apzgVar7 = apzg.a;
                    }
                    actiVar2.H(3, new acte(apzgVar7.c), null);
                }
            }
            if ((apojVar.b & 1048576) != 0) {
                this.f.H(3, new acte(apojVar.t), null);
            }
            this.g.dismiss();
            if (view == this.k) {
                this.m = apojVar;
            } else if (view != this.l) {
            } else {
                this.n = apojVar;
            }
        }
    }
}
