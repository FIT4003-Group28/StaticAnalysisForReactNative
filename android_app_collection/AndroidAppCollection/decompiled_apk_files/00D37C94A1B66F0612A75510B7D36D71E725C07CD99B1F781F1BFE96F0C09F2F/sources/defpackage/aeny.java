package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aeny  reason: default package */
/* loaded from: classes.dex */
public final class aeny {
    static {
        ampm.b(",");
    }

    public static Uri a(Uri uri) {
        return uri.buildUpon().appendQueryParameter("cmo", "td=a1.googlevideo.com").build();
    }

    public static aryz b(arzb arzbVar, aenb aenbVar, String str) {
        aemz a = aenbVar.a(arzbVar.toByteArray());
        aopa createBuilder = aryz.a.createBuilder();
        createBuilder.copyOnWrite();
        aryz aryzVar = (aryz) createBuilder.instance;
        str.getClass();
        aryzVar.b |= 64;
        aryzVar.i = str;
        aopa createBuilder2 = aroy.a.createBuilder();
        aopa createBuilder3 = arow.a.createBuilder();
        createBuilder3.copyOnWrite();
        arow arowVar = (arow) createBuilder3.instance;
        arowVar.b |= 1048576;
        arowVar.l = "0";
        arov arovVar = arov.ANDROID;
        createBuilder3.copyOnWrite();
        arow arowVar2 = (arow) createBuilder3.instance;
        arowVar2.p = arovVar.ay;
        arowVar2.b |= 16777216;
        createBuilder3.copyOnWrite();
        arow arowVar3 = (arow) createBuilder3.instance;
        arowVar3.b |= 67108864;
        arowVar3.r = "10.29";
        createBuilder3.copyOnWrite();
        arow arowVar4 = (arow) createBuilder3.instance;
        arowVar4.b |= 1;
        arowVar4.e = "zz";
        createBuilder3.copyOnWrite();
        arow arowVar5 = (arow) createBuilder3.instance;
        arowVar5.b |= 8;
        arowVar5.h = "ZZ";
        createBuilder2.copyOnWrite();
        aroy aroyVar = (aroy) createBuilder2.instance;
        arow arowVar6 = (arow) createBuilder3.mo39build();
        arowVar6.getClass();
        aroyVar.c = arowVar6;
        aroyVar.b |= 1;
        aroy aroyVar2 = (aroy) createBuilder2.mo39build();
        createBuilder.copyOnWrite();
        aryz aryzVar2 = (aryz) createBuilder.instance;
        aroyVar2.getClass();
        aryzVar2.c = aroyVar2;
        aryzVar2.b |= 1;
        aoob aoobVar = a.a;
        createBuilder.copyOnWrite();
        aryz aryzVar3 = (aryz) createBuilder.instance;
        aryzVar3.b |= 2;
        aryzVar3.d = aoobVar;
        aoob aoobVar2 = a.b;
        createBuilder.copyOnWrite();
        aryz aryzVar4 = (aryz) createBuilder.instance;
        aryzVar4.b |= 8;
        aryzVar4.f = aoobVar2;
        aoob aoobVar3 = a.c;
        createBuilder.copyOnWrite();
        aryz aryzVar5 = (aryz) createBuilder.instance;
        aryzVar5.b |= 4;
        aryzVar5.e = aoobVar3;
        aoob aoobVar4 = a.d;
        createBuilder.copyOnWrite();
        aryz aryzVar6 = (aryz) createBuilder.instance;
        aryzVar6.b |= 16;
        aryzVar6.g = aoobVar4;
        createBuilder.copyOnWrite();
        aryz aryzVar7 = (aryz) createBuilder.instance;
        aryzVar7.b |= 32;
        aryzVar7.h = true;
        return (aryz) createBuilder.mo39build();
    }

    public static String c(String str) {
        zgh.m(str);
        aneg anegVar = aneg.e;
        amox amoxVar = amox.b;
        String charSequence = str.toString();
        int c = amoxVar.c(charSequence, 0);
        if (c != -1) {
            char[] charArray = charSequence.toCharArray();
            int i = 1;
            loop0: while (true) {
                c++;
                while (c != charArray.length) {
                    if (amoxVar.b(charArray[c])) {
                        break;
                    }
                    charArray[c - i] = charArray[c];
                    c++;
                }
                i++;
            }
            charSequence = new String(charArray, 0, c - i);
        }
        byte[] j = anegVar.j(charSequence);
        StringBuilder sb = new StringBuilder();
        int length = j.length;
        for (int i2 = 0; i2 < length; i2++) {
            sb.append(String.format("%02x", Byte.valueOf(j[i2])));
        }
        return sb.toString();
    }

    public static String d(zgp zgpVar, aenx aenxVar, List list) {
        zgpVar.g("por", "yes");
        int i = aenxVar.b;
        if (i > 0) {
            zgpVar.g("ohrtt", Integer.toString(i));
        }
        f(list, aenxVar.c, zgpVar);
        return aenxVar.a;
    }

    public static String e(String str) {
        return (!str.equals("redirector.googlevideo.com") && str.endsWith(".googlevideo.com") && !str.endsWith(".a1.googlevideo.com")) ? str.replaceFirst(".googlevideo.com", ".a1.googlevideo.com") : str;
    }

    public static void f(List list, Uri uri, zgp zgpVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String queryParameter = uri == null ? null : uri.getQueryParameter(str);
            if (queryParameter == null) {
                zgpVar.j(str);
            } else {
                zgpVar.g(str, queryParameter);
            }
        }
    }

    public static void g(String str) {
        j(str, new Exception());
    }

    public static arza[] h(Map map, String str) {
        arza[] arzaVarArr = new arza[map.size() + 1];
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            aopa createBuilder = arza.a.createBuilder();
            String str2 = (String) entry.getKey();
            createBuilder.copyOnWrite();
            arza arzaVar = (arza) createBuilder.instance;
            str2.getClass();
            arzaVar.b |= 1;
            arzaVar.c = str2;
            String str3 = (String) entry.getValue();
            createBuilder.copyOnWrite();
            arza arzaVar2 = (arza) createBuilder.instance;
            str3.getClass();
            arzaVar2.b |= 2;
            arzaVar2.d = str3;
            arzaVarArr[i] = (arza) createBuilder.mo39build();
            i++;
        }
        aopa createBuilder2 = arza.a.createBuilder();
        createBuilder2.copyOnWrite();
        arza arzaVar3 = (arza) createBuilder2.instance;
        arzaVar3.b |= 1;
        arzaVar3.c = "User-Agent";
        String concat = String.valueOf(str).concat(" gzip");
        createBuilder2.copyOnWrite();
        arza arzaVar4 = (arza) createBuilder2.instance;
        concat.getClass();
        arzaVar4.b |= 2;
        arzaVar4.d = concat;
        arzaVarArr[i] = (arza) createBuilder2.mo39build();
        return arzaVarArr;
    }

    public static aenc i(aadd aaddVar, aacz aaczVar, snc sncVar) {
        aaqd aaqdVar = (aaqd) aaddVar.c;
        long j = aaqdVar.i() ? aaqdVar.h.b : aaqdVar.g;
        long c = sncVar.c() - j;
        atdy atdyVar = aaddVar.a().i;
        if (atdyVar == null) {
            atdyVar = atdy.a;
        }
        attv attvVar = atdyVar.d;
        if (attvVar == null) {
            attvVar = attv.a;
        }
        if ((attvVar.b & 1) != 0) {
            attv attvVar2 = atdyVar.d;
            if (attvVar2 == null) {
                attvVar2 = attv.a;
            }
            if ((attvVar2.b & 2) != 0) {
                attv attvVar3 = atdyVar.d;
                if (attvVar3 == null) {
                    attvVar3 = attv.a;
                }
                if (attvVar3.e > 0) {
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    attv attvVar4 = atdyVar.d;
                    if (attvVar4 == null) {
                        attvVar4 = attv.a;
                    }
                    long millis = timeUnit.toMillis(attvVar4.e);
                    if (j < 0 || c >= millis) {
                        throw new aenw(2);
                    }
                    attv attvVar5 = atdyVar.d;
                    if (attvVar5 == null) {
                        attvVar5 = attv.a;
                    }
                    byte[] I = attvVar5.c.I();
                    attv attvVar6 = atdyVar.d;
                    if (attvVar6 == null) {
                        attvVar6 = attv.a;
                    }
                    return new aenc(I, attvVar6.d.I());
                }
            }
        }
        atfw atfwVar = aaczVar.b().k;
        if (atfwVar == null) {
            atfwVar = atfw.a;
        }
        aaczVar.c();
        aaqd aaqdVar2 = (aaqd) aaczVar.a;
        long j2 = aaqdVar2.i() ? aaqdVar2.i.c : aaqdVar2.f;
        if (j2 == -1) {
            j2 = Long.MAX_VALUE;
        }
        long convert = TimeUnit.SECONDS.convert(sncVar.c() - j2, TimeUnit.MILLISECONDS);
        if ((atfwVar.b & 1073741824) != 0) {
            atts attsVar = atfwVar.s;
            if (attsVar == null) {
                attsVar = atts.b;
            }
            if (convert < 0 || convert > attsVar.f) {
                throw new aenw(2);
            }
            return new aenc(attsVar.d.I(), attsVar.e.I());
        }
        throw new aenw(1);
    }

    public static void j(String str, Exception exc) {
        String format = String.format(Locale.ENGLISH, "%.2f", Double.valueOf(0.01d));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 16 + String.valueOf(format).length());
        sb.append(str);
        sb.append(" [sample rate: ");
        sb.append(format);
        sb.append("]");
        afus.d(1, 8, sb.toString(), exc, 0.01d);
        afkj.c(afki.ONESIE, exc, "Warning message: %s", str);
    }

    public static List k(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FormatStreamModel formatStreamModel = (FormatStreamModel) it.next();
            Uri uri = formatStreamModel.d;
            if (uri != null && !TextUtils.isEmpty(uri.getHost())) {
                arrayList.add(uri.toString());
            } else {
                String str = true != TextUtils.isEmpty(formatStreamModel.a.e) ? "url is not empty" : "url is empty";
                int e = formatStreamModel.e();
                StringBuilder sb = new StringBuilder(str.length() + 35);
                sb.append("Invalid URL for itag ");
                sb.append(e);
                sb.append(" : ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return arrayList;
    }
}
