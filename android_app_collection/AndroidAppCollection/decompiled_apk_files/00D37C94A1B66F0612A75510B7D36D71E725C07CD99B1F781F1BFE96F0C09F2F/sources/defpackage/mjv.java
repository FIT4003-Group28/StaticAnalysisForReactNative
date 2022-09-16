package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mjv  reason: default package */
/* loaded from: classes3.dex */
public final class mjv extends mfs implements lmt {
    private final ajrp C;
    private final lmu D;
    private final jkv E;
    private final ViewStub F;
    private final snc G;
    private final ImageView H;
    private View I;

    /* renamed from: J  reason: collision with root package name */
    private aplx f227J;
    private jku K;
    private arfe L;
    private final aadd M;
    protected final Resources a;
    protected final ajrx b;
    protected final LinearLayout c;
    protected final RelativeLayout d;
    protected final RelativeLayout e;
    private final ajyc f;

    public mjv(Context context, ajmy ajmyVar, ajrx ajrxVar, aafo aafoVar, ajyc ajycVar, snc sncVar, ViewGroup viewGroup, lmu lmuVar, jkv jkvVar, aadd aaddVar, ftb ftbVar, kua kuaVar) {
        super(context, ajmyVar, aafoVar, ajrxVar, (int) R.layout.compact_video_item, viewGroup, jkvVar, ftbVar, kuaVar);
        this.a = context.getResources();
        this.b = ajrxVar;
        ajycVar.getClass();
        this.f = ajycVar;
        this.C = new ajrp(aafoVar, ajrxVar);
        this.G = sncVar;
        this.D = lmuVar;
        lmuVar.a(this);
        this.E = jkvVar;
        View view = this.i;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.video_info_view);
        this.c = linearLayout;
        this.d = (RelativeLayout) linearLayout.findViewById(R.id.thumbnail_layout);
        this.e = (RelativeLayout) linearLayout.findViewById(R.id.text_layout);
        this.F = (ViewStub) linearLayout.findViewById(R.id.offline_badge_beside_details);
        this.H = (ImageView) view.findViewById(R.id.channel_avatar);
        lj.M(view, new mjt());
        this.M = aaddVar;
    }

    private static apmi f(arfe arfeVar) {
        apmg apmgVar = arfeVar.s;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        if ((apmgVar.b & 2) != 0) {
            apmg apmgVar2 = arfeVar.s;
            if (apmgVar2 == null) {
                apmgVar2 = apmg.a;
            }
            apmi apmiVar = apmgVar2.d;
            return apmiVar == null ? apmi.a : apmiVar;
        }
        return null;
    }

    private static final boolean g(asxo asxoVar) {
        int aa;
        return (asxoVar == null || (aa = almu.aa(asxoVar.b)) == 0 || aa != 11) ? false : true;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b.a();
    }

    @Override // defpackage.lmt
    public final fjz d() {
        return this.r;
    }

    @Override // defpackage.lmt
    public final aplx e() {
        return this.f227J;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c3  */
    @Override // defpackage.ajru
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void oK(defpackage.ajrs r17, java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 1374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mjv.oK(ajrs, java.lang.Object):void");
    }

    @Override // defpackage.mfs, defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        super.qZ(ajsaVar);
        this.L = null;
        jku jkuVar = this.K;
        if (jkuVar != null) {
            jkuVar.a();
        }
        this.C.c();
    }
}
