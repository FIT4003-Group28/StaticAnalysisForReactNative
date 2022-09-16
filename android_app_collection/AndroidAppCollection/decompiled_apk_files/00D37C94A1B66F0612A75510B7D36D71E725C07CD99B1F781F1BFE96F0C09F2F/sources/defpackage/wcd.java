package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: wcd  reason: default package */
/* loaded from: classes4.dex */
final class wcd extends xo {
    public int[] d;
    private final View.OnClickListener e;
    private final View.OnClickListener f;
    private final String g;
    private final String h;

    public wcd(Context context, wbc wbcVar) {
        this.g = context.getResources().getString(R.string.use_password);
        this.h = context.getResources().getString(R.string.use_fingerprint);
        this.e = new wbk(wbcVar, 3);
        this.f = new wbk(wbcVar, 4);
    }

    @Override // defpackage.xo
    public final int b() {
        int[] iArr = this.d;
        if (iArr == null) {
            return 0;
        }
        return iArr.length;
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ yo f(ViewGroup viewGroup, int i) {
        return new wcc((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.modal_other_methods_list_item, viewGroup, false));
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ void o(yo yoVar, int i) {
        wcc wccVar = (wcc) yoVar;
        int i2 = this.d[i];
        if (i2 == 0) {
            wccVar.t.setText(this.g);
            wccVar.t.setOnClickListener(this.e);
        } else if (i2 != 1) {
        } else {
            wccVar.t.setText(this.h);
            wccVar.t.setOnClickListener(this.f);
        }
    }
}
