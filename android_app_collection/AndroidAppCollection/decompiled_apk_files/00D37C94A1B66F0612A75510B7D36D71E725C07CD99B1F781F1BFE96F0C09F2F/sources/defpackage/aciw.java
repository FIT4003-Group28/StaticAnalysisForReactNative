package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: aciw  reason: default package */
/* loaded from: classes.dex */
final class aciw extends xo {
    public final ArrayList d = new ArrayList();
    private final acis e;

    public aciw(acis acisVar) {
        this.e = acisVar;
    }

    @Override // defpackage.xo
    public final int b() {
        return this.d.size();
    }

    @Override // defpackage.xo
    public final int c(int i) {
        return R.layout.lc_game_title;
    }

    @Override // defpackage.xo
    public final yo f(ViewGroup viewGroup, int i) {
        return new aciv(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lc_game_title, viewGroup, false), this.e);
    }

    @Override // defpackage.xo
    public final void o(yo yoVar, int i) {
        aciv acivVar = (aciv) yoVar;
        arbt arbtVar = (arbt) this.d.get(i);
        acivVar.v = arbtVar;
        acivVar.t.setText(arbtVar.c);
        acivVar.u.setText(arbtVar.d);
    }

    public final void w() {
        this.d.clear();
    }
}
