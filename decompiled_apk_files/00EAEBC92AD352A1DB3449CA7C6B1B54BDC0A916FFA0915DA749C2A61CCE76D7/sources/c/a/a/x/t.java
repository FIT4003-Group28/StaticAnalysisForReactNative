package c.a.a.x;

import android.graphics.Rect;
import c.a.a.v.l.d;
import c.a.a.x.k0.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class t {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f2676a = c.a.a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b  reason: collision with root package name */
    static c.a f2677b = c.a.a("id", "layers", "w", "h", "p", "u");

    /* renamed from: c  reason: collision with root package name */
    private static final c.a f2678c = c.a.a("list");

    /* renamed from: d  reason: collision with root package name */
    private static final c.a f2679d = c.a.a("cm", "tm", "dr");

    public static c.a.a.e a(c.a.a.x.k0.c cVar) {
        HashMap hashMap;
        ArrayList arrayList;
        c.a.a.x.k0.c cVar2 = cVar;
        float a2 = c.a.a.y.h.a();
        a.e.d<c.a.a.v.l.d> dVar = new a.e.d<>();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        a.e.h<c.a.a.v.d> hVar = new a.e.h<>();
        c.a.a.e eVar = new c.a.a.e();
        cVar.b();
        int i = 0;
        int i2 = 0;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        while (cVar.f()) {
            switch (cVar2.a(f2676a)) {
                case 0:
                    i = cVar.i();
                    continue;
                    cVar2 = cVar;
                case 1:
                    i2 = cVar.i();
                    continue;
                    cVar2 = cVar;
                case 2:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f2 = (float) cVar.h();
                    break;
                case 3:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f3 = ((float) cVar.h()) - 0.01f;
                    break;
                case 4:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f4 = (float) cVar.h();
                    break;
                case 5:
                    String[] split = cVar.z().split("\\.");
                    if (!c.a.a.y.h.a(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        eVar.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 6:
                    a(cVar2, eVar, arrayList2, dVar);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 7:
                    a(cVar2, eVar, hashMap2, hashMap3);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 8:
                    a(cVar2, hashMap4);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 9:
                    a(cVar2, eVar, hVar);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 10:
                    a(cVar2, eVar, arrayList3);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                default:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    cVar.B();
                    cVar.C();
                    break;
            }
            hashMap4 = hashMap;
            arrayList3 = arrayList;
            cVar2 = cVar;
        }
        eVar.a(new Rect(0, 0, (int) (i * a2), (int) (i2 * a2)), f2, f3, f4, arrayList2, dVar, hashMap2, hashMap3, hVar, hashMap4, arrayList3);
        return eVar;
    }

    private static void a(c.a.a.x.k0.c cVar, c.a.a.e eVar, a.e.h<c.a.a.v.d> hVar) {
        cVar.a();
        while (cVar.f()) {
            c.a.a.v.d a2 = j.a(cVar, eVar);
            hVar.c(a2.hashCode(), a2);
        }
        cVar.c();
    }

    private static void a(c.a.a.x.k0.c cVar, c.a.a.e eVar, List<c.a.a.v.h> list) {
        cVar.a();
        while (cVar.f()) {
            String str = null;
            cVar.b();
            float f2 = 0.0f;
            float f3 = 0.0f;
            while (cVar.f()) {
                int a2 = cVar.a(f2679d);
                if (a2 == 0) {
                    str = cVar.z();
                } else if (a2 == 1) {
                    f2 = (float) cVar.h();
                } else if (a2 != 2) {
                    cVar.B();
                    cVar.C();
                } else {
                    f3 = (float) cVar.h();
                }
            }
            cVar.d();
            list.add(new c.a.a.v.h(str, f2, f3));
        }
        cVar.c();
    }

    private static void a(c.a.a.x.k0.c cVar, c.a.a.e eVar, List<c.a.a.v.l.d> list, a.e.d<c.a.a.v.l.d> dVar) {
        cVar.a();
        int i = 0;
        while (cVar.f()) {
            c.a.a.v.l.d a2 = s.a(cVar, eVar);
            if (a2.d() == d.a.IMAGE) {
                i++;
            }
            list.add(a2);
            dVar.c(a2.b(), a2);
            if (i > 4) {
                c.a.a.y.d.b("You have " + i + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        cVar.c();
    }

    private static void a(c.a.a.x.k0.c cVar, c.a.a.e eVar, Map<String, List<c.a.a.v.l.d>> map, Map<String, c.a.a.h> map2) {
        cVar.a();
        while (cVar.f()) {
            ArrayList arrayList = new ArrayList();
            a.e.d dVar = new a.e.d();
            cVar.b();
            String str = null;
            String str2 = null;
            String str3 = null;
            int i = 0;
            int i2 = 0;
            while (cVar.f()) {
                int a2 = cVar.a(f2677b);
                if (a2 == 0) {
                    str = cVar.z();
                } else if (a2 == 1) {
                    cVar.a();
                    while (cVar.f()) {
                        c.a.a.v.l.d a3 = s.a(cVar, eVar);
                        dVar.c(a3.b(), a3);
                        arrayList.add(a3);
                    }
                    cVar.c();
                } else if (a2 == 2) {
                    i = cVar.i();
                } else if (a2 == 3) {
                    i2 = cVar.i();
                } else if (a2 == 4) {
                    str2 = cVar.z();
                } else if (a2 != 5) {
                    cVar.B();
                    cVar.C();
                } else {
                    str3 = cVar.z();
                }
            }
            cVar.d();
            if (str2 != null) {
                c.a.a.h hVar = new c.a.a.h(i, i2, str, str2, str3);
                map2.put(hVar.d(), hVar);
            } else {
                map.put(str, arrayList);
            }
        }
        cVar.c();
    }

    private static void a(c.a.a.x.k0.c cVar, Map<String, c.a.a.v.c> map) {
        cVar.b();
        while (cVar.f()) {
            if (cVar.a(f2678c) != 0) {
                cVar.B();
                cVar.C();
            } else {
                cVar.a();
                while (cVar.f()) {
                    c.a.a.v.c a2 = k.a(cVar);
                    map.put(a2.b(), a2);
                }
                cVar.c();
            }
        }
        cVar.d();
    }
}
