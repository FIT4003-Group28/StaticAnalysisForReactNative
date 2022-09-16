package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;
import com.google.android.youtube.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: mie  reason: default package */
/* loaded from: classes3.dex */
public final class mie extends mfs implements lmt {
    private final jkv C;
    private aplx D;
    private final int E;
    private final int F;
    private final LinearLayout G;
    private final RelativeLayout H;
    private final SwipeLayout I;

    /* renamed from: J  reason: collision with root package name */
    private final ViewStub f226J;
    private final ajsa K;
    private ajrp L;
    private View M;
    private jrh N;
    private zda O;
    private List P;
    private jku Q;
    private aqfa R;
    private final snc a;
    private final ajrx b;
    private final ajyc c;
    private final lmu d;
    private final jri e;
    private final aafo f;

    public mie(Context context, ajmy ajmyVar, aafo aafoVar, snc sncVar, gem gemVar, ajyc ajycVar, jkv jkvVar, lmu lmuVar, jri jriVar, ajsi ajsiVar, ftb ftbVar, kua kuaVar) {
        super(context, ajmyVar, gemVar, LayoutInflater.from(context).inflate(R.layout.compact_video_item, (ViewGroup) null, false), aafoVar, jkvVar, ftbVar, kuaVar);
        this.a = sncVar;
        this.b = gemVar;
        ajycVar.getClass();
        this.c = ajycVar;
        this.f = aafoVar;
        this.C = jkvVar;
        this.d = lmuVar;
        this.e = jriVar;
        lmuVar.a(this);
        this.E = context.getResources().getDimensionPixelSize(R.dimen.compact_video_padding_start);
        this.F = context.getResources().getDimensionPixelSize(R.dimen.compact_video_padding_bottom);
        this.K = ajsiVar;
        View view = this.i;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.video_info_view);
        this.G = linearLayout;
        this.H = (RelativeLayout) linearLayout.findViewById(R.id.thumbnail_layout);
        this.I = (SwipeLayout) view.findViewById(R.id.compact_swipe_layout);
        this.f226J = (ViewStub) linearLayout.findViewById(R.id.offline_badge_beside_details);
        gemVar.c(linearLayout);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.i;
    }

    @Override // defpackage.lmt
    public final fjz d() {
        return this.r;
    }

    @Override // defpackage.lmt
    public final aplx e() {
        return this.D;
    }

    /* JADX WARN: Removed duplicated region for block: B:202:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x04a5 A[LOOP:0: B:263:0x049f->B:265:0x04a5, LOOP_END] */
    @Override // defpackage.ajru
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void oK(defpackage.ajrs r29, java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 1228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mie.oK(ajrs, java.lang.Object):void");
    }

    @Override // defpackage.mfs, defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        super.qZ(ajsaVar);
        this.R = null;
        this.L.c();
        jrh jrhVar = this.N;
        if (jrhVar != null) {
            jrhVar.c.m(jrhVar);
            jrhVar.h.b(jrhVar.r);
            jrhVar.g.b(jrhVar.q);
            jrhVar.k.setTextColor(jrhVar.s);
            jrhVar.m.setTextColor(jrhVar.t);
            jrhVar.m.setSingleLine();
            zag.o(jrhVar.l, true);
            jrhVar.b();
            zag.o(jrhVar.n, false);
            zag.o(jrhVar.p, false);
            jrhVar.o.setOnClickListener(null);
            ajrx ajrxVar = jrhVar.v;
            if (ajrxVar != null) {
                ajrxVar.d(jrhVar.e);
                jrhVar.v = null;
            }
            jrhVar.u = null;
            jrhVar.w = null;
            jrhVar.x = null;
            jrhVar.y = null;
            jrhVar.z = null;
            this.N = null;
        }
        mpe.b(this.O, this.I, this.P, ajsaVar);
        this.O = null;
        jku jkuVar = this.Q;
        if (jkuVar != null) {
            jkuVar.a();
        }
    }
}
