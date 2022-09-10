package com.google.android.libraries.social.peoplekit.avatars.viewcontrollers;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.maps.R;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class GroupAvatarView extends View {
    public cxpv a;
    public List<Channel> b;
    public Paint c;
    public int d;
    public int e;
    public final cxps f;
    private int g;
    private int h;
    private Paint i;
    private Path j;
    private Path k;
    private Path l;
    private Path m;
    private Path n;
    private Path o;
    private Path p;

    public GroupAvatarView(Context context) {
        super(context);
        getResources().getDimensionPixelSize(R.dimen.peoplekit_avatar_border_width);
        this.f = new cxps(this);
    }

    private final void b(Context context) {
        this.a = new cxpv(context);
        this.d = (int) Math.ceil(context.getResources().getDimensionPixelSize(R.dimen.peoplekit_group_avatar_border_width) / 2.0f);
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setColor(-1);
        this.c.setStyle(Paint.Style.STROKE);
        Paint paint2 = this.c;
        int i = this.d;
        paint2.setStrokeWidth(i + i);
        Paint paint3 = new Paint(1);
        this.i = paint3;
        paint3.setColor(context.getResources().getColor(R.color.quantum_grey300));
    }

    private final void c(Canvas canvas, Path path, int i) {
        Paint paint = this.a.i[i];
        if (paint != null) {
            canvas.drawPath(path, paint);
            return;
        }
        this.b.get(i);
        canvas.drawPath(path, this.i);
    }

    private final void d(Canvas canvas) {
        canvas.drawLine(((int) Math.ceil(this.g / 2.0f)) - this.d, 0.0f, ((int) Math.ceil(this.g / 2.0f)) - this.d, this.h, this.c);
    }

    private final void e(Canvas canvas, boolean z) {
        canvas.drawLine(z ? (this.g / 2) - this.d : 0, ((int) Math.ceil(this.h / 2.0f)) - this.d, this.g, ((int) Math.ceil(this.h / 2.0f)) - this.d, this.c);
    }

    private final Path f(RectF rectF, int i, int i2) {
        Path path = new Path();
        path.addArc(rectF, i, i2);
        if (i2 != 360) {
            path.lineTo((int) Math.ceil(this.g / 2.0f), (int) Math.ceil(this.h / 2.0f));
        }
        path.close();
        return path;
    }

    public final void a() {
        int i;
        if (this.e == 0 || this.g == 0 || (i = this.h) == 0) {
            return;
        }
        int ceil = (int) Math.ceil(i / 2.0f);
        int ceil2 = (int) Math.ceil(this.g / 2.0f);
        int i2 = this.e;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        boolean z = true;
        if (i3 != 0) {
            if (i3 == 1) {
                this.a.a(this.b.get(0), this.g, this.h, 0);
                return;
            } else if (i3 == 2) {
                this.a.a(this.b.get(0), ceil2, this.h, 0);
                this.a.a(this.b.get(1), ceil2, this.h, 1);
                return;
            } else if (i3 == 3) {
                this.a.a(this.b.get(0), ceil2, this.h, 0);
                this.a.a(this.b.get(1), ceil2, ceil, 1);
                this.a.a(this.b.get(2), ceil2, ceil, 2);
                return;
            } else if (i3 != 4) {
                String str = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "FOUR_IMAGES" : "THREE_IMAGES" : "TWO_IMAGES" : "ONE_IMAGE" : "EMPTY";
                throw new IllegalStateException(str.length() != 0 ? "Un-supported targetState : ".concat(str) : new String("Un-supported targetState : "));
            } else {
                for (int i4 = 0; i4 < this.b.size(); i4++) {
                    this.a.a(this.b.get(i4), ceil2, ceil, i4);
                }
                return;
            }
        }
        cxpv cxpvVar = this.a;
        dbsk.a(cxpvVar.k.size() >= 0);
        for (int i5 = 0; i5 < cxpvVar.k.size(); i5++) {
            cij<Bitmap> cijVar = cxpvVar.k.get(i5);
            if (cijVar != null) {
                brc.d(cxpvVar.a).l(cijVar);
            }
        }
        dbsk.l(cxpvVar.b > 0);
        if (cxpvVar.c <= 0) {
            z = false;
        }
        dbsk.l(z);
        cxpu cxpuVar = new cxpu(cxpvVar, cxpvVar.b, cxpvVar.c);
        if (cxpvVar.k.size() - 1 < 0) {
            cxpvVar.k.add(cxpuVar);
        } else {
            cxpvVar.k.set(0, cxpuVar);
        }
        brw<Bitmap> e = brc.d(cxpvVar.a).g().e(cxpvVar.e);
        e.j(Integer.valueOf(cxpvVar.f));
        Context context = e.a;
        int i6 = civ.b;
        brw<Bitmap> e2 = e.e(chw.c(new civ(context.getResources().getConfiguration().uiMode & 48, ciw.a(context))));
        e2.k(cxpvVar.h);
        e2.i(cxpuVar);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int i = this.e;
        if (i == 0) {
            return;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            canvas.drawPath(this.j, this.c);
            cxpv cxpvVar = this.a;
            if (cxpvVar.g == null) {
                return;
            }
            canvas.drawPath(this.j, cxpvVar.d);
        } else if (i2 == 1) {
            c(canvas, this.j, 0);
        } else if (i2 == 2) {
            c(canvas, this.k, 0);
            c(canvas, this.l, 1);
            d(canvas);
        } else if (i2 != 3) {
            c(canvas, this.m, 0);
            c(canvas, this.n, 1);
            c(canvas, this.o, 2);
            c(canvas, this.p, 3);
            d(canvas);
            e(canvas, false);
        } else {
            c(canvas, this.k, 0);
            c(canvas, this.n, 1);
            c(canvas, this.p, 2);
            d(canvas);
            e(canvas, true);
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == 0 || i2 == 0) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i5 = i - (paddingLeft + paddingRight);
        this.g = i5;
        int i6 = i2 - (paddingTop + paddingBottom);
        this.h = i6;
        cxpv cxpvVar = this.a;
        cxpvVar.b = i5;
        cxpvVar.c = i6;
        a();
        RectF rectF = new RectF(0.0f, 0.0f, this.g, this.h);
        this.j = f(rectF, 0, 360);
        this.k = f(rectF, 90, 180);
        this.l = f(rectF, 270, 180);
        this.m = f(rectF, 180, 90);
        this.n = f(rectF, 270, 90);
        this.o = f(rectF, 90, 90);
        this.p = f(rectF, 0, 90);
    }

    public GroupAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getResources().getDimensionPixelSize(R.dimen.peoplekit_avatar_border_width);
        this.f = new cxps(this);
        b(context);
    }

    public GroupAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        getResources().getDimensionPixelSize(R.dimen.peoplekit_avatar_border_width);
        this.f = new cxps(this);
        b(context);
    }
}
