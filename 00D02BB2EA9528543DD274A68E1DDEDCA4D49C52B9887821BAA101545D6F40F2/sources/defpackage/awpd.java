package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: awpd  reason: default package */
/* loaded from: classes3.dex */
public final class awpd {
    @dzsi
    public akra a;
    public float b;
    @dzsi
    public amub c;
    @dzsi
    public akrn d;

    public final void a(awpd awpdVar) {
        this.a = awpdVar.a;
        this.b = awpdVar.b;
        this.c = awpdVar.c;
        this.d = awpdVar.d;
    }

    public final void b() {
        this.a = null;
        this.b = 0.0f;
        this.c = null;
        this.d = null;
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof awpd)) {
            return false;
        }
        awpd awpdVar = (awpd) obj;
        return dbsd.a(this.a, awpdVar.a) && Float.compare(this.b, awpdVar.b) == 0 && dbsd.a(this.c, awpdVar.c) && dbsd.a(this.d, awpdVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b), this.c, this.d});
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("chevronLocation", this.a);
        b.e("chevronLocationProximity", this.b);
        b.b("route", this.c);
        b.b("projectionOnPolyline", this.d);
        return b.toString();
    }
}
