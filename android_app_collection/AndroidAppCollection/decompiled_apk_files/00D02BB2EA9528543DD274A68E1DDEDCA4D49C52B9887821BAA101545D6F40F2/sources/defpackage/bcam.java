package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: bcam  reason: default package */
/* loaded from: classes3.dex */
public abstract class bcam implements Serializable, Comparable<bcam> {
    public static bcam c(bbtj bbtjVar) {
        return new bcai(bbtjVar.q().A(), bbtjVar.i());
    }

    public abstract String a();

    @dzsi
    public abstract String b();

    @Override // java.lang.Comparable
    /* renamed from: d */
    public final int compareTo(bcam bcamVar) {
        String b = b();
        String b2 = bcamVar.b();
        if (b == null || b2 != null) {
            if (b == null && b2 != null) {
                return -1;
            }
            return b != null ? b.compareTo(b2) : a().compareTo(bcamVar.a());
        }
        return 1;
    }

    public final boolean equals(@dzsi Object obj) {
        return (obj instanceof bcam) && compareTo((bcam) obj) == 0;
    }

    public final int hashCode() {
        String b = b();
        return b != null ? b.hashCode() : a().hashCode();
    }
}
