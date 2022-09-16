package defpackage;

import com.google.android.apps.maps.R;
import java.text.NumberFormat;
/* compiled from: PG */
/* renamed from: kob  reason: default package */
/* loaded from: classes7.dex */
public final class kob {
    public static final knz a = knz.d(koa.NO_BATTERY_INFORMATION, "", null, "");

    public static knz a(@dzsi amve amveVar) {
        koa koaVar;
        cqtd ah;
        if (amveVar == null || amveVar.e() == 0) {
            return a;
        }
        doub doubVar = amveVar.d(0).c;
        if (doubVar == null) {
            return a;
        }
        int i = doubVar.b;
        int i2 = doubVar.c;
        int min = (i2 > 0 && i >= 0) ? Math.min(100, (i * 100) / i2) : 0;
        String str = doubVar.e;
        int h = decl.h(min, 0, 100);
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        percentInstance.setMaximumFractionDigits(0);
        if (h <= 0) {
            koaVar = koa.CHARGING_STOP_REQUIRED;
        } else if (h <= 15) {
            koaVar = koa.LOW_BATTERY_ON_ARRIVAL;
        } else {
            koaVar = koa.HIGH_BATTERY_ON_ARRIVAL;
        }
        double d = h;
        Double.isNaN(d);
        String format = percentInstance.format(d / 100.0d);
        if (h <= 0) {
            ah = nqu.ah(R.raw.car_only_ic_battery_0_36dp, nql.bm);
        } else if (h <= 10) {
            ah = nqu.ai(R.raw.car_only_ic_battery_5_36dp, nql.bm);
        } else if (h <= 15) {
            ah = nqu.ai(R.raw.car_only_ic_battery_15_36dp, nql.bm);
        } else if (h <= 25) {
            ah = nqu.ai(R.raw.car_only_ic_battery_20_36dp, nql.f);
        } else if (h <= 40) {
            ah = nqu.ai(R.raw.car_only_ic_battery_30_36dp, nql.f);
        } else if (h <= 55) {
            ah = nqu.ai(R.raw.car_only_ic_battery_50_36dp, nql.f);
        } else if (h <= 70) {
            ah = nqu.ai(R.raw.car_only_ic_battery_60_36dp, nql.f);
        } else if (h <= 85) {
            ah = nqu.ai(R.raw.car_only_ic_battery_80_36dp, nql.f);
        } else if (h <= 95) {
            ah = nqu.ai(R.raw.car_only_ic_battery_90_36dp, nql.f);
        } else {
            ah = nqu.ah(R.raw.car_only_ic_battery_full_36dp, nql.f);
        }
        return knz.d(koaVar, format, ah, str);
    }
}
