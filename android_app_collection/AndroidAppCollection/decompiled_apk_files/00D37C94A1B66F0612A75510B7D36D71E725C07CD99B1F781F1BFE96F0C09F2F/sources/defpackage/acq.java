package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: acq  reason: default package */
/* loaded from: classes.dex */
public final class acq implements Map.Entry {
    public final Object a;
    public final Object b;
    acq c;
    public acq d;

    public acq(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof acq)) {
            return false;
        }
        acq acqVar = (acq) obj;
        return this.a.equals(acqVar.a) && this.b.equals(acqVar.b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.a + "=" + this.b;
    }
}
