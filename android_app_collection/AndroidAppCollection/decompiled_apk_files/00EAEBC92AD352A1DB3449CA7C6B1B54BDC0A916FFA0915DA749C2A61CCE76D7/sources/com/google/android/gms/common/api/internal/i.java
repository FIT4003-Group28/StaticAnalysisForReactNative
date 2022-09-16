package com.google.android.gms.common.api.internal;
/* loaded from: classes.dex */
public final class i<L> {

    /* renamed from: a  reason: collision with root package name */
    private final L f6889a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6890b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f6889a == iVar.f6889a && this.f6890b.equals(iVar.f6890b);
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f6889a) * 31) + this.f6890b.hashCode();
    }
}
