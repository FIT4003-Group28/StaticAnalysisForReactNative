package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.chipcloud.ChipCloudView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: kyo  reason: default package */
/* loaded from: classes3.dex */
public final class kyo extends ajsl implements ajrm {
    public final View a;
    private final String b;
    private final Context c;
    private final Resources d;
    private final aafo e;
    private final ajmy f;
    private final ImageView g;
    private final ImageView h;
    private final FrameLayout i;
    private final TextView j;
    private final TextView k;
    private final ViewGroup l;
    private final ImageView m;
    private final ChipCloudView n;
    private final ajrp o;
    private final ajrp p;
    private final RelativeLayout.LayoutParams q;
    private final RelativeLayout.LayoutParams r;
    private auob s;
    private final List t = new ArrayList();
    private final List u = new ArrayList();
    private final ajxz v;

    public kyo(Context context, aafo aafoVar, ajxz ajxzVar, ajmy ajmyVar) {
        context.getClass();
        this.c = context;
        Resources resources = context.getResources();
        this.d = resources;
        aafoVar.getClass();
        this.e = aafoVar;
        ajmyVar.getClass();
        this.f = ajmyVar;
        ajxzVar.getClass();
        this.v = ajxzVar;
        View inflate = View.inflate(context, R.layout.rich_list_header, null);
        this.a = inflate;
        ImageView imageView = (ImageView) inflate.findViewById(R.id.channel_avatar);
        this.g = imageView;
        View findViewById = inflate.findViewById(R.id.wrapper);
        this.i = (FrameLayout) inflate.findViewById(R.id.box_art_layout);
        this.h = (ImageView) inflate.findViewById(R.id.box_art);
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        this.j = textView;
        this.k = (TextView) inflate.findViewById(R.id.subtitle);
        this.l = (ViewGroup) inflate.findViewById(R.id.standalone_badges_container);
        this.m = (ImageView) inflate.findViewById(R.id.icon);
        ChipCloudView chipCloudView = (ChipCloudView) inflate.findViewById(R.id.badges_container);
        this.n = chipCloudView;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.cloud_chip_margin);
        chipCloudView.a(dimensionPixelSize, dimensionPixelSize);
        this.o = new ajrp(aafoVar, imageView);
        this.p = new ajrp(aafoVar, inflate);
        this.q = (RelativeLayout.LayoutParams) findViewById.getLayoutParams();
        this.r = (RelativeLayout.LayoutParams) textView.getLayoutParams();
        this.b = resources.getString(R.string.accessibility_header_postfix);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018c  */
    @Override // defpackage.ajsl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void d(defpackage.ajrs r13, java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 921
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kyo.d(ajrs, java.lang.Object):void");
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((auob) obj).k.I();
    }

    @Override // defpackage.ajrm
    public final boolean h(View view) {
        apoj apojVar;
        apoj apojVar2;
        auob auobVar = this.s;
        if (auobVar != null) {
            auoa auoaVar = auobVar.h;
            if (auoaVar == null) {
                auoaVar = auoa.a;
            }
            if (auoaVar.b == 65153809) {
                apojVar = (apoj) auoaVar.c;
            } else {
                apojVar = apoj.a;
            }
            if ((apojVar.b & 8192) == 0) {
                return false;
            }
            aafo aafoVar = this.e;
            auoa auoaVar2 = this.s.h;
            if (auoaVar2 == null) {
                auoaVar2 = auoa.a;
            }
            if (auoaVar2.b == 65153809) {
                apojVar2 = (apoj) auoaVar2.c;
            } else {
                apojVar2 = apoj.a;
            }
            apzg apzgVar = apojVar2.n;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, null);
            return false;
        }
        return false;
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.o.c();
        this.p.c();
    }
}
