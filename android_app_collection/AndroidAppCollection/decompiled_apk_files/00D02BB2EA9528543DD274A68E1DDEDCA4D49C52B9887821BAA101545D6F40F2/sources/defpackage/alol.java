package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: alol  reason: default package */
/* loaded from: classes.dex */
public final class alol {
    private final Map<dmpn, akwf> d = Collections.synchronizedMap(new HashMap());
    public final Map<allu, akth> a = Collections.synchronizedMap(new HashMap());
    public final Map<akti, akwf> b = new HashMap();
    public final Map<allu, akth> c = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(allu alluVar, akwf akwfVar) {
        dmpn k = alluVar.k();
        if (k != dmpn.r) {
            this.d.put(k, akwfVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(allu alluVar) {
        dmpn k = alluVar.k();
        if (k != dmpn.r) {
            this.d.remove(k);
        }
    }

    @dzsi
    public final akwf c(dmpn dmpnVar) {
        if (dmpnVar != dmpn.r) {
            return this.d.get(dmpnVar);
        }
        return akwf.h;
    }
}
