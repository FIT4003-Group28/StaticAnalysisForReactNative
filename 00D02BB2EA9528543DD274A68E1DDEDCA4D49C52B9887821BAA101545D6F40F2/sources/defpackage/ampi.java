package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.android.apps.gmm.map.internal.vector.gl.GeometryUtil;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ampi  reason: default package */
/* loaded from: classes.dex */
public final class ampi implements ampc {
    public static float a = 1.0f;
    public final boolean b;
    public final ArrayList<bnvn> c = new ArrayList<>(2);
    @dzsi
    public bnvl d;
    private final List<ampe> e;
    private final int f;
    private final int g;
    private final float h;

    public ampi(GeometryUtil geometryUtil, alyh alyhVar, amqi amqiVar, List<ampe> list, bnrz bnrzVar, alth althVar, bnuv bnuvVar, bnvo bnvoVar, List<bnsa> list2) {
        int i;
        float f;
        int i2;
        amgr amgrVar;
        int i3;
        float f2;
        float f3;
        List<ampe> list3;
        List<ampe> list4 = list;
        this.e = list4;
        int c = list4.get(0).c();
        boolean z = c > 1;
        this.b = z;
        if (z) {
            int i4 = c / 16;
            i = i4 + i4;
            f = Math.max(1.0f, list4.get(0).b());
        } else {
            int i5 = 0;
            float f4 = 1.0f;
            for (ampe ampeVar : list) {
                int c2 = ampeVar.c();
                f4 = Math.max(f4, ampeVar.b());
                i5 += c2;
            }
            i = i5;
            f = f4;
        }
        int i6 = 0;
        while ((1 << i6) < i) {
            i6++;
        }
        this.f = i6;
        float ceil = (float) Math.ceil(f * a);
        float f5 = 1.3333334f * ceil;
        int f6 = bvop.f((int) f5, 8);
        this.g = f6;
        this.h = f6 / f5;
        float m = ((ceil * alyhVar.f().m()) / 256.0f) * 0.5f;
        int i7 = 0;
        for (ampe ampeVar2 : this.e) {
            for (akrk akrkVar : ampeVar2.a) {
                i7 += GeometryUtil.getMaxVerticesForExtrudedPolyline(akrkVar);
            }
        }
        ArrayList arrayList = new ArrayList(2);
        amgr builder = geometryUtil.getBuilder("line_group", 82, true, alyhVar.g, i7);
        arrayList.add(builder);
        int i8 = 0;
        int i9 = 0;
        while (i9 < list.size()) {
            akrk[] akrkVarArr = list4.get(i9).a;
            int i10 = 0;
            while (i10 < akrkVarArr.length) {
                int l = (akrkVarArr[i10].l() - 1) * 5;
                if (l + i8 >= 65536) {
                    i2 = i9;
                    amgr builder2 = geometryUtil.getBuilder("line_group", 82, true, alyhVar.g, i7);
                    arrayList.add(builder2);
                    amgrVar = builder2;
                    i8 = 0;
                } else {
                    i2 = i9;
                    amgrVar = builder;
                }
                int i11 = l + i8;
                akrp f7 = alyhVar.f();
                akrk akrkVar2 = akrkVarArr[i10];
                if (akrkVar2.l() < 2) {
                    i3 = i11;
                } else {
                    akra akraVar = f7.a;
                    if (this.b && (list3 = this.e) != null) {
                        i3 = i11;
                        f3 = (2048.0f / list3.get(0).c()) / f7.m();
                        f2 = 0.0f;
                    } else {
                        i3 = i11;
                        f2 = (i2 + 0.5f) / (1 << this.f);
                        f3 = 0.0f;
                    }
                    geometryUtil.addExtrudedPolyline(akrkVar2, m, akraVar, f3, f2, this.b, amgrVar);
                }
                i10++;
                i9 = i2;
                builder = amgrVar;
                i8 = i3;
            }
            i9++;
            list4 = list;
        }
        int size = arrayList.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            amgr amgrVar2 = (amgr) arrayList.get(i13);
            int i14 = amgrVar2.f;
            if (i14 > 0) {
                i12 += i14;
                bnvn n = amgrVar2.n(4);
                n.a(true);
                this.c.add(n);
            }
        }
        if (i12 != 0) {
            List<ampe> list5 = this.e;
            int i15 = this.g;
            int i16 = this.f;
            float f8 = this.h;
            boolean z2 = this.b;
            Bitmap createBitmap = Bitmap.createBitmap(i15, 1 << i16, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(0);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setStrokeWidth(1.0f);
            paint.setAntiAlias(true);
            float width = createBitmap.getWidth() * 0.5f;
            int size2 = z2 ? 1 : list5.size();
            int i17 = 0;
            while (i17 < size2) {
                ampe ampeVar3 = list5.get(i17);
                int c3 = ampeVar3.c();
                float f9 = i17;
                Paint paint2 = paint;
                b(ampeVar3.b, canvas, paint, width, f9, f8, c3);
                b(ampeVar3.c, canvas, paint2, width, f9, f8, c3);
                i17++;
                size2 = size2;
                paint = paint2;
            }
            boolean z3 = (bnrzVar == bnts.a || bnrzVar == bntk.INDOOR_LINES) ? false : true;
            bnvl bnvlVar = new bnvl("line_group", new bntv(createBitmap, true), 3, 4);
            this.d = bnvlVar;
            ArrayList<bnvn> arrayList2 = this.c;
            int size3 = arrayList2.size();
            int i18 = 0;
            while (i18 < size3) {
                bnvn bnvnVar = arrayList2.get(i18);
                ArrayList arrayList3 = arrayList;
                amye amyeVar = new amye(bnrzVar, alyhVar, amqiVar.b, bnvoVar, z3);
                String valueOf = String.valueOf(alyhVar);
                int i19 = bnvnVar.j;
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                sb.append("Line ");
                sb.append(valueOf);
                sb.append("   ");
                sb.append(i19);
                amyeVar.s = sb.toString();
                amyeVar.r(bnvnVar);
                amyeVar.e(0, bnvlVar);
                amyeVar.n(false);
                if (althVar == null) {
                    amyeVar.s(1, 771);
                } else {
                    amyeVar.s(770, 771);
                    althVar.a(amyeVar);
                    amyeVar.j(althVar.a);
                    althVar.d.add((bnvk) bnuvVar);
                    althVar.b.b(althVar);
                    althVar.b.d();
                }
                amyeVar.t(bnuvVar);
                list2.add(amyeVar);
                i18++;
                arrayList = arrayList3;
            }
        }
        ArrayList arrayList4 = arrayList;
        int size4 = arrayList4.size();
        for (int i20 = 0; i20 < size4; i20++) {
            ((amgr) arrayList4.get(i20)).b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(float f) {
        return f * a > 1.0f;
    }

    private static void b(ArrayList<ampf> arrayList, Canvas canvas, Paint paint, float f, float f2, float f3, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        float height = (canvas.getHeight() / i) * 16.0f;
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            ampf ampfVar = arrayList.get(i6);
            float f4 = ampfVar.a;
            float f5 = ampfVar.c;
            int i7 = ampfVar.e;
            int[] iArr = ampfVar.f;
            float f6 = f - (f4 * f3);
            float f7 = f5 * f3 * 0.5f;
            paint.setColor(i7);
            boolean z = true;
            if (iArr != null) {
                float f8 = f2;
                int i8 = 0;
                while (i8 < i) {
                    int i9 = 0;
                    while (true) {
                        int length = iArr.length;
                        if (i9 <= (length & 1)) {
                            float f9 = f8;
                            int i10 = 0;
                            while (i10 < length) {
                                int i11 = iArr[i10];
                                float f10 = ((i11 / 16.0f) * height) + f9;
                                if (z) {
                                    i2 = i11;
                                    i3 = i10;
                                    i4 = length;
                                    i5 = i9;
                                    canvas.drawRect(f6 - f7, f9, f6 + f7, f10, paint);
                                } else {
                                    i2 = i11;
                                    i3 = i10;
                                    i4 = length;
                                    i5 = i9;
                                }
                                z = !z;
                                i8 += i2;
                                i10 = i3 + 1;
                                f9 = f10;
                                i9 = i5;
                                length = i4;
                            }
                            i9++;
                            f8 = f9;
                        }
                    }
                }
            } else if (i == 1) {
                float f11 = f2 + 0.5f;
                canvas.drawLine(f6 - f7, f11, f6 + f7, f11, paint);
            } else {
                canvas.drawRect(f6 - f7, 0.0f, f6 + f7, canvas.getHeight(), paint);
            }
        }
    }

    @Override // defpackage.ampc
    public final int d() {
        ArrayList<bnvn> arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += arrayList.get(i2).p;
        }
        return i;
    }

    @Override // defpackage.ampc
    public final int e() {
        int i = 608;
        for (ampe ampeVar : this.e) {
            int i2 = 208;
            for (akrk akrkVar : ampeVar.a) {
                i2 += (akrkVar.b.length * 4) + 160;
            }
            i += i2 + ((ampeVar.b.size() + ampeVar.c.size()) * 24);
        }
        return i;
    }
}
