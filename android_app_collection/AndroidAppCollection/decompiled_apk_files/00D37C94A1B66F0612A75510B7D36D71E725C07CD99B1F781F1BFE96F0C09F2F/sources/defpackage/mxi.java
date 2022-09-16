package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.Spanned;
import android.view.View;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.youtube.R;
import java.util.Map;
/* compiled from: PG */
/* renamed from: mxi  reason: default package */
/* loaded from: classes3.dex */
public class mxi extends mfs implements ajrm {
    public final View C;
    public Bitmap D;
    public String E;
    private final ajrx F;
    private final ajrp G;
    private ajrs H;
    private ggz I;
    private final aafo a;
    private final InlinePlaybackLifecycleController b;
    private final mbw c;
    private final mcj d;
    private final ajmu e;
    public final mxf f;

    /* JADX INFO: Access modifiers changed from: protected */
    public mxi(ajmy ajmyVar, ajxz ajxzVar, ajyc ajycVar, View view, View view2, View view3, Context context, aafo aafoVar, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, mbw mbwVar, mcj mcjVar, ajrx ajrxVar, fjn fjnVar, akem akemVar) {
        super(context, ajmyVar, ajrxVar, view2, aafoVar, ajxzVar, (jkv) null, (ftb) null, (kua) null);
        this.f = new mxf(ajmyVar, ajxzVar, ajycVar, view, view3, true, fjnVar, akemVar);
        this.a = aafoVar;
        this.b = inlinePlaybackLifecycleController;
        this.c = mbwVar;
        this.F = ajrxVar;
        this.G = new ajrp(aafoVar, ajrxVar, this);
        this.d = mcjVar;
        this.C = view2.findViewById(R.id.thumbnail_layout);
        ajmt a = ajmu.a();
        a.c = new mxh(this, mbwVar);
        this.e = a.a();
    }

    public static final boolean f(ggz ggzVar, ggz ggzVar2) {
        if (ggzVar == null || ggzVar2 == null) {
            return ggzVar == ggzVar2;
        }
        return akzj.f(ggzVar.b, ggzVar2.b);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.F.a();
    }

    public final aynr d(int i, fzq fzqVar) {
        if (i == 0) {
            return this.b.i(this.I);
        }
        InlinePlaybackLifecycleController inlinePlaybackLifecycleController = this.b;
        ggz ggzVar = this.I;
        int i2 = 2;
        if (i != 2) {
            i2 = 0;
        }
        return inlinePlaybackLifecycleController.j(ggzVar, fzqVar, i2);
    }

    @Override // defpackage.ajru
    /* renamed from: e */
    public final void oK(ajrs ajrsVar, ggz ggzVar) {
        apzg apzgVar;
        arag aragVar;
        arag aragVar2;
        avhn avhnVar;
        this.I = ggzVar;
        arjw arjwVar = ggzVar.b;
        this.E = arjwVar.k;
        avgw avgwVar = null;
        this.D = null;
        this.H = ajrsVar;
        ajrp ajrpVar = this.G;
        acti actiVar = ajrsVar.a;
        if ((arjwVar.b & 256) != 0) {
            apzgVar = arjwVar.i;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        ajrpVar.b(actiVar, apzgVar, ajrsVar.e(), this);
        if ((arjwVar.b & 16) != 0) {
            aragVar = arjwVar.f;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        Spanned b = ajgl.b(aragVar);
        if ((arjwVar.b & 16) != 0) {
            aragVar2 = arjwVar.f;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        p(b, ajgl.i(aragVar2), arjwVar.d, null);
        if ((arjwVar.b & 2) != 0) {
            avhnVar = arjwVar.c;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
        } else {
            avhnVar = null;
        }
        A(avhnVar, this.e);
        t(ohn.f(arjwVar.d));
        fmj fmjVar = this.p;
        if (fmjVar != null) {
            fmjVar.a();
        }
        aunb aunbVar = arjwVar.e;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(avhh.a)) {
            aunb aunbVar2 = arjwVar.e;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            avgwVar = (avgw) aunbVar2.qm(avhh.a);
        }
        if (avgwVar != null) {
            y(avgwVar, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g() {
        this.f.f(false);
    }

    @Override // defpackage.ajrm
    public final boolean h(View view) {
        mcj mcjVar = this.d;
        ggz ggzVar = this.I;
        aafo aafoVar = this.a;
        ajrs ajrsVar = this.H;
        return mcjVar.b(ggzVar, aafoVar, ajrsVar.a, ajrsVar.e(), this);
    }

    public final void i() {
        Bitmap bitmap = this.D;
        if (bitmap != null) {
            this.c.b(this.E, bitmap);
        }
    }

    @Override // defpackage.mfs, defpackage.ajrn
    public final void oq(Map map) {
        avhn avhnVar;
        map.put("VideoPresenterConstants.VIDEO_THUMBNAIL_VIEW_KEY", this.C);
        arjw arjwVar = this.I.b;
        if ((arjwVar.b & 2) != 0) {
            avhnVar = arjwVar.c;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
        } else {
            avhnVar = null;
        }
        map.put("VideoPresenterConstants.VIDEO_THUMBNAIL_DETAILS_KEY", avhnVar);
        this.d.a(this.I, map);
    }

    @Override // defpackage.mfs, defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        super.qZ(ajsaVar);
        this.C.setAlpha(1.0f);
        this.G.c();
    }
}
