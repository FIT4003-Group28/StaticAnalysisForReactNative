package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: acik  reason: default package */
/* loaded from: classes2.dex */
public final class acik implements Serializable {
    public akqq a;
    public Long b;
    public acij c;
    public akqq d;
    public Long e;

    public final String toString() {
        akqq akqqVar;
        dbsb b = dbsc.b(this);
        b.b("issueType", this.c);
        akqq akqqVar2 = this.a;
        if (akqqVar2 != null) {
            b.b("blueDotLatLng", akqqVar2.a());
        }
        akqq akqqVar3 = this.d;
        if (akqqVar3 != null) {
            b.b("correctedLatLng", akqqVar3.a());
        }
        akqq akqqVar4 = this.d;
        if (akqqVar4 != null && (akqqVar = this.a) != null) {
            b.d("errorDistanceMeters", akqo.e(akqqVar4, akqqVar));
        }
        Long l = this.e;
        if (l != null) {
            b.b("correctedLocationTimestamp", l);
        }
        Long l2 = this.b;
        if (l2 != null) {
            b.b("originalLocationTimestamp", l2);
        }
        return b.toString();
    }
}
