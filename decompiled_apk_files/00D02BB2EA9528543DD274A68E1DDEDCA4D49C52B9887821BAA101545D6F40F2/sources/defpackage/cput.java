package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cput  reason: default package */
/* loaded from: classes5.dex */
public final class cput implements cpul {
    private final RectF a;
    private final Paint b;
    private final Map<String, cpum> c;

    public cput() {
        this.a = new RectF();
        this.b = new Paint();
        this.c = new HashMap();
        b();
    }

    @Override // defpackage.cpul
    public final void a(Canvas canvas, cppd cppdVar, int i, RectF rectF, Paint paint, Paint paint2) {
        int i2;
        float f;
        if (!cppdVar.j.isEmpty()) {
            float round = Math.round(cppdVar.a);
            float round2 = Math.round(cppdVar.b);
            if (round2 == 0.0f) {
                return;
            }
            float f2 = cppdVar.d;
            int i3 = 1;
            if (f2 > 0.0f) {
                float round3 = Math.round(cppdVar.h);
                float round4 = Math.round(cppdVar.i);
                float round5 = Math.round(cppdVar.f);
                float round6 = Math.round(cppdVar.g);
                float f3 = cppdVar.d;
                int i4 = i - 1;
                if (i == 0) {
                    throw null;
                }
                if (i4 == 0) {
                    if (cppdVar.i >= cppdVar.g) {
                        round6 = round4 + f3;
                    } else {
                        round5 = round3 - f3;
                    }
                    this.a.set(round, round5, round + round2, round6);
                } else if (i4 == 1) {
                    if (cppdVar.i <= cppdVar.g) {
                        round5 = round3 - f3;
                    } else {
                        round6 = round4 + f3;
                    }
                    this.a.set(round5, round, round6, round + round2);
                } else {
                    throw new AssertionError();
                }
            }
            int i5 = 0;
            while (i5 < cppdVar.j.size()) {
                cppc cppcVar = cppdVar.j.get(i5);
                if (d(rectF, i, cppcVar, round, round2)) {
                    i2 = i5;
                    f = f2;
                } else {
                    cpum c = c(cppcVar.d);
                    this.b.set(paint);
                    paint.setColor(cppcVar.c);
                    float round7 = Math.round(cppcVar.b);
                    float round8 = Math.round(cppcVar.a);
                    int i6 = i - 1;
                    if (i != 0) {
                        if (i6 == 0) {
                            i2 = i5;
                            f = f2;
                            if (f > 0.0f) {
                                c.a(canvas, round7, round8, round, round2, cppdVar.d, this.a, paint);
                            } else {
                                c.b(canvas, round7, round8, round, round2, paint);
                            }
                        } else if (i6 != i3) {
                            throw new AssertionError();
                        } else {
                            if (f2 > 0.0f) {
                                i2 = i5;
                                f = f2;
                                c.d(canvas, round7, round8, round, round2, cppdVar.d, this.a, paint);
                            } else {
                                i2 = i5;
                                f = f2;
                                c.c(canvas, round7, round8, round, round2, paint);
                            }
                        }
                        paint.set(this.b);
                    } else {
                        throw null;
                    }
                }
                i5 = i2 + 1;
                f2 = f;
                i3 = 1;
            }
            if (!cppdVar.e) {
                return;
            }
            float f4 = cppdVar.c;
            if (f4 <= 0.0f) {
                return;
            }
            paint2.setStrokeWidth(f4);
            float f5 = cppdVar.i;
            float f6 = cppdVar.g;
            if (f5 > f6) {
                f6 = cppdVar.f;
            }
            float f7 = f6;
            for (cppc cppcVar2 : cppdVar.j) {
                if (cppcVar2.a != f7 && !d(rectF, i, cppcVar2, round, round2)) {
                    cpum c2 = c(cppcVar2.d);
                    float round9 = Math.round(cppcVar2.a);
                    int i7 = i - 1;
                    if (i == 0) {
                        throw null;
                    }
                    if (i7 == 0) {
                        c2.e(canvas, round9, round, round2, paint2);
                    } else if (i7 == 1) {
                        c2.f(canvas, round9, round, round2, paint2);
                    } else {
                        throw new AssertionError();
                    }
                }
            }
        }
    }

    final void b() {
        if (!this.c.containsKey("aplos.HOLLOW")) {
            this.c.put("aplos.HOLLOW", new cpuq(new cpuo()));
        }
        if (!this.c.containsKey("aplos.SOLID")) {
            this.c.put("aplos.SOLID", cpup.a());
        }
    }

    final cpum c(String str) {
        if (this.c.containsKey(str)) {
            return this.c.get(str);
        }
        return this.c.get("aplos.SOLID");
    }

    private static final boolean d(RectF rectF, int i, cppc cppcVar, float f, float f2) {
        int i2 = i - 1;
        if (i != 0) {
            return i2 != 0 ? !rectF.intersects(Math.min(cppcVar.b, cppcVar.a), f, Math.max(cppcVar.b, cppcVar.a), f2 + f) : !rectF.intersects(f, Math.min(cppcVar.b, cppcVar.a), f2 + f, Math.max(cppcVar.b, cppcVar.a));
        }
        throw null;
    }

    public cput(Map<String, cpum> map) {
        this.a = new RectF();
        this.b = new Paint();
        HashMap hashMap = new HashMap();
        this.c = hashMap;
        hashMap.putAll(map);
        b();
    }
}
