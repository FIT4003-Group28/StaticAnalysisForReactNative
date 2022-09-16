package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: acln  reason: default package */
/* loaded from: classes.dex */
public final class acln extends acjk implements View.OnClickListener {
    public aafo a;
    private ImageButton ae;
    private Button af;
    private Button ag;
    private apoj ah;
    private apoj ai;
    private apzg aj;
    public ache b;
    public ajmy c;
    public aclm d;
    private aqft e;

    private final View o(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.lc_safeguard_fragment, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        TextView textView2 = (TextView) inflate.findViewById(R.id.heading);
        TextView textView3 = (TextView) inflate.findViewById(R.id.bullet1);
        TextView textView4 = (TextView) inflate.findViewById(R.id.bullet2);
        TextView textView5 = (TextView) inflate.findViewById(R.id.bullet3);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.safeguard_image);
        ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.close_button);
        this.ae = imageButton;
        imageButton.setOnClickListener(this);
        Button button = (Button) inflate.findViewById(R.id.learn_more_button);
        this.ag = button;
        button.setOnClickListener(this);
        Button button2 = (Button) inflate.findViewById(R.id.get_started_button);
        this.af = button2;
        button2.setOnClickListener(this);
        aqft aqftVar = this.e;
        if (aqftVar != null) {
            arag aragVar = aqftVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            textView.setText(ajgl.b(aragVar));
            textView.requestFocus();
            textView.sendAccessibilityEvent(8);
            arag aragVar2 = this.e.m;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            textView2.setText(ajgl.b(aragVar2));
            ajmy ajmyVar = this.c;
            avhn avhnVar = this.e.d;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            ajmyVar.h(imageView, avhnVar);
            int size = this.e.g.size();
            if (size > 0) {
                SpannableString spannableString = new SpannableString(ajgl.b((arag) this.e.g.get(0)));
                spannableString.setSpan(new RelativeSizeSpan(2.0f), 0, 1, 33);
                textView3.setText(spannableString);
            }
            if (size > 1) {
                SpannableString spannableString2 = new SpannableString(ajgl.b((arag) this.e.g.get(1)));
                spannableString2.setSpan(new RelativeSizeSpan(2.0f), 0, 1, 33);
                textView4.setText(spannableString2);
            }
            if (size > 2) {
                SpannableString spannableString3 = new SpannableString(ajgl.b((arag) this.e.g.get(2)));
                spannableString3.setSpan(new RelativeSizeSpan(2.0f), 0, 1, 33);
                textView5.setText(spannableString3);
            }
            if (size > 3) {
                arag aragVar3 = (arag) this.e.g.get(3);
                if (aragVar3.c.size() > 0) {
                    apzg apzgVar = ((arai) aragVar3.c.get(0)).m;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    this.aj = apzgVar;
                    this.ag.setText(ajgl.b(aragVar3));
                    Button button3 = this.ag;
                    arah arahVar = aragVar3.f;
                    if (arahVar == null) {
                        arahVar = arah.a;
                    }
                    aovr aovrVar = arahVar.c;
                    if (aovrVar == null) {
                        aovrVar = aovr.a;
                    }
                    button3.setContentDescription(aovrVar.c);
                }
            }
            apok apokVar = this.e.i;
            if (apokVar == null) {
                apokVar = apok.a;
            }
            apoj apojVar = apokVar.c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
            this.ah = apojVar;
            ache acheVar = this.b;
            arhs arhsVar = apojVar.g;
            if (arhsVar == null) {
                arhsVar = arhs.a;
            }
            arhr b = arhr.b(arhsVar.c);
            if (b == null) {
                b = arhr.UNKNOWN;
            }
            this.ae.setImageDrawable(akf.a(rb(), acheVar.a(b)));
            ImageButton imageButton2 = this.ae;
            aovs aovsVar = this.ah.s;
            if (aovsVar == null) {
                aovsVar = aovs.a;
            }
            aovr aovrVar2 = aovsVar.c;
            if (aovrVar2 == null) {
                aovrVar2 = aovr.a;
            }
            imageButton2.setContentDescription(aovrVar2.c);
            apok apokVar2 = this.e.h;
            if (apokVar2 == null) {
                apokVar2 = apok.a;
            }
            apoj apojVar2 = apokVar2.c;
            if (apojVar2 == null) {
                apojVar2 = apoj.a;
            }
            this.ai = apojVar2;
            Button button4 = this.af;
            arag aragVar4 = apojVar2.i;
            if (aragVar4 == null) {
                aragVar4 = arag.a;
            }
            button4.setText(ajgl.b(aragVar4));
            Button button5 = this.af;
            aovs aovsVar2 = this.ai.s;
            if (aovsVar2 == null) {
                aovsVar2 = aovs.a;
            }
            aovr aovrVar3 = aovsVar2.c;
            if (aovrVar3 == null) {
                aovrVar3 = aovr.a;
            }
            button5.setContentDescription(aovrVar3.c);
        }
        return inflate;
    }

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        byte[] byteArray = this.m.getByteArray("ARG_RENDERER");
        if (byteArray != null) {
            try {
                this.e = (aqft) aopi.parseFrom(aqft.a, byteArray, aoos.b());
            } catch (aopx e) {
                throw new IllegalArgumentException("Failed to parse a known parcelable proto.", e);
            }
        }
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mc(layoutInflater, viewGroup, bundle);
        return o(viewGroup, layoutInflater);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.ag) {
            this.a.a(this.aj);
        } else if (view == this.ae) {
            this.d.A();
        } else if (view != this.af) {
        } else {
            this.d.H();
        }
    }

    @Override // defpackage.dp, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View view = this.O;
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        View o = o(viewGroup, mJ().getLayoutInflater());
        viewGroup.removeAllViews();
        viewGroup.addView(o);
    }
}
