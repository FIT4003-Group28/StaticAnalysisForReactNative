package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.PhoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: wjg  reason: default package */
/* loaded from: classes4.dex */
public final class wjg extends wil {
    public atwq a;
    public wjf b;
    public zhf c;
    public ajve d;

    public static final boolean o(atwq atwqVar) {
        if (atwqVar != null) {
            atwp atwpVar = atwqVar.e;
            if (atwpVar == null) {
                atwpVar = atwp.a;
            }
            apoj apojVar = atwpVar.b;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
            if ((apojVar.b & 256) == 0) {
                return false;
            }
            atwp atwpVar2 = atwqVar.e;
            if (atwpVar2 == null) {
                atwpVar2 = atwp.a;
            }
            apoj apojVar2 = atwpVar2.b;
            if (apojVar2 == null) {
                apojVar2 = apoj.a;
            }
            apzg apzgVar = apojVar2.o;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            atwf atwfVar = ((PhoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint) apzgVar.qm(PhoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint.phoneVerificationContactNumberInputEndpoint)).b;
            if (atwfVar == null) {
                atwfVar = atwf.a;
            }
            return (atwfVar.b & 1) != 0;
        }
        return false;
    }

    private final View p(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        arag aragVar;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.verification_intro_fragment, viewGroup, false);
        TextView textView = (TextView) viewGroup2.findViewById(R.id.title);
        TextView textView2 = (TextView) viewGroup2.findViewById(R.id.body);
        TextView textView3 = (TextView) viewGroup2.findViewById(R.id.consent);
        ImageButton imageButton = (ImageButton) viewGroup2.findViewById(R.id.back_arrow_button);
        Button button = (Button) viewGroup2.findViewById(R.id.get_started_button);
        Button button2 = (Button) viewGroup2.findViewById(R.id.learn_more_button);
        atwp atwpVar = this.a.e;
        if (atwpVar == null) {
            atwpVar = atwp.a;
        }
        apoj apojVar = atwpVar.b;
        if (apojVar == null) {
            apojVar = apoj.a;
        }
        if ((apojVar.b & 256) != 0) {
            atwp atwpVar2 = this.a.e;
            if (atwpVar2 == null) {
                atwpVar2 = atwp.a;
            }
            apoj apojVar2 = atwpVar2.b;
            if (apojVar2 == null) {
                apojVar2 = apoj.a;
            }
            aragVar = apojVar2.i;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        button.setText(ajgl.b(aragVar).toString().toUpperCase(Locale.getDefault()));
        atwq atwqVar = this.a;
        if ((atwqVar.b & 2) != 0) {
            arag aragVar2 = atwqVar.c;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            textView.setText(ajgl.b(aragVar2));
        }
        atwq atwqVar2 = this.a;
        if ((atwqVar2.b & 4) != 0) {
            arag aragVar3 = atwqVar2.d;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
            textView2.setText(ajgl.b(aragVar3));
        }
        atwq atwqVar3 = this.a;
        if ((atwqVar3.b & 64) == 0) {
            textView3.setVisibility(8);
        } else {
            arag aragVar4 = atwqVar3.i;
            if (aragVar4 == null) {
                aragVar4 = arag.a;
            }
            textView3.setText(ajgl.c(aragVar4, this.d));
        }
        atwp atwpVar3 = this.a.f;
        if (atwpVar3 == null) {
            atwpVar3 = atwp.a;
        }
        apoj apojVar3 = atwpVar3.b;
        if (apojVar3 == null) {
            apojVar3 = apoj.a;
        }
        if ((apojVar3.b & 256) != 0) {
            atwp atwpVar4 = this.a.f;
            if (atwpVar4 == null) {
                atwpVar4 = atwp.a;
            }
            apoj apojVar4 = atwpVar4.b;
            if (apojVar4 == null) {
                apojVar4 = apoj.a;
            }
            if ((apojVar4.b & 16384) != 0) {
                atwp atwpVar5 = this.a.f;
                if (atwpVar5 == null) {
                    atwpVar5 = atwp.a;
                }
                apoj apojVar5 = atwpVar5.b;
                if (apojVar5 == null) {
                    apojVar5 = apoj.a;
                }
                arag aragVar5 = apojVar5.i;
                if (aragVar5 == null) {
                    aragVar5 = arag.a;
                }
                button2.setText(ajgl.b(aragVar5).toString().toUpperCase(Locale.getDefault()));
                button2.setOnClickListener(new wjd(this, apojVar5));
            }
        }
        imageButton.setOnClickListener(new wje(this, 1));
        button.setOnClickListener(new wje(this));
        return viewGroup2;
    }

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        Bundle bundle2 = this.m;
        if (bundle2.containsKey("ARG_RENDERER")) {
            try {
                this.a = (atwq) aphq.i(bundle2, "ARG_RENDERER", atwq.a, aoos.b());
            } catch (aopx e) {
                throw new RuntimeException("Failed to parse a known parcelable proto.", e);
            }
        }
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mc(layoutInflater, viewGroup, bundle);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(layoutInflater.getContext(), this.c.a);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        FrameLayout frameLayout = new FrameLayout(contextThemeWrapper);
        if (o(this.a)) {
            frameLayout.addView(p(frameLayout, cloneInContext));
        } else {
            zep.l("PhoneVerificationIntroRenderer invalid.");
            wjf wjfVar = this.b;
            if (wjfVar != null) {
                wjfVar.aI();
            }
        }
        return frameLayout;
    }

    @Override // defpackage.dp, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Context rb = rb();
        View view = this.O;
        if (rb == null || view == null || !(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        View p = p(viewGroup, LayoutInflater.from(new ContextThemeWrapper(rb, this.c.a)));
        viewGroup.removeAllViews();
        viewGroup.addView(p);
    }
}
