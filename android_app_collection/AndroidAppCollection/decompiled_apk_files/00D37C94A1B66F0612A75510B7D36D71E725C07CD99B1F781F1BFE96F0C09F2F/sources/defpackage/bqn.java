package defpackage;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: bqn  reason: default package */
/* loaded from: classes2.dex */
public final class bqn {
    private final UUID a;
    private final bpx b;
    private final Set c;
    private final bpx d;
    private final int e;
    private final int f;

    public bqn(UUID uuid, int i, bpx bpxVar, List list, bpx bpxVar2, int i2) {
        this.a = uuid;
        this.f = i;
        this.b = bpxVar;
        this.c = new HashSet(list);
        this.d = bpxVar2;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bqn bqnVar = (bqn) obj;
        if (this.e != bqnVar.e || !this.a.equals(bqnVar.a) || this.f != bqnVar.f || !this.b.equals(bqnVar.b) || !this.c.equals(bqnVar.c)) {
            return false;
        }
        return this.d.equals(bqnVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int i = this.f;
        adz.f(i);
        return (((((((((hashCode * 31) + i) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e;
    }

    public final String toString() {
        return "WorkInfo{mId='" + this.a + "', mState=" + ((Object) adz.d(this.f)) + ", mOutputData=" + this.b + ", mTags=" + this.c + ", mProgress=" + this.d + '}';
    }
}
