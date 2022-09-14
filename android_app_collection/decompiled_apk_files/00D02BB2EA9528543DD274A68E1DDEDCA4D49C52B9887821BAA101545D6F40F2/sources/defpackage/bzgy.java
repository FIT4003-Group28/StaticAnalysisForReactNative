package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: bzgy  reason: default package */
/* loaded from: classes.dex */
public final class bzgy extends afhx {
    public static final dbsl<afga> a = bzgx.a;
    private final dxio<qbt> b;
    private final cjqy c;

    public bzgy(Intent intent, @dzsi String str, dxio<qbt> dxioVar, cjqy cjqyVar) {
        super(intent, str, afid.TRANSIT_STATION);
        this.b = dxioVar;
        this.c = cjqyVar;
    }

    public static Intent d(Context context, String str, String str2) {
        Intent a2 = afft.a(context);
        String packageName = context.getPackageName();
        StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 23);
        sb.append(packageName);
        sb.append(".");
        sb.append("TransitStationActivity");
        return a2.setComponent(new ComponentName(context, sb.toString())).putExtra("STATION_NAME", str).putExtra("STATION_FEATURE_ID", str2);
    }

    @Override // defpackage.afhx
    public final void a() {
        String stringExtra = this.f.getStringExtra("STATION_NAME");
        String stringExtra2 = this.f.getStringExtra("STATION_FEATURE_ID");
        qdf o = qdg.o();
        qaw qawVar = (qaw) o;
        qawVar.a = stringExtra;
        qawVar.b = stringExtra2;
        qawVar.d = afhi.b(this.f.getStringExtra("STATION_LOCATION"));
        if (this.f.hasExtra("FILTERED_DEPARTURES_TOKEN")) {
            o.j(this.f.getStringExtra("FILTERED_DEPARTURES_TOKEN"));
        }
        if (this.f.hasExtra("FILTERED_DEPARTURES_TOKENS")) {
            o.b(this.f.getStringArrayListExtra("FILTERED_DEPARTURES_TOKENS"));
        }
        if (this.f.getBooleanExtra("HOMESCREEN_SHORTCUT", false)) {
            cjqy cjqyVar = this.c;
            cjta b = cjtd.b();
            b.g(this.f.getStringExtra("STATION_VED"));
            b.d = dtyc.fh;
            cjqyVar.i(b.a());
            o.d(true);
        }
        this.b.a().C(o.h());
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_TRANSIT_STATION;
    }
}
