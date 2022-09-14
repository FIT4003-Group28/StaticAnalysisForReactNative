package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: znh  reason: default package */
/* loaded from: classes7.dex */
public class znh {
    @dzsi
    public View a;
    private final efa b;
    private final Resources c;
    private final cqkj d;
    private final ddho e;
    private final ddho f;

    public znh(efa efaVar, Resources resources, cqkj cqkjVar, ddho ddhoVar, ddho ddhoVar2) {
        this.b = efaVar;
        this.c = resources;
        this.d = cqkjVar;
        this.e = ddhoVar;
        this.f = ddhoVar2;
    }

    public final void a(znf znfVar) {
        zng zngVar = new zng(this, this.e, this.f, znfVar);
        cqkf d = this.d.d(new vgn(), this.b.b(), false);
        d.e(zngVar);
        View c = d.c();
        this.a = c;
        this.b.e(c, this.c.getString(R.string.UPDATE_ROUTES_AND_TRAFFIC_SNACKBAR_DESCRIPTION));
    }

    public final void b() {
        this.b.c();
    }

    public final void c() {
        View view = this.a;
        if (view != null) {
            this.b.d(view);
        }
    }
}
