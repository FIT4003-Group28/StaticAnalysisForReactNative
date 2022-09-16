package defpackage;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: admi  reason: default package */
/* loaded from: classes.dex */
public final class admi {
    public static final String a = zep.a("MDX.promotion");
    public final SharedPreferences b;
    public final snc c;
    public final Map d;
    public final Map e;
    public int f;
    private int g;

    public admi(SharedPreferences sharedPreferences, Set set, int i, snc sncVar) {
        this.b = sharedPreferences;
        sncVar.getClass();
        this.c = sncVar;
        this.d = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            adls adlsVar = (adls) it.next();
            this.d.put(adlsVar.a, adlsVar);
        }
        HashMap hashMap = new HashMap();
        this.e = hashMap;
        ylx.k(anlz.q(Integer.valueOf(this.b.getInt("promotion_counter_ref_id", 0))), anjk.a, adkd.c, new ylw() { // from class: admf
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                final admi admiVar = admi.this;
                admiVar.f = ((Integer) obj).intValue();
                for (final adls adlsVar2 : admiVar.d.values()) {
                    final String e = admi.e(adlsVar2.a);
                    ylx.k(anlz.q(admiVar.b.getString(e, "")), anjk.a, new ylv() { // from class: adme
                        @Override // defpackage.zdt
                        /* renamed from: b */
                        public final void a(Throwable th) {
                            zep.f(admi.a, String.format(Locale.US, "Error while retrieving storage item of type=%s", adls.this.a), th);
                        }
                    }, new ylw() { // from class: admg
                        @Override // defpackage.ylw, defpackage.zdt
                        public final void a(Object obj2) {
                            admi admiVar2 = admi.this;
                            adls adlsVar3 = adlsVar2;
                            String str = e;
                            String str2 = (String) obj2;
                            if (str2.isEmpty()) {
                                return;
                            }
                            try {
                                admh admhVar = new admh(adlsVar3.a, str2);
                                admiVar2.e.put(adlsVar3.a, admhVar);
                                String.format(Locale.US, "loaded promotion item: type=%s value=%s", adlsVar3.a, admhVar);
                            } catch (IllegalArgumentException e2) {
                                String str3 = admi.a;
                                String valueOf = String.valueOf(str);
                                zep.f(str3, valueOf.length() != 0 ? "Failed to load promotion: ".concat(valueOf) : new String("Failed to load promotion: "), e2);
                            }
                        }
                    });
                }
            }
        });
        this.g = i;
        if (this.f < i) {
            String.format(Locale.US, "clearing promotion storage: stored promotion counter ref id %d < %d", Integer.valueOf(this.f), Integer.valueOf(this.g));
            for (admj admjVar : hashMap.keySet()) {
                this.e.put(admjVar, new admh(admjVar));
            }
            ylx.k(a(), anjk.a, adkd.e, ylx.b);
        }
    }

    public static final String e(admj admjVar) {
        String valueOf = String.valueOf(admjVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("notification-type-");
        sb.append(valueOf);
        return sb.toString();
    }

    public final ankt a() {
        SharedPreferences.Editor edit = this.b.edit();
        int i = this.g;
        if (i > this.f) {
            edit.putInt("promotion_counter_ref_id", i);
        }
        for (admh admhVar : this.e.values()) {
            edit.putString(e(admhVar.a), admhVar.toString());
        }
        edit.commit();
        return ankq.a;
    }
}
