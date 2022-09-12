package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dzld  reason: default package */
/* loaded from: classes6.dex */
public class dzld extends dzki implements Serializable, Cloneable {
    private static final long serialVersionUID = -7046029254386353129L;

    private Object readResolve() {
        return dzle.a;
    }

    @Override // defpackage.dzki, defpackage.dzgu
    public final void clear() {
    }

    public Object clone() {
        return dzle.a;
    }

    @Override // defpackage.dzlc
    public final boolean e(long j) {
        return false;
    }

    public boolean equals(Object obj) {
        return (obj instanceof dzgu) && ((dzgu) obj).size() == 0;
    }

    public int hashCode() {
        return 0;
    }

    @Override // defpackage.dzlc
    public final double i(long j) {
        return dcyn.a;
    }

    @Override // defpackage.dzgu, java.util.Map
    public final int size() {
        return 0;
    }

    public String toString() {
        return "{}";
    }
}
