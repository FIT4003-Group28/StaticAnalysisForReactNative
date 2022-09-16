package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
/* compiled from: PG */
/* renamed from: xvj  reason: default package */
/* loaded from: classes4.dex */
public final class xvj extends xwm {
    public static final /* synthetic */ int ar = 0;
    private static final ColorDrawable as = new ColorDrawable(0);
    public ajmy ae;
    public acti af;
    public ayor ag;
    public aafo ah;
    public afvn ai;
    public aagi aj;
    public aplp ak;
    public EditText al;
    public xxe am;
    public boolean an;
    public iia ao;
    public vne ap;
    public xkj aq;
    private amuk at;

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        aoqu aoquVar;
        super.mQ(bundle);
        try {
            aoquVar = aphq.j(this.m, "renderer", aplp.a, aoos.b());
        } catch (RuntimeException unused) {
            zep.b("Failed to merge proto for renderer");
            aoquVar = null;
        }
        this.ak = (aplp) aoquVar;
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mS() {
        super.mS();
        Dialog dialog = this.d;
        if (dialog == null) {
            return;
        }
        Window window = dialog.getWindow();
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(as);
        window.setSoftInputMode(5);
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mc(layoutInflater, viewGroup, bundle);
        this.d.getWindow().requestFeature(1);
        View inflate = layoutInflater.inflate(R.layout.backstage_repost_fragment, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(R.id.repost_header_title);
        arag aragVar = this.ak.c;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        zag.m(textView, ajgl.b(aragVar));
        ((LinearLayout) inflate.findViewById(R.id.repost_header)).setOnClickListener(new xvf(this, 1));
        ((LinearLayout) inflate.findViewById(R.id.repost_description_top)).setOnClickListener(new xvf(this));
        ((LinearLayout) inflate.findViewById(R.id.repost_scroll_content)).setOnClickListener(new xvf(this, 2));
        TextView textView2 = (TextView) inflate.findViewById(R.id.repost_author_text);
        arag aragVar2 = this.ak.f;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        zag.m(textView2, ajgl.b(aragVar2));
        TextView textView3 = (TextView) inflate.findViewById(R.id.repost_privacy);
        arag aragVar3 = this.ak.h;
        if (aragVar3 == null) {
            aragVar3 = arag.a;
        }
        zag.m(textView3, ajgl.b(aragVar3));
        EditText editText = (EditText) inflate.findViewById(R.id.content);
        this.al = editText;
        arag aragVar4 = this.ak.g;
        if (aragVar4 == null) {
            aragVar4 = arag.a;
        }
        editText.setHint(ajgl.b(aragVar4));
        this.al.requestFocus();
        ImageView imageView = (ImageView) inflate.findViewById(R.id.repost_avatar);
        apoj apojVar = null;
        imageView.setImageBitmap(null);
        avhn avhnVar = this.ak.e;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        Uri s = akel.s(avhnVar, 24);
        if (s != null) {
            this.ae.g(imageView, s);
        }
        aunb aunbVar = this.ak.d;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(ButtonRendererOuterClass.buttonRenderer)) {
            apojVar = (apoj) aunbVar.qm(ButtonRendererOuterClass.buttonRenderer);
        }
        TextView textView4 = (TextView) inflate.findViewById(R.id.repost_character_count);
        int i = this.ak.i;
        StringBuilder sb = new StringBuilder(13);
        sb.append("0/");
        sb.append(i);
        zag.m(textView4, sb.toString());
        textView4.setVisibility(4);
        aplp aplpVar = this.ak;
        if ((aplpVar.b & 128) == 0) {
            BottomSheetBehavior.v(inflate.findViewById(R.id.user_mention_suggestions_bottom_sheet)).E(5);
        } else {
            apzg apzgVar = aplpVar.j;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            iia iiaVar = this.ao;
            EditText editText2 = this.al;
            this.am = iiaVar.a((CoordinatorLayout) inflate.findViewById(R.id.repost_coordinator_layout), editText2, (ViewGroup) inflate.findViewById(R.id.user_mention_suggestions_bottom_sheet), apzgVar, this.af, avvq.USER_MENTION_AUTO_COMPLETE_SOURCE_BACKSTAGE_POST, true);
        }
        YouTubeButton youTubeButton = (YouTubeButton) inflate.findViewById(R.id.repost_button);
        arag aragVar5 = apojVar.i;
        if (aragVar5 == null) {
            aragVar5 = arag.a;
        }
        youTubeButton.setText(ajgl.b(aragVar5));
        youTubeButton.setTextColor(zhn.j(rb(), R.attr.ytIconDisabled).orElse(0));
        youTubeButton.setEnabled(false);
        youTubeButton.setOnClickListener(new xvf(this, 3));
        this.al.addTextChangedListener(new xvg(this, youTubeButton, textView4));
        this.al.setOnFocusChangeListener(new xvh(this));
        this.al.setOnClickListener(new xvf(this, 4));
        amuf f = amuk.f();
        if ((this.ak.b & 1024) != 0) {
            f.h(this.aj.a(this.ai.c()).i(this.ak.l).I(noc.r).V(ona.t).k(aovf.class).X(this.ag).as(new ayqb() { // from class: xve
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    xvj xvjVar = xvj.this;
                    boolean booleanValue = ((aovf) obj).getShouldRequireViewerAck().booleanValue();
                    xvjVar.an = booleanValue;
                    if (!booleanValue) {
                        ylx.n(xvjVar, xvjVar.ap.b(new xvd(xvjVar), anjk.a), mbi.s, mbi.u);
                    }
                }
            }));
        }
        this.at = f.g();
        if ((this.ak.b & 1024) != 0) {
            ylx.n(this, anii.h(this.ap.a(), new xvd(this, 1), anjk.a), mbi.t, new zdt() { // from class: xvc
                @Override // defpackage.zdt
                public final void a(Object obj) {
                    xvj xvjVar = xvj.this;
                    ampq ampqVar = (ampq) obj;
                    boolean z = true;
                    if (ampqVar.h() && ((Boolean) ampqVar.c()).booleanValue()) {
                        z = false;
                    }
                    xvjVar.an = z;
                }
            });
        }
        inflate.findViewById(R.id.repost_cancel).setOnClickListener(new xvf(this, 5));
        return inflate;
    }

    @Override // defpackage.dh, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        amuk amukVar = this.at;
        if (amukVar != null) {
            int i = ((amxx) amukVar).c;
            for (int i2 = 0; i2 < i; i2++) {
                ((aypg) amukVar.get(i2)).qr();
            }
        }
    }
}
