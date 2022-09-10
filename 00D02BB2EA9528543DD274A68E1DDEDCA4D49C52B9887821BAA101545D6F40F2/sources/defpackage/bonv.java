package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.google.android.apps.gmm.base.views.map.MapViewContainer;
/* compiled from: PG */
/* renamed from: bonv  reason: default package */
/* loaded from: classes3.dex */
public class bonv {
    public final Context a;
    public final cqkj b;
    public final boqr c;
    public final boqn d;
    @dzsi
    public final DialogInterface.OnClickListener e;
    @dzsi
    public cqkf<boqr> f;
    @dzsi
    public AlertDialog g;
    public boolean h;
    public boolean i;
    private final hwd j;

    public bonv(Context context, boqr boqrVar, boqn boqnVar, @dzsi DialogInterface.OnClickListener onClickListener, hwd hwdVar, cqkj cqkjVar) {
        this.a = context;
        this.c = boqrVar;
        this.d = boqnVar;
        this.e = onClickListener;
        this.j = hwdVar;
        this.b = cqkjVar;
    }

    public final void a() {
        MapViewContainer mapViewContainer;
        cqkf<boqr> cqkfVar = this.f;
        if (cqkfVar == null || (mapViewContainer = (MapViewContainer) cqkx.e(cqkfVar.c(), bofz.a, MapViewContainer.class)) == null) {
            return;
        }
        mapViewContainer.h(this.j);
    }
}
