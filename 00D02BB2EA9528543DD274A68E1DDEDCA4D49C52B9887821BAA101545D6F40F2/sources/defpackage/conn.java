package defpackage;

import android.content.Context;
import com.google.android.gms.location.LocationListener;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: conn  reason: default package */
/* loaded from: classes.dex */
public final class conn {
    public final Context a;
    public boolean b = false;
    public final Map<cnsb<LocationListener>, conm> c = new HashMap();
    public final Map<cnsb<cojl>, conk> d = new HashMap();
    public final Map<cnsb<cola>, coni> e = new HashMap();
    public final colx f;

    public conn(Context context, colx colxVar) {
        this.a = context;
        this.f = colxVar;
    }

    public final conm a(cnsd<LocationListener> cnsdVar) {
        conm conmVar;
        cnsb<LocationListener> cnsbVar = cnsdVar.b;
        if (cnsbVar == null) {
            return null;
        }
        synchronized (this.c) {
            conmVar = this.c.get(cnsbVar);
            if (conmVar == null) {
                conmVar = new conm(cnsdVar);
            }
            this.c.put(cnsbVar, conmVar);
        }
        return conmVar;
    }

    public final void b(boolean z) {
        this.f.a();
        this.f.b().l(z);
        this.b = z;
    }
}
