package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import com.google.android.apps.maps.R;
import java.util.EnumMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: zwd  reason: default package */
/* loaded from: classes7.dex */
public final class zwd extends cpsb<zwh> {
    private static final cqvj b = irn.e;
    private static final cqrp c = cqrp.d(10.0d);
    private static final cqrp d = cqrp.d(8.0d);
    private static final cqss e = cqrt.c(R.color.quantum_grey500);
    private static final cqss f = cqrt.c(R.color.quantum_grey400);
    private static final cqrp g = cqrp.d(5.0d);
    private static final cqss h = cqrt.c(R.color.quantum_grey400);
    private static final cqrp i = cqrp.d(3.0d);
    private static final cqss j = cqrt.c(R.color.quantum_grey400);
    private final Context k;
    @dzsi
    private cpry<zwh> o;
    private final EnumMap<dpft, cprr> l = new EnumMap<>(dpft.class);
    private final Rect m = new Rect();
    private final Rect n = new Rect();
    private int p = 4;

    public zwd(Context context) {
        dpft[] values;
        this.k = context;
        for (dpft dpftVar : dpft.values()) {
            EnumMap<dpft, cprr> enumMap = this.l;
            cprr a = a(context);
            int ordinal = dpftVar.ordinal();
            if (ordinal == 1) {
                a.d = g.NR(context);
                a.c(h.b(context));
            } else if (ordinal == 2) {
                a.d = i.NR(context);
                a.c(j.b(context));
            }
            enumMap.put((EnumMap<dpft, cprr>) dpftVar, (dpft) a);
        }
    }

    public static cprr a(Context context) {
        cprr a = cprr.a(context, null);
        a.k.setColor(f.b(context));
        a.e = d.NR(context);
        a.i.setTextSize(c.a(context));
        a.i.setColor(e.b(context));
        cprq cprqVar = cprq.LEFT_STEP_EDGE;
        cpwl.h(cprqVar, "rangeBandTickAlign");
        a.c = cprqVar;
        a.i.setTypeface(((cqvi) b).a);
        a.i.setTextAlign(Paint.Align.CENTER);
        a.i.setAntiAlias(true);
        a.i.setDither(true);
        return a;
    }

    @Override // defpackage.cprz, defpackage.cpre
    public final void b(Canvas canvas, boolean z) {
        super.b(canvas, z);
        cpry<zwh> cpryVar = this.o;
        if (cpryVar != null) {
            this.a.j.setAlpha(255);
            d(canvas, cpryVar, this.m, this.n, this.p, this.a.j);
            if (cpryVar.b == null) {
                return;
            }
            this.a.i.setAlpha(255);
            e(canvas, cpryVar, this.m, this.n, this.p, this.a.i);
        }
    }

    @Override // defpackage.cprz, defpackage.cpre
    public final void c(int i2, cpso<zwh> cpsoVar, List<cprt<zwh>> list, Rect rect, Rect rect2, Integer num) {
        this.p = i2;
        this.m.set(rect);
        this.n.set(rect2);
        super.c(i2, cpsoVar, list, rect, rect2, num);
        this.o = null;
        if (list.size() < 2 || cpsoVar.p(list.get(list.size() - 1).a) == 0 || cpsoVar.p(list.get(list.size() - 2).a) != 0) {
            return;
        }
        cpry<zwh> cpryVar = (cpry) list.get(list.size() - 1);
        dbsk.s(cpryVar);
        float round = Math.round(cpsoVar.s(list.get(list.size() - 2).a)) + (cpsoVar.l() / 2.0f);
        cpryVar.b(round);
        cpryVar.a(round);
        this.o = cpryVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cpsb, defpackage.cprz
    public final void d(Canvas canvas, cpry<zwh> cpryVar, Rect rect, Rect rect2, int i2, Paint paint) {
        cprr cprrVar = this.a;
        EnumMap<dpft, cprr> enumMap = this.l;
        dpft b2 = dpft.b(cpryVar.a.a.c);
        if (b2 == null) {
            b2 = dpft.UNKNOWN_TICK_MARK_TYPE;
        }
        this.a = enumMap.get(b2);
        super.d(canvas, cpryVar, rect, rect2, i2, this.a.j);
        this.a = cprrVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cpsb, defpackage.cprz
    public final void e(Canvas canvas, cpry<zwh> cpryVar, Rect rect, Rect rect2, int i2, TextPaint textPaint) {
        textPaint.setTextScaleX(bvox.e(bvox.b(this.k)));
        super.e(canvas, cpryVar, rect, rect2, i2, textPaint);
    }
}
