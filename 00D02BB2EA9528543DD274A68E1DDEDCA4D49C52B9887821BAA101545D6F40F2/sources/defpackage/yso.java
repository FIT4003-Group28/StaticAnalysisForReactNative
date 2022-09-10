package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: yso  reason: default package */
/* loaded from: classes7.dex */
final class yso extends yta {
    public String a;
    public doza b;
    public String c;
    public dcdc<dozz> d;
    public akqi e;
    public drij f;
    public dcdc<dpce> g;
    public Double h;
    private dcdc<dbsi<String, List<ysx>>> i;

    public yso() {
    }

    public yso(ytb ytbVar) {
        ysp yspVar = (ysp) ytbVar;
        this.a = yspVar.a;
        this.b = yspVar.b;
        this.c = yspVar.c;
        this.d = yspVar.d;
        this.i = yspVar.e;
        this.e = yspVar.f;
        this.f = yspVar.g;
        this.g = yspVar.h;
        this.h = Double.valueOf(yspVar.i);
    }

    @Override // defpackage.yta
    public final void b(List<dbsi<String, List<ysx>>> list) {
        this.i = dcdc.r(list);
    }

    @Override // defpackage.yta
    public final ytb a() {
        String str = this.a == null ? " stationName" : "";
        if (this.d == null) {
            str = str.concat(" stationNotices");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" headsignAndDepartures");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" stationFeatureId");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" departureStop");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" renderableComponents");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" distanceToStationMeters");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new ysp(this.a, this.b, this.c, this.d, this.i, this.e, this.f, this.g, this.h.doubleValue());
    }
}
