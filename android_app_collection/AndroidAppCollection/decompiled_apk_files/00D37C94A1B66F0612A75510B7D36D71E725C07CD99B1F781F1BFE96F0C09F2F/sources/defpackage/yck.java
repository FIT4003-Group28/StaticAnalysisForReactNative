package defpackage;

import android.content.DialogInterface;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.UnpluggedPauseMembershipDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: yck  reason: default package */
/* loaded from: classes4.dex */
public final class yck implements aafl {
    private final acth a;
    private final ybc b;

    public yck(acth acthVar, ybc ybcVar) {
        this.a = acthVar;
        this.b = ybcVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        apoj apojVar;
        apoj apojVar2;
        aunb aunbVar = ((YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand) apzgVar.qm(YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand.ypcPauseMembershipDialogCommand)).b;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        avrd avrdVar = (avrd) aunbVar.qm(UnpluggedPauseMembershipDialogRendererOuterClass.unpluggedPauseMembershipDialogRenderer);
        ajrs ajrsVar = new ajrs();
        ajrsVar.a(this.a.oi());
        final ybc ybcVar = this.b;
        ybcVar.j = avrdVar;
        ybcVar.i.setOnShowListener(new DialogInterface.OnShowListener() { // from class: yax
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ybc ybcVar2 = ybc.this;
                if (ybcVar2.j.i.size() > 0) {
                    ybcVar2.a.d(ybcVar2.j.i, null);
                }
            }
        });
        ybcVar.i.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: yaw
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                ybc ybcVar2 = ybc.this;
                if (ybcVar2.j.j.size() > 0) {
                    ybcVar2.a.d(ybcVar2.j.j, null);
                }
            }
        });
        TextView textView = ybcVar.c;
        arag aragVar = ybcVar.j.b;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        zag.m(textView, ajgl.b(aragVar));
        Spanned[] n = ajgl.n(ybcVar.j.c);
        zag.m(ybcVar.d, ybc.a(n, 0));
        zag.m(ybcVar.e, ybc.a(n, 1));
        ybcVar.f.setMax(ybcVar.j.d.size() - 1);
        ybcVar.f.setOnSeekBarChangeListener(new ybb(ybcVar));
        int i = ybcVar.j.e;
        ybcVar.k = i;
        ybcVar.f.setProgress(i);
        ybcVar.b();
        final acti actiVar = ajrsVar.a;
        akbm akbmVar = ybcVar.g;
        apok apokVar = ybcVar.j.f;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        if ((apokVar.b & 1) != 0) {
            apok apokVar2 = ybcVar.j.f;
            if (apokVar2 == null) {
                apokVar2 = apok.a;
            }
            apojVar = apokVar2.c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
        } else {
            apojVar = null;
        }
        akbmVar.b(apojVar, actiVar);
        ybcVar.g.d = new akbi() { // from class: yaz
            @Override // defpackage.akbi
            public final void oL(aopc aopcVar) {
                ybc.this.i.dismiss();
            }
        };
        akbm akbmVar2 = ybcVar.h;
        apok apokVar3 = ybcVar.j.g;
        if (apokVar3 == null) {
            apokVar3 = apok.a;
        }
        if ((apokVar3.b & 1) != 0) {
            apok apokVar4 = ybcVar.j.g;
            if (apokVar4 == null) {
                apokVar4 = apok.a;
            }
            apojVar2 = apokVar4.c;
            if (apojVar2 == null) {
                apojVar2 = apoj.a;
            }
        } else {
            apojVar2 = null;
        }
        akbmVar2.b(apojVar2, actiVar);
        ybcVar.h.d = new akbi() { // from class: yba
            @Override // defpackage.akbi
            public final void oL(aopc aopcVar) {
                ybc ybcVar2 = ybc.this;
                actiVar.H(3, new acte(((apoj) aopcVar.instance).t), null);
                ybcVar2.i.cancel();
            }
        };
        ybcVar.g.e = new akbh() { // from class: yay
            @Override // defpackage.akbh
            public final Map a() {
                ybc ybcVar2 = ybc.this;
                HashMap hashMap = new HashMap();
                avrd avrdVar2 = ybcVar2.j;
                hashMap.put("pause_subscription_resume_time_ms_key", Long.valueOf(((avrc) avrdVar2.d.get(ybcVar2.k)).e));
                return hashMap;
            }
        };
        actiVar.u(new acte(avrdVar.h), null);
        View findViewById = ybcVar.b.findViewById(R.id.scroll_body);
        double d = ybcVar.i.getContext().getResources().getDisplayMetrics().heightPixels;
        Double.isNaN(d);
        int i2 = (int) (d * 0.5d);
        findViewById.getLayoutParams().height = -2;
        if (findViewById.getMeasuredHeight() > i2) {
            findViewById.getLayoutParams().height = i2;
        }
        ybcVar.i.show();
    }
}
