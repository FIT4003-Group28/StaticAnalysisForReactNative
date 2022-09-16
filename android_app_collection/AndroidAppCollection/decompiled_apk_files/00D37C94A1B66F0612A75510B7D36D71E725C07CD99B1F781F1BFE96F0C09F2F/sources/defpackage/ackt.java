package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ackt  reason: default package */
/* loaded from: classes.dex */
public final class ackt extends acji implements View.OnClickListener {
    public ajmr a;
    private arag ae;
    private athj af;
    private apzg ag;
    private View ah;
    private View ai;
    private View aj;
    private Button ak;
    private TextView al;
    private TextView am;
    private TextView an;
    private TextView ao;
    private RecyclerView ap;
    private ajnj aq;
    public acti b;
    public ackr c;
    public aafo d;
    private String e;

    @Override // defpackage.actq
    protected final apzg kw() {
        return null;
    }

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        Bundle bundle2 = this.m;
        this.e = bundle2.getString("ARG_ERROR_MESSAGE", "");
        if (bundle2.containsKey("ARG_ERROR_MESSAGE_FORMATTED_STRING")) {
            this.ae = (arag) aphq.j(bundle2, "ARG_ERROR_MESSAGE_FORMATTED_STRING", arag.a, aoos.b());
        }
        if (bundle2.containsKey("ARG_ENDSCREEN_RENDERER")) {
            this.af = (athj) aphq.j(bundle2, "ARG_ENDSCREEN_RENDERER", athj.a, aoos.b());
        }
    }

    @Override // defpackage.dp
    public final void mS() {
        super.mS();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.ak, "translationY", rh().getDimensionPixelSize(R.dimen.lc_post_stream_next_button_translation), 0.0f);
        ofFloat.setDuration(400L);
        ofFloat.start();
    }

    @Override // defpackage.actq, defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mc(layoutInflater, viewGroup, bundle);
        FrameLayout frameLayout = new FrameLayout(mJ());
        frameLayout.addView(s(viewGroup));
        return frameLayout;
    }

    @Override // defpackage.actq
    protected final acti oi() {
        return this.b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ackr ackrVar;
        if (this.O == null || view != this.ak || (ackrVar = this.c) == null) {
            return;
        }
        ackrVar.S(this.ag);
    }

    @Override // defpackage.dp, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View view = this.O;
        if (!(view instanceof ViewGroup)) {
            return;
        }
        new Bundle();
        ViewGroup viewGroup = (ViewGroup) view;
        View s = s(viewGroup);
        viewGroup.removeAllViews();
        viewGroup.addView(s);
    }

    @Override // defpackage.actq
    protected final acup p() {
        return acuo.a(26108);
    }

    public final View s(ViewGroup viewGroup) {
        CharSequence charSequence;
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        int l;
        View inflate = mJ().getLayoutInflater().inflate(R.layout.lc_post_stream_fragment, viewGroup, false);
        this.ah = inflate.findViewById(R.id.post_stream_spinner);
        this.ai = inflate.findViewById(R.id.content);
        this.aj = inflate.findViewById(R.id.stream_layout);
        this.al = (TextView) inflate.findViewById(R.id.stream_header_text);
        this.am = (TextView) inflate.findViewById(R.id.stream_title);
        this.an = (TextView) inflate.findViewById(R.id.stream_account_name);
        this.ap = (RecyclerView) inflate.findViewById(R.id.stream_stats_recycler_view);
        this.aq = new ajnj(this.a, (ImageView) inflate.findViewById(R.id.stream_thumbnail));
        Button button = (Button) inflate.findViewById(R.id.next_button);
        this.ak = button;
        button.setOnClickListener(this);
        this.ao = (TextView) inflate.findViewById(R.id.privacy_setting_notice);
        dt mJ = mJ();
        if (mJ != null) {
            this.ah.setVisibility(8);
            this.ai.setVisibility(0);
            arag aragVar4 = this.ae;
            int i = 1;
            arag aragVar5 = null;
            if (aragVar4 != null) {
                charSequence = aafv.a(aragVar4, this.d, false);
            } else if (!TextUtils.isEmpty(this.e)) {
                charSequence = this.e;
            } else {
                athj athjVar = this.af;
                if (athjVar == null || (athjVar.b & 1) == 0) {
                    charSequence = null;
                } else {
                    arag aragVar6 = athjVar.c;
                    if (aragVar6 == null) {
                        aragVar6 = arag.a;
                    }
                    charSequence = ajgl.b(aragVar6);
                }
            }
            if (charSequence != null) {
                this.al.setText(charSequence);
                if (this.ae != null) {
                    this.al.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
            if (this.af != null) {
                this.aj.setVisibility(0);
                TextView textView = this.am;
                athj athjVar2 = this.af;
                if ((athjVar2.b & 2) != 0) {
                    aragVar = athjVar2.d;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                } else {
                    aragVar = null;
                }
                textView.setText(ajgl.b(aragVar));
                TextView textView2 = this.an;
                athj athjVar3 = this.af;
                if ((athjVar3.b & 4) != 0) {
                    aragVar2 = athjVar3.e;
                    if (aragVar2 == null) {
                        aragVar2 = arag.a;
                    }
                } else {
                    aragVar2 = null;
                }
                textView2.setText(ajgl.b(aragVar2));
                TextView textView3 = this.am;
                Object[] objArr = new Object[1];
                athj athjVar4 = this.af;
                if ((athjVar4.b & 2) != 0) {
                    aragVar3 = athjVar4.d;
                    if (aragVar3 == null) {
                        aragVar3 = arag.a;
                    }
                } else {
                    aragVar3 = null;
                }
                objArr[0] = ajgl.b(aragVar3);
                textView3.setContentDescription(O(R.string.lc_title_cd, objArr));
                ajnj ajnjVar = this.aq;
                avhn avhnVar = this.af.g;
                if (avhnVar == null) {
                    avhnVar = avhn.a;
                }
                ajnjVar.k(avhnVar);
                this.aq.i(ImageView.ScaleType.CENTER_CROP);
                this.ap.ag(new GridLayoutManager(rh().getInteger(R.integer.lc_post_stream_stat_column_count), null));
                this.ap.ad(new acks(mJ, this.af.i));
                if (this.af.h.size() > 0 && (((apok) this.af.h.get(0)).b & 1) != 0) {
                    apoj apojVar = ((apok) this.af.h.get(0)).c;
                    if (apojVar == null) {
                        apojVar = apoj.a;
                    }
                    apzg apzgVar = apojVar.o;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    this.ag = apzgVar;
                    Button button2 = this.ak;
                    if ((apojVar.b & 256) != 0 && (aragVar5 = apojVar.i) == null) {
                        aragVar5 = arag.a;
                    }
                    button2.setText(ajgl.b(aragVar5));
                    Context rb = rb();
                    Button button3 = this.ak;
                    if (apojVar.c == 1 && (l = akzj.l(((Integer) apojVar.d).intValue())) != 0) {
                        i = l;
                    }
                    acly.a(rb, button3, i);
                }
                athj athjVar5 = this.af;
                if ((athjVar5.b & 32) != 0) {
                    TextView textView4 = this.ao;
                    arag aragVar7 = athjVar5.j;
                    if (aragVar7 == null) {
                        aragVar7 = arag.a;
                    }
                    textView4.setText(ajgl.b(aragVar7));
                    TextView textView5 = this.ao;
                    arag aragVar8 = this.af.j;
                    if (aragVar8 == null) {
                        aragVar8 = arag.a;
                    }
                    textView5.setContentDescription(ajgl.b(aragVar8));
                    this.ao.setVisibility(0);
                    if (rb().getResources().getConfiguration().orientation == 2 && !zew.y(rb())) {
                        this.al.setVisibility(8);
                    }
                }
            }
        }
        return inflate;
    }
}
