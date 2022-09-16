package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mml  reason: default package */
/* loaded from: classes3.dex */
public final class mml implements ajru {
    public final aafo a;
    private final View b;
    private final TextView c;
    private final TextView d;
    private final TextView e;
    private final ImageView f;
    private final ProgressBar g;
    private final ProgressBar h;
    private final ProgressBar i;
    private final ProgressBar j;
    private final RelativeLayout k;
    private final View l;
    private final mnk m;
    private final Context n;
    private final ajmy o;
    private final ajrx p;
    private final ajyc q;
    private final axxs r;

    public mml(Context context, aafo aafoVar, ajmy ajmyVar, gem gemVar, ajyc ajycVar, axxs axxsVar) {
        this.n = context;
        this.o = ajmyVar;
        this.a = aafoVar;
        this.r = axxsVar;
        View inflate = View.inflate(context, R.layout.pending_video_upload_item, null);
        this.b = inflate;
        this.c = (TextView) inflate.findViewById(R.id.title);
        this.d = (TextView) inflate.findViewById(R.id.upload_status_message);
        this.e = (TextView) inflate.findViewById(R.id.upload_status_detailed_message);
        this.f = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.g = (ProgressBar) inflate.findViewById(R.id.transcoding_progressbar);
        this.h = (ProgressBar) inflate.findViewById(R.id.copy_file_progressbar);
        this.i = (ProgressBar) inflate.findViewById(R.id.upload_progressbar);
        this.j = (ProgressBar) inflate.findViewById(R.id.processing_progressbar);
        this.k = (RelativeLayout) inflate.findViewById(R.id.thumbnail_layout);
        this.l = inflate.findViewById(R.id.contextual_menu_anchor);
        this.m = new mnk((ViewStub) inflate.findViewById(R.id.privacy_badge), context);
        this.p = gemVar;
        this.q = ajycVar;
        gemVar.c(inflate);
    }

    private final String e(ggp ggpVar) {
        double d = ggpVar.k;
        if (Double.isNaN(d)) {
            return null;
        }
        if (Double.isInfinite(d)) {
            if (ggpVar.f()) {
                return this.n.getResources().getString(R.string.upload_waiting_wifi);
            }
            if (ggpVar.e()) {
                return this.n.getResources().getString(R.string.upload_waiting_network);
            }
            return this.n.getResources().getString(R.string.upload_transfer_pending);
        }
        int i = (int) d;
        int i2 = i / 60;
        int i3 = i2 / 60;
        if (i <= 1) {
            return null;
        }
        if (i <= 90) {
            return this.n.getResources().getQuantityString(R.plurals.upload_seconds_remaing, i, Integer.valueOf(i));
        }
        if (i2 <= 90) {
            return this.n.getResources().getQuantityString(R.plurals.upload_minutes_remaing, i2, Integer.valueOf(i2));
        }
        if (i3 > 3) {
            return null;
        }
        return this.n.getResources().getQuantityString(R.plurals.upload_hours_remaing, i3, Integer.valueOf(i3));
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.p).b;
    }

    final int d(int i) {
        return (int) TypedValue.applyDimension(1, i, this.n.getResources().getDisplayMetrics());
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0230, code lost:
        if (r19 != (-1.0d)) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:83:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02cc  */
    @Override // defpackage.ajru
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void oK(defpackage.ajrs r22, java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 832
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mml.oK(ajrs, java.lang.Object):void");
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
