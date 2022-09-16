package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: eby  reason: default package */
/* loaded from: classes3.dex */
public final class eby extends ebq {
    public dt a;
    public ajxz ae;
    public fqv af;
    public ecd ag;
    public akbk ah;
    public YouTubeTextView ai;
    public YouTubeTextView aj;
    public ViewGroup ak;
    public ViewGroup al;
    public ViewGroup am;
    public Map an;
    public boolean ao;
    aase ap;
    private View aq;
    private View ar;
    private YouTubeTextView as;
    private YouTubeTextView at;
    private View au;
    private ajrs av;
    public fjy b;
    public aafo c;
    public ajmy d;
    public acti e;

    public final void aE(Throwable th, String str, View.OnClickListener onClickListener) {
        ViewGroup viewGroup = this.ak;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        s();
        this.at.setText(this.af.b(th));
        this.at.setVisibility(0);
        this.as.setText(str);
        this.as.setVisibility(0);
        this.au.setOnClickListener(onClickListener);
        this.au.setVisibility(0);
    }

    public final void aF() {
        ViewGroup viewGroup = this.ak;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        YouTubeTextView youTubeTextView = this.at;
        if (youTubeTextView != null) {
            youTubeTextView.setVisibility(8);
        }
        View view = this.au;
        if (view != null) {
            view.setVisibility(8);
        }
        YouTubeTextView youTubeTextView2 = this.as;
        if (youTubeTextView2 != null) {
            youTubeTextView2.setVisibility(8);
        }
        View view2 = this.ar;
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }

    @Override // defpackage.actq, defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.required_sign_in, viewGroup, false);
        this.aq = inflate;
        this.ak = (ViewGroup) inflate.findViewById(R.id.sign_in_layout);
        this.al = (ViewGroup) this.aq.findViewById(R.id.feedback_layout);
        this.am = (ViewGroup) this.aq.findViewById(R.id.learn_more_layout);
        this.at = (YouTubeTextView) this.aq.findViewById(R.id.error_message_text);
        this.as = (YouTubeTextView) this.aq.findViewById(R.id.error_title_text);
        this.au = this.aq.findViewById(R.id.error_retry_button);
        this.ai = (YouTubeTextView) this.aq.findViewById(R.id.title);
        this.aj = (YouTubeTextView) this.aq.findViewById(R.id.description);
        super.mc(layoutInflater, viewGroup, bundle);
        ajrs ajrsVar = new ajrs();
        this.av = ajrsVar;
        ajrsVar.a(this.e);
        this.an = new HashMap();
        this.ar = this.aq.findViewById(R.id.load_progress);
        aF();
        return this.aq;
    }

    @Override // defpackage.actq
    protected final acti oi() {
        return this.e;
    }

    @Override // defpackage.actq
    protected final acup p() {
        return acuo.a(76980);
    }

    public final void q(apoj apojVar, ViewGroup viewGroup, acup acupVar) {
        r(apojVar, viewGroup, acupVar, null, 0);
    }

    public final void r(apoj apojVar, ViewGroup viewGroup, acup acupVar, final akbi akbiVar, int i) {
        fjx a;
        final acte acteVar = acupVar != null ? new acte(acupVar) : null;
        akbi akbiVar2 = new akbi() { // from class: ebw
            @Override // defpackage.akbi
            public final void oL(aopc aopcVar) {
                eby ebyVar = eby.this;
                acum acumVar = acteVar;
                akbi akbiVar3 = akbiVar;
                if (acumVar != null) {
                    ebyVar.e.H(3, acumVar, null);
                }
                if (akbiVar3 != null) {
                    akbiVar3.oL(aopcVar);
                }
            }
        };
        if (i != 0) {
            a = this.b.b(akbiVar2, this.an, i);
        } else {
            a = this.b.a(akbiVar2, this.an);
        }
        a.oK(this.av, apojVar);
        a.b.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        viewGroup.addView(a.b);
        if (acteVar != null) {
            this.e.n(acteVar);
        }
    }

    public final void s() {
        View view = this.ar;
        if (view != null) {
            view.setVisibility(8);
        }
    }
}
