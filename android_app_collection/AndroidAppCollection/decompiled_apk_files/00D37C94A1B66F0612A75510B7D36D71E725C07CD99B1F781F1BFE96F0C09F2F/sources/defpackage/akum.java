package defpackage;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: akum  reason: default package */
/* loaded from: classes.dex */
public final class akum implements akuk, ynl {
    public final Map a = new HashMap();
    private final azqb b;

    public akum(azqb azqbVar) {
        this.b = azqbVar;
    }

    @Override // defpackage.akuk
    public final void a(String str, Bundle bundle) {
        if (!this.a.isEmpty()) {
            for (Map.Entry entry : this.a.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    public final void b() {
        ((yni) this.b.get()).g(this);
    }

    @Override // defpackage.akuk
    public final void d(Bundle bundle) {
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i != 0) {
                if (i == 1) {
                    afwb afwbVar = (afwb) obj;
                    this.a.clear();
                    return null;
                }
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
            asmc[] a = ((aaog) obj).a();
            if (a == null) {
                return null;
            }
            for (asmc asmcVar : a) {
                this.a.put(asmcVar.e, asmcVar.c == 2 ? (String) asmcVar.d : "");
            }
            return null;
        }
        return new Class[]{aaog.class, afwb.class};
    }
}
