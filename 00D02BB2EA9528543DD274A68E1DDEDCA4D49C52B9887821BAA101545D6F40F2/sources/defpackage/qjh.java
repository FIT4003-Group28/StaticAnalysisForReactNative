package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: qjh  reason: default package */
/* loaded from: classes7.dex */
public class qjh implements qjf {
    @dzsi
    private final cqtd a;
    private final CharSequence b;
    private final CharSequence c;
    private final dbty<Boolean> d;
    @dzsi
    private final dbty<Boolean> e;
    private boolean f;
    private boolean g;

    public qjh(Context context, zuz zuzVar, dbty<Boolean> dbtyVar, @dzsi dbty<Boolean> dbtyVar2) {
        this.d = dbtyVar;
        this.e = dbtyVar2;
        this.f = dbtyVar.a().booleanValue();
        this.g = dbtyVar2 == null ? false : dbtyVar2.a().booleanValue();
        if (zuzVar != null) {
            this.a = zuzVar.a(vxz.REALTIME_DATA_AVAILABLE);
        } else {
            this.a = null;
        }
        bvsx bvsxVar = new bvsx(context.getResources());
        bvsu c = bvsxVar.c(R.string.LIVE_TIMES_UPDATED_JUST_NOW);
        bvsv a = bvsxVar.a(context.getString(R.string.LIVE_TIMES));
        a.l(ibm.M().b(context));
        a.i();
        c.a(a);
        this.b = c.c();
        bvsu c2 = bvsxVar.c(R.string.LIVE_TIMES_NOT_AVAILABLE);
        c2.a(bvsxVar.a(context.getString(R.string.LIVE_TIMES)));
        this.c = c2.c();
    }

    @Override // defpackage.qjf
    public CharSequence a() {
        return this.f ? this.b : this.c;
    }

    @Override // defpackage.qjf
    @dzsi
    public cqtd b() {
        if (this.g || this.f) {
            return this.a;
        }
        return null;
    }

    @Override // defpackage.qjf
    public void c() {
        this.f = this.d.a().booleanValue();
        dbty<Boolean> dbtyVar = this.e;
        this.g = dbtyVar == null ? false : dbtyVar.a().booleanValue();
        cqkx.p(this);
    }
}
