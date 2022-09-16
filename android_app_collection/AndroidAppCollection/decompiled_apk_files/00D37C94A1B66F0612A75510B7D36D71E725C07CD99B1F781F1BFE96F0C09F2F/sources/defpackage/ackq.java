package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ackq  reason: default package */
/* loaded from: classes.dex */
public final class ackq extends acjh {
    public acti a;
    public swq b;
    private aqtb c;
    private View d;
    private ScrollView e;

    @Override // defpackage.actq
    protected final apzg kw() {
        return null;
    }

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        Bundle bundle2 = this.m;
        if (bundle2.containsKey("ARG_ENDSCREEN_RENDERER")) {
            this.c = (aqtb) aphq.j(bundle2, "ARG_ENDSCREEN_RENDERER", aqtb.a, aoos.b());
        }
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
        return this.a;
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
        View inflate = mJ().getLayoutInflater().inflate(R.layout.lc_post_costream_fragment, viewGroup, false);
        this.d = inflate.findViewById(R.id.post_stream_spinner);
        this.e = (ScrollView) inflate.findViewById(R.id.content);
        if (mJ() != null) {
            this.d.setVisibility(8);
            this.e.setVisibility(0);
            if (this.c != null) {
                tdy a = tdz.a(this.b.a);
                a.b = "CostreamEndscreenElements";
                a.b(false);
                sri sriVar = new sri(rb(), a.a());
                sriVar.a(this.c.toByteArray());
                this.e.addView(sriVar);
            }
        }
        return inflate;
    }
}
