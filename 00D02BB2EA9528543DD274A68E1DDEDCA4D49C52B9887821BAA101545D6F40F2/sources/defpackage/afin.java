package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.gmm.streetview.model.UserOrientation;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: afin  reason: default package */
/* loaded from: classes.dex */
public final class afin implements afip {
    private static final Pattern a = Pattern.compile("^(http|https)$");
    private static final Pattern b = Pattern.compile("^(maps|local|ditu)\\.google\\..+$");
    private static final Pattern c = Pattern.compile("^/maps/share/.+$");
    private static final dcdc<String> d = dcdc.i("h", "k", "w", "p");

    @Override // defpackage.afip
    public final boolean a(Intent intent) {
        Uri data = intent.getData();
        if (data == null) {
            return false;
        }
        String scheme = data.getScheme();
        String authority = data.getAuthority();
        if (!dbsj.d(scheme) && !dbsj.d(authority)) {
            Matcher matcher = a.matcher(scheme);
            Matcher matcher2 = b.matcher(authority);
            c.matcher(dbsj.e(data.getPath()));
            if (matcher.matches() && matcher2.matches()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.afip
    public final afia b(Intent intent, @dzsi String str) {
        String str2;
        String str3;
        Boolean valueOf;
        String str4;
        akqq akqqVar;
        Boolean bool;
        Boolean bool2;
        boolean booleanValue;
        String str5;
        String str6;
        afie afieVar;
        akqi akqiVar;
        akqq akqqVar2;
        dggg dgggVar;
        String str7;
        afie afieVar2;
        amvh amvhVar;
        aeui aeuiVar;
        bbus bbusVar;
        dbsk.l(a(intent));
        Uri data = intent.getData();
        Bundle extras = intent.getExtras();
        String encodedQuery = data.getEncodedQuery();
        if (encodedQuery == null) {
            return afia.R;
        }
        afio afioVar = new afio();
        afioVar.parseQuery(encodedQuery);
        String value = afioVar.getValue("q");
        afhh f = afhi.f(value);
        if (f != null) {
            value = f.a();
            str2 = f.a;
        } else {
            str2 = null;
        }
        String value2 = afioVar.getValue("hq");
        String value3 = afioVar.getValue("hnear");
        akqq a2 = afhi.a(afioVar, "sll");
        akqq a3 = afhi.a(afioVar, "ll");
        akqq m = afhi.m(afioVar, "spn");
        akqq m2 = afhi.m(afioVar, "sspn");
        Float r = afhi.r(afioVar);
        String[] j = afhi.j(afioVar, "geocode", ";");
        amvh t = afhi.t(afioVar, j != null ? j[0] : null);
        int i = t == null ? 0 : 1;
        amvh[] u = afhi.u(afioVar);
        Boolean c2 = afhi.c(afioVar, "notts");
        boolean z = c2 == null || !c2.booleanValue();
        if (j != null) {
            str3 = str2;
            int length = j.length;
            if (length > i) {
                u = afhi.d(u, (String[]) Arrays.copyOfRange(j, i, length));
            }
        } else {
            str3 = str2;
        }
        afie s = afhi.s(afioVar);
        String value4 = afioVar.getValue("layer");
        if (dbsj.d(value4)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(value4.indexOf("t") >= 0);
        }
        String value5 = afioVar.getValue("t");
        if (value5 != null) {
            boolean z2 = false;
            dcdc<String> dcdcVar = d;
            akqqVar = a2;
            int size = dcdcVar.size();
            str4 = value3;
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                int i3 = size;
                String str8 = dcdcVar.get(i2);
                i2++;
                if (value5.indexOf(str8) < 0) {
                    size = i3;
                } else if (str8.equals("p")) {
                    bool2 = true;
                    bool = false;
                } else {
                    z2 = true;
                }
            }
            bool = z2;
        } else {
            str4 = value3;
            akqqVar = a2;
            bool = null;
        }
        bool2 = null;
        boolean equals = "list".equals(afioVar.getValue("gmmview"));
        Boolean c3 = afhi.c(afioVar, "nav");
        if (c3 == null) {
            str5 = value2;
            booleanValue = false;
        } else {
            booleanValue = c3.booleanValue();
            str5 = value2;
        }
        afht p = afhi.p(afioVar);
        akqi k = afhi.k(afioVar, "ftid");
        if (k == null) {
            k = afhi.k(afioVar, "cid");
        }
        akqq a4 = afhi.a(afioVar, "cbll");
        boolean z3 = booleanValue;
        if (afioVar.hasParameter("panoid")) {
            dgge w = afhi.w(afioVar);
            if (w == null) {
                w = dgge.IMAGE_ALLEYCAT;
            }
            str6 = value;
            dgge dggeVar = w;
            akqiVar = k;
            dggf bZ = dggg.d.bZ();
            String value6 = afioVar.getValue("panoid");
            akqqVar2 = a4;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dggg dgggVar2 = (dggg) bZ.b;
            value6.getClass();
            afieVar = s;
            int i4 = dgggVar2.a | 2;
            dgggVar2.a = i4;
            dgggVar2.c = value6;
            dgggVar2.b = dggeVar.l;
            dgggVar2.a = 1 | i4;
            dgggVar = bZ.bK();
        } else {
            str6 = value;
            afieVar = s;
            akqiVar = k;
            akqqVar2 = a4;
            dgggVar = null;
        }
        UserOrientation v = afhi.v(afioVar);
        ddjr q = afhi.q(afioVar);
        String value7 = afioVar.getValue("ptp");
        afhz e = afia.e();
        e.h = r;
        e.f = a3;
        e.u = m;
        e.p = valueOf;
        e.q = bool;
        e.r = bool2;
        e.z = q;
        e.G = str;
        e.b(Boolean.valueOf(z));
        if (extras != null) {
            if (dbsj.d(str)) {
                String string = extras.getString("referer");
                if (!dbsj.d(string)) {
                    e.G = string;
                }
            }
            ArrayList parcelableArrayList = extras.getParcelableArrayList("multiple_streams");
            if (parcelableArrayList != null) {
                e.I = parcelableArrayList;
            }
            Uri uri = (Uri) extras.getParcelable("android.intent.extra.STREAM");
            if (uri != null) {
                e.H = uri;
            }
            e.N = extras.getBoolean("GMM_ENABLE_ONE_BACK_TAP", false);
            String string2 = extras.getString("photo_notification_debug");
            if (string2 != null) {
                e.K = string2;
            }
            Serializable serializable = extras.getSerializable("iAmHereState");
            if (serializable instanceof aeui) {
                aeuiVar = (aeui) serializable;
            } else {
                aeuiVar = aeui.b;
            }
            e.M = aeuiVar;
            int i5 = extras.getInt("photoPlaceDisambiguationUiOption", bbus.SHOW_ON_CLICK.d);
            bbus[] values = bbus.values();
            int length2 = values.length;
            str7 = value7;
            int i6 = 0;
            while (true) {
                if (i6 >= length2) {
                    bbusVar = bbus.DISABLE;
                    break;
                }
                int i7 = length2;
                bbusVar = values[i6];
                bbus[] bbusVarArr = values;
                if (i5 == bbusVar.d) {
                    break;
                }
                i6++;
                values = bbusVarArr;
                length2 = i7;
            }
            e.L = bbusVar;
            e.J = dwyd.b(extras.getInt("upload_entry_point", dwyd.UNKNOWN_ENTRY_POINT.Z));
            e.R = csct.a(extras);
        } else {
            str7 = value7;
        }
        e.F = afhi.o(afioVar.getValue("gmm"));
        if (u.length > 0 || t != null) {
            afieVar2 = afieVar;
            amvhVar = t;
        } else {
            afieVar2 = afieVar;
            if (afieVar2 != afie.SOURCE) {
                if (dgggVar != null || akqqVar2 != null) {
                    e.a = afib.STREET_VIEW;
                    e.w = akqqVar2;
                    e.x = dgggVar;
                    e.y = v;
                    e.b = str6;
                    return e.a();
                } else if (akqi.d(akqiVar)) {
                    e.a = afib.PLACE;
                    e.t = akqiVar;
                    e.b = str6;
                    return e.a();
                } else {
                    String str9 = str6;
                    if (str9 == null) {
                        if (a3 == null && m == null && r == null && valueOf == null && bool == null) {
                            return afia.R;
                        }
                        e.a = afib.MAP_ONLY;
                        return e.a();
                    }
                    if (z3) {
                        e.s = afhv.NAVIGATION;
                    }
                    e.a = equals ? afib.SEARCH_LIST : afib.SEARCH;
                    e.b = str9;
                    e.c = str5;
                    e.d = str4;
                    e.g = akqqVar;
                    e.v = m2;
                    e.e = str3;
                    return e.a();
                }
            }
            amvhVar = null;
        }
        if (z3) {
            e.s = afhv.NAVIGATION;
        }
        e.a = afib.DIRECTIONS;
        e.i = amvhVar;
        e.j = u;
        e.o = p;
        e.n = afieVar2;
        e.C = str7;
        return e.a();
    }
}
