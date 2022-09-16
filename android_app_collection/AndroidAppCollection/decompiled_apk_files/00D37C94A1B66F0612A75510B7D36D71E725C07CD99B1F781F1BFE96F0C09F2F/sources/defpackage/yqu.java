package defpackage;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: yqu  reason: default package */
/* loaded from: classes4.dex */
public final class yqu {
    public String a;
    public yqt b;
    public int c;
    private abhq d;

    private final abhq d() {
        if (this.d == null) {
            this.d = yqp.c();
        }
        return this.d;
    }

    public final yqv a() {
        abhq abhqVar;
        yqt yqtVar = this.b;
        if (yqtVar != null) {
            String str = yqtVar.c;
            if (!TextUtils.isEmpty(str) && ((abhqVar = this.d) == null || !abhqVar.b("Content-Type"))) {
                b("Content-Type", str);
            }
            if (this.b.f()) {
                abhq abhqVar2 = this.d;
                if (abhqVar2 == null || !abhqVar2.b("Transfer-Encoding")) {
                    b("Transfer-Encoding", "chunked");
                }
            } else {
                abhq abhqVar3 = this.d;
                if (abhqVar3 == null || !abhqVar3.b("Content-Length")) {
                    b("Content-Length", Long.toString(this.b.b));
                }
            }
        }
        abhq abhqVar4 = this.d;
        return new yqv(this.c, this.a, abhqVar4 != null ? abhqVar4.a() : yqp.a, this.b);
    }

    public final void b(String str, String str2) {
        d().d(str, str2);
    }

    public final void c(String str, String str2) {
        abhq d = d();
        Iterator it = d.a.iterator();
        while (it.hasNext()) {
            if (str.equalsIgnoreCase((String) ((Map.Entry) it.next()).getKey())) {
                it.remove();
            }
        }
        d.d(str, str2);
    }
}
