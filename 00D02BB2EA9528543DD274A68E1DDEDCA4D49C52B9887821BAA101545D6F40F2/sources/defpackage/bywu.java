package defpackage;

import android.app.Application;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bywu  reason: default package */
/* loaded from: classes4.dex */
public final class bywu {
    public static final /* synthetic */ int b = 0;
    private static final dcdn<dlju, Integer> c;
    public final Application a;

    static {
        dcdg p = dcdn.p();
        p.f(dlju.SEVERITY_UNKNOWN, 0);
        p.f(dlju.SEVERITY_INFORMATION, 1);
        p.f(dlju.SEVERITY_WARNING, 2);
        p.f(dlju.SEVERITY_CRITICAL, 3);
        c = p.b();
    }

    public bywu(Application application) {
        this.a = application;
    }

    public static dbsl<dlkn> a(final long j) {
        return new dbsl(j) { // from class: bywn
            private final long a;

            {
                this.a = j;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                long j2 = this.a;
                int i = bywu.b;
                return ((dlkn) obj).b > j2;
            }
        };
    }

    public static Integer b(dlju dljuVar) {
        return (Integer) dbsg.j(c.get(dljuVar)).c(0);
    }

    public static String e(dljv dljvVar) {
        return dljvVar.d.isEmpty() ? dljvVar.e : dljvVar.d;
    }

    public static String f(dljv dljvVar) {
        if (!dljvVar.d.isEmpty()) {
            if (dljvVar.e.isEmpty()) {
                return dljvVar.d;
            }
            String str = dljvVar.d;
            String str2 = dljvVar.e;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
            sb.append(str);
            sb.append("\n");
            sb.append(str2);
            return sb.toString();
        }
        return dljvVar.e;
    }

    public final String c(String str, String str2) {
        return str2.isEmpty() ? str : this.a.getString(R.string.DISRUPTION_HEADLINE_AND_TEXT, new Object[]{str, str2});
    }

    public final String d(String str, Iterable<bywt> iterable, String str2) {
        return this.a.getString(R.string.DISRUPTION_HEADLINE_LINES_AND_TEXT, new Object[]{str, dbrz.e(this.a.getString(R.string.TRANSIT_LINE_DELIMITER)).g(dcbg.b(iterable).s(bywf.a)), str2}).trim();
    }

    public final byxs g(String str, String str2, dcdc<String> dcdcVar, int i) {
        byxr m = byxs.m();
        m.c(str);
        m.b(str2);
        m.m(str, dcdcVar);
        m.h(this.a.getString(R.string.DISRUPTION_NOTIFICATION_HEADER));
        if (dcdcVar.size() > 5) {
            dcdc<String> subList = dcdcVar.subList(0, 5);
            String string = this.a.getResources().getString(R.string.DISRUPTION_NOTIFICATION_MORE_ALERTS);
            ie ieVar = new ie();
            ieVar.i(str);
            int size = subList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ieVar.h(subList.get(i2));
            }
            ieVar.f = ib.c(string);
            ieVar.g = true;
            m.g(str);
            m.f(subList);
            byvz byvzVar = (byvz) m;
            byvzVar.b = ieVar;
            byvzVar.a = dbsg.i(string);
        } else {
            m.m(str, dcdcVar);
        }
        m.i(i);
        return m.a();
    }
}
