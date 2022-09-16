package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.chipcloud.ChipCloudView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mpk  reason: default package */
/* loaded from: classes3.dex */
public final class mpk extends ajsl {
    private final int A;
    private final int B;
    private final int C;
    private final int D;
    private final int E;
    private final int F;
    private final int G;
    public final TextView a;
    public mpj b;
    private final Context c;
    private final ajmy d;
    private final aafo e;
    private final ajrx f;
    private final jxn g;
    private final View h;
    private final TextView i;
    private final TextView j;
    private final TextView k;
    private final ImageView l;
    private final View m;
    private final ajyc n;
    private final ChipCloudView o;
    private final CompoundButton p;
    private final Resources q;
    private final aadd r;
    private final ahit s;
    private auuf t;
    private final ajrp u;
    private final int v;
    private final int x;
    private final int y;
    private final int z;

    public mpk(Context context, gem gemVar, ajmy ajmyVar, aafo aafoVar, ajyc ajycVar, jxn jxnVar, aadd aaddVar) {
        this.u = new ajrp(aafoVar, gemVar);
        context.getClass();
        this.c = context;
        ajmyVar.getClass();
        this.d = ajmyVar;
        aafoVar.getClass();
        this.e = aafoVar;
        this.f = gemVar;
        ajycVar.getClass();
        this.n = ajycVar;
        jxnVar.getClass();
        this.g = jxnVar;
        this.r = aaddVar;
        Resources resources = context.getResources();
        this.q = resources;
        this.v = resources.getDimensionPixelSize(R.dimen.shelf_header_normal_padding_top);
        this.x = resources.getDimensionPixelSize(R.dimen.shelf_header_autonav_padding_top);
        this.y = resources.getDimensionPixelSize(R.dimen.shelf_header_menu_padding_top);
        this.z = resources.getDimensionPixelSize(R.dimen.shelf_header_normal_padding_bottom);
        this.A = resources.getDimensionPixelSize(R.dimen.shelf_header_autonav_padding_bottom);
        this.B = resources.getDimensionPixelSize(R.dimen.shelf_header_badge_padding_bottom);
        this.C = resources.getDimensionPixelSize(R.dimen.shelf_header_menu_padding_bottom);
        this.D = resources.getDimensionPixelSize(R.dimen.shelf_header_menu_padding_top_linear_grid_tablet);
        this.E = resources.getDimensionPixelSize(R.dimen.shelf_header_menu_padding_bottom_linear_grid_tablet);
        this.F = resources.getDimensionPixelSize(R.dimen.shelf_header_menu_anchor_margin_offset);
        this.G = resources.getDimensionPixelSize(R.dimen.shelf_header_menu_anchor_margin_offset_default);
        View inflate = View.inflate(context, R.layout.shelf_header, null);
        this.h = inflate;
        this.i = (TextView) inflate.findViewById(R.id.title);
        this.a = (TextView) inflate.findViewById(R.id.autonav_title);
        this.j = (TextView) inflate.findViewById(R.id.autonav_toggle_title);
        this.k = (TextView) inflate.findViewById(R.id.subtitle);
        ChipCloudView chipCloudView = (ChipCloudView) inflate.findViewById(R.id.badges_container);
        this.o = chipCloudView;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.cloud_chip_margin);
        chipCloudView.a(dimensionPixelSize, dimensionPixelSize);
        this.l = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.m = inflate.findViewById(R.id.contextual_menu_anchor);
        CompoundButton compoundButton = (CompoundButton) inflate.findViewById(R.id.autonav_toggle);
        this.p = compoundButton;
        this.s = new mpg(this);
        compoundButton.setOnCheckedChangeListener(new mph(this, jxnVar));
        inflate.addOnLayoutChangeListener(new mpi(this));
        gemVar.c(inflate);
    }

    private static apos g(auuf auufVar) {
        autw autwVar = auufVar.n;
        if (autwVar == null) {
            autwVar = autw.a;
        }
        if ((autwVar.b & 1) != 0) {
            autw autwVar2 = auufVar.n;
            if (autwVar2 == null) {
                autwVar2 = autw.a;
            }
            apos aposVar = autwVar2.c;
            return aposVar == null ? apos.a : aposVar;
        }
        return null;
    }

    private static CharSequence h(aovs aovsVar, CharSequence charSequence) {
        if (aovsVar != null && (aovsVar.b & 1) != 0) {
            aovr aovrVar = aovsVar.c;
            if (aovrVar == null) {
                aovrVar = aovr.a;
            }
            if ((aovrVar.b & 2) != 0) {
                return aovrVar.c;
            }
        }
        return charSequence;
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.f).b;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0249  */
    @Override // defpackage.ajsl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ void d(defpackage.ajrs r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mpk.d(ajrs, java.lang.Object):void");
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((auuf) obj).u.I();
    }

    public final void f() {
        boolean g = this.g.g();
        this.p.setChecked(g);
        mpj mpjVar = this.b;
        if (mpjVar != null) {
            mpjVar.a(g);
        }
    }

    @Override // defpackage.ajsl
    protected final boolean l() {
        return true;
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.u.c();
        this.g.f(this.s);
    }
}
