package defpackage;

import android.content.Context;
import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: zst  reason: default package */
/* loaded from: classes7.dex */
public final class zst extends View {
    public dcdc<zso> a;
    @dzsi
    public zsn b;
    private final zsp c;

    public zst(Context context) {
        super(context);
        this.a = dcdc.e();
        zsp zspVar = new zsp(this, new zss(this));
        this.c = zspVar;
        od.c(this, zspVar);
    }

    public void setRouteCalloutSelectedCallback(@dzsi zsn zsnVar) {
        this.b = zsnVar;
    }

    public void setRouteCallouts(List<zso> list) {
        this.a = dcdc.w(zsq.a, list);
        this.c.n();
    }
}
