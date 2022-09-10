package defpackage;

import android.app.Application;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: qfr  reason: default package */
/* loaded from: classes7.dex */
public final class qfr {
    public final Set<qfp> a = Collections.newSetFromMap(new WeakHashMap());
    public final Application b;
    public final qho c;
    @dzsi
    public vnk d;

    public qfr(Application application, qho qhoVar) {
        this.b = application;
        this.c = qhoVar;
    }

    public final void a(qfp qfpVar) {
        this.a.add(qfpVar);
    }

    public final void b(qfq qfqVar) {
        for (qfp qfpVar : this.a) {
            if (qfpVar != null) {
                qfqVar.a(qfpVar);
            }
        }
    }
}
