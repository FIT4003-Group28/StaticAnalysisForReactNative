package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: abyv  reason: default package */
/* loaded from: classes.dex */
final class abyv extends xo {
    public final List d = new ArrayList();
    private final LayoutInflater e;

    public abyv(LayoutInflater layoutInflater) {
        this.e = layoutInflater;
    }

    @Override // defpackage.xo
    public final int b() {
        return this.d.size();
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ yo f(ViewGroup viewGroup, int i) {
        return new abyt(this.e.inflate(R.layout.multi_message_confirm_dialog_icon_message_item, viewGroup, false));
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ void o(yo yoVar, int i) {
        abyt abytVar = (abyt) yoVar;
        abyu abyuVar = (abyu) this.d.get(i);
        abytVar.t.setImageResource(abyuVar.a);
        abytVar.u.setText(abyuVar.b);
    }
}
