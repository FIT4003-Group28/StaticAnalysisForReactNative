package defpackage;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
/* compiled from: PG */
/* renamed from: amzp  reason: default package */
/* loaded from: classes.dex */
public final class amzp {
    public final NavigableMap a = new TreeMap();

    private amzp() {
    }

    public static amzp a() {
        return new amzp();
    }

    private final void f(amsz amszVar, amsz amszVar2, Object obj) {
        this.a.put(amszVar, new amzo(amxt.f(amszVar, amszVar2), obj));
    }

    public final Object b(Comparable comparable) {
        Map.Entry floorEntry = this.a.floorEntry(amsz.f(comparable));
        Map.Entry entry = (floorEntry == null || !((amzo) floorEntry.getValue()).a.a(comparable)) ? null : (Map.Entry) floorEntry.getValue();
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    public final Map c() {
        return new amzn(this, this.a.values());
    }

    public final void d() {
        this.a.clear();
    }

    public final void e(amxt amxtVar, Object obj) {
        if (!amxtVar.m()) {
            obj.getClass();
            if (!amxtVar.m()) {
                Map.Entry lowerEntry = this.a.lowerEntry(amxtVar.b);
                if (lowerEntry != null) {
                    amzo amzoVar = (amzo) lowerEntry.getValue();
                    if (amzoVar.a().compareTo(amxtVar.b) > 0) {
                        if (amzoVar.a().compareTo(amxtVar.c) > 0) {
                            f(amxtVar.c, amzoVar.a(), ((amzo) lowerEntry.getValue()).b);
                        }
                        f(amzoVar.a.b, amxtVar.b, ((amzo) lowerEntry.getValue()).b);
                    }
                }
                Map.Entry lowerEntry2 = this.a.lowerEntry(amxtVar.c);
                if (lowerEntry2 != null) {
                    amzo amzoVar2 = (amzo) lowerEntry2.getValue();
                    if (amzoVar2.a().compareTo(amxtVar.c) > 0) {
                        f(amxtVar.c, amzoVar2.a(), ((amzo) lowerEntry2.getValue()).b);
                    }
                }
                this.a.subMap(amxtVar.b, amxtVar.c).clear();
            }
            this.a.put(amxtVar.b, new amzo(amxtVar, obj));
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof amzp) {
            return c().equals(((amzp) obj).c());
        }
        return false;
    }

    public final int hashCode() {
        return c().hashCode();
    }

    public final String toString() {
        return this.a.values().toString();
    }
}
