package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mux  reason: default package */
/* loaded from: classes3.dex */
final class mux extends xo {
    final /* synthetic */ muz d;

    public mux(muz muzVar) {
        this.d = muzVar;
    }

    @Override // defpackage.xo
    public final int b() {
        return this.d.b.size();
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ yo f(ViewGroup viewGroup, int i) {
        return new yo(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.formfill_region_picker_item, viewGroup, false));
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ void o(yo yoVar, int i) {
        final muw muwVar = (muw) this.d.b.get(i);
        final muq muqVar = this.d.e;
        ((TextView) yoVar.a.findViewById(R.id.region_text)).setText(muwVar.a);
        ((TextView) yoVar.a.findViewById(R.id.calling_code_text)).setText(yoVar.a.getContext().getResources().getString(R.string.calling_code, Integer.valueOf(muwVar.c)));
        yoVar.a.setOnClickListener(new View.OnClickListener() { // from class: muy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                muq muqVar2 = muq.this;
                muw muwVar2 = muwVar;
                int i2 = yo.s;
                muu muuVar = muqVar2.a;
                muuVar.b.setText(muuVar.a.getResources().getString(R.string.region_with_calling_code, muwVar2.b, Integer.valueOf(muwVar2.c)));
                muuVar.i = muwVar2.b;
                if (muuVar.l) {
                    muuVar.i();
                }
                muuVar.k();
                muuVar.j.dismiss();
            }
        });
    }
}
