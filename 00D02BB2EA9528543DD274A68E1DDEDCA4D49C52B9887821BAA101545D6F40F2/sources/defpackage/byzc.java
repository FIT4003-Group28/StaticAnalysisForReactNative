package defpackage;

import com.google.android.apps.maps.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: byzc  reason: default package */
/* loaded from: classes4.dex */
public class byzc implements byzb {
    private final gga a;
    private final cjmt b;
    private final byyp c;
    private final dxio<afha> d;
    private final cqat e;

    public byzc(gga ggaVar, cjmt cjmtVar, byyp byypVar, dxio<afha> dxioVar, cqat cqatVar) {
        this.a = ggaVar;
        this.b = cjmtVar;
        this.c = byypVar;
        this.d = dxioVar;
        this.e = cqatVar;
    }

    @Override // defpackage.byzb
    public String a() {
        return this.a.getString(R.string.TRANSIT_GUIDANCE_RESUME_BANNER_TITLE);
    }

    @Override // defpackage.byzb
    public String b() {
        if (this.c.c().l(this.a) != null) {
            long b = this.c.c().d().a - this.e.b();
            if (b < 0) {
                b = 0;
            }
            int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(b);
            if (seconds >= 0) {
                return bvtb.e(this.a.getResources(), seconds, bvsz.ABBREVIATED).toString();
            }
        }
        return "";
    }

    @Override // defpackage.byzb
    public Integer c() {
        return Integer.valueOf(this.b.f(efe.CURRENT_TRIP_BANNER));
    }

    @Override // defpackage.byzb
    public cqkl d() {
        bzdk c = this.c.c();
        amte k = c.k();
        dbsk.s(k);
        this.d.a().f(this.a, umz.d(this.a, k, c.m(), true), 2);
        return cqkl.a;
    }

    @Override // defpackage.byzb
    public cjtd e() {
        return cjtd.a(dtyc.df);
    }
}
