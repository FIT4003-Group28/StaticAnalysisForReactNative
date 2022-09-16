package defpackage;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteButton;
import com.google.android.libraries.youtube.mdx.smartremote.DpadView;
import com.google.android.libraries.youtube.mdx.smartremote.MdxSmartRemoteActivity;
import com.google.android.libraries.youtube.mdx.smartremote.MicrophoneView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: adsj  reason: default package */
/* loaded from: classes.dex */
public final class adsj extends adrx {
    public adsg a;

    @Override // defpackage.dp
    public final void mS() {
        super.mS();
        MdxSmartRemoteActivity mdxSmartRemoteActivity = (MdxSmartRemoteActivity) mJ();
        adsg adsgVar = this.a;
        int i = mdxSmartRemoteActivity.f;
        int i2 = mdxSmartRemoteActivity.e;
        View findViewById = mdxSmartRemoteActivity.findViewById(16908290);
        adsgVar.D = i;
        adsgVar.A = i2;
        adsgVar.m = findViewById;
        adsgVar.b.g(adsgVar);
        adnt adntVar = adsgVar.c;
        if (adntVar != null) {
            adsgVar.e(adntVar.a(), adsgVar.c.k().b());
        }
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        adsg adsgVar = this.a;
        adsgVar.n = layoutInflater.inflate(R.layout.mdx_smart_remote_fragment, viewGroup, false);
        adsgVar.l = adsgVar.n.getContext();
        adsgVar.j = new adso(adsgVar.l, adsgVar.d, adsgVar);
        adsgVar.p = (TextView) adsgVar.n.findViewById(R.id.loading_text);
        adsgVar.q = (TextView) adsgVar.n.findViewById(R.id.title);
        adsgVar.r = (MediaRouteButton) adsgVar.n.findViewById(R.id.cast_icon);
        adsgVar.o = (ProgressBar) adsgVar.n.findViewById(R.id.loading_spinner);
        adsgVar.s = (DpadView) adsgVar.n.findViewById(R.id.dpad);
        adsgVar.t = (TextView) adsgVar.n.findViewById(R.id.voice_query);
        adsgVar.u = (TextView) adsgVar.n.findViewById(R.id.voice_tips);
        adsgVar.v = (MicrophoneView) adsgVar.n.findViewById(R.id.mic);
        adsgVar.w = adsgVar.n.findViewById(R.id.back);
        adsgVar.x = adsgVar.n.findViewById(R.id.tap_mic);
        Resources resources = adsgVar.l.getResources();
        adsgVar.z = new String[]{resources.getString(R.string.mdx_smart_remote_voice_tips_1), resources.getString(R.string.mdx_smart_remote_voice_tips_2), resources.getString(R.string.mdx_smart_remote_voice_tips_3), resources.getString(R.string.mdx_smart_remote_voice_tips_4), resources.getString(R.string.mdx_smart_remote_voice_tips_5), resources.getString(R.string.mdx_smart_remote_voice_tips_6), resources.getString(R.string.mdx_smart_remote_voice_tips_7), resources.getString(R.string.mdx_smart_remote_voice_tips_8), resources.getString(R.string.mdx_smart_remote_voice_tips_9), resources.getString(R.string.mdx_smart_remote_voice_tips_10), resources.getString(R.string.mdx_smart_remote_voice_tips_11), resources.getString(R.string.mdx_smart_remote_voice_tips_12), resources.getString(R.string.mdx_smart_remote_voice_tips_13), resources.getString(R.string.mdx_smart_remote_voice_tips_14)};
        adsgVar.h.d(acuo.a(61411), null, null);
        adsgVar.o.getIndeterminateDrawable().setColorFilter(zhn.d(adsgVar.l, R.attr.ytStaticBrandRed), PorterDuff.Mode.SRC_IN);
        adsgVar.h.n(new acte(acuo.b(61403)));
        adsgVar.n.findViewById(R.id.collapse).setOnClickListener(new adsa(adsgVar, 1));
        ((acsx) adsgVar.h).D(new acte(acuo.b(61410)));
        ((acsx) adsgVar.h).D(new acte(acuo.b(61404)));
        ((acsx) adsgVar.h).D(new acte(acuo.b(61406)));
        ((acsx) adsgVar.h).D(new acte(acuo.b(61409)));
        ((acsx) adsgVar.h).D(new acte(acuo.b(61405)));
        adsgVar.s.e = new adry(adsgVar);
        ((acsx) adsgVar.h).D(new acte(acuo.b(61401)));
        adsgVar.w.setOnClickListener(new adsa(adsgVar));
        ((acsx) adsgVar.h).D(new acte(acuo.b(61407)));
        adsgVar.v.setOnClickListener(new adsa(adsgVar, 2));
        if (!adsgVar.y) {
            adsgVar.h.n(new acte(acuo.b(61402)));
            adsgVar.r.e(adsgVar.l.getResources().getDrawable(2131231540));
            adsgVar.r.g(adsgVar.f);
            adsgVar.r.d(adsgVar.e);
            adsgVar.r.setOnClickListener(new adsa(adsgVar, 3));
        }
        adsgVar.n.findViewById(R.id.privacy).setOnClickListener(new adsa(adsgVar, 4));
        return adsgVar.n;
    }

    @Override // defpackage.dp
    public final void my() {
        super.my();
        adsg adsgVar = this.a;
        adsgVar.m = null;
        adsgVar.b.i(adsgVar);
        if (adsgVar.k) {
            adsgVar.j.g();
            adnt adntVar = adsgVar.c;
            if (adntVar == null) {
                return;
            }
            adntVar.Q(3, null, null);
        }
    }
}
