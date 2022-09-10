package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zku  reason: default package */
/* loaded from: classes7.dex */
class zku implements zdr {
    public final int a;
    @dzsi
    public final amuk b;
    public final amsq c;
    private final Activity d;
    private final boolean e;

    public zku(Activity activity, int i, boolean z, @dzsi amuk amukVar, amsq amsqVar) {
        this.d = activity;
        this.a = i;
        this.e = z;
        this.b = amukVar;
        this.c = amsqVar;
    }

    @Override // defpackage.zdr
    public CharSequence a() {
        amuk amukVar = this.b;
        return amukVar == null ? this.d.getText(R.string.BIKESHARING_YOUR_BICYCLE_TAB_TITLE) : amukVar.a();
    }

    @Override // defpackage.zdr
    public final CharSequence b() {
        return e().booleanValue() ? this.d.getString(R.string.DIRECTIONS_SUB_TAB_SELECTED, new Object[]{a()}) : a();
    }

    @Override // defpackage.zdr
    public final String c() {
        return a().toString();
    }

    @Override // defpackage.zdr
    @dzsi
    public jhk d() {
        amuk amukVar = this.b;
        if (amukVar == null) {
            return null;
        }
        return amukVar.b();
    }

    @Override // defpackage.zdr
    public final Boolean e() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.zdr
    public final cjtd f() {
        if (this.b == null) {
            return cjtd.a(dtxn.M);
        }
        amsq amsqVar = amsq.NONE;
        int ordinal = this.c.ordinal();
        if (ordinal == 1) {
            return cjtd.a(dtxn.B);
        }
        if (ordinal == 2) {
            return cjtd.a(dtxn.E);
        }
        return cjtd.a(dtxn.M);
    }
}
