package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SlimVideoMetadataRendererOuterClass;
/* compiled from: PG */
/* renamed from: neq  reason: default package */
/* loaded from: classes3.dex */
public final class neq extends nez {
    private static final String a;
    private final aafo b;
    private final axnm c;
    private final mqm d;
    private final aadd e;
    private final ViewGroup f;
    private final TextView g;
    private final LinearLayout h;
    private final View i;
    private final ViewGroup m;
    private final bnk n;

    static {
        String valueOf = String.valueOf(System.getProperty("line.separator"));
        String valueOf2 = String.valueOf(System.getProperty("line.separator"));
        a = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public neq(Context context, axnm axnmVar, aafo aafoVar, mqn mqnVar, aadd aaddVar) {
        this.b = aafoVar;
        this.c = axnmVar;
        this.e = aaddVar;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.slim_video_description, (ViewGroup) null);
        this.f = viewGroup;
        this.m = (ViewGroup) viewGroup.findViewById(R.id.slim_channel_metadata_container);
        this.g = (TextView) viewGroup.findViewById(R.id.description);
        LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(R.id.metadata_row_container);
        this.h = linearLayout;
        this.i = viewGroup.findViewById(R.id.bottom_separator);
        Context context2 = (Context) ((axov) mqnVar.a).a;
        context2.getClass();
        ajsa ajsaVar = (ajsa) mqnVar.b.get();
        linearLayout.getClass();
        this.d = new mqm(context2, ajsaVar, linearLayout, new mql(context2, ajsaVar));
        bnr bnrVar = new bnr();
        fqs fqsVar = new fqs();
        fqsVar.y(R.id.container);
        bnrVar.f(fqsVar);
        nep nepVar = new nep();
        nepVar.y(R.id.slim_channel_metadata_container);
        nepVar.y(R.id.description);
        nepVar.y(R.id.metadata_row_container);
        nepVar.y(R.id.bottom_separator);
        bnrVar.f(nepVar);
        bne bneVar = new bne();
        bneVar.y(R.id.slim_channel_metadata_container);
        bneVar.b = 400L;
        bnrVar.f(bneVar);
        this.n = bnrVar;
    }

    private final void h() {
        int i = 1;
        boolean z = this.g.getVisibility() == 0 || this.h.getVisibility() == 0;
        int aV = awwc.aV(((auxk) this.k).f);
        if (aV != 0) {
            i = aV;
        }
        if (!z) {
            this.i.setVisibility(8);
        } else if (i != 2) {
            this.i.setVisibility(0);
        } else {
            this.i.setVisibility(4);
        }
    }

    private final void i() {
        arag aragVar;
        auxk auxkVar = (auxk) this.k;
        arag aragVar2 = null;
        if ((auxkVar.b & 1) != 0) {
            aragVar = auxkVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        Spanned b = ajgl.b(aragVar);
        if ((auxkVar.b & 2) != 0 && (aragVar2 = auxkVar.d) == null) {
            aragVar2 = arag.a;
        }
        Spanned a2 = aafv.a(aragVar2, this.b, false);
        if (this.l.f && (!TextUtils.isEmpty(b) || !TextUtils.isEmpty(a2))) {
            acti actiVar = this.j.a;
            arag aragVar3 = auxkVar.d;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
            aczo.d(aragVar3, actiVar);
            asxp asxpVar = this.e.a().e;
            if (asxpVar == null) {
                asxpVar = asxp.a;
            }
            if (asxpVar.aw) {
                TextView textView = this.g;
                textView.setTextColor(zhn.d(textView.getContext(), R.attr.ytTextPrimary));
            } else {
                TextView textView2 = this.g;
                textView2.setTextColor(zhn.d(textView2.getContext(), R.attr.ytTextSecondary));
            }
            this.g.setVisibility(0);
            this.g.setImportantForAccessibility(1);
            this.g.setText(ajgl.k(a, b, a2));
            TextView textView3 = this.g;
            asxp asxpVar2 = this.e.a().e;
            if (asxpVar2 == null) {
                asxpVar2 = asxp.a;
            }
            textView3.setTextIsSelectable(asxpVar2.U);
            return;
        }
        this.g.setVisibility(8);
        this.g.setImportantForAccessibility(2);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void j() {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.neq.j():void");
    }

    private final void k() {
        this.m.setVisibility(8);
        if (this.l.f) {
            auxk auxkVar = (auxk) this.k;
            if ((auxkVar.b & 64) == 0) {
                return;
            }
            aunb aunbVar = auxkVar.g;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (!aunbVar.qn(SlimVideoMetadataRendererOuterClass.slimChannelMetadataRenderer)) {
                return;
            }
            this.m.setVisibility(0);
            if (this.m.getChildCount() != 0) {
                return;
            }
            nek nekVar = (nek) this.c.get();
            this.m.addView(nekVar.a);
            nekVar.oK(this.j, (auwu) aunbVar.qm(SlimVideoMetadataRendererOuterClass.slimChannelMetadataRenderer));
        }
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.f;
    }

    @Override // defpackage.nez
    protected final void d() {
        k();
        i();
        j();
        h();
    }

    @Override // defpackage.nez
    protected final void e() {
        bno.c(this.f);
        mqm mqmVar = this.d;
        mqmVar.e = 0;
        mqmVar.d = null;
        mqmVar.c.e(mqmVar.b);
        mqmVar.d(false);
        if (this.m.getChildCount() > 0) {
            ((nek) this.c.get()).e();
            this.m.removeAllViews();
        }
    }

    @Override // defpackage.nez, defpackage.odj
    public final void oT() {
        bno.b(this.f, this.n);
        k();
        i();
        j();
        h();
    }
}
