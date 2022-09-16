package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: acie  reason: default package */
/* loaded from: classes.dex */
public final class acie extends acja implements View.OnClickListener {
    public aafo a;
    private Button ae;
    private apzg af;
    public ajmy b;
    public apoj c;
    private aqft d;
    private Button e;

    private final View o(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.lc_cool_off_fragment, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        TextView textView2 = (TextView) inflate.findViewById(R.id.body);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.icon);
        Button button = (Button) inflate.findViewById(R.id.learn_more_button);
        this.e = button;
        button.setOnClickListener(this);
        Button button2 = (Button) inflate.findViewById(R.id.ok_button);
        this.ae = button2;
        button2.setOnClickListener(this);
        aqft aqftVar = this.d;
        if (aqftVar != null) {
            arag aragVar = aqftVar.m;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            textView.setText(ajgl.b(aragVar));
            textView.requestFocus();
            textView.sendAccessibilityEvent(8);
            textView2.setText(ajgl.b((arag) this.d.g.get(0)));
            ajmy ajmyVar = this.b;
            avhn avhnVar = this.d.d;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            ajmyVar.h(imageView, avhnVar);
            arag aragVar2 = (arag) this.d.g.get(1);
            apzg apzgVar = ((arai) aragVar2.c.get(0)).m;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            this.af = apzgVar;
            this.e.setText(ajgl.b(aragVar2));
            Button button3 = this.e;
            arah arahVar = aragVar2.f;
            if (arahVar == null) {
                arahVar = arah.a;
            }
            aovr aovrVar = arahVar.c;
            if (aovrVar == null) {
                aovrVar = aovr.a;
            }
            button3.setContentDescription(aovrVar.c);
            apok apokVar = this.d.h;
            if (apokVar == null) {
                apokVar = apok.a;
            }
            apoj apojVar = apokVar.c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
            this.c = apojVar;
            Button button4 = this.ae;
            arag aragVar3 = apojVar.i;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
            button4.setText(ajgl.b(aragVar3));
            Button button5 = this.ae;
            aovs aovsVar = this.c.s;
            if (aovsVar == null) {
                aovsVar = aovs.a;
            }
            aovr aovrVar2 = aovsVar.c;
            if (aovrVar2 == null) {
                aovrVar2 = aovr.a;
            }
            button5.setContentDescription(aovrVar2.c);
        }
        return inflate;
    }

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        byte[] byteArray = this.m.getByteArray("ARG_RENDERER");
        if (byteArray != null) {
            try {
                this.d = (aqft) aopi.parseFrom(aqft.a, byteArray, aoos.b());
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
        apoj apojVar;
        apzg apzgVar;
        if (view == this.e && (apzgVar = this.af) != null) {
            this.a.a(apzgVar);
        }
        if (view != this.ae || (apojVar = this.c) == null) {
            return;
        }
        aafo aafoVar = this.a;
        apzg apzgVar2 = apojVar.p;
        if (apzgVar2 == null) {
            apzgVar2 = apzg.a;
        }
        aafoVar.a(apzgVar2);
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
