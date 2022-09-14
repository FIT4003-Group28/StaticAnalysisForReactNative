package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: crpx  reason: default package */
/* loaded from: classes5.dex */
public class crpx {
    @dzsi
    public final GmmLocation a;
    @dzsi
    public final String b;
    public final boolean c;
    public final boolean d;
    public final long e;

    public crpx(crpw<?> crpwVar) {
        this.a = crpwVar.a;
        this.b = crpwVar.b;
        this.c = crpwVar.c;
        this.d = crpwVar.d;
        this.e = crpwVar.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dbsb a() {
        dbsb b = dbsc.b(this);
        b.b("myLocation", this.a);
        b.b("currentRoadName", this.b);
        b.h("dataConnectionReady", this.c);
        b.h("gpsReady", this.d);
        b.g("token", this.e);
        return b;
    }

    public String toString() {
        return a().toString();
    }
}
