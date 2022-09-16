package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
@Deprecated
/* renamed from: acvk  reason: default package */
/* loaded from: classes.dex */
public class acvk {
    public boolean a;
    private final String c;
    private final int d;
    private final boolean e;
    private String h;
    private dvn i;
    private Set j;
    private Set k;
    private dvo l;
    private final Set g = new HashSet();
    private final Map f = new HashMap();
    private final String b = i(this);

    /* JADX INFO: Access modifiers changed from: protected */
    public acvk(String str, int i, boolean z) {
        this.c = str;
        this.e = z;
        this.d = i;
    }

    private static String i(Object obj) {
        int i;
        String name = obj.getClass().getName();
        int indexOf = name.indexOf(36);
        if (indexOf < 0 || (i = indexOf + 1) >= name.length()) {
            return obj.getClass().getSimpleName();
        }
        return name.substring(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(ymg ymgVar) {
        if (!h()) {
            String str = this.b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 29);
            sb.append("CsiAction [");
            sb.append(str);
            sb.append("] not yet started.");
            zep.l(sb.toString());
            return false;
        }
        boolean z = ymgVar instanceof ymj;
        String f = ymgVar.f();
        Class<?> cls = ymgVar.getClass();
        if (z || !this.g.contains(f)) {
            if (!TextUtils.isEmpty(f)) {
                if (z) {
                    if (this.f.containsKey(f)) {
                        int intValue = ((Integer) this.f.get(f)).intValue();
                        this.f.put(f, Integer.valueOf(intValue + 1));
                        String valueOf = String.valueOf(f);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 12);
                        sb2.append(valueOf);
                        sb2.append("_");
                        sb2.append(intValue);
                        f = sb2.toString();
                    } else {
                        this.f.put(f, 1);
                    }
                }
                if (this.l.d(this.i, ymgVar.h(), f)) {
                    this.g.add(f);
                } else {
                    zep.l(String.format("CsiAction [%s] past event %s can't be marked", this.b, f));
                }
            } else {
                zep.l(String.format("CsiAction [%s] triggered with no registered label", this.b));
            }
        } else if (!TextUtils.equals(this.h, f)) {
            zep.l(String.format("CsiAction [%s] already ticked %s. Ignored.", this.b, f));
        }
        this.a |= this.k.contains(cls) && this.g.size() > 1;
        boolean z2 = this.j.contains(cls) && this.g.size() > 1;
        if (this.k.contains(cls)) {
            String.format("CsiAction DROP [%s](%b) due to: %s", this.b, Boolean.valueOf(this.a), i(ymgVar));
        }
        if (this.j.contains(cls)) {
            String.format("CsiAction END [%s](%b) due to: %s", this.b, Boolean.valueOf(z2), i(ymgVar));
        }
        return z2 || this.a;
    }

    public dvo b() {
        if (!h()) {
            zep.l("CsiAction.start() should be called before report. Ignored.");
            return null;
        }
        g("mod_li", true != this.e ? "0" : "1");
        g("conn", String.valueOf(this.d));
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(ymg ymgVar, Set set, Set set2) {
        if (h()) {
            String str = this.b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38);
            sb.append("CsiAction [");
            sb.append(str);
            sb.append("] already started. Ignored.");
            zep.l(sb.toString());
            return;
        }
        String.format("CsiAction START [%s] due to: %s", this.b, i(ymgVar));
        set.getClass();
        this.j = set;
        set2.getClass();
        this.k = set2;
        this.l = new dvo(this.c);
        this.i = dvo.e(ymgVar.h());
        this.h = ymgVar.f();
        g("yt_lt", "warm");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(acvk acvkVar) {
        String.format("CsiAction CLONE [%s] from %s", this.b, i(acvkVar));
        if (!acvkVar.h() || acvkVar.a || !h() || this.a) {
            return;
        }
        Long l = acvkVar.i.a;
        this.g.addAll(acvkVar.g);
        dvo dvoVar = acvkVar.l;
        long longValue = l.longValue();
        dvo dvoVar2 = this.l;
        dvn e = dvo.e(longValue);
        Iterator it = dvoVar.a.iterator();
        while (it.hasNext()) {
            dvn dvnVar = (dvn) it.next();
            dvoVar2.d(e, dvnVar.a.longValue(), dvnVar.b);
        }
        Map b = dvoVar.b();
        if (b != null && !b.isEmpty()) {
            for (Map.Entry entry : b.entrySet()) {
                dvoVar2.c((String) entry.getKey(), (String) entry.getValue());
            }
        }
        this.i = e;
    }

    public final void e() {
        String.format("CsiAction DROP [%s]", this.b);
        this.a = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f(String str) {
        this.l.b = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g(String str, String str2) {
        if (!h()) {
            zep.l("CsiAction not yet started.");
        } else {
            this.l.c(str, str2);
        }
    }

    final boolean h() {
        return (this.l == null || this.i == null) ? false : true;
    }
}
