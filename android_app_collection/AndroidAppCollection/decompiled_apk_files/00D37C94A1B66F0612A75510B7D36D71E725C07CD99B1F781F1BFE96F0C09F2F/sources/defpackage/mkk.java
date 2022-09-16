package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.EndorsementMetadataSwapRendererOuterClass;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mkk  reason: default package */
/* loaded from: classes3.dex */
public final class mkk extends mfs implements ajrm, lmt {
    private static final asjj G;
    private static final asjj H;
    public String C;
    public ggz D;
    public Bitmap E;
    public boolean F;
    private final ajyc I;

    /* renamed from: J  reason: collision with root package name */
    private final mcj f228J;
    private final ImageView K;
    private final View L;
    private final ajmu M;
    private final fyy N;
    private final TextView O;
    private final emg P;
    private final ajrb Q;
    private final lmu R;
    private final ViewGroup S;
    private final mln T;
    private ajrs U;
    private final boolean V;
    private final boolean W;
    private aplx X;
    private final aacz Y;
    final ajrp a;
    final ajrx b;
    public final aafo c;
    public final View d;
    public final mbw e;
    public final mlo f;

    static {
        aopa createBuilder = asjj.a.createBuilder();
        aopa createBuilder2 = asji.a.createBuilder();
        createBuilder2.copyOnWrite();
        asji asjiVar = (asji) createBuilder2.instance;
        asjiVar.b |= 1;
        asjiVar.c = true;
        createBuilder.copyOnWrite();
        asjj asjjVar = (asjj) createBuilder.instance;
        asji asjiVar2 = (asji) createBuilder2.mo39build();
        asjiVar2.getClass();
        asjjVar.o = asjiVar2;
        asjjVar.b |= 67108864;
        G = (asjj) createBuilder.mo39build();
        aopa createBuilder3 = asjj.a.createBuilder();
        aopa createBuilder4 = asji.a.createBuilder();
        createBuilder4.copyOnWrite();
        asji asjiVar3 = (asji) createBuilder4.instance;
        asjiVar3.b = 1 | asjiVar3.b;
        asjiVar3.c = false;
        createBuilder3.copyOnWrite();
        asjj asjjVar2 = (asjj) createBuilder3.instance;
        asji asjiVar4 = (asji) createBuilder4.mo39build();
        asjiVar4.getClass();
        asjjVar2.o = asjiVar4;
        asjjVar2.b |= 67108864;
        H = (asjj) createBuilder3.mo39build();
    }

    public mkk(Context context, ajmy ajmyVar, ajxz ajxzVar, aafo aafoVar, ajyc ajycVar, mbw mbwVar, fyy fyyVar, mcj mcjVar, emg emgVar, ajrb ajrbVar, jkv jkvVar, aacz aaczVar, lmu lmuVar, mlp mlpVar, kua kuaVar, ajrx ajrxVar, View view, mln mlnVar, boolean z) {
        super(context, ajmyVar, ajrxVar, view, aafoVar, ajxzVar, jkvVar, (ftb) null, kuaVar);
        ViewStub viewStub;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        boolean z2 = z && context.getResources().getConfiguration().orientation == 2;
        this.W = z2;
        this.b = ajrxVar;
        this.I = ajycVar;
        this.a = new ajrp(aafoVar, ajrxVar, this);
        this.c = aafoVar;
        this.e = mbwVar;
        this.N = fyyVar;
        this.f228J = mcjVar;
        this.P = emgVar;
        this.Q = ajrbVar;
        this.Y = aaczVar;
        this.T = mlnVar;
        this.R = lmuVar;
        lmuVar.a(this);
        this.d = view.findViewById(R.id.thumbnail_layout);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.inline_muted_metadata);
        this.S = viewGroup;
        this.V = z;
        mlo mloVar = null;
        if (z2) {
            this.O = (TextView) view.findViewById(R.id.channel_name);
            this.K = (ImageView) view.findViewById(R.id.channel_thumbnail);
        } else {
            this.O = null;
            this.K = (ImageView) view.findViewById(R.id.channel_avatar);
            if (z && (viewStub = (ViewStub) view.findViewById(R.id.ad_attribution)) != null) {
                viewStub.inflate();
            }
        }
        this.L = view.findViewById(R.id.contextual_menu_anchor);
        ajmt a = ajmu.a();
        a.c = new mkj(this, mbwVar);
        this.M = a.a();
        ViewSwitcher viewSwitcher = (ViewSwitcher) this.i.findViewById(R.id.avatar_switcher);
        ViewSwitcher viewSwitcher2 = (ViewSwitcher) this.i.findViewById(R.id.metadata_switcher);
        ImageView imageView = (ImageView) this.i.findViewById(R.id.channel_avatar_swap);
        TextView textView = (TextView) this.i.findViewById(R.id.metadata_text_swap);
        if (viewSwitcher != null && viewSwitcher2 != null && imageView != null && textView != null) {
            mloVar = mlpVar.a(viewSwitcher, viewSwitcher2, imageView, textView, mlnVar);
        }
        this.f = mloVar;
        TextView textView2 = this.l;
        if (textView2 != null) {
            textView2.setTypeface(ajgo.ROBOTO_MEDIUM.c(this.g));
        }
        if (this.n != null) {
            if (z) {
                dimensionPixelSize3 = this.g.getResources().getDimensionPixelSize(R.dimen.video_metadata_ads_inline_details_padding_top);
            } else {
                dimensionPixelSize3 = this.g.getResources().getDimensionPixelSize(R.dimen.video_metadata_no_ads_inline_details_padding_top);
            }
            TextView textView3 = this.n;
            textView3.setPadding(textView3.getPaddingLeft(), dimensionPixelSize3, this.n.getPaddingRight(), this.n.getPaddingBottom());
        }
        if (!mix.d(aaczVar) || this.g.getResources().getConfiguration().orientation == 2) {
            return;
        }
        if (mix.b(aaczVar)) {
            dimensionPixelSize = this.g.getResources().getDimensionPixelSize(R.dimen.smaller_divider_height_dp);
        } else {
            dimensionPixelSize = this.g.getResources().getDimensionPixelSize(R.dimen.bigger_divider_height_dp);
        }
        ((gem) ajrxVar).a.b(zhn.j(this.g, R.attr.adSeparator1).orElse(0));
        ((gem) ajrxVar).a.d(dimensionPixelSize);
        if (!mix.a(aaczVar) || viewGroup == null || viewGroup.getLayoutParams() == null) {
            return;
        }
        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).bottomMargin = this.g.getResources().getDimensionPixelSize(R.dimen.inline_metadata_exp_bot_margin_dp);
        if (mix.c(aaczVar)) {
            dimensionPixelSize2 = this.g.getResources().getDimensionPixelSize(R.dimen.exp_layout_bot_padding_with_small_div);
        } else {
            dimensionPixelSize2 = this.g.getResources().getDimensionPixelSize(R.dimen.exp_layout_bot_padding_with_big_div);
        }
        viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), dimensionPixelSize2);
    }

    public static boolean g(ggz ggzVar) {
        arjw arjwVar;
        if (ggzVar == null || (arjwVar = ggzVar.b) == null) {
            return false;
        }
        aunb aunbVar = arjwVar.n;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        return aunbVar.qn(EndorsementMetadataSwapRendererOuterClass.endorsementMetadataSwapRenderer);
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.b).b;
    }

    @Override // defpackage.lmt
    public final fjz d() {
        return this.r;
    }

    @Override // defpackage.lmt
    public final aplx e() {
        return this.X;
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02ae  */
    @Override // defpackage.ajru
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void oK(defpackage.ajrs r18, defpackage.ggz r19) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mkk.oK(ajrs, ggz):void");
    }

    @Override // defpackage.ajrm
    public final boolean h(View view) {
        mcj mcjVar = this.f228J;
        ggz ggzVar = this.D;
        aafo aafoVar = this.c;
        ajrs ajrsVar = this.U;
        return mcjVar.b(ggzVar, aafoVar, ajrsVar.a, ajrsVar.e(), this);
    }

    @Override // defpackage.mfs, defpackage.ajrn
    public final void oq(Map map) {
        avhn avhnVar;
        map.put("VideoPresenterConstants.VIDEO_THUMBNAIL_VIEW_KEY", this.d);
        arjw arjwVar = this.D.b;
        if ((arjwVar.b & 2) != 0) {
            avhnVar = arjwVar.c;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
        } else {
            avhnVar = null;
        }
        map.put("VideoPresenterConstants.VIDEO_THUMBNAIL_DETAILS_KEY", avhnVar);
        this.f228J.a(this.D, map);
    }

    @Override // defpackage.mfs, defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        super.qZ(ajsaVar);
        this.d.setAlpha(1.0f);
        this.F = false;
        this.a.c();
        mlo mloVar = this.f;
        if (mloVar != null) {
            mloVar.a();
        }
    }
}
