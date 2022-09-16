package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: adde  reason: default package */
/* loaded from: classes.dex */
final class adde extends xo {
    public List d;
    private final LayoutInflater e;
    private final View.OnClickListener f;
    private final acti g;

    public adde(Context context, View.OnClickListener onClickListener, acti actiVar) {
        this.e = LayoutInflater.from(context);
        this.f = onClickListener;
        this.g = actiVar;
    }

    @Override // defpackage.xo
    public final int b() {
        List list = this.d;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return this.d.size() + 1;
    }

    @Override // defpackage.xo
    public final int c(int i) {
        return i == 0 ? 0 : 1;
    }

    @Override // defpackage.xo
    public final yo f(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new addd(this.e.inflate(R.layout.mdx_delete_tv_codes_row, viewGroup, false), this.f);
        }
        return new yo(this.e.inflate(R.layout.mdx_delete_tv_codes_header, viewGroup, false));
    }

    @Override // defpackage.xo
    public final void o(yo yoVar, int i) {
        if (yoVar instanceof addd) {
            addd adddVar = (addd) yoVar;
            adif adifVar = (adif) this.d.get(i - 1);
            acti actiVar = this.g;
            adddVar.t.setText(adifVar.b());
            actiVar.n(new acte(acuo.b(27858)));
            adddVar.u.setTag(adifVar);
        }
    }
}
