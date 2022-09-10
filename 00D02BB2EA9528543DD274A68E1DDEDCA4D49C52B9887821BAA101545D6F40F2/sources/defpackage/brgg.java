package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: brgg  reason: default package */
/* loaded from: classes4.dex */
public class brgg implements brgr {
    private final Resources a;
    private final Runnable b;
    private final List<brye> c;

    public brgg(Resources resources, Runnable runnable, @dzsi brye bryeVar) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        dbsk.s(resources);
        this.a = resources;
        dbsk.s(runnable);
        this.b = runnable;
        if (bryeVar != null) {
            arrayList.add(bryeVar);
        }
    }

    @Override // defpackage.brgr
    public String a() {
        return this.a.getString(R.string.EV_PROFILE_PROMO_CARD_DISMISS_TEXT_V2);
    }

    @Override // defpackage.bryf
    public cqkl b() {
        for (brye bryeVar : this.c) {
            bryeVar.a();
        }
        return cqkl.a;
    }

    @Override // defpackage.bryf
    public cqkl c() {
        this.b.run();
        return cqkl.a;
    }

    @Override // defpackage.bryf
    public String d() {
        return this.a.getString(R.string.EV_PROFILE_PROMO_CARD_TITLE_TEXT_V3);
    }

    @Override // defpackage.bryf
    public String e() {
        return this.a.getString(R.string.EV_PROFILE_PROMO_CARD_DESCRIPTION_V3);
    }

    @Override // defpackage.bryf
    public String f() {
        return this.a.getString(R.string.EV_PROFILE_PROMO_CARD_ACTION_TEXT_V2);
    }

    @Override // defpackage.bryf
    public cqtd g() {
        return new brgf(new Object[0]);
    }

    @Override // defpackage.bryf
    public cqtd h() {
        return cqrt.f(R.drawable.ev_charger_illustration);
    }

    @Override // defpackage.bryf
    public void i(brye bryeVar) {
        this.c.add(bryeVar);
    }

    @Override // defpackage.bryf
    public cjtd j() {
        return cjtd.a(dtxo.au);
    }

    @Override // defpackage.bryf
    public cjtd k() {
        return cjtd.a(dtxo.aw);
    }

    @Override // defpackage.bryf
    public cjtd l() {
        return cjtd.a(dtxo.av);
    }
}
