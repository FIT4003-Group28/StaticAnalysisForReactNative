package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: czna  reason: default package */
/* loaded from: classes.dex */
public final class czna implements cznn {
    private final cnjz a;
    private final String b;
    private final CopyOnWriteArrayList<czmz> c;
    private final CopyOnWriteArrayList<String> d;
    private final String e;

    public czna(Context context, String str) {
        cnjz cnjzVar = new cnjz(context, str, null);
        this.c = new CopyOnWriteArrayList<>();
        this.d = new CopyOnWriteArrayList<>();
        this.e = "";
        if (str.startsWith("STREAMZ_")) {
            this.a = cnjzVar;
            this.b = str;
            return;
        }
        throw new IllegalArgumentException("logSourceName should be prefixed by STREAMZ_");
    }

    @Override // defpackage.cznn
    public final void a(cznl cznlVar) {
        czmy czmyVar = new czmy(cznlVar);
        if (czmyVar.a.a.size() != 0) {
            cnjv e = this.a.e(czmyVar);
            e.i = this.b;
            Iterator<String> it = this.d.iterator();
            while (it.hasNext()) {
                e.c(it.next());
            }
            if (!this.e.isEmpty()) {
                String str = this.e;
                dujh dujhVar = e.c;
                if (dujhVar.c) {
                    dujhVar.bF();
                    dujhVar.c = false;
                }
                duji dujiVar = (duji) dujhVar.b;
                duji dujiVar2 = duji.m;
                str.getClass();
                dujiVar.a |= 32;
                dujiVar.f = str;
            }
            Iterator<czmz> it2 = this.c.iterator();
            while (it2.hasNext()) {
                e = it2.next().a();
            }
            e.a();
        }
    }
}
