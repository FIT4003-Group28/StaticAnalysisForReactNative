package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: yex  reason: default package */
/* loaded from: classes4.dex */
public final class yex extends yeb implements akbi, xyl {
    public ajmy ae;
    public aafo af;
    public acti ag;
    public akbn ah;
    public xyn ai;
    public yni aj;
    private ImageView ak;
    private LinearLayout al;
    private TextView am;
    private TextView an;
    private TextView ao;
    private TextView ap;
    private avnt aq;

    private final void aG(TextView textView, apok apokVar, boolean z, Map map) {
        akbm a = this.ah.a(textView);
        apoj apojVar = null;
        if (apokVar != null && (apokVar.b & 1) != 0 && (apojVar = apokVar.c) == null) {
            apojVar = apoj.a;
        }
        a.a(apojVar, this.ag, map);
        if (z) {
            a.d = this;
        }
    }

    @Override // defpackage.xyl
    public final void d(boolean z) {
        if (z) {
            ku();
            this.aj.d(new yem());
        }
    }

    @Override // defpackage.xym
    public final boolean g() {
        return false;
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        mN(0, R.style.UnlimitedFamily);
        this.ai.c(this);
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        super.mc(layoutInflater, viewGroup, bundle);
        if (bundle == null) {
            bundle = this.m;
        }
        try {
            this.aq = (avnt) aopi.parseFrom(avnt.a, bundle.getByteArray("UnlimitedFamilyProfileInterstitialRenderer"), aoos.b());
        } catch (aopx unused) {
        }
        arag aragVar4 = null;
        if (this.aq == null) {
            return null;
        }
        View inflate = layoutInflater.inflate(R.layout.family_pre_purchase_fragment_view, viewGroup, false);
        this.ak = (ImageView) inflate.findViewById(R.id.main_thumbnail);
        this.al = (LinearLayout) inflate.findViewById(R.id.secondary_thumbnails);
        this.am = (TextView) inflate.findViewById(R.id.member_info);
        this.an = (TextView) inflate.findViewById(R.id.member_title);
        HashMap hashMap = new HashMap();
        hashMap.put("accountName", "myaccount");
        TextView textView = (TextView) inflate.findViewById(R.id.manage_button);
        apok apokVar = this.aq.g;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        aG(textView, apokVar, false, hashMap);
        this.ao = (TextView) inflate.findViewById(R.id.additional_info_header);
        this.ap = (TextView) inflate.findViewById(R.id.additional_info);
        TextView textView2 = (TextView) inflate.findViewById(R.id.action_button);
        apok apokVar2 = this.aq.k;
        if (apokVar2 == null) {
            apokVar2 = apok.a;
        }
        aG(textView2, apokVar2, true, null);
        TextView textView3 = (TextView) inflate.findViewById(R.id.dismiss_button);
        apok apokVar3 = this.aq.j;
        if (apokVar3 == null) {
            apokVar3 = apok.a;
        }
        aG(textView3, apokVar3, true, null);
        ajmy ajmyVar = this.ae;
        ImageView imageView = this.ak;
        avhn avhnVar = this.aq.c;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        ajmyVar.h(imageView, avhnVar);
        for (avhn avhnVar2 : this.aq.d) {
            ImageView imageView2 = (ImageView) layoutInflater.inflate(R.layout.family_pre_purchase_fragment_secondary_thumbnail, (ViewGroup) this.al, false);
            this.ae.h(imageView2, avhnVar2);
            this.al.addView(imageView2);
        }
        int childCount = this.al.getChildCount();
        this.al.setVisibility(childCount > 0 ? 0 : 8);
        int dimensionPixelSize = rh().getDimensionPixelSize(childCount > 0 ? R.dimen.family_profile_main_thumbnail_size_small : R.dimen.family_profile_main_thumbnail_size_big);
        this.ak.getLayoutParams().height = dimensionPixelSize;
        this.ak.getLayoutParams().width = dimensionPixelSize;
        TextView textView4 = this.am;
        avnt avntVar = this.aq;
        if ((avntVar.b & 2) != 0) {
            aragVar = avntVar.e;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(textView4, ajgl.b(aragVar));
        TextView textView5 = this.an;
        avnt avntVar2 = this.aq;
        if ((avntVar2.b & 4) != 0) {
            aragVar2 = avntVar2.f;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        zag.m(textView5, ajgl.b(aragVar2));
        TextView textView6 = this.ao;
        avnt avntVar3 = this.aq;
        if ((avntVar3.b & 16) != 0) {
            aragVar3 = avntVar3.h;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
        } else {
            aragVar3 = null;
        }
        zag.m(textView6, ajgl.b(aragVar3));
        TextView textView7 = this.ap;
        avnt avntVar4 = this.aq;
        if ((avntVar4.b & 32) != 0 && (aragVar4 = avntVar4.i) == null) {
            aragVar4 = arag.a;
        }
        zag.m(textView7, aafv.a(aragVar4, this.af, false));
        return inflate;
    }

    @Override // defpackage.akbi
    public final void oL(aopc aopcVar) {
        dismiss();
    }

    @Override // defpackage.dh, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.ai.d(this);
    }
}
