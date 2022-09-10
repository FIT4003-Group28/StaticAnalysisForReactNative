package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: bzgs  reason: default package */
/* loaded from: classes.dex */
public final class bzgs extends afhx {
    private final dxio<qbt> c;
    private static final dcqe b = dcqe.c("bzgs");
    public static final dbsl<afga> a = bzgr.a;

    public bzgs(Intent intent, @dzsi String str, dxio<qbt> dxioVar) {
        super(intent, str, afid.TRANSIT_COMMUTE_BOARD);
        this.c = dxioVar;
    }

    public static int d(@dzsi dndr dndrVar) {
        if (dndrVar != null) {
            int ordinal = dndrVar.ordinal();
            int i = 1;
            if (ordinal != 1) {
                i = 2;
                if (ordinal != 2) {
                    return 0;
                }
            }
            return i;
        }
        return 0;
    }

    public static Intent e(Context context, @dzsi String str, @dzsi Integer num, @dzsi String str2, @dzsi Integer num2, @dzsi Integer num3, @dzsi dspd dspdVar, @dzsi Integer num4) {
        dbsk.b(true, "Must set destination type, featureId or latLng.");
        dbsk.b(true, "Destination name must be supplied if destinationType is not set.");
        Intent a2 = afft.a(context);
        String packageName = context.getPackageName();
        StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 21);
        sb.append(packageName);
        sb.append(".");
        sb.append("CommuteBoardActivity");
        Intent component = a2.setComponent(new ComponentName(context, sb.toString()));
        if (str != null) {
            component.putExtra("DESTINATION_NAME", str);
        }
        component.putExtra("DESTINATION_TYPE", num.intValue());
        if (!dbsj.d(str2)) {
            component.putExtra("DESTINATION_FEATURE_ID", str2);
        }
        if (num2 != null && num3 != null) {
            component.putExtra("DESTINATION_LAT", num2.intValue());
            component.putExtra("DESTINATION_LONG", num3.intValue());
        }
        if (dspdVar != null) {
            component.putExtra("ROUTE_TOKEN", dspdVar.G());
        }
        if (num4 != null) {
            component.putExtra("ROUTE_TOKEN_TYPE", num4.intValue());
        }
        return component;
    }

    @dzsi
    private static akqq h(Intent intent, String str, String str2) {
        dbsk.a(!str.equals(str2));
        if (intent.hasExtra(str) && intent.hasExtra(str2)) {
            int intExtra = intent.getIntExtra(str, Integer.MAX_VALUE);
            int intExtra2 = intent.getIntExtra(str2, Integer.MAX_VALUE);
            if (intExtra != Integer.MAX_VALUE && intExtra2 != Integer.MAX_VALUE) {
                return akqq.d(intExtra, intExtra2);
            }
            bvoo.h("Broken lat or long in transit commute board intent.", new Object[0]);
        }
        return null;
    }

    @Override // defpackage.afhx
    public final void a() {
        qcl c;
        dndr dndrVar;
        qbt a2 = this.c.a();
        Intent intent = this.f;
        akqq h = h(intent, "SOURCE_LAT", "SOURCE_LONG");
        dspd dspdVar = null;
        if (h == null) {
            c = qcl.i();
        } else {
            qck l = qcl.l();
            qaj qajVar = (qaj) l;
            qajVar.c = h;
            qajVar.b = null;
            c = l.c();
        }
        qcj h2 = qco.h();
        h2.e(c);
        qck l2 = qcl.l();
        int intExtra = intent.getIntExtra("DESTINATION_TYPE", 0);
        int i = 2;
        if (intExtra == 0) {
            dndrVar = dndr.UNKNOWN_ALIAS_TYPE;
        } else if (intExtra == 1) {
            dndrVar = dndr.HOME;
        } else if (intExtra != 2) {
            bvoo.h("Invalid WaypointType %s", Integer.valueOf(intExtra));
            dndrVar = dndr.UNKNOWN_ALIAS_TYPE;
        } else {
            dndrVar = dndr.WORK;
        }
        if (!dndrVar.equals(dndr.UNKNOWN_ALIAS_TYPE)) {
            ((qaj) l2).a = dndrVar;
        }
        akqq h3 = h(intent, "DESTINATION_LAT", "DESTINATION_LONG");
        if (h3 != null) {
            ((qaj) l2).c = h3;
        }
        String stringExtra = intent.getStringExtra("DESTINATION_FEATURE_ID");
        if (!dbsj.d(stringExtra)) {
            ((qaj) l2).b = akqi.b(stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("DESTINATION_NAME");
        if (!TextUtils.isEmpty(stringExtra2)) {
            ((qaj) l2).d = stringExtra2;
        }
        h2.b(l2.c());
        byte[] byteArrayExtra = intent.getByteArrayExtra("ROUTE_TOKEN");
        if (byteArrayExtra != null && byteArrayExtra.length > 0) {
            dspdVar = dspd.x(byteArrayExtra);
        }
        if (intent.getIntExtra("ROUTE_TOKEN_TYPE", 0) != 1) {
            i = 6;
        }
        if (dspdVar != null) {
            h2.g(qcn.e(dspdVar, i));
        }
        a2.P(h2.a());
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_TRANSIT_COMMUTE_BOARD;
    }
}
