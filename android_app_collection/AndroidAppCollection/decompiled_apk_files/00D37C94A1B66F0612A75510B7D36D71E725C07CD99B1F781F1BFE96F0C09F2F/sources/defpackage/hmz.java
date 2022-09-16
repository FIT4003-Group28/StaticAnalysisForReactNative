package defpackage;

import android.view.View;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: hmz  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class hmz implements View.OnClickListener {
    public final /* synthetic */ hni a;
    private final /* synthetic */ int b;

    public /* synthetic */ hmz(hni hniVar) {
        this.a = hniVar;
    }

    public /* synthetic */ hmz(hni hniVar, int i) {
        this.b = i;
        this.a = hniVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            hni hniVar = this.a;
            hniVar.r.H(3, new acte(actj.UPLOAD_VIDEO_EDITING_DONE_BUTTON), null);
            hniVar.I = true;
            hniVar.i();
            hniVar.D.dismiss();
            hniVar.l(view.getContext().getApplicationContext());
        } else if (i == 1) {
            hni hniVar2 = this.a;
            hniVar2.r.H(3, new acte(actj.EDIT_CREATOR_COMPLIANCE_DISMISS_BUTTON), null);
            hniVar2.D.dismiss();
        } else if (i != 2) {
            if (i != 3) {
                hni hniVar3 = this.a;
                hniVar3.r.H(3, new acte(actj.EDIT_CREATOR_COMPLIANCE_DISMISS_BUTTON), null);
                hniVar3.C = false;
                hniVar3.D.dismiss();
                return;
            }
            hni hniVar4 = this.a;
            hniVar4.r.H(3, new acte(actj.UPLOAD_VIDEO_EDITING_DONE_BUTTON), null);
            ylx.n(hniVar4.n, hniVar4.f209J.b(new hmx(hniVar4), anjk.a), etg.u, hmv.c);
            hniVar4.D.dismiss();
            hniVar4.l(view.getContext().getApplicationContext());
        } else {
            hni hniVar5 = this.a;
            hniVar5.r.H(3, new acte(actj.EDIT_CREATOR_COMPLIANCE_LEARN_MORE_BUTTON), null);
            aafo aafoVar = hniVar5.c;
            aopc aopcVar = (aopc) apzg.a.createBuilder();
            aopg aopgVar = UrlEndpointOuterClass.urlEndpoint;
            aopa createBuilder = avvk.a.createBuilder();
            String valueOf = String.valueOf(Locale.getDefault().getLanguage());
            String concat = valueOf.length() != 0 ? "https://support.google.com/youtube/answer/9528076?hl=".concat(valueOf) : new String("https://support.google.com/youtube/answer/9528076?hl=");
            createBuilder.copyOnWrite();
            avvk avvkVar = (avvk) createBuilder.instance;
            concat.getClass();
            avvkVar.b = 1 | avvkVar.b;
            avvkVar.c = concat;
            aopcVar.e(aopgVar, (avvk) createBuilder.mo39build());
            aafoVar.c((apzg) aopcVar.mo39build(), null);
        }
    }
}
