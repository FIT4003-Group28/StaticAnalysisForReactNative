package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.g;
import java.util.Map;
/* loaded from: classes.dex */
final class c extends g {

    /* renamed from: a  reason: collision with root package name */
    private final c.e.a.a.i.y.a f6720a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<c.e.a.a.d, g.b> f6721b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(c.e.a.a.i.y.a aVar, Map<c.e.a.a.d, g.b> map) {
        if (aVar != null) {
            this.f6720a = aVar;
            if (map == null) {
                throw new NullPointerException("Null values");
            }
            this.f6721b = map;
            return;
        }
        throw new NullPointerException("Null clock");
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g
    c.e.a.a.i.y.a a() {
        return this.f6720a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g
    Map<c.e.a.a.d, g.b> b() {
        return this.f6721b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f6720a.equals(gVar.a()) && this.f6721b.equals(gVar.b());
    }

    public int hashCode() {
        return ((this.f6720a.hashCode() ^ 1000003) * 1000003) ^ this.f6721b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f6720a + ", values=" + this.f6721b + "}";
    }
}
