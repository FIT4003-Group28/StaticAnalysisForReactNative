package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.EventParams;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: rjx  reason: default package */
/* loaded from: classes4.dex */
public class rjx {
    final String a;
    final String b;
    final String c;
    final long d;
    final long e;
    final EventParams f;

    public rjx(rlx rlxVar, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        qnm.l(str2);
        qnm.l(str3);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            rlxVar.aG().f.b("Event created with reverse previous/current timestamps. appId", rks.a(str2));
        }
        this.f = b(rlxVar, bundle);
    }

    static EventParams b(rlx rlxVar, Bundle bundle) {
        if (bundle == null || bundle.isEmpty()) {
            return new EventParams(new Bundle());
        }
        Bundle bundle2 = new Bundle(bundle);
        Iterator<String> it = bundle2.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next == null) {
                rlxVar.aG().c.a("Param name can't be null");
                it.remove();
            } else {
                Object y = rlxVar.q().y(next, bundle2.get(next));
                if (y == null) {
                    rlxVar.aG().f.b("Param value can't be null", rlxVar.f().d(next));
                    it.remove();
                } else {
                    rlxVar.q().S(bundle2, next, y);
                }
            }
        }
        return new EventParams(bundle2);
    }

    public rjx a(rlx rlxVar, long j) {
        return new rjx(rlxVar, this.c, this.a, this.b, this.d, j, this.f);
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.f);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 33 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }

    private rjx(rlx rlxVar, String str, String str2, String str3, long j, long j2, EventParams eventParams) {
        qnm.l(str2);
        qnm.l(str3);
        qnm.b(eventParams);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            rlxVar.aG().f.c("Event created with reverse previous/current timestamps. appId, name", rks.a(str2), rks.a(str3));
        }
        this.f = eventParams;
    }
}
