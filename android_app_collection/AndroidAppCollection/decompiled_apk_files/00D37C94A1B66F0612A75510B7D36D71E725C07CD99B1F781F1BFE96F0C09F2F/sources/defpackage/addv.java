package defpackage;

import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.MdxPairingEndpointOuterClass;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: addv  reason: default package */
/* loaded from: classes.dex */
public final class addv extends addk {
    public addu a;

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        if (!this.K) {
            this.K = true;
            if (!ap() || this.G) {
                return;
            }
            this.A.c();
        }
    }

    @Override // defpackage.dp
    public final void mS() {
        super.mS();
        addu adduVar = this.a;
        adduVar.d.N();
        if (adduVar.t == null) {
            adduVar.t = new adds(adduVar);
        }
        adduVar.h.registerReceiver(adduVar.t, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        adduVar.d();
        ((bhd) adduVar.b.get()).q(adduVar.c, adduVar.w, 1);
        adduVar.c();
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        addu adduVar = this.a;
        View inflate = layoutInflater.inflate(R.layout.mdx_pair_with_tv_fragment, viewGroup, false);
        adduVar.h = inflate.getContext();
        adduVar.v = new Handler(Looper.getMainLooper());
        adduVar.g = adduVar.e;
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopcVar.e(MdxPairingEndpointOuterClass.mdxPairingEndpoint, atdo.a);
        adduVar.g.d(acuo.a(27846), (apzg) aopcVar.mo39build(), null);
        adduVar.i = (ScrollView) inflate;
        adduVar.j = (TextView) inflate.findViewById(R.id.header);
        adduVar.k = (LinearLayout) inflate.findViewById(R.id.available_tv_container);
        adduVar.l = new ArrayList(10);
        adduVar.m = new addo(adduVar, 1);
        adduVar.n = inflate.findViewById(R.id.no_tvs_found_title);
        adduVar.o = (TextView) inflate.findViewById(R.id.no_tvs_found_summary);
        adduVar.p = (TextView) inflate.findViewById(R.id.no_tvs_found_button);
        adduVar.p.setOnClickListener(new addo(adduVar));
        adduVar.q = inflate.findViewById(R.id.tv_code);
        adduVar.q.setOnClickListener(new addo(adduVar, 2));
        adduVar.r = inflate.findViewById(R.id.delete_tv_codes_separator);
        adduVar.s = inflate.findViewById(R.id.delete_tv_codes_title);
        adduVar.s.setOnClickListener(new addo(adduVar, 3));
        inflate.findViewById(R.id.not_finding_tv_title).setOnClickListener(new addo(adduVar, 4));
        adduVar.g.n(new acte(acuo.b(27852)));
        return inflate;
    }

    @Override // defpackage.dp
    public final void my() {
        super.my();
        addu adduVar = this.a;
        adduVar.h.unregisterReceiver(adduVar.t);
        ((bhd) adduVar.b.get()).r(adduVar.w);
        adduVar.d.O();
    }
}
