package com.google.android.libraries.social.populous.logging;
/* compiled from: PG */
/* renamed from: com.google.android.libraries.social.populous.logging.$AutoValue_LogEvent  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_LogEvent extends LogEvent {
    public final Long a;
    public final long b;
    public final long c;
    public final int d;
    public final dcdc<LogEntity> e;
    public final Long f;
    public final boolean g;
    public final Integer h;
    public final int i;

    public C$AutoValue_LogEvent(int i, @dzsi Long l, long j, long j2, int i2, dcdc<LogEntity> dcdcVar, @dzsi Long l2, boolean z, @dzsi Integer num) {
        if (i != 0) {
            this.i = i;
            this.a = l;
            this.b = j;
            this.c = j2;
            this.d = i2;
            if (dcdcVar != null) {
                this.e = dcdcVar;
                this.f = l2;
                this.g = z;
                this.h = num;
                return;
            }
            throw new NullPointerException("Null logEntities");
        }
        throw new NullPointerException("Null eventType");
    }

    @Override // com.google.android.libraries.social.populous.logging.LogEvent
    @dzsi
    public final Long a() {
        return this.a;
    }

    @Override // com.google.android.libraries.social.populous.logging.LogEvent
    public final long b() {
        return this.b;
    }

    @Override // com.google.android.libraries.social.populous.logging.LogEvent
    public final long c() {
        return this.c;
    }

    @Override // com.google.android.libraries.social.populous.logging.LogEvent
    public final int d() {
        return this.d;
    }

    @Override // com.google.android.libraries.social.populous.logging.LogEvent
    public final dcdc<LogEntity> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        Long l;
        Long l2;
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof LogEvent) {
            LogEvent logEvent = (LogEvent) obj;
            if (this.i == logEvent.i() && ((l = this.a) != null ? l.equals(logEvent.a()) : logEvent.a() == null) && this.b == logEvent.b() && this.c == logEvent.c() && this.d == logEvent.d() && dchl.m(this.e, logEvent.e()) && ((l2 = this.f) != null ? l2.equals(logEvent.f()) : logEvent.f() == null) && this.g == logEvent.g() && ((num = this.h) != null ? num.equals(logEvent.h()) : logEvent.h() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.social.populous.logging.LogEvent
    @dzsi
    public final Long f() {
        return this.f;
    }

    @Override // com.google.android.libraries.social.populous.logging.LogEvent
    public final boolean g() {
        return this.g;
    }

    @Override // com.google.android.libraries.social.populous.logging.LogEvent
    @dzsi
    public final Integer h() {
        return this.h;
    }

    public final int hashCode() {
        int i = (this.i ^ 1000003) * 1000003;
        Long l = this.a;
        int i2 = 0;
        int hashCode = l == null ? 0 : l.hashCode();
        long j = this.b;
        long j2 = this.c;
        int hashCode2 = (((((((((i ^ hashCode) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        Long l2 = this.f;
        int hashCode3 = (((hashCode2 ^ (l2 == null ? 0 : l2.hashCode())) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003;
        Integer num = this.h;
        if (num != null) {
            i2 = num.hashCode();
        }
        return hashCode3 ^ i2;
    }

    @Override // com.google.android.libraries.social.populous.logging.LogEvent
    public final int i() {
        return this.i;
    }

    public final String toString() {
        String a = cyou.a(this.i);
        String valueOf = String.valueOf(this.a);
        long j = this.b;
        long j2 = this.c;
        int i = this.d;
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        boolean z = this.g;
        String valueOf4 = String.valueOf(this.h);
        int length = String.valueOf(a).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 228 + length2 + length3 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("LogEvent{eventType=");
        sb.append(a);
        sb.append(", querySessionId=");
        sb.append(valueOf);
        sb.append(", selectSessionId=");
        sb.append(j);
        sb.append(", submitSessionId=");
        sb.append(j2);
        sb.append(", queryLength=");
        sb.append(i);
        sb.append(", logEntities=");
        sb.append(valueOf2);
        sb.append(", cacheLastUpdatedTime=");
        sb.append(valueOf3);
        sb.append(", hadDeviceContactsPermission=");
        sb.append(z);
        sb.append(", affinityVersion=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
