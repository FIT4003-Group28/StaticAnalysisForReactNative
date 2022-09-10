package defpackage;
/* compiled from: PG */
/* renamed from: bbhx  reason: default package */
/* loaded from: classes3.dex */
public class bbhx implements bbhr {
    @dzsi
    private final bbhm a;
    private final bbho b;
    private final bbfg c;

    public bbhx(@dzsi bbhm bbhmVar, @dzsi bbho bbhoVar, bbfg bbfgVar) {
        this.a = bbhmVar;
        if (bbhoVar == null || bbhoVar == bbho.PLACE) {
            this.b = bbho.INTERSTITIAL_PROGRESS;
        } else {
            this.b = bbhoVar;
        }
        this.c = bbfgVar;
    }

    private final void h() {
        this.a.c(bbhn.INTERSTITIAL_NEXT, this);
    }

    @Override // defpackage.bbhp
    public bbho a() {
        return this.b;
    }

    @Override // defpackage.bbhp
    public Boolean b(bbho bbhoVar) {
        return Boolean.valueOf(a() == bbhoVar);
    }

    @Override // defpackage.bbhp
    public cqkl c() {
        bbho bbhoVar = bbho.PLACE;
        if (this.b.ordinal() == 2) {
            h();
        }
        return cqkl.a;
    }

    @Override // defpackage.bbhp
    @dzsi
    public cjtd d() {
        ddho ddhoVar;
        bbho bbhoVar = bbho.PLACE;
        int ordinal = this.b.ordinal();
        if (ordinal == 1) {
            ddhoVar = dtxo.aR;
        } else if (ordinal == 2) {
            ddhoVar = dtxo.aP;
        } else {
            return cjtd.b;
        }
        return cjtd.a(ddhoVar);
    }

    @Override // defpackage.bbhp
    @dzsi
    public cjtd e() {
        ddho ddhoVar;
        bbho bbhoVar = bbho.PLACE;
        int ordinal = this.b.ordinal();
        if (ordinal == 1) {
            ddhoVar = null;
        } else if (ordinal == 2) {
            ddhoVar = dtxo.aQ;
        } else {
            String valueOf = String.valueOf(this.b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
            sb.append("Non interstitial card type used: ");
            sb.append(valueOf);
            bvoo.f(new IllegalStateException(sb.toString()));
            return cjtd.b;
        }
        if (ddhoVar != null) {
            return cjtd.a(ddhoVar);
        }
        return cjtd.b;
    }

    @Override // defpackage.bbhr
    public cqkl f() {
        bbho bbhoVar = bbho.PLACE;
        int ordinal = this.b.ordinal();
        if (ordinal == 1) {
            h();
        } else if (ordinal == 2) {
            this.a.c(bbhn.INTERSTITIAL_DONE, this);
        }
        return cqkl.a;
    }

    @Override // defpackage.bbhr
    public Boolean g() {
        return Boolean.valueOf(!this.c.c.b().u());
    }
}
