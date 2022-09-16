package defpackage;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.MdxPairingEndpointOuterClass;
/* compiled from: PG */
/* renamed from: addg  reason: default package */
/* loaded from: classes.dex */
public final class addg extends addh {
    public addf a;

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final addf addfVar = this.a;
        RecyclerView recyclerView = (RecyclerView) layoutInflater.inflate(R.layout.mdx_delete_tv_codes_fragment, viewGroup, false);
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopcVar.e(MdxPairingEndpointOuterClass.mdxPairingEndpoint, atdo.a);
        addfVar.b.d(acuo.a(27857), (apzg) aopcVar.mo39build(), null);
        addfVar.d = new adde(layoutInflater.getContext(), new View.OnClickListener() { // from class: adcy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                addf addfVar2 = addf.this;
                addfVar2.b.H(3, new acte(acuo.b(27858)), null);
                adif adifVar = (adif) view.getTag();
                addc addcVar = new addc();
                addcVar.ae = new adda(addfVar2);
                Bundle bundle2 = new Bundle();
                bundle2.putString("deviceId", adifVar.h().c);
                bundle2.putString("screenName", adifVar.b());
                addcVar.aD(addfVar2.a);
                addcVar.ae(bundle2);
                addcVar.qv(addfVar2.a.mJ().getSupportFragmentManager(), "confirmRemoveDialog");
            }
        }, addfVar.b);
        layoutInflater.getContext();
        recyclerView.ag(new LinearLayoutManager());
        recyclerView.ad(addfVar.d);
        return recyclerView;
    }
}
