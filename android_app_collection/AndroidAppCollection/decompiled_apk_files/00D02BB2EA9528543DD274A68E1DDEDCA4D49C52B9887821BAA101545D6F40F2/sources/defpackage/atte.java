package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: atte  reason: default package */
/* loaded from: classes2.dex */
class atte implements atxo {
    private final String a;
    private final String b;
    private boolean c;
    private final attd d;
    private final dbsg<Integer> e;
    private final Context f;

    public atte(String str, String str2, boolean z, dbsg<Integer> dbsgVar, attd attdVar, Context context) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.e = dbsgVar;
        this.d = attdVar;
        this.f = context;
    }

    @Override // defpackage.atxo
    @dzsi
    public cjtd a() {
        if (this.e.a()) {
            return cjtd.a(cjth.d(this.e.b().intValue()));
        }
        return null;
    }

    @Override // defpackage.atxo
    public jic b() {
        return new jic(this.a, ckqc.FULLY_QUALIFIED, R.drawable.generic_image_placeholder);
    }

    @Override // defpackage.atxo
    public String c() {
        return this.c ? this.f.getString(R.string.ACCESSIBILITY_SELECTED_TOGGLE, this.b) : this.b;
    }

    @Override // defpackage.atxo
    public void d(boolean z) {
        this.c = z;
    }

    @Override // defpackage.atxo
    public Boolean e() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.atxo
    public cqkl f() {
        atta attaVar = (atta) this.d;
        attf attfVar = attaVar.a;
        dbsg dbsgVar = attaVar.b;
        pns pnsVar = attaVar.c;
        String str = (String) dbsgVar.b();
        int c = pnsVar.c();
        deha.q(attfVar.d.p(attfVar.E, c, str), new attc(attfVar, str, c), attfVar.C);
        dcdc<atxo> dcdcVar = attfVar.c;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            atxo atxoVar = dcdcVar.get(i);
            atxoVar.d(atxoVar == this);
        }
        cqkx.p(attfVar);
        return cqkl.a;
    }
}
