package defpackage;

import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.google.android.apps.gmm.directions.maneuvers.Maneuvers$Maneuver;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
/* compiled from: PG */
/* renamed from: atln  reason: default package */
/* loaded from: classes2.dex */
public class atln {
    static final int b;
    static final int c;
    static final int d;
    static final int e;
    private static final dcqe f = dcqe.c("atln");
    private static final dccr<amup> g = dcdc.e();
    public final Application a;
    private final dxio<amfi> h;
    private Drawable k;
    private amup l;
    private final HashSet<String> j = n(R.string.DA_ROUTE_PREFIXES);
    private final HashSet<String> i = n(R.string.DA_ROUTE_SUFFIXES);

    static {
        Integer valueOf = Integer.valueOf((int) R.string.DA_TOWARD);
        b = R.string.DA_TOWARD;
        Integer valueOf2 = Integer.valueOf((int) R.string.DA_ONTO);
        c = R.string.DA_ONTO;
        Integer valueOf3 = Integer.valueOf((int) R.string.DA_AT);
        d = R.string.DA_AT;
        e = R.string.DA_NAME_DELIMITER;
        dcdg p = dcdn.p();
        p.f(dovu.TYPE_TOWARD_NAME, valueOf);
        p.f(dovu.TYPE_TOWARD_ROAD_NAME, valueOf);
        p.f(dovu.TYPE_TO_ROAD_NAME, valueOf2);
        p.f(dovu.TYPE_AT_ROAD_NAME, valueOf3);
        p.f(dovu.TYPE_INTERSECTION, valueOf3);
        p.f(dovu.TYPE_EXIT_NUMBER, valueOf2);
        p.f(dovu.TYPE_EXIT_NAME, valueOf2);
        p.f(dovu.TYPE_FOLLOW_ROAD_NAME, 0);
        p.f(dovu.TYPE_FROM_ROAD_NAME, 0);
        p.f(dovu.TYPE_TITLE, valueOf);
        p.f(dovu.TYPE_ADDRESS, valueOf);
        p.f(dovu.TYPE_TRANSIT_SIGNPOST, 0);
        p.f(dovu.TYPE_TRANSIT_ENTRANCE_NAME, 0);
        p.f(dovu.TYPE_TRANSIT_EXIT_NAME, 0);
        p.b();
    }

    public atln(Application application, dxio<amfi> dxioVar) {
        this.a = application;
        this.h = dxioVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(amup amupVar, atlm atlmVar, Drawable drawable) {
        String upperCase = !dbsj.d(amupVar.f()) ? amupVar.f().toUpperCase(Locale.getDefault()) : "";
        if (amupVar.e() != null) {
            amupVar.e();
            atlmVar.i(amupVar.c(), upperCase, drawable);
            return;
        }
        String c2 = amupVar.c();
        if (amupVar.a == null) {
            dpdn dpdnVar = dpdn.SIDE_LEFT;
        }
        atlmVar.h(c2, upperCase, drawable);
    }

    static Collection<amup> c(Collection<amup> collection, Set<String> set) {
        if (collection.isEmpty()) {
            return collection;
        }
        HashSet hashSet = new HashSet();
        for (amup amupVar : collection) {
            if (amupVar.e() != null && amupVar.f() != null) {
                hashSet.add(amupVar.e());
            }
        }
        dccx F = dcdc.F();
        for (amup amupVar2 : collection) {
            String e2 = amupVar2.e();
            if (e2 != null) {
                String f2 = amupVar2.f();
                if (f2 != null || !hashSet.contains(e2)) {
                    if (f2 != null) {
                        e2 = f2.length() != 0 ? e2.concat(f2) : new String(e2);
                    }
                    if (set.add(e2)) {
                    }
                }
            }
            String c2 = amupVar2.c();
            if (c2 != null && set.add(c2)) {
                F.g(amupVar2);
            }
        }
        return F.f();
    }

    public static String f(Context context, amvh amvhVar) {
        String p = amvhVar.p();
        return !dbsj.d(p) ? p : context.getString(R.string.DA_POINT_ON_MAP);
    }

    public static atll g(Context context, @dzsi amuo amuoVar, int i) {
        Collection<amup> collection;
        int m;
        boolean z = false;
        int i2 = 0;
        if (amuoVar == null) {
            dccr<amup> dccrVar = g;
            return new atll(dccrVar, dccrVar, 0, 0);
        }
        HashSet hashSet = new HashSet();
        Collection<amup> c2 = c(amuoVar.B, hashSet);
        Collection<amup> arrayList = new ArrayList<>();
        if (amuoVar.c() || amuoVar.d()) {
            if (amuoVar.c()) {
                hashSet.add(amuoVar.u.c());
            }
            if (amuoVar.d()) {
                hashSet.add(amuoVar.v.c());
            }
            arrayList.add(e(context, amuoVar));
        }
        arrayList.addAll(c(amuoVar.z, hashSet));
        Collection<amup> c3 = c(amuoVar.A, hashSet);
        boolean isEmpty = c2.isEmpty();
        boolean isEmpty2 = arrayList.isEmpty();
        boolean z2 = !isEmpty2;
        if (!isEmpty) {
            if (true == isEmpty2) {
                arrayList = c3;
            }
            collection = arrayList;
            arrayList = c2;
        } else if (z2) {
            collection = c3;
        } else {
            collection = arrayList;
            arrayList = c3;
        }
        boolean z3 = arrayList == c3;
        boolean z4 = arrayList == c2;
        boolean z5 = collection == c3;
        if (i == 3) {
            if (!arrayList.isEmpty()) {
                arrayList = dcdc.f(arrayList.iterator().next());
            }
            collection = dcdc.e();
        }
        if (collection.isEmpty()) {
            if (!arrayList.isEmpty()) {
                i2 = m(amuoVar, z3, false, false);
            }
            m = 0;
        } else {
            int m2 = m(amuoVar, false, false, false);
            if (i != 1) {
                z = true;
            }
            m = m(amuoVar, z5, z, z4);
            i2 = m2;
        }
        return new atll(arrayList, collection, i2, m);
    }

    @dzsi
    public static CharSequence h(amve amveVar, Set<dozy> set) {
        if (!amveVar.c() || amveVar.b().j.size() == 0) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (dozz dozzVar : amveVar.b().j) {
            dozy b2 = dozy.b(dozzVar.f);
            if (b2 == null) {
                b2 = dozy.UNKNOWN;
            }
            if (!set.contains(b2)) {
                if (spannableStringBuilder.length() > 0) {
                    spannableStringBuilder.append((CharSequence) " ");
                }
                if ((dozzVar.a & 16) != 0) {
                    spannableStringBuilder.append((CharSequence) dozzVar.g);
                } else if (dozzVar.m.size() > 0) {
                    for (dpce dpceVar : dozzVar.m) {
                        doul doulVar = dpceVar.c;
                        if (doulVar == null) {
                            doulVar = doul.f;
                        }
                        if (!doulVar.b.isEmpty()) {
                            doul doulVar2 = dpceVar.c;
                            if (doulVar2 == null) {
                                doulVar2 = doul.f;
                            }
                            spannableStringBuilder.append((CharSequence) doulVar2.b);
                        }
                    }
                }
            }
        }
        return spannableStringBuilder;
    }

    private static boolean k(amup amupVar) {
        return amupVar.e() != null || amupVar.g();
    }

    private static String l(String str, int i) {
        return str.length() > i ? String.format("%s...", str.substring(0, i)) : str;
    }

    private static int m(amuo amuoVar, boolean z, boolean z2, boolean z3) {
        dgau dgauVar = amuoVar.d;
        if (z) {
            if (dgauVar == dgau.DEPART || z3 || amux.c(dgauVar)) {
                return b;
            }
        } else if (dgauVar == dgau.UTURN) {
            return d;
        } else {
            if (z3) {
                return c;
            }
        }
        if (z2) {
            return e;
        }
        return 0;
    }

    private final HashSet<String> n(int i) {
        Iterable<String> g2 = dbtm.a(',').g(this.a.getString(i));
        HashSet<String> hashSet = new HashSet<>();
        for (String str : g2) {
            hashSet.add(str.trim());
        }
        return hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void b(defpackage.amup r8, boolean r9, @defpackage.dzsi defpackage.amfq r10, defpackage.atlm r11) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atln.b(amup, boolean, amfq, atlm):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.util.Collection<defpackage.amup> r6, int r7, boolean r8, @defpackage.dzsi defpackage.amfq r9, defpackage.atlm r10) {
        /*
            r5 = this;
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L7
            return
        L7:
            android.app.Application r0 = r5.a
            r1 = 2131953074(0x7f1305b2, float:1.9542609E38)
            java.lang.String r0 = r0.getString(r1)
            int r1 = defpackage.atln.e
            r2 = 0
            if (r7 != r1) goto L1a
            r10.g(r0)
        L18:
            r7 = r2
            goto L4f
        L1a:
            int r1 = defpackage.atln.b
            java.lang.String r3 = "{0}"
            if (r7 == r1) goto L2b
            int r1 = defpackage.atln.c
            if (r7 == r1) goto L2b
            int r1 = defpackage.atln.d
            if (r7 != r1) goto L29
            goto L2b
        L29:
            r7 = r3
            goto L35
        L2b:
            android.app.Application r1 = r5.a
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r7 = r1.getString(r7)
        L35:
            int r1 = r7.indexOf(r3)
            int r3 = r1 + 3
            if (r1 <= 0) goto L45
            r4 = 0
            java.lang.String r1 = r7.substring(r4, r1)
            r10.c(r1)
        L45:
            int r1 = r7.length()
            if (r3 >= r1) goto L18
            java.lang.String r7 = r7.substring(r3)
        L4f:
            java.util.Iterator r6 = r6.iterator()
        L53:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L7f
            java.lang.Object r1 = r6.next()
            amup r1 = (defpackage.amup) r1
            if (r2 == 0) goto L7a
            boolean r3 = k(r2)
            if (r3 == 0) goto L6d
            java.lang.String r2 = r2.f()
            if (r2 == 0) goto L75
        L6d:
            boolean r2 = k(r1)
            if (r2 != 0) goto L75
            r2 = r0
            goto L77
        L75:
            java.lang.String r2 = " "
        L77:
            r10.g(r2)
        L7a:
            r5.b(r1, r8, r9, r10)
            r2 = r1
            goto L53
        L7f:
            if (r7 == 0) goto L84
            r10.c(r7)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atln.d(java.util.Collection, int, boolean, amfq, atlm):void");
    }

    public final void i(amup amupVar, boolean z, atlm atlmVar) {
        if (amupVar == null) {
            bvoo.h("The road name step cue for a long step is null", new Object[0]);
        }
        String string = this.a.getResources().getString(R.string.DA_STAY_ON_ROAD_PRIMARY);
        int indexOf = string.indexOf("{0}");
        int i = indexOf + 3;
        if (indexOf > 0) {
            atlmVar.d(string.substring(0, indexOf));
        }
        b(amupVar, z, null, atlmVar);
        if (i < string.length()) {
            atlmVar.d(string.substring(i));
        }
    }

    public final void j(amuo amuoVar, atlm atlmVar) {
        amup e2;
        Drawable h;
        amup b2 = amuoVar.b();
        if (amuoVar.c() || amuoVar.d()) {
            if (b2 == null || amuoVar.b().e() == null) {
                e2 = e(this.a, amuoVar);
            }
            e2 = amuoVar.b();
        } else {
            if (b2 == null) {
                e2 = null;
            }
            e2 = amuoVar.b();
        }
        if (e2 == null || !e2.g()) {
            Maneuvers$Maneuver c2 = vrv.c(amuoVar);
            atli atliVar = (atli) atlmVar;
            if (atliVar.b != null && (h = vrv.h(c2, atliVar.a)) != null) {
                atliVar.j(atliVar.b.e(h, 1.0f), true);
            }
            atlmVar.g(" ");
        }
        if (e2 != null) {
            d(dcdc.f(e2), amuoVar.d == dgau.UTURN ? d : 0, true, null, atlmVar);
        }
    }

    static amup e(Context context, amuo amuoVar) {
        String l;
        dovu dovuVar;
        if (amuoVar.c() && amuoVar.d()) {
            String c2 = amuoVar.v.c();
            String c3 = amuoVar.u.c();
            if (c3.length() + 1 >= 13) {
                l = l(c3, 13);
            } else {
                String l2 = l(c2, 13 - (c3.length() + 1));
                l = bvox.b(context) ? String.format("%s %s", l2, c3) : String.format("%s %s", c3, l2);
            }
        } else if (!amuoVar.c()) {
            l = l(amuoVar.v.c(), 13);
        } else {
            l = l(amuoVar.u.c(), 13);
        }
        dovq bZ = dovv.h.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dovv dovvVar = (dovv) bZ.b;
        l.getClass();
        dovvVar.a = 2 | dovvVar.a;
        dovvVar.c = l;
        if (amuoVar.c()) {
            dovuVar = dovu.TYPE_EXIT_NUMBER;
        } else {
            dovuVar = dovu.TYPE_EXIT_NAME;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dovv dovvVar2 = (dovv) bZ.b;
        dovvVar2.b = dovuVar.o;
        dovvVar2.a |= 1;
        amup a = amup.a(bZ.bK());
        a.a = amuoVar;
        return a;
    }
}
