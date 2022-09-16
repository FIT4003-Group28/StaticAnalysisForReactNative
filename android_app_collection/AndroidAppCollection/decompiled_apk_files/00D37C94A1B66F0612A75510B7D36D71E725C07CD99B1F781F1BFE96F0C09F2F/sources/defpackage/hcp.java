package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: hcp  reason: default package */
/* loaded from: classes3.dex */
public final class hcp implements haz {
    private final azqb a;

    public hcp(azqb azqbVar) {
        this.a = azqbVar;
    }

    @Override // defpackage.haz
    public final View a(ViewGroup viewGroup, final axbm axbmVar, final akgc akgcVar) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.timeline_tooltip_entry, viewGroup, false);
        final hci hciVar = (hci) this.a.get();
        gyq gyqVar = new gyq(hciVar.b());
        gyo a = gyqVar.a(actj.SHORTS_CREATION_EDITOR_TOOL_TIP_EDIT_BUTTON);
        a.h(true);
        a.a();
        gyo a2 = gyqVar.a(actj.SHORTS_CREATION_EDITOR_TOOL_TIP_TIMING_BUTTON);
        a2.h(true);
        a2.a();
        inflate.setOnClickListener(new View.OnClickListener() { // from class: hco
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                akgc akgcVar2 = akgc.this;
                hci hciVar2 = hciVar;
                axbm axbmVar2 = axbmVar;
                akgcVar2.b(1);
                hciVar2.g(axbmVar2.e(), actj.SHORTS_CREATION_EDITOR_TOOL_TIP_TIMING_BUTTON);
            }
        });
        return inflate;
    }

    @Override // defpackage.haz
    public final boolean b(axbm axbmVar) {
        axca axcaVar;
        axbk i = axbmVar.i();
        if (i.c == 1) {
            axcaVar = (axca) i.d;
        } else {
            axcaVar = axca.a;
        }
        return !axcaVar.c.isEmpty();
    }
}
