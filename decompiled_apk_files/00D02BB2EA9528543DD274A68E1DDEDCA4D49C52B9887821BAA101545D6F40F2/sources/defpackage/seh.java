package defpackage;

import android.app.Application;
import com.google.android.apps.maps.R;
import java.text.DateFormatSymbols;
/* compiled from: PG */
/* renamed from: seh  reason: default package */
/* loaded from: classes7.dex */
public class seh implements saq {
    private final String a;
    private final String b;
    private final String c;
    private final dpol d;
    private final cqkn<saq> e;
    private final int f;
    private boolean g;

    public seh(Application application, int i, cqkn<saq> cqknVar, int i2, boolean z) {
        this.d = bvtb.r(i);
        this.a = DateFormatSymbols.getInstance().getShortWeekdays()[i];
        String str = DateFormatSymbols.getInstance().getWeekdays()[i];
        this.e = cqknVar;
        this.f = i2;
        this.g = false;
        this.b = application.getString(R.string.COMMUTE_DAY_SELECTED, new Object[]{str});
        this.c = application.getString(R.string.COMMUTE_DAY_NOT_SELECTED, new Object[]{str});
    }

    @Override // defpackage.saq
    public dpol a() {
        return this.d;
    }

    @Override // defpackage.saq
    public String b() {
        return this.a;
    }

    @Override // defpackage.saq
    public String c() {
        return this.g ? this.b : this.c;
    }

    @Override // defpackage.saq
    public void d(boolean z) {
        this.g = z;
    }

    @Override // defpackage.saq
    public Boolean e() {
        return Boolean.valueOf(this.g);
    }

    @Override // defpackage.saq
    @dzsi
    public cqkn<saq> f() {
        return this.e;
    }

    @Override // defpackage.saq
    public cjtd g() {
        cjta b = cjtd.b();
        b.d = dtxl.cn;
        ddzy bZ = deab.c.bZ();
        deaa deaaVar = this.g ? deaa.TOGGLE_ON : deaa.TOGGLE_OFF;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        deab deabVar = (deab) bZ.b;
        deabVar.b = deaaVar.d;
        deabVar.a |= 1;
        b.a = bZ.bK();
        b.i(this.f);
        return b.a();
    }
}
