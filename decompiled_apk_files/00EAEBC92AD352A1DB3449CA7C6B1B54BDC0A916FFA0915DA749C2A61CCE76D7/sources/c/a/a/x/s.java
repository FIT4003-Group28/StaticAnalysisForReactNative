package c.a.a.x;

import android.graphics.Color;
import android.graphics.Rect;
import c.a.a.v.l.d;
import c.a.a.x.k0.c;
import java.util.ArrayList;
import java.util.Collections;
/* loaded from: classes.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f2673a = c.a.a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd");

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f2674b = c.a.a("d", "a");

    /* renamed from: c  reason: collision with root package name */
    private static final c.a f2675c = c.a.a("nm");

    public static c.a.a.v.l.d a(c.a.a.e eVar) {
        Rect a2 = eVar.a();
        return new c.a.a.v.l.d(Collections.emptyList(), eVar, "__container", -1L, d.a.PRE_COMP, -1L, null, Collections.emptyList(), new c.a.a.v.j.l(), 0, 0, 0, 0.0f, 0.0f, a2.width(), a2.height(), null, null, Collections.emptyList(), d.b.NONE, null, false);
    }

    public static c.a.a.v.l.d a(c.a.a.x.k0.c cVar, c.a.a.e eVar) {
        float f2;
        ArrayList arrayList;
        d.b bVar = d.b.NONE;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        cVar.b();
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        d.b bVar2 = bVar;
        d.a aVar = null;
        String str = null;
        c.a.a.v.j.l lVar = null;
        c.a.a.v.j.j jVar = null;
        c.a.a.v.j.k kVar = null;
        c.a.a.v.j.b bVar3 = null;
        long j = -1;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 1.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        float f6 = 0.0f;
        boolean z = false;
        long j2 = 0;
        String str2 = null;
        String str3 = "UNSET";
        while (cVar.f()) {
            switch (cVar.a(f2673a)) {
                case 0:
                    str3 = cVar.z();
                    continue;
                case 1:
                    j2 = cVar.i();
                    continue;
                case 2:
                    str = cVar.z();
                    continue;
                case 3:
                    int i6 = cVar.i();
                    if (i6 < d.a.UNKNOWN.ordinal()) {
                        aVar = d.a.values()[i6];
                    } else {
                        aVar = d.a.UNKNOWN;
                        continue;
                    }
                case 4:
                    j = cVar.i();
                    continue;
                case 5:
                    i = (int) (cVar.i() * c.a.a.y.h.a());
                    continue;
                case 6:
                    i2 = (int) (cVar.i() * c.a.a.y.h.a());
                    continue;
                case 7:
                    i3 = Color.parseColor(cVar.z());
                    continue;
                case 8:
                    lVar = c.a(cVar, eVar);
                    continue;
                case 9:
                    bVar2 = d.b.values()[cVar.i()];
                    eVar.a(1);
                    continue;
                case 10:
                    cVar.a();
                    while (cVar.f()) {
                        arrayList2.add(u.a(cVar, eVar));
                    }
                    eVar.a(arrayList2.size());
                    break;
                case 11:
                    cVar.a();
                    while (cVar.f()) {
                        c.a.a.v.k.b a2 = g.a(cVar, eVar);
                        if (a2 != null) {
                            arrayList3.add(a2);
                        }
                    }
                    break;
                case 12:
                    cVar.b();
                    while (cVar.f()) {
                        int a3 = cVar.a(f2674b);
                        if (a3 == 0) {
                            jVar = d.b(cVar, eVar);
                        } else if (a3 != 1) {
                            cVar.B();
                            cVar.C();
                        } else {
                            cVar.a();
                            if (cVar.f()) {
                                kVar = b.a(cVar, eVar);
                            }
                            while (cVar.f()) {
                                cVar.C();
                            }
                            cVar.c();
                        }
                    }
                    cVar.d();
                    continue;
                case 13:
                    cVar.a();
                    ArrayList arrayList4 = new ArrayList();
                    while (cVar.f()) {
                        cVar.b();
                        while (cVar.f()) {
                            if (cVar.a(f2675c) != 0) {
                                cVar.B();
                                cVar.C();
                            } else {
                                arrayList4.add(cVar.z());
                            }
                        }
                        cVar.d();
                    }
                    cVar.c();
                    eVar.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList4);
                    continue;
                case 14:
                    f5 = (float) cVar.h();
                    continue;
                case 15:
                    f6 = (float) cVar.h();
                    continue;
                case 16:
                    i4 = (int) (cVar.i() * c.a.a.y.h.a());
                    continue;
                case 17:
                    i5 = (int) (cVar.i() * c.a.a.y.h.a());
                    continue;
                case 18:
                    f3 = (float) cVar.h();
                    continue;
                case 19:
                    f4 = (float) cVar.h();
                    continue;
                case 20:
                    bVar3 = d.a(cVar, eVar, false);
                    continue;
                case 21:
                    str2 = cVar.z();
                    continue;
                case 22:
                    z = cVar.g();
                    continue;
                default:
                    cVar.B();
                    cVar.C();
                    continue;
            }
            cVar.c();
        }
        cVar.d();
        float f7 = f3 / f5;
        float f8 = f4 / f5;
        ArrayList arrayList5 = new ArrayList();
        if (f7 > 0.0f) {
            f2 = f5;
            arrayList = arrayList5;
            arrayList.add(new c.a.a.z.a(eVar, valueOf2, valueOf2, null, 0.0f, Float.valueOf(f7)));
        } else {
            f2 = f5;
            arrayList = arrayList5;
        }
        if (f8 <= 0.0f) {
            f8 = eVar.e();
        }
        arrayList.add(new c.a.a.z.a(eVar, valueOf, valueOf, null, f7, Float.valueOf(f8)));
        arrayList.add(new c.a.a.z.a(eVar, valueOf2, valueOf2, null, f8, Float.valueOf(Float.MAX_VALUE)));
        if (str3.endsWith(".ai") || "ai".equals(str2)) {
            eVar.a("Convert your Illustrator layers to shape layers.");
        }
        return new c.a.a.v.l.d(arrayList3, eVar, str3, j2, aVar, j, str, arrayList2, lVar, i, i2, i3, f2, f6, i4, i5, jVar, kVar, arrayList, bVar2, bVar3, z);
    }
}
