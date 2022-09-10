package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cpuc  reason: default package */
/* loaded from: classes5.dex */
public final class cpuc<T, D> extends cppr<T, D> implements cppl {
    public static final cpvf<Integer> a = new cpvf<>("aplos.line_width");
    public static final cpvf<String> b = new cpvf<>("aplos.dash_pattern");
    public static final cpvf<Integer> d = new cpvf<>("aplos.line_point.color");
    public static final cpvf<Integer> e = new cpvf<>("aplos.line_point.radius");
    public static final cpvf<Integer> f = new cpvf<>("aplos.line_area.color");
    private Paint g;
    private Paint h;
    private Paint i;
    private LinkedHashMap<String, cpue<T, D>> j;
    private int k;
    private final Path l;
    private final Rect m;
    private cpud n;

    public cpuc(Context context) {
        super(context);
        this.g = new Paint();
        this.h = new Paint();
        this.i = new Paint();
        this.j = cpwj.c();
        this.k = 10;
        this.l = new Path();
        this.m = new Rect();
        this.n = new cpud(context);
        a();
    }

    private final void a() {
        this.g.setAntiAlias(true);
        this.g.setStyle(Paint.Style.STROKE);
        this.g.setStrokeJoin(Paint.Join.ROUND);
        this.g.setStrokeCap(Paint.Cap.ROUND);
        this.g.setDither(true);
        this.h.setAntiAlias(true);
        this.h.setStyle(Paint.Style.FILL);
        this.h.setDither(true);
        this.i.setAntiAlias(true);
        this.i.setStyle(Paint.Style.FILL);
        this.i.setDither(true);
        cppt.a(this, cpps.CLIP_PATH);
    }

    @Override // defpackage.cppr, defpackage.cpqf
    public final CharSequence e() {
        int size = this.j.size();
        cpud cpudVar = this.n;
        int i = cpudVar.l;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 1 || i2 == 2) {
                if (cpudVar.g) {
                    return MessageFormat.format(getContext().getString(R.string.aplosA11yChartTypeStackedStep), Integer.valueOf(size));
                }
                return getContext().getString(R.string.aplosA11yChartTypeStep);
            } else if (cpudVar.g) {
                return MessageFormat.format(getContext().getString(R.string.aplosA11yChartTypeStackedLine), Integer.valueOf(size));
            } else {
                return getContext().getString(R.string.aplosA11yChartTypeLine);
            }
        }
        throw null;
    }

    @Override // defpackage.cppr, defpackage.cpqf
    public final void f(cpoj<T, D> cpojVar, List<cpot> list, cptb<T, D> cptbVar) {
        super.f(cpojVar, list, cptbVar);
        if (this.n.g) {
            cpvi<T, D> cpviVar = null;
            cpve<T, D> cpveVar = null;
            for (cpot cpotVar : list) {
                cpvi<T, D> cpviVar2 = cpotVar.a;
                cpve<T, D> a2 = cpotVar.a();
                cpwc.a(cpviVar2, a2, cpviVar, cpveVar);
                cpveVar = a2;
                cpviVar = cpviVar2;
            }
            String str = cpviVar.f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [cpuj] */
    /* JADX WARN: Type inference failed for: r1v16, types: [cpug] */
    /* JADX WARN: Type inference failed for: r1v21, types: [cpuk] */
    /* JADX WARN: Type inference failed for: r1v23, types: [cpuf] */
    /* JADX WARN: Type inference failed for: r1v24 */
    @Override // defpackage.cpqf
    public final void g(List<cpot> list, cptb<T, D> cptbVar) {
        String str;
        boolean z;
        int intValue;
        LinkedHashMap linkedHashMap;
        Iterator<cpot> it;
        HashSet hashSet;
        DashPathEffect dashPathEffect;
        ?? cpujVar;
        LinkedHashMap c = cpwj.c();
        HashSet c2 = cpwm.c(this.j.keySet());
        Iterator<cpot> it2 = list.iterator();
        while (it2.hasNext()) {
            cpot next = it2.next();
            cpvi<T, D> cpviVar = next.a;
            cpve<T, D> a2 = next.a();
            String str2 = cpviVar.f;
            c2.remove(str2);
            cpue<T, D> cpueVar = this.j.get(str2);
            if (cpueVar == null) {
                cpueVar = new cpue<>();
            }
            c.put(str2, cpueVar);
            int intValue2 = ((Integer) cpviVar.d(cpvf.e).a(null, -1, cpviVar)).intValue();
            int intValue3 = ((Integer) cpviVar.e(d, Integer.valueOf(intValue2)).a(null, -1, cpviVar)).intValue();
            int intValue4 = ((Integer) cpviVar.e(a, Integer.valueOf(this.n.b)).a(null, -1, cpviVar)).intValue();
            cpvf cpvfVar = f;
            if (cpviVar.d(cpvfVar) == null) {
                intValue = Color.argb(this.n.f, Color.red(intValue2), Color.green(intValue2), Color.blue(intValue2));
                z = false;
            } else {
                z = false;
                intValue = ((Integer) cpviVar.d(cpvfVar).a(null, -1, cpviVar)).intValue();
            }
            cpvf cpvfVar2 = e;
            int intValue5 = cpviVar.d(cpvfVar2) == null ? this.n.d : ((Integer) cpviVar.d(cpvfVar2).a(z, -1, cpviVar)).intValue();
            cpvf cpvfVar3 = b;
            if (cpviVar.d(cpvfVar3) == null) {
                linkedHashMap = c;
                hashSet = c2;
                it = it2;
                dashPathEffect = null;
            } else {
                String str3 = (String) cpviVar.d(cpvfVar3).a(null, -1, cpviVar);
                cpwl.h(str3, "Dash pattern cannot be null");
                String[] split = str3.split(",");
                int length = split.length;
                linkedHashMap = c;
                it = it2;
                hashSet = c2;
                cpwl.b(1 == ((length & 1) ^ 1), "Dash pattern %s does not have an even number of intervals: %s", str3, Integer.valueOf(length));
                float[] fArr = new float[length];
                for (int i = 0; i < split.length; i++) {
                    try {
                        fArr[i] = Float.parseFloat(split[i]);
                    } catch (NumberFormatException unused) {
                        String valueOf = String.valueOf(str3);
                        throw new IllegalArgumentException(valueOf.length() != 0 ? "Dash pattern should have numeric intervals: ".concat(valueOf) : new String("Dash pattern should have numeric intervals: "));
                    }
                }
                dashPathEffect = new DashPathEffect(fArr, 0.0f);
            }
            int i2 = this.n.l;
            int i3 = i2 - 1;
            if (i2 != 0) {
                if (i3 == 0) {
                    cpujVar = new cpuj();
                } else if (i3 == 1) {
                    cpujVar = new cpuk();
                    cpujVar.a = this.n.h;
                } else if (i3 != 2) {
                    cpujVar = 0;
                } else {
                    cpujVar = new cpuf();
                    cpud cpudVar = this.n;
                    cpujVar.b = cpudVar.j;
                    cpujVar.a = cpudVar.i;
                }
                cpud cpudVar2 = this.n;
                boolean z2 = cpudVar2.a;
                int i4 = cpudVar2.k;
                boolean z3 = cpudVar2.e;
                cpueVar.b = intValue2;
                cpueVar.i = intValue3;
                cpueVar.j = intValue;
                cpueVar.q = cpujVar;
                cpueVar.k = z2;
                cpueVar.l = intValue4;
                cpueVar.m = dashPathEffect;
                cpueVar.r = i4;
                cpueVar.n = intValue5;
                cpueVar.o = z3;
                boolean z4 = cpudVar2.g;
                cpueVar.p = false;
                cpueVar.b(next.e, next.d, cpviVar, a2, this.c);
                it2 = it;
                c = linkedHashMap;
                c2 = hashSet;
            } else {
                throw null;
            }
        }
        LinkedHashMap linkedHashMap2 = c;
        HashSet<String> hashSet2 = c2;
        boolean z5 = false;
        for (String str4 : hashSet2) {
            this.j.get(str4).b(null, null, cpvo.a(str4), null, this.c);
        }
        LinkedHashMap<String, cpue<T, D>> linkedHashMap3 = this.j;
        LinkedHashMap linkedHashMap4 = (LinkedHashMap<String, cpue<T, D>>) new LinkedHashMap();
        int i5 = 0;
        for (Map.Entry<String, cpue<T, D>> entry : linkedHashMap3.entrySet()) {
            LinkedHashMap linkedHashMap5 = linkedHashMap2;
            if (linkedHashMap5.containsKey(entry.getKey())) {
                z5 = true;
            } else if (!z5) {
                linkedHashMap4.put(entry.getKey(), entry.getValue());
            } else {
                i5++;
            }
            linkedHashMap2 = linkedHashMap5;
        }
        LinkedHashMap linkedHashMap6 = linkedHashMap2;
        for (Map.Entry entry2 : linkedHashMap6.entrySet()) {
            linkedHashMap4.put(entry2.getKey(), entry2.getValue());
            if (i5 > 0) {
                Iterator<Map.Entry<String, cpue<T, D>>> it3 = linkedHashMap3.entrySet().iterator();
                while (it3.hasNext() && !it3.next().getKey().equals(entry2.getKey())) {
                }
                while (it3.hasNext()) {
                    Map.Entry<String, cpue<T, D>> next2 = it3.next();
                    if (!linkedHashMap6.containsKey(next2.getKey())) {
                        linkedHashMap4.put(next2.getKey(), next2.getValue());
                        i5--;
                    }
                }
            }
        }
        this.j = linkedHashMap4;
        if (cptbVar.f()) {
            Iterator it4 = linkedHashMap4.keySet().iterator();
            while (true) {
                if (!it4.hasNext()) {
                    str = null;
                    break;
                }
                Object obj = (String) it4.next();
                if (cptbVar.h(((cpue) linkedHashMap4.get(obj)).a, null) == 1) {
                    str = obj;
                    break;
                }
            }
            if (str == null) {
                return;
            }
            linkedHashMap4.put(str, (cpue) linkedHashMap4.remove(str));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0094, code lost:
        if (r7 <= (r4 + r3)) goto L35;
     */
    @Override // defpackage.cppr, defpackage.cpqf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<defpackage.cpvg<T, D>> h(int r11, int r12, boolean r13) {
        /*
            r10 = this;
            java.util.ArrayList r0 = defpackage.cpwi.a()
            android.graphics.Rect r1 = r10.m
            int r2 = r10.getPaddingLeft()
            int r3 = r10.getPaddingTop()
            int r4 = r10.getWidth()
            int r5 = r10.getPaddingRight()
            int r4 = r4 - r5
            int r5 = r10.getHeight()
            int r6 = r10.getPaddingBottom()
            int r5 = r5 - r6
            r1.set(r2, r3, r4, r5)
            android.graphics.Rect r1 = r10.m
            boolean r1 = r1.contains(r11, r12)
            if (r1 == 0) goto Lc6
            java.util.LinkedHashMap<java.lang.String, cpue<T, D>> r1 = r10.j
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L35:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lc6
            java.lang.Object r2 = r1.next()
            cpue r2 = (defpackage.cpue) r2
            monitor-enter(r2)
            S extends cpqu<T, D> r3 = r2.c     // Catch: java.lang.Throwable -> Lc3
            int r3 = r3.i()     // Catch: java.lang.Throwable -> Lc3
            S extends cpqu<T, D> r4 = r2.c     // Catch: java.lang.Throwable -> Lc3
            r5 = -1
            r6 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r7 = 0
        L4f:
            if (r7 >= r3) goto L7b
            float r8 = r4.l(r7)     // Catch: java.lang.Throwable -> Lc3
            int r8 = java.lang.Math.round(r8)     // Catch: java.lang.Throwable -> Lc3
            android.graphics.Rect r9 = r10.m     // Catch: java.lang.Throwable -> Lc3
            int r9 = r9.left     // Catch: java.lang.Throwable -> Lc3
            if (r8 < r9) goto L78
            android.graphics.Rect r9 = r10.m     // Catch: java.lang.Throwable -> Lc3
            int r9 = r9.right     // Catch: java.lang.Throwable -> Lc3
            if (r8 <= r9) goto L66
            goto L78
        L66:
            int r8 = r8 - r11
            int r8 = java.lang.Math.abs(r8)     // Catch: java.lang.Throwable -> Lc3
            float r8 = (float) r8     // Catch: java.lang.Throwable -> Lc3
            int r9 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r9 >= 0) goto L73
            r5 = r7
            r6 = r8
            goto L78
        L73:
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r8 <= 0) goto L78
            goto L7b
        L78:
            int r7 = r7 + 1
            goto L4f
        L7b:
            if (r5 < 0) goto Lc0
            float r3 = r4.n(r5)     // Catch: java.lang.Throwable -> Lc3
            if (r13 != 0) goto L96
            int r4 = r10.k     // Catch: java.lang.Throwable -> Lc3
            float r4 = (float) r4     // Catch: java.lang.Throwable -> Lc3
            int r7 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r7 > 0) goto Lc0
            float r7 = (float) r12     // Catch: java.lang.Throwable -> Lc3
            float r8 = r3 - r4
            int r8 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r8 < 0) goto Lc0
            float r4 = r4 + r3
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 > 0) goto Lc0
        L96:
            float r4 = (float) r12     // Catch: java.lang.Throwable -> Lc3
            float r4 = r4 - r3
            float r3 = java.lang.Math.abs(r4)     // Catch: java.lang.Throwable -> Lc3
            S extends cpqu<T, D> r4 = r2.c     // Catch: java.lang.Throwable -> Lc3
            cpvg r7 = new cpvg     // Catch: java.lang.Throwable -> Lc3
            r7.<init>()     // Catch: java.lang.Throwable -> Lc3
            cpvi<T, D> r8 = r2.a     // Catch: java.lang.Throwable -> Lc3
            r7.a = r8     // Catch: java.lang.Throwable -> Lc3
            r4.j(r5)     // Catch: java.lang.Throwable -> Lc3
            java.lang.Object r8 = r4.k(r5)     // Catch: java.lang.Throwable -> Lc3
            r7.b = r8     // Catch: java.lang.Throwable -> Lc3
            r4.l(r5)     // Catch: java.lang.Throwable -> Lc3
            r4.m(r5)     // Catch: java.lang.Throwable -> Lc3
            r4.n(r5)     // Catch: java.lang.Throwable -> Lc3
            r7.c = r6     // Catch: java.lang.Throwable -> Lc3
            r7.d = r3     // Catch: java.lang.Throwable -> Lc3
            r0.add(r7)     // Catch: java.lang.Throwable -> Lc3
        Lc0:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc3
            goto L35
        Lc3:
            r11 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc3
            throw r11
        Lc6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpuc.h(int, int, boolean):java.util.List");
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean b2 = cppt.b(this, cpps.CLIP_PATH);
        for (cpue<T, D> cpueVar : this.j.values()) {
            cpueVar.d(this);
            if (b2) {
                canvas.save();
                this.l.rewind();
                this.l.addRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), Path.Direction.CW);
                canvas.clipPath(this.l);
            }
            this.i.setColor(cpueVar.j);
            canvas.drawPath(cpueVar.g, this.i);
            if (cpueVar.l > 0) {
                this.g.setColor(cpueVar.b);
                this.g.setStrokeWidth(cpueVar.l);
                this.g.setStrokeCap(this.n.c ? Paint.Cap.ROUND : Paint.Cap.BUTT);
                this.g.setPathEffect(cpueVar.m);
                canvas.drawPath(cpueVar.e, this.g);
            }
            if (b2) {
                canvas.restore();
            }
            this.h.setColor(cpueVar.i);
            canvas.drawPath(cpueVar.f, this.h);
        }
        boolean b3 = cppt.b(this, cpps.CLIP_PATH);
        if (b3) {
            canvas.save();
            this.l.rewind();
            this.l.addRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), Path.Direction.CW);
            canvas.clipPath(this.l);
        }
        for (cpue<T, D> cpueVar2 : this.j.values()) {
            boolean z = cpueVar2.p;
        }
        if (b3) {
            canvas.restore();
        }
    }

    @Override // defpackage.cppl
    public void setAnimationPercent(float f2) {
        ArrayList c = cpwi.c(this.j.keySet());
        int size = c.size();
        for (int i = 0; i < size; i++) {
            String str = (String) c.get(i);
            cpue<T, D> cpueVar = this.j.get(str);
            cpueVar.a(f2);
            if (cpueVar.c.i() == 0) {
                this.j.remove(str);
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof cppw) {
            ((cppw) layoutParams).d();
        }
    }

    public cpuc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public cpuc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = new Paint();
        this.h = new Paint();
        this.i = new Paint();
        this.j = cpwj.c();
        this.k = 10;
        this.l = new Path();
        this.m = new Rect();
        this.n = cpud.a(context, attributeSet, i);
        a();
    }

    public cpuc(Context context, cpud cpudVar) {
        super(context);
        this.g = new Paint();
        this.h = new Paint();
        this.i = new Paint();
        this.j = cpwj.c();
        this.k = 10;
        this.l = new Path();
        this.m = new Rect();
        if (cpudVar != null) {
            this.n = cpudVar;
        } else {
            this.n = new cpud(context);
        }
        a();
    }
}
