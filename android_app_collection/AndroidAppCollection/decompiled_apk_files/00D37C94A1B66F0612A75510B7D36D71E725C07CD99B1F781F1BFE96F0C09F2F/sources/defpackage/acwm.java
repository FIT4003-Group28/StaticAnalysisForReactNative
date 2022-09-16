package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: acwm  reason: default package */
/* loaded from: classes.dex */
public final class acwm {
    private final afwu b;
    private final afzo c;
    private final String d;
    public final Map a = new HashMap();
    private final acwl e = new acwl(this);

    public acwm(afwu afwuVar, afzo afzoVar, String str) {
        afwuVar.getClass();
        this.b = afwuVar;
        afzoVar.getClass();
        this.c = afzoVar;
        this.d = str;
    }

    private final void d(aswg aswgVar) {
        if (aswgVar == null || (aswgVar.b & 1) == 0) {
            return;
        }
        try {
            Uri a = this.c.a(Uri.parse(aswgVar.c), this.e);
            if (a == null) {
                return;
            }
            afwt d = afwu.d(this.d);
            d.b(a);
            d.a(new acwk((aswf[]) aswgVar.d.toArray(new aswf[0])));
            this.b.a(d, afzr.a);
        } catch (zhy unused) {
            zep.l("Error substituting macros in URI.");
        }
    }

    public final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d((aswg) it.next());
        }
    }

    public final void b(aswg[] aswgVarArr) {
        if (aswgVarArr == null) {
            return;
        }
        for (aswg aswgVar : aswgVarArr) {
            d(aswgVar);
        }
    }

    public final void c(String str, String str2) {
        if (str2 != null) {
            this.a.put(str, str2);
        } else {
            this.a.remove(str);
        }
    }
}
