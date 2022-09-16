package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;
/* compiled from: PG */
/* renamed from: xec  reason: default package */
/* loaded from: classes4.dex */
public final class xec {
    public final snc a;
    public final apap b;
    public long c;
    private final TimeZone d;
    private long e;
    private List f;
    private boolean g;

    public xec(apap apapVar, snc sncVar) {
        TimeZone timeZone = TimeZone.getDefault();
        this.b = apapVar;
        sncVar.getClass();
        this.a = sncVar;
        timeZone.getClass();
        this.d = timeZone;
    }

    public final List a(String str, String str2, aaln aalnVar, String str3, List list, Uri uri) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(new AbstractMap.SimpleEntry("p", str2));
        }
        String valueOf = String.valueOf(str);
        arrayList.add(new AbstractMap.SimpleEntry(valueOf.length() != 0 ? "m.d-".concat(valueOf) : new String("m.d-"), Long.toString(this.e - this.c)));
        arrayList.add(new AbstractMap.SimpleEntry("m.v", "2"));
        long j = this.e;
        long offset = j + this.d.getOffset(j);
        String valueOf2 = String.valueOf(str);
        arrayList.add(new AbstractMap.SimpleEntry(valueOf2.length() != 0 ? "m.lt-".concat(valueOf2) : new String("m.lt-"), Long.toString(almu.v(offset / 1000))));
        if ((aalnVar == aaln.MULTI_SELECT || aalnVar == aaln.SINGLE_ANSWERS) && !TextUtils.isEmpty(str3)) {
            String valueOf3 = String.valueOf(str);
            arrayList.add(new AbstractMap.SimpleEntry(valueOf3.length() != 0 ? "r.o-".concat(valueOf3) : new String("r.o-"), str3));
        }
        if (this.f != null) {
            arrayList.add(new AbstractMap.SimpleEntry("t", "a"));
            for (Integer num : this.f) {
                int intValue = num.intValue();
                String valueOf4 = String.valueOf(str);
                arrayList.add(new AbstractMap.SimpleEntry(valueOf4.length() != 0 ? "r.r-".concat(valueOf4) : new String("r.r-"), (String) list.get(intValue)));
            }
        } else {
            if (this.g) {
                String valueOf5 = String.valueOf(str);
                arrayList.add(new AbstractMap.SimpleEntry(valueOf5.length() != 0 ? "m.f-".concat(valueOf5) : new String("m.f-"), "1"));
            }
            if (uri.getQueryParameter("t") == null || !uri.getQueryParameter("t").equals("a")) {
                arrayList.add(new AbstractMap.SimpleEntry("t", "nr"));
            } else {
                arrayList.add(new AbstractMap.SimpleEntry("t", "pa"));
            }
        }
        return arrayList;
    }

    public final List b(aval avalVar) {
        Uri uri;
        ArrayList arrayList = new ArrayList();
        for (apae apaeVar : avalVar.b) {
            try {
                uri = zgt.i(apaeVar.c);
            } catch (MalformedURLException unused) {
                zep.l("Badly formed uri - ignoring");
                uri = null;
            }
            Uri uri2 = uri;
            if (uri2 != null) {
                arrayList.add(new AbstractMap.SimpleEntry(apaeVar, a("0", "", aaln.MULTI_SELECT, "", avalVar.c, uri2)));
            }
        }
        return arrayList;
    }

    public final void c() {
        this.e = this.a.c();
        this.f = null;
    }

    public final void d(List list) {
        this.e = this.a.c();
        this.f = Collections.unmodifiableList(list);
    }

    public final void e() {
        this.g = true;
    }
}
