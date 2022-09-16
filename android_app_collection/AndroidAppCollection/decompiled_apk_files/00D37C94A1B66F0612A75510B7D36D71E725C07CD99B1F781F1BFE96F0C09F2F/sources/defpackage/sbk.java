package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.Log;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: sbk  reason: default package */
/* loaded from: classes4.dex */
public final class sbk extends sbt implements sbn {
    public static final sgq a = new sgq("aplos.bar_fill_style");
    private static final String c = "sbk";
    private final HashMap d;
    private final Paint e;
    private final Paint f;
    private sbl g;
    private boolean h;
    private final LinkedHashSet i;
    private final LinkedHashSet j;
    private boolean k;
    private final sbf l;
    private final HashSet m;
    private final RectF n;
    private final RectF o;
    private final sek p;
    private boolean q;
    private int r;
    private final sgi s;

    public sbk(Context context, sbl sblVar) {
        super(context);
        this.d = shp.h();
        Paint paint = new Paint();
        this.e = paint;
        Paint paint2 = new Paint();
        this.f = paint2;
        this.s = new sgi();
        this.r = 1;
        this.i = shp.f();
        this.j = new LinkedHashSet();
        this.k = false;
        this.l = new sbf();
        this.m = shp.c();
        this.n = new RectF();
        this.o = new RectF();
        Float valueOf = Float.valueOf(0.0f);
        this.p = new sek(valueOf, valueOf);
        this.q = false;
        this.g = sblVar;
        this.h = true;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setDither(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(-1);
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        sbv.a(this, sbu.CLIP_PATH, sbu.CLIP_RECT);
    }

    private static final float h(float f, float f2) {
        float f3 = f - f2;
        return (f3 == 0.0f || Math.abs(f3) > 0.0f) ? f : f2 + Math.copySign(0.0f, f3);
    }

    private final void i() {
        boolean z = this.g.a;
    }

    @Override // defpackage.sbt, defpackage.scd
    public final CharSequence a() {
        int size = this.i.size();
        if (this.h) {
            this.g = new sbl(this.g);
            this.h = false;
        }
        if (this.g.a) {
            return MessageFormat.format(getContext().getString(R.string.aplosA11yChartTypeStackedBar), Integer.valueOf(size));
        }
        return MessageFormat.format(getContext().getString(R.string.aplosA11yChartTypeGroupBar), Integer.valueOf(size));
    }

    @Override // defpackage.sbt, defpackage.scd
    public final List b(int i, int i2, boolean z) {
        int i3;
        int i4;
        float f;
        if (this.r == 2) {
            this.o.set(this.n.top, this.n.left, this.n.bottom, this.n.right);
            i4 = i;
            i3 = i2;
        } else {
            this.o.set(this.n);
            i3 = i;
            i4 = i2;
        }
        Collection<sbg> values = this.d.values();
        RectF rectF = this.o;
        ArrayList d = sbv.d();
        for (sbg sbgVar : values) {
            synchronized (sbgVar) {
                int e = sbgVar.e();
                int i5 = -1;
                float f2 = Float.MAX_VALUE;
                int i6 = 0;
                while (true) {
                    f = 0.0f;
                    if (i6 >= e) {
                        break;
                    }
                    float a2 = sbgVar.a(i6) + sbgVar.i();
                    float j = sbgVar.j() + a2;
                    if (rectF.intersects(a2, rectF.top, j, rectF.bottom)) {
                        float f3 = i3;
                        float min = scf.d(f3, a2, j) ? 0.0f : Math.min(Math.abs(a2 - f3), Math.abs(j - f3));
                        if (min < f2) {
                            f2 = (int) min;
                            i5 = i6;
                        } else if (min > f2) {
                            break;
                        }
                    }
                    i6++;
                }
                if (i5 >= 0) {
                    float b = sbgVar.b(i5);
                    float c2 = sbgVar.c(i5);
                    float f4 = i4;
                    if (!scf.d(f4, b, c2)) {
                        f = Math.min(Math.abs(b - f4), Math.abs(c2 - f4));
                    }
                    if (z || (f2 <= 10.0f && f <= 10.0f)) {
                        sgr sgrVar = new sgr();
                        sgrVar.c = sbgVar.b;
                        sgrVar.d = sbgVar.g(i5);
                        sgrVar.e = sbgVar.a.t(i5);
                        sbgVar.a(i5);
                        sbgVar.a.r(i5);
                        sbgVar.c(i5);
                        sgrVar.f = f2;
                        sgrVar.g = f;
                        d.add(sgrVar);
                    }
                }
            }
        }
        return d;
    }

    @Override // defpackage.scd
    public final void c(List list, sfa sfaVar) {
        HashMap hashMap;
        this.n.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        int i = this.r;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                this.p.b(Float.valueOf(this.n.left), Float.valueOf(this.n.right));
            } else if (i2 == 1) {
                this.p.b(Float.valueOf(this.n.top), Float.valueOf(this.n.bottom));
            } else {
                throw new AssertionError();
            }
            HashMap h = shp.h();
            HashSet<String> d = shp.d(this.d.keySet());
            i();
            int size = this.g.a ? 1 : list.size();
            sbm sbmVar = new sbm(size);
            if (!list.isEmpty()) {
                float c2 = ((sat) list.get(0)).d.c();
                boolean z = this.g.c;
                sbj[] sbjVarArr = new sbj[size];
                if (sbmVar.c < size) {
                    Log.w(c, "There are more series than weights, extra series are drawn with zero weight");
                }
                float round = Math.round(scf.b(null, 1.0f));
                float f = (sbmVar.c - 1) * round;
                float f2 = c2 - f;
                float f3 = 0.0f;
                int i3 = 0;
                while (i3 < size) {
                    float floor = (float) Math.floor(((i3 < sbmVar.c ? sbmVar.a[i3] : 0) / sbmVar.b) * f2);
                    sbj sbjVar = new sbj();
                    sbjVarArr[i3] = sbjVar;
                    sbjVar.a = floor;
                    sbjVar.b = f3 + (i3 * round);
                    i3++;
                    f3 += floor;
                    h = h;
                }
                HashMap hashMap2 = h;
                float round2 = Math.round((c2 - (f3 + f)) / 2.0f);
                for (int i4 = 0; i4 < size; i4++) {
                    sbj sbjVar2 = sbjVarArr[i4];
                    float f4 = sbjVar2.b + round2;
                    sbjVar2.b = f4;
                    double d2 = f4;
                    double d3 = c2;
                    Double.isNaN(d3);
                    Double.isNaN(d2);
                    sbjVar2.b = (float) Math.round(d2 - (d3 / 2.0d));
                }
                int i5 = 0;
                while (i5 < list.size()) {
                    sat satVar = (sat) list.get(i5);
                    sgt sgtVar = satVar.a;
                    String str = sgtVar.b;
                    d.remove(str);
                    sbg sbgVar = (sbg) this.d.get(str);
                    if (sbgVar == null) {
                        sbgVar = new sbg(new sci());
                    }
                    HashMap hashMap3 = hashMap2;
                    hashMap3.put(str, sbgVar);
                    sbgVar.a.C();
                    int i6 = true != this.g.a ? i5 : 0;
                    sep sepVar = satVar.d;
                    sep sepVar2 = satVar.c;
                    sgp c3 = satVar.c();
                    boolean z2 = this.b;
                    sbj sbjVar3 = sbjVarArr[i6];
                    sbgVar.h(sepVar, sepVar2, c3, sgtVar, z2, sbjVar3.a, sbjVar3.b, this.p);
                    i5++;
                    hashMap2 = hashMap3;
                }
                hashMap = hashMap2;
            } else {
                hashMap = h;
            }
            i();
            for (String str2 : d) {
                ((sbg) this.d.get(str2)).h(null, null, null, smx.d(str2), this.b, 0.0f, 0.0f, this.p);
            }
            this.d.putAll(hashMap);
            this.m.clear();
            for (sbg sbgVar2 : this.d.values()) {
                this.m.addAll(sbgVar2.a.u(sbgVar2.c));
            }
            return;
        }
        throw null;
    }

    @Override // defpackage.sbt, defpackage.scd
    public final void d(sai saiVar, List list, sfa sfaVar) {
        String str;
        super.d(saiVar, list, sfaVar);
        int size = list.size();
        ArrayList e = sbv.e(list);
        LinkedHashSet linkedHashSet = this.i;
        int i = 0;
        sgt sgtVar = null;
        int i2 = 1;
        if ((sfaVar instanceof sfb) && sfaVar.e()) {
            for (int i3 = 0; i3 < e.size(); i3++) {
                sgt sgtVar2 = ((sat) e.get(i3)).a;
                if (sfaVar.f(sgtVar2, null) == 1) {
                    str = sgtVar2.b;
                    break;
                }
            }
        }
        str = null;
        boolean z = this.g.a;
        for (String str2 : sbv.g(e, new sbi())) {
            if (!str2.equals(str)) {
                linkedHashSet.remove(str2);
                linkedHashSet.add(str2);
            }
        }
        if (str != null) {
            linkedHashSet.remove(str);
            linkedHashSet.add(str);
        }
        if (this.g.a) {
            int size2 = e.size();
            sgp sgpVar = null;
            int i4 = 0;
            while (i4 < size2) {
                sat satVar = (sat) e.get(i4);
                sgt sgtVar3 = satVar.a;
                sgp c2 = satVar.c();
                sbv.h(sgtVar3, c2, sgtVar, sgpVar);
                ser serVar = satVar.e.a;
                if (serVar.b == 5 && serVar.a != sfc.e(1)) {
                    satVar.e.d(ser.c(1));
                }
                i4++;
                sgtVar = sgtVar3;
                sgpVar = c2;
            }
            ArrayList d = sbv.d();
            for (int i5 = 0; i5 < e.size(); i5++) {
                d.add(((sat) e.get(i5)).a.b);
            }
            this.k = false;
            if (d.size() == this.j.size() && this.j.containsAll(d)) {
                Iterator it = this.j.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (!((String) d.get(i)).equals((String) it.next())) {
                        this.k = true;
                        break;
                    }
                    i++;
                }
            }
            this.j.clear();
            this.j.addAll(d);
            i();
        } else {
            int size3 = e.size();
            while (i < size3) {
                sat satVar2 = (sat) e.get(i);
                ser serVar2 = satVar2.e.a;
                if (serVar2.b == 5 && serVar2.a != sfc.e(size)) {
                    satVar2.e.d(ser.c(size));
                }
                i++;
            }
        }
        if (true != ((sab) saiVar).c) {
            i2 = 2;
        }
        this.r = i2;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = 1;
        boolean b = sbv.b(this, sbu.CLIP_PATH);
        if (b) {
            canvas.save();
            canvas.clipRect(this.n);
        }
        if (!this.g.a) {
            Iterator it = this.i.iterator();
            while (it.hasNext()) {
                sbg sbgVar = (sbg) this.d.get((String) it.next());
                Iterator it2 = this.m.iterator();
                while (it2.hasNext()) {
                    int f = sbgVar.f(it2.next());
                    if (f != -1) {
                        this.l.b();
                        this.l.a = sbgVar.a(f) + sbgVar.i();
                        this.l.b = sbgVar.j();
                        this.l.d = this.g.e == null ? 0.0f : smx.e(sbgVar.j());
                        float c2 = sbgVar.c(f);
                        float b2 = sbgVar.b(f);
                        this.l.a(h(c2, b2), b2, sbgVar.d(f), (String) sbgVar.b.d(a, "aplos.SOLID").a(sbgVar.g(f), 0, sbgVar.b));
                        this.s.a(canvas, this.l, this.r, this.n, this.e, this.f);
                    }
                }
            }
        } else {
            Iterator it3 = this.m.iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                this.l.b();
                sbf sbfVar = this.l;
                sbfVar.e = !this.q || !this.k;
                sbfVar.c = this.g.d;
                Iterator it4 = this.i.iterator();
                while (it4.hasNext()) {
                    String str = (String) it4.next();
                    sbg sbgVar2 = (sbg) this.d.get(str);
                    if (sbgVar2 == null) {
                        String str2 = c;
                        Object[] objArr = new Object[i];
                        objArr[0] = str;
                        Log.e(str2, String.format("No barAnimator found for series %s", objArr));
                    } else {
                        int f2 = sbgVar2.f(next);
                        if (f2 != -1) {
                            float j = sbgVar2.j();
                            sbf sbfVar2 = this.l;
                            if (j > sbfVar2.b) {
                                sbfVar2.b = j;
                                sbfVar2.a = sbgVar2.a(f2) + sbgVar2.i();
                            }
                            float c3 = sbgVar2.c(f2);
                            float b3 = sbgVar2.b(f2);
                            this.l.a(h(c3, b3), b3, sbgVar2.d(f2), (String) sbgVar2.b.d(a, "aplos.SOLID").a(sbgVar2.g(f2), 0, sbgVar2.b));
                            i = 1;
                        }
                    }
                }
                float e = this.g.e == null ? 0.0f : smx.e(this.l.b);
                sbf sbfVar3 = this.l;
                sbfVar3.d = e;
                this.s.a(canvas, sbfVar3, this.r, this.n, this.e, this.f);
                i = 1;
            }
        }
        if (b) {
            canvas.restore();
        }
    }

    @Override // defpackage.sbn
    public final void setAnimationPercent(float f) {
        this.q = f < 1.0f;
        ArrayList e = sbv.e(this.d.keySet());
        int size = e.size();
        for (int i = 0; i < size; i++) {
            String str = (String) e.get(i);
            sbg sbgVar = (sbg) this.d.get(str);
            sbgVar.setAnimationPercent(f);
            if (sbgVar.e() == 0) {
                this.d.remove(str);
                this.i.remove(str);
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof sby) {
            ((sby) layoutParams).d();
        }
    }
}
