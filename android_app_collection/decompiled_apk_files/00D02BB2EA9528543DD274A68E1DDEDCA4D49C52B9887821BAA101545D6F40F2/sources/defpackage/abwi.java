package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: abwi  reason: default package */
/* loaded from: classes2.dex */
public class abwi extends abvc {
    private static final jic a = new jic((String) null, ckqc.FULLY_QUALIFIED, iup.e(R.raw.trending_list), 0);
    private final jic b;

    public abwi(gga ggaVar, dxio<axwy> dxioVar, dxio<afha> dxioVar2, cqat cqatVar, djrm djrmVar, @dzsi acwt acwtVar, ddho ddhoVar, absg absgVar) {
        super(ggaVar, dxioVar, dxioVar2, cqatVar, djrmVar, acwtVar, ddhoVar, false, absgVar);
        ckqc ckqcVar;
        String str = djrmVar.k;
        if (djrmVar.u.isEmpty()) {
            ckqcVar = ckqc.FIFE;
        } else {
            ckqcVar = ckqc.FULLY_QUALIFIED;
        }
        this.b = new jic(str, ckqcVar, djrmVar.k.isEmpty() ? iup.e(R.raw.trending_list) : null, 250);
    }

    @Override // defpackage.abvc, defpackage.abom
    public jic d() {
        return this.b;
    }

    @Override // defpackage.abvc, defpackage.abom
    public jic e() {
        return a;
    }
}
