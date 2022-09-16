package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: akrf  reason: default package */
/* loaded from: classes.dex */
public final class akrf extends akrj {
    public axnm a;
    sri b;
    private awnn c;
    private tee d;

    public static akrf a(awnn awnnVar, tee teeVar) {
        akrf akrfVar = new akrf();
        Bundle bundle = new Bundle();
        p(bundle, awnnVar);
        akrfVar.ae(bundle);
        akrfVar.d = teeVar;
        return akrfVar;
    }

    private static void p(Bundle bundle, awnn awnnVar) {
        bundle.putParcelable("element", new ParcelableMessageLite(awnnVar));
    }

    @Override // defpackage.dp
    public final void lU() {
        super.lU();
        this.b.onDetachedFromWindow();
    }

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        if (bundle == null) {
            bundle = this.m;
        }
        ParcelableMessageLite parcelableMessageLite = (ParcelableMessageLite) bundle.getParcelable("element");
        awnn awnnVar = parcelableMessageLite == null ? null : (awnn) parcelableMessageLite.a(awnn.a);
        if (awnnVar != null) {
            this.c = awnnVar;
        }
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.elements_fragment, viewGroup, false);
        sri sriVar = this.b;
        if (sriVar == null) {
            tdy a = tdz.a(((swq) this.a.get()).a);
            a.b = "StudioElements";
            a.b(false);
            a.d = this.d;
            sri sriVar2 = new sri(rb(), a.a());
            this.b = sriVar2;
            sriVar2.a(this.c.toByteArray());
        } else if (sriVar.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.b.getParent()).removeView(this.b);
        }
        frameLayout.addView(this.b);
        return frameLayout;
    }

    @Override // defpackage.dp
    public final void oz(Bundle bundle) {
        p(bundle, this.c);
    }
}
