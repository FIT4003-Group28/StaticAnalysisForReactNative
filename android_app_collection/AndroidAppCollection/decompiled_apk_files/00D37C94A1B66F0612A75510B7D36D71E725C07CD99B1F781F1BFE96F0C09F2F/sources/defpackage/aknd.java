package defpackage;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: aknd  reason: default package */
/* loaded from: classes.dex */
public final class aknd extends akna {
    public zhf ae;

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        mN(2, this.ae.a);
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.scan_code, viewGroup, false);
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        toolbar.r(new View.OnClickListener() { // from class: aknc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aknd.this.dismiss();
            }
        });
        toolbar.o(R.string.accessibility_back);
        return inflate;
    }
}
