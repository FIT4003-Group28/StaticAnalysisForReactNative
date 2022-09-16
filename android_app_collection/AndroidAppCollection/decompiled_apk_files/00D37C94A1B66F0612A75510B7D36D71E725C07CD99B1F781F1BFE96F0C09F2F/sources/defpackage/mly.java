package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mly  reason: default package */
/* loaded from: classes3.dex */
public final class mly extends ajsl {
    mlx a;
    private final Context b;
    private final fjy c;
    private final gem d;
    private final FrameLayout e;
    private final aacz f;

    public mly(Context context, gem gemVar, fjy fjyVar, aacz aaczVar) {
        this.b = context;
        this.d = gemVar;
        this.c = fjyVar;
        this.f = aaczVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        gemVar.c(frameLayout);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.d.b;
    }

    @Override // defpackage.ajsl
    public final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        atou atouVar = (atou) obj;
        this.e.removeAllViews();
        int a = aqmv.a(atouVar.f);
        int i = R.layout.notification_multi_action_item;
        if (a != 0 && a == 2) {
            if (hqs.q(ajrsVar)) {
                i = eog.ar(this.f) ? R.layout.notification_multi_action_item_tablet_v2 : R.layout.notification_multi_action_item_tablet;
            } else {
                i = R.layout.notification_multi_action_item_compact_tall;
            }
        }
        mlx mlxVar = new mlx(LayoutInflater.from(this.b).inflate(i, (ViewGroup) null), this.c);
        this.a = mlxVar;
        if (i == R.layout.notification_multi_action_item_compact_tall) {
            mlxVar.a.setBackgroundColor(zhn.d(this.b, R.attr.ytBorderedButtonChipBackground));
        }
        this.a.oK(ajrsVar, atouVar);
        this.e.addView(this.a.a);
        this.d.e(ajrsVar);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((atou) obj).g.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        if (this.a != null) {
            this.a = null;
        }
        this.e.removeAllViews();
    }
}
