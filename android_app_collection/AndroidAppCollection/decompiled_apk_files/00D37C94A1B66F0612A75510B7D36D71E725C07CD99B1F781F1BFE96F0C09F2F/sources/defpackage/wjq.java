package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: wjq  reason: default package */
/* loaded from: classes4.dex */
public final class wjq extends wio {
    public long a;
    public wjp b;
    private atwe c;
    private CountDownTimer d;

    private final View o(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i;
        arag aragVar;
        View inflate = layoutInflater.inflate(R.layout.verification_result_success_fragment, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        atwe atweVar = this.c;
        if (atweVar != null && (i = atweVar.b & 1) != 0) {
            if (i != 0) {
                aragVar = atweVar.c;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            textView.setText(ajgl.b(aragVar));
        }
        return inflate;
    }

    @Override // defpackage.dp
    public final void W() {
        super.W();
        this.d.cancel();
    }

    @Override // defpackage.dp
    public final void Y() {
        super.Y();
        long j = this.a;
        if (j == 0) {
            j = 3000;
        }
        wjo wjoVar = new wjo(this, j);
        this.d = wjoVar;
        wjoVar.start();
    }

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        byte[] byteArray = this.m.getByteArray("ARG_RENDERER");
        if (byteArray != null) {
            try {
                this.c = (atwe) aopi.parseFrom(atwe.a, byteArray, aoos.b());
            } catch (aopx e) {
                throw new RuntimeException("Failed to parse a known parcelable proto.", e);
            }
        }
        if (bundle != null) {
            this.a = bundle.getLong("SAVED_TIME_REMAINING_MILLIS");
        }
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mc(layoutInflater, viewGroup, bundle);
        Context b = wpu.b(mJ());
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(b);
        FrameLayout frameLayout = new FrameLayout(b);
        frameLayout.addView(o(frameLayout, cloneInContext));
        return frameLayout;
    }

    @Override // defpackage.dp, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        dt mJ = mJ();
        View view = this.O;
        if (mJ == null || view == null || !(view instanceof ViewGroup)) {
            return;
        }
        Bundle bundle = new Bundle();
        LayoutInflater cloneInContext = ((LayoutInflater) mJ.getSystemService("layout_inflater")).cloneInContext(wpu.b(mJ));
        oz(bundle);
        ViewGroup viewGroup = (ViewGroup) view;
        View o = o(viewGroup, cloneInContext);
        viewGroup.removeAllViews();
        viewGroup.addView(o);
    }

    @Override // defpackage.dp
    public final void oz(Bundle bundle) {
        bundle.putLong("SAVED_TIME_REMAINING_MILLIS", this.a);
    }
}
