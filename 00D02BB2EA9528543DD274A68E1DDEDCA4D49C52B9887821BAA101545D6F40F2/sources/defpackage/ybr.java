package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ybr  reason: default package */
/* loaded from: classes7.dex */
public class ybr implements xzn {
    private final acrm a;
    private final View.OnClickListener b;
    private final String c;
    private final boolean d;

    public ybr(Context context, acrm acrmVar, boolean z, String str, String str2, View.OnClickListener onClickListener, boolean z2) {
        String string;
        this.a = acrmVar;
        this.b = onClickListener;
        this.d = z2;
        if (z) {
            string = context.getString(R.string.ACCESSIBILITY_DIRECTIONS_TRIP_DETAILS_ARRIVAL_LIVE_BUSYNESS, str);
        } else {
            string = context.getString(R.string.ACCESSIBILITY_DIRECTIONS_TRIP_DETAILS_ARRIVAL_HISTORIC_BUSYNESS, str, str2);
        }
        this.c = string;
    }

    @Override // defpackage.xzn
    public acqx a() {
        return this.a;
    }

    @Override // defpackage.xzn
    public CharSequence b() {
        return this.c;
    }

    @Override // defpackage.xzn
    @dzsi
    public View.OnClickListener c() {
        if (this.d) {
            return null;
        }
        return this.b;
    }

    @Override // defpackage.xzn
    public cjtd d() {
        cjta b = cjtd.b();
        b.d = dtxn.aH;
        if (this.d) {
            b.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
        }
        return b.a();
    }

    @Override // defpackage.xzn
    public Boolean e() {
        return Boolean.valueOf(!this.d);
    }
}
