package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: afij  reason: default package */
/* loaded from: classes2.dex */
public final class afij {
    public afib a;
    public amvh b;
    public amvh[] c = new amvh[0];
    public amvf[] d = new amvf[0];
    public String e;
    public Integer f;
    public dpjs g;
    @dzsi
    public dspd h;
    @dzsi
    public dspd i;
    public afhv j;
    public afht k;
    private final String l;

    public afij(String str) {
        this.l = str.replace("+", "%20");
    }

    private static boolean b(Uri uri, String str) {
        return "true".equals(uri.getQueryParameter(str));
    }

    @dzsi
    private static dpjs c(Uri uri) {
        String queryParameter = uri.getQueryParameter("place");
        if (queryParameter == null) {
            return null;
        }
        if (dbqa.e(queryParameter, "home")) {
            return dpjs.ENTITY_TYPE_HOME;
        }
        if (!dbqa.e(queryParameter, "work")) {
            return null;
        }
        return dpjs.ENTITY_TYPE_WORK;
    }

    private static List<String> d(Uri uri) {
        return uri.getQueryParameters("title");
    }

    private static List<String> e(Uri uri) {
        return uri.getQueryParameters("q");
    }

    private static String f(Uri uri) {
        return uri.getQueryParameter("waypoints");
    }

    @dzsi
    private static String g(Uri uri, String str, String str2) {
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter != null) {
            return queryParameter;
        }
        String queryParameter2 = uri.getQueryParameter(str2);
        if (queryParameter2 != null) {
            try {
                return afhi.l(akqi.b(queryParameter2));
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    private static List<String> h(Uri uri) {
        return uri.getQueryParameters("token");
    }

    private static List<String> i(Uri uri) {
        return uri.getQueryParameters("ll");
    }

    private static boolean j(String str) {
        return str == null || str.equals("");
    }

    private static boolean l(@dzsi dpjs dpjsVar) {
        return dpjsVar == dpjs.ENTITY_TYPE_HOME || dpjsVar == dpjs.ENTITY_TYPE_WORK;
    }

    public final boolean a() {
        Uri parse;
        afhv afhvVar;
        afht g;
        dqvj dqvjVar;
        Integer num;
        amvh[] amvhVarArr;
        amvf[] amvfVarArr;
        dpjs dpjsVar;
        if (!this.l.startsWith("google.navigation:")) {
            return false;
        }
        String str = this.l;
        String substring = str.substring(18);
        if (substring.startsWith("?")) {
            parse = Uri.parse(substring);
        } else if (substring.contains("?")) {
            parse = Uri.parse(str);
            if (!parse.isHierarchical()) {
                String valueOf = String.valueOf(substring.replace("?", "%3F"));
                parse = Uri.parse(valueOf.length() != 0 ? "/?".concat(valueOf) : new String("/?"));
            }
        } else {
            String valueOf2 = String.valueOf(substring);
            parse = Uri.parse(valueOf2.length() != 0 ? "/?".concat(valueOf2) : new String("/?"));
        }
        if (!parse.isHierarchical()) {
            return false;
        }
        if (!b(parse, "quitquitquit")) {
            b(parse, "sync_layers");
            if (!b(parse, "resume")) {
                String queryParameter = parse.getQueryParameter("free");
                this.a = (queryParameter != null && queryParameter.equals("1")) ? afib.FNAV : afib.DIRECTIONS;
                String queryParameter2 = parse.getQueryParameter("target");
                if (queryParameter2 == null) {
                    afhvVar = afhv.NAVIGATION;
                } else if (queryParameter2.equals("d")) {
                    afhvVar = afhv.MAP_VIEW;
                } else if (queryParameter2.equals("c")) {
                    afhvVar = afhv.DEFAULT;
                } else {
                    afhvVar = afhv.NAVIGATION;
                }
                this.j = afhvVar;
                afht g2 = afhi.g(parse.getQueryParameter("mode"));
                if (TextUtils.isEmpty(parse.getQueryParameter("avoid"))) {
                    g = new afht(dqvj.DRIVE, false, dcmr.a);
                } else {
                    String queryParameter3 = parse.getQueryParameter("avoid");
                    StringBuilder sb = new StringBuilder(String.valueOf(queryParameter3).length() + 1);
                    sb.append('d');
                    sb.append(queryParameter3);
                    g = afhi.g(sb.toString());
                }
                if (g2 == null) {
                    dqvjVar = dqvj.DRIVE;
                } else {
                    dqvjVar = g2.a;
                }
                this.k = new afht(dqvjVar, false, g.b);
                this.e = parse.getQueryParameter("entry");
                ArrayList arrayList = null;
                try {
                    num = Integer.valueOf(Integer.parseInt(parse.getQueryParameter("index")));
                } catch (NumberFormatException unused) {
                    num = null;
                }
                this.f = num;
                dpjs c = c(parse);
                this.g = c;
                if (c == null) {
                    String queryParameter4 = parse.getQueryParameter("et");
                    if (queryParameter4 != null) {
                        if (queryParameter4.equals("eth")) {
                            dpjsVar = dpjs.ENTITY_TYPE_HOME;
                        } else if (queryParameter4.equals("etw")) {
                            dpjsVar = dpjs.ENTITY_TYPE_WORK;
                        }
                        this.g = dpjsVar;
                    }
                    dpjsVar = null;
                    this.g = dpjsVar;
                }
                List<String> e = e(parse);
                List<String> i = i(parse);
                List<String> d = d(parse);
                List<String> h = h(parse);
                String f = f(parse);
                if (e.size() <= 1 && i.size() <= 1 && d.size() <= 1 && h.size() <= 1 && (e.isEmpty() || f == null)) {
                    amvh k = k(parse.getQueryParameter("q"), parse.getQueryParameter("ll"), c(parse), parse.getQueryParameter("title"), g(parse, "token", "ftid"));
                    this.c = k != null ? new amvh[]{k} : new amvh[0];
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    List<String> e2 = e(parse);
                    List<String> i2 = i(parse);
                    List<String> d2 = d(parse);
                    List<String> h2 = h(parse);
                    String f2 = f(parse);
                    if (e2.isEmpty() || TextUtils.isEmpty(f2)) {
                        if (e2.size() == i2.size() && e2.size() == d2.size() && e2.size() == h2.size()) {
                            int i3 = 0;
                            while (true) {
                                if (i3 < e2.size()) {
                                    amvh k2 = k(e2.get(i3), i2.get(i3), null, d2.get(i3), h2.get(i3));
                                    if (k2 == null) {
                                        amvhVarArr = new amvh[0];
                                        break;
                                    }
                                    arrayList2.add(k2);
                                    i3++;
                                } else {
                                    amvhVarArr = (amvh[]) arrayList2.toArray(new amvh[arrayList2.size()]);
                                    break;
                                }
                            }
                        } else {
                            amvhVarArr = new amvh[0];
                        }
                    } else {
                        String str2 = e2.get(0);
                        String[] split = f2.split("\\|", -1);
                        ArrayList arrayList3 = new ArrayList();
                        int i4 = 0;
                        while (true) {
                            if (i4 < split.length) {
                                amvh k3 = k(split[i4], "", null, "", "");
                                if (k3 == null) {
                                    amvhVarArr = new amvh[0];
                                    break;
                                }
                                arrayList3.add(k3);
                                i4++;
                            } else {
                                arrayList3.add(k(str2, "", null, "", ""));
                                amvhVarArr = (amvh[]) arrayList3.toArray(new amvh[arrayList3.size()]);
                                break;
                            }
                        }
                    }
                    this.c = amvhVarArr;
                }
                ArrayList arrayList4 = new ArrayList();
                List<String> queryParameters = parse.getQueryParameters("via");
                int i5 = 0;
                while (true) {
                    if (i5 < queryParameters.size()) {
                        ArrayList<akql> arrayList5 = new ArrayList();
                        String[] split2 = queryParameters.get(i5).replace("(", "").replace(")", "").split(",");
                        if ((split2.length & 1) != 0) {
                            arrayList5 = arrayList;
                        } else {
                            for (int i6 = 0; i6 < split2.length; i6 += 2) {
                                try {
                                    arrayList5.add(new akql(akqg.c(Double.parseDouble(split2[i6])), akqg.c(Double.parseDouble(split2[i6 + 1]))));
                                } catch (NumberFormatException unused2) {
                                    arrayList5 = null;
                                }
                            }
                        }
                        if (arrayList5 == null) {
                            amvfVarArr = new amvf[0];
                            break;
                        }
                        for (akql akqlVar : arrayList5) {
                            arrayList4.add(amvf.d(akra.g(akqlVar).S(), i5));
                        }
                        i5++;
                        arrayList = null;
                    } else {
                        amvfVarArr = (amvf[]) arrayList4.toArray(new amvf[arrayList4.size()]);
                        break;
                    }
                }
                this.d = amvfVarArr;
                parse.getQueryParameter("r");
                String queryParameter5 = parse.getQueryParameter("rr");
                this.h = queryParameter5 != null ? dspd.x(Base64.decode(queryParameter5, 0)) : null;
                String queryParameter6 = parse.getQueryParameter("tu");
                this.i = queryParameter6 != null ? dspd.x(Base64.decode(queryParameter6, 0)) : null;
                this.b = k(parse.getQueryParameter("s"), parse.getQueryParameter("sll"), this.g, parse.getQueryParameter("stitle"), g(parse, "stoken", "sftid"));
                if (b(parse, "sr") && this.b == null) {
                    return false;
                }
                if (this.c.length == 0 && this.a != afib.FNAV) {
                    return false;
                }
                if (b(parse, "goff") && (this.c.length == 0 || this.b == null)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static defpackage.amvh k(java.lang.String r6, java.lang.String r7, @defpackage.dzsi defpackage.dpjs r8, java.lang.String r9, java.lang.String r10) {
        /*
            r0 = 0
            r1 = 0
            if (r7 != 0) goto L6
        L4:
            r7 = r1
            goto L2c
        L6:
            java.lang.String r2 = ","
            java.lang.String[] r7 = r7.split(r2)
            if (r7 == 0) goto L4
            int r2 = r7.length
            r3 = 2
            if (r2 < r3) goto L4
            r2 = r7[r0]     // Catch: java.lang.NumberFormatException -> L4
            double r2 = java.lang.Double.parseDouble(r2)     // Catch: java.lang.NumberFormatException -> L4
            r4 = 1
            r7 = r7[r4]     // Catch: java.lang.NumberFormatException -> L4
            double r4 = java.lang.Double.parseDouble(r7)     // Catch: java.lang.NumberFormatException -> L4
            akql r7 = new akql     // Catch: java.lang.NumberFormatException -> L4
            int r2 = defpackage.akqg.c(r2)     // Catch: java.lang.NumberFormatException -> L4
            int r3 = defpackage.akqg.c(r4)     // Catch: java.lang.NumberFormatException -> L4
            r7.<init>(r2, r3)     // Catch: java.lang.NumberFormatException -> L4
        L2c:
            boolean r2 = j(r6)
            if (r2 == 0) goto L3c
            if (r7 != 0) goto L3c
            boolean r2 = l(r8)
            if (r2 == 0) goto L3b
            goto L3c
        L3b:
            return r1
        L3c:
            boolean r2 = j(r6)
            if (r2 != 0) goto L4c
            if (r7 == 0) goto L4c
            boolean r2 = j(r9)
            if (r2 == 0) goto L4c
            r9 = r6
            r6 = r1
        L4c:
            amvg r1 = new amvg
            r1.<init>()
            if (r7 == 0) goto L5a
            akra r7 = defpackage.akra.g(r7)
            r1.d(r7)
        L5a:
            boolean r7 = j(r6)
            if (r7 != 0) goto L62
            r1.b = r6
        L62:
            boolean r7 = j(r9)
            if (r7 != 0) goto L6b
            r1.j = r9
            goto L75
        L6b:
            boolean r7 = j(r6)
            if (r7 != 0) goto L73
            r1.j = r6
        L73:
            r1.k = r0
        L75:
            boolean r6 = j(r10)
            if (r6 != 0) goto L7e
            defpackage.afhi.e(r10, r1)
        L7e:
            boolean r6 = l(r8)
            if (r6 == 0) goto L8a
            java.lang.String r6 = ""
            r1.b = r6
            r1.a = r8
        L8a:
            amvh r6 = r1.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afij.k(java.lang.String, java.lang.String, dpjs, java.lang.String, java.lang.String):amvh");
    }
}
