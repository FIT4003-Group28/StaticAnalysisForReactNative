package defpackage;
/* compiled from: PG */
/* renamed from: aejz  reason: default package */
/* loaded from: classes.dex */
public final class aejz {
    public final Long a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final boolean e;
    public final aexf f;

    public aejz() {
    }

    public aejz(Long l, Long l2, Long l3, Long l4, aexf aexfVar, boolean z) {
        this.a = l;
        this.b = l2;
        this.c = l3;
        this.d = l4;
        this.f = aexfVar;
        this.e = z;
    }

    public static aejy a() {
        aejy aejyVar = new aejy();
        aejyVar.d(false);
        return aejyVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aejz) {
            aejz aejzVar = (aejz) obj;
            Long l = this.a;
            if (l != null ? l.equals(aejzVar.a) : aejzVar.a == null) {
                Long l2 = this.b;
                if (l2 != null ? l2.equals(aejzVar.b) : aejzVar.b == null) {
                    Long l3 = this.c;
                    if (l3 != null ? l3.equals(aejzVar.c) : aejzVar.c == null) {
                        Long l4 = this.d;
                        if (l4 != null ? l4.equals(aejzVar.d) : aejzVar.d == null) {
                            aexf aexfVar = this.f;
                            if (aexfVar != null ? aexfVar.equals(aejzVar.f) : aejzVar.f == null) {
                                if (this.e == aejzVar.e) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Long l = this.a;
        int i = 0;
        int hashCode = ((l == null ? 0 : l.hashCode()) ^ 1000003) * 1000003;
        Long l2 = this.b;
        int hashCode2 = (hashCode ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        Long l3 = this.c;
        int hashCode3 = (hashCode2 ^ (l3 == null ? 0 : l3.hashCode())) * 1000003;
        Long l4 = this.d;
        int hashCode4 = (hashCode3 ^ (l4 == null ? 0 : l4.hashCode())) * (-721379959);
        aexf aexfVar = this.f;
        if (aexfVar != null) {
            i = aexfVar.hashCode();
        }
        return ((hashCode4 ^ i) * 1000003) ^ (true != this.e ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.f);
        boolean z = this.e;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 172 + length2 + length3 + length4 + "null".length() + String.valueOf(valueOf5).length());
        sb.append("RequestData{mediaStartTimeMs=");
        sb.append(valueOf);
        sb.append(", mediaDurationMs=");
        sb.append(valueOf2);
        sb.append(", formatBitrateBps=");
        sb.append(valueOf3);
        sb.append(", playbackPositionMillis=");
        sb.append(valueOf4);
        sb.append(", timeSinceLastSeekOrJoinMillis=");
        sb.append("null");
        sb.append(", umpPartListener=");
        sb.append(valueOf5);
        sb.append(", forceRequestIdempotent=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
