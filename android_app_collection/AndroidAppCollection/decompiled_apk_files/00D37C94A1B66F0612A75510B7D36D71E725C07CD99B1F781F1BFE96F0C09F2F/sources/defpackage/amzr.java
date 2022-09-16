package defpackage;

import java.io.Serializable;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;
/* compiled from: PG */
/* renamed from: amzr  reason: default package */
/* loaded from: classes.dex */
public final class amzr extends amrx implements Serializable {
    final NavigableMap a;
    private transient Set b;

    private amzr(NavigableMap navigableMap) {
        this.a = navigableMap;
    }

    public static amzr c() {
        return new amzr(new TreeMap());
    }

    private final void e(amxt amxtVar) {
        if (amxtVar.m()) {
            this.a.remove(amxtVar.b);
        } else {
            this.a.put(amxtVar.b, amxtVar);
        }
    }

    @Override // defpackage.amrx, defpackage.amxv
    public final void a(amxt amxtVar) {
        if (amxtVar.m()) {
            return;
        }
        amsz amszVar = amxtVar.b;
        amsz amszVar2 = amxtVar.c;
        Map.Entry lowerEntry = this.a.lowerEntry(amszVar);
        if (lowerEntry != null) {
            amxt amxtVar2 = (amxt) lowerEntry.getValue();
            if (amxtVar2.c.compareTo(amszVar) >= 0) {
                if (amxtVar2.c.compareTo(amszVar2) >= 0) {
                    amszVar2 = amxtVar2.c;
                }
                amszVar = amxtVar2.b;
            }
        }
        Map.Entry floorEntry = this.a.floorEntry(amszVar2);
        if (floorEntry != null) {
            amxt amxtVar3 = (amxt) floorEntry.getValue();
            if (amxtVar3.c.compareTo(amszVar2) >= 0) {
                amszVar2 = amxtVar3.c;
            }
        }
        this.a.subMap(amszVar, amszVar2).clear();
        e(amxt.f(amszVar, amszVar2));
    }

    @Override // defpackage.amrx, defpackage.amxv
    public final void b(amxt amxtVar) {
        amxtVar.getClass();
        if (amxtVar.m()) {
            return;
        }
        Map.Entry lowerEntry = this.a.lowerEntry(amxtVar.b);
        if (lowerEntry != null) {
            amxt amxtVar2 = (amxt) lowerEntry.getValue();
            if (amxtVar2.c.compareTo(amxtVar.b) >= 0) {
                if (amxtVar.k() && amxtVar2.c.compareTo(amxtVar.c) >= 0) {
                    e(amxt.f(amxtVar.c, amxtVar2.c));
                }
                e(amxt.f(amxtVar2.b, amxtVar.b));
            }
        }
        Map.Entry floorEntry = this.a.floorEntry(amxtVar.c);
        if (floorEntry != null) {
            amxt amxtVar3 = (amxt) floorEntry.getValue();
            if (amxtVar.k() && amxtVar3.c.compareTo(amxtVar.c) >= 0) {
                e(amxt.f(amxtVar.c, amxtVar3.c));
            }
        }
        this.a.subMap(amxtVar.b, amxtVar.c).clear();
    }

    @Override // defpackage.amxv
    public final Set d() {
        Set set = this.b;
        if (set == null) {
            amzq amzqVar = new amzq(this.a.values());
            this.b = amzqVar;
            return amzqVar;
        }
        return set;
    }
}
