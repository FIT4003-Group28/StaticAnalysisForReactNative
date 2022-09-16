package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: gzd  reason: default package */
/* loaded from: classes3.dex */
public final class gzd implements haz {
    public final azqb a;
    public final hba b;
    public final gzf c;

    public gzd(azqb azqbVar, hba hbaVar, gzf gzfVar) {
        this.a = azqbVar;
        this.b = hbaVar;
        this.c = gzfVar;
    }

    @Override // defpackage.haz
    public final View a(ViewGroup viewGroup, final axbm axbmVar, final akgc akgcVar) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.shorts_edit_add_text_tooltip, viewGroup, false);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: gzc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gzd gzdVar = gzd.this;
                axbm axbmVar2 = axbmVar;
                akgc akgcVar2 = akgcVar;
                gzdVar.b.c(axbmVar2);
                akgcVar2.b(1);
                gzdVar.c.f();
                ((hvy) gzdVar.a.get()).mt(axbmVar2);
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
