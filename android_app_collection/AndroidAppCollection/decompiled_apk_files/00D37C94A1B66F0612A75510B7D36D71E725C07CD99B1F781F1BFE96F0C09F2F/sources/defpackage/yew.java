package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: yew  reason: default package */
/* loaded from: classes4.dex */
public final class yew extends yea implements ajgw, akbi, xyk {
    public akbn ae;
    public ajmy af;
    public aafo ag;
    public acti ah;
    public xyn ai;
    public yni aj;
    private apoj ak;
    private avns al;

    private final void aG(TextView textView, apok apokVar, Map map) {
        akbm a = this.ae.a(textView);
        apoj apojVar = null;
        if (apokVar != null && (apokVar.b & 1) != 0 && (apojVar = apokVar.c) == null) {
            apojVar = apoj.a;
        }
        a.a(apojVar, this.ah, map);
        a.d = this;
    }

    @Override // defpackage.ajgw
    public final void a() {
    }

    @Override // defpackage.ajgw
    public final void b() {
        dismiss();
    }

    @Override // defpackage.ajgw
    public final void c(boolean z) {
    }

    @Override // defpackage.xyk
    public final void d() {
        ku();
    }

    @Override // defpackage.xyk
    public final void e() {
        ku();
    }

    @Override // defpackage.xym
    public final boolean g() {
        return true;
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        mN(0, R.style.UnlimitedFamily);
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        apoj apojVar;
        arag aragVar;
        arag aragVar2;
        super.mc(layoutInflater, viewGroup, bundle);
        if (bundle == null) {
            bundle = this.m;
        }
        try {
            this.al = (avns) aopi.parseFrom(avns.a, bundle.getByteArray("UnlimitedFamilyMessageInterstitialRenderer"), aoos.b());
        } catch (aopx unused) {
        }
        arag aragVar3 = null;
        if (this.al == null) {
            return null;
        }
        View inflate = layoutInflater.inflate(R.layout.family_post_purchase_fragment_view, viewGroup, false);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.thumb_image_view);
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        TextView textView2 = (TextView) inflate.findViewById(R.id.content);
        TextView textView3 = (TextView) inflate.findViewById(R.id.footer);
        TextView textView4 = (TextView) inflate.findViewById(R.id.action);
        TextView textView5 = (TextView) inflate.findViewById(R.id.dismiss);
        HashMap hashMap = new HashMap();
        hashMap.put("confirmDialogControllerListener", this);
        apok apokVar = this.al.h;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        aG(textView4, apokVar, null);
        apok apokVar2 = this.al.g;
        if (apokVar2 == null) {
            apokVar2 = apok.a;
        }
        aG(textView5, apokVar2, hashMap);
        apok apokVar3 = this.al.h;
        if (apokVar3 == null) {
            apokVar3 = apok.a;
        }
        if ((apokVar3.b & 1) != 0) {
            apok apokVar4 = this.al.h;
            if (apokVar4 == null) {
                apokVar4 = apok.a;
            }
            apojVar = apokVar4.c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
        } else {
            apojVar = null;
        }
        this.ak = apojVar;
        avns avnsVar = this.al;
        if ((avnsVar.b & 2) != 0) {
            aragVar = avnsVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(textView, ajgl.b(aragVar));
        avns avnsVar2 = this.al;
        if ((avnsVar2.b & 4) != 0) {
            aragVar2 = avnsVar2.e;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        zag.m(textView2, aafv.a(aragVar2, this.ag, false));
        avns avnsVar3 = this.al;
        if ((avnsVar3.b & 8) != 0 && (aragVar3 = avnsVar3.f) == null) {
            aragVar3 = arag.a;
        }
        zag.m(textView3, aafv.a(aragVar3, this.ag, false));
        ajmy ajmyVar = this.af;
        avhn avhnVar = this.al.c;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        ajmyVar.h(imageView, avhnVar);
        this.ai.a(this);
        return inflate;
    }

    @Override // defpackage.akbi
    public final void oL(aopc aopcVar) {
        if (aopcVar == null || !((apoj) aopcVar.mo39build()).equals(this.ak)) {
            return;
        }
        apzg apzgVar = this.ak.o;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        if (apzgVar.qn(UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.unlimitedCreateFamilyEndpoint)) {
            return;
        }
        dismiss();
    }

    @Override // defpackage.dh
    public final Dialog oy(Bundle bundle) {
        Dialog oy = super.oy(bundle);
        oy.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: yev
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                yew yewVar = yew.this;
                if (i == 4 && keyEvent.getAction() == 1) {
                    yewVar.aj.d(new yem());
                    return false;
                }
                return false;
            }
        });
        return oy;
    }
}
