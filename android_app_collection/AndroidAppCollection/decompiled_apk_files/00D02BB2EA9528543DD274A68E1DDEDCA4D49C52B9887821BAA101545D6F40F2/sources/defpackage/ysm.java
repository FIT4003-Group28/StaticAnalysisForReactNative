package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: ysm  reason: default package */
/* loaded from: classes7.dex */
final class ysm extends ysy {
    public doza a;
    public dcdc<dozz> b;
    public dcdc<dpce> c;
    public akqi d;
    public dgsn e;
    public jhk f;
    public Integer g;
    public akqq h;
    private Double i;
    private dcdc<ytb> j;

    public ysm() {
    }

    public ysm(ysz yszVar) {
        ysn ysnVar = (ysn) yszVar;
        this.i = Double.valueOf(ysnVar.a);
        this.a = ysnVar.b;
        this.b = ysnVar.c;
        this.c = ysnVar.d;
        this.d = ysnVar.e;
        this.e = ysnVar.f;
        this.f = ysnVar.g;
        this.g = Integer.valueOf(ysnVar.h);
        this.j = ysnVar.i;
        this.h = ysnVar.j;
    }

    @Override // defpackage.ysy
    public final void b(double d) {
        this.i = Double.valueOf(d);
    }

    @Override // defpackage.ysy
    public final void c(@dzsi doza dozaVar) {
        this.a = dozaVar;
    }

    @Override // defpackage.ysy
    public final void d(List<ytb> list) {
        this.j = dcdc.r(list);
    }

    @Override // defpackage.ysy
    public final ysz a() {
        String str = this.i == null ? " distanceToNearestStationMeters" : "";
        if (this.b == null) {
            str = str.concat(" lineNotices");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" renderableComponents");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" lineFeatureId");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" vehicleTypeCategory");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" lineColor");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" stations");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" queryLocation");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new ysn(this.i.doubleValue(), this.a, this.b, this.c, this.d, this.e, this.f, this.g.intValue(), this.j, this.h);
    }
}
