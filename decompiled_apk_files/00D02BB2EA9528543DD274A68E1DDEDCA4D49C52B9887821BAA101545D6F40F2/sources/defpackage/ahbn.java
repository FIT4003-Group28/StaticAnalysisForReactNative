package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ahbn  reason: default package */
/* loaded from: classes2.dex */
public class ahbn implements agyv {
    public final gga a;
    public final ahbl b;
    private final agwa c;
    private final dehq d;
    private final btlu e;
    private final dkzq f;
    private final dlas g;
    private boolean h;

    public ahbn(cqhn cqhnVar, agwa agwaVar, gga ggaVar, dehq dehqVar, btlu btluVar, dkzq dkzqVar, dlas dlasVar, ahbl ahblVar) {
        this.c = agwaVar;
        this.a = ggaVar;
        this.d = dehqVar;
        this.e = btluVar;
        this.f = dkzqVar;
        this.g = dlasVar;
        this.b = ahblVar;
    }

    @Override // defpackage.agyv
    public String a() {
        dkzo dkzoVar = this.g.a;
        if (dkzoVar == null) {
            dkzoVar = dkzo.d;
        }
        return dkzoVar.c;
    }

    @Override // defpackage.agyv
    public CharSequence b() {
        return this.a.getString(this.f == dkzq.POSITIVE ? R.string.LOCALSTREAM_ACCESSIBILITY_FOLLOW_MANAGEMENT_REMOVE_FROM_POSITIVE_EXPLICIT_PREFERENCE : R.string.LOCALSTREAM_ACCESSIBILITY_FOLLOW_MANAGEMENT_REMOVE_FROM_NEGATIVE_EXPLICIT_PREFERENCE, new Object[]{a()});
    }

    @Override // defpackage.agyv
    public cqkl c() {
        if (this.h) {
            return cqkl.a;
        }
        this.h = true;
        deha.q(this.c.h(this.e, this.g, this.f), new ahbm(this), this.d);
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.agyv
    public cjtd d() {
        return cjtd.a(this.f == dkzq.POSITIVE ? dtxu.cq : dtxu.cp);
    }

    @Override // defpackage.agyv
    public Boolean e() {
        return Boolean.valueOf(this.h);
    }
}
