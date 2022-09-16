package defpackage;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kqq  reason: default package */
/* loaded from: classes3.dex */
public final class kqq extends kqn {
    public zhf ae;

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        mN(2, this.ae.a);
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mc(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.playlist_info_fragment, viewGroup, false);
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        toolbar.r(new View.OnClickListener() { // from class: kqp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kqq.this.dismiss();
            }
        });
        toolbar.w(rh().getString(R.string.playlist_info_header_title));
        Bundle bundle2 = this.m;
        if (bundle2 != null) {
            apzg b = aafr.b(bundle2.getByteArray("navigation_endpoint"));
            if (b.qn(aucy.a)) {
                aucx aucxVar = (aucx) b.qm(aucy.a);
                TextView textView = (TextView) inflate.findViewById(R.id.playlist_title);
                arag aragVar = aucxVar.c;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
                zag.m(textView, ajgl.b(aragVar));
                TextView textView2 = (TextView) inflate.findViewById(R.id.description);
                arag aragVar2 = aucxVar.b;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
                zag.m(textView2, ajgl.r(aragVar2));
            }
        }
        return inflate;
    }
}
