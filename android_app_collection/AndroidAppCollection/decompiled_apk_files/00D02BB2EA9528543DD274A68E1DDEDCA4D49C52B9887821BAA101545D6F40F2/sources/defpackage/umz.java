package defpackage;

import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: umz  reason: default package */
/* loaded from: classes.dex */
public final class umz extends afhx {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final dbsl<afga> d;
    private static final String e = "umz";
    private static final String i;
    private static final String j;
    private static final String k;
    private final dxio<qbt> l;

    static {
        String name = umz.class.getName();
        a = String.valueOf(name).concat(".dsi");
        b = String.valueOf(name).concat(".tidx");
        i = String.valueOf(name).concat(".updates");
        j = String.valueOf(name).concat(".et");
        k = String.valueOf(name).concat(".sharetrip");
        c = String.valueOf(name).concat(".stage");
        d = umy.a;
    }

    public umz(Intent intent, @dzsi String str, dxio<qbt> dxioVar) {
        super(intent, str, afid.RESUME_DIRECTIONS);
        this.l = dxioVar;
    }

    public static Intent d(Context context, amte amteVar, int i2, boolean z) {
        return e(context, amteVar, false, i2, z, -1, null);
    }

    public static Intent e(Context context, amte amteVar, boolean z, int i2, boolean z2, int i3, @dzsi String str) {
        Intent putExtra = afft.a(context).putExtra(a, amteVar).putExtra(b, i2).putExtra(k, z).putExtra(i, z2);
        if (i3 >= 0) {
            putExtra.putExtra(c, i3);
        }
        if (str != null) {
            putExtra.putExtra(j, str);
        }
        return putExtra;
    }

    @Override // defpackage.afhx
    public final void a() {
        qbs qbsVar;
        amte amteVar = (amte) this.f.getSerializableExtra(a);
        boolean booleanExtra = this.f.getBooleanExtra(i, false);
        boolean booleanExtra2 = this.f.getBooleanExtra(k, false);
        int intExtra = this.f.getIntExtra(b, 0);
        dqvj c2 = amteVar.c(intExtra);
        String stringExtra = this.f.getStringExtra(j);
        int intExtra2 = this.f.getIntExtra(c, -1);
        qcs v = qct.v(amteVar);
        v.b(Integer.valueOf(intExtra));
        if (c2 == dqvj.TRANSIT) {
            qbsVar = qbs.TRANSIT_TRIP_DETAILS;
        } else {
            qbsVar = qbs.DEFAULT;
        }
        v.d(qbsVar);
        v.f();
        v.c();
        qcr qcrVar = v.a;
        qcrVar.k(booleanExtra);
        v.a = qcrVar;
        qcr qcrVar2 = v.a;
        qcrVar2.j(booleanExtra2);
        v.a = qcrVar2;
        ((qao) v.a).g = stringExtra;
        if (intExtra2 >= 0) {
            ((qao) v.a).f = Integer.valueOf(intExtra2);
        }
        this.l.a().m(v.a(this.l.a().e()));
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_DIRECTIONS;
    }
}
