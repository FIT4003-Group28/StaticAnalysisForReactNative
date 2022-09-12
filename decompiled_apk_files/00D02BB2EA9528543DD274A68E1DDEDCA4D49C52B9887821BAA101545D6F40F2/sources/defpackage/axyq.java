package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: axyq  reason: default package */
/* loaded from: classes3.dex */
public class axyq extends ivw {
    private final gga c;
    private final bwqv d;
    private final ges e;
    @dzsi
    private final baad f;
    private final String g;

    public axyq(gga ggaVar, bwqv bwqvVar, fd fdVar, @dzsi baad baadVar, cjtd cjtdVar) {
        super(ggaVar, ivu.FIXED, jaq.DAY_NIGHT_BLUE_ON_WHITE, cqtt.h(cqrt.f(2131231580), 1.25f), ggaVar.getString(R.string.ACCESSIBILITY_ADD_PLACES_TO_LIST), cjtdVar, true, 0);
        this.c = ggaVar;
        this.d = bwqvVar;
        this.e = (ges) fdVar;
        this.f = baadVar;
        this.g = ggaVar.getString(R.string.ADD_PLACE_TO_LIST_HINT);
    }

    @Override // defpackage.jar
    public cqkl a(cjqm cjqmVar) {
        ges gesVar = this.e;
        if (!gesVar.aD) {
            return cqkl.a;
        }
        baad baadVar = this.f;
        if (baadVar != null) {
            this.c.D(azrm.aS(this.d, bwrs.a(baadVar), false, this.g, true));
        } else {
            gesVar.aZ(azrm.aR(this.d, false, this.g));
        }
        return cqkl.a;
    }
}
