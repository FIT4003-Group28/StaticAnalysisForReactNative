package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.youtube.R;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: hbm  reason: default package */
/* loaded from: classes3.dex */
public final class hbm implements View.OnClickListener, ajru {
    public final hvy a;
    public final hci b;
    public final ImageView c;
    private final hba d;
    private final ayor e;
    private final hkl f;
    private final View g;
    private aypg h;

    public hbm(hvy hvyVar, hci hciVar, hba hbaVar, ayor ayorVar, hkl hklVar, ViewGroup viewGroup) {
        this.a = hvyVar;
        this.b = hciVar;
        this.d = hbaVar;
        this.e = ayorVar;
        this.f = hklVar;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.add_button_layout, viewGroup, false);
        this.g = inflate;
        ImageView imageView = (ImageView) inflate.findViewById(R.id.add_text_button);
        this.c = imageView;
        imageView.setOnClickListener(this);
        hklVar.o();
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.g;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        hbl hblVar = (hbl) obj;
        this.h = this.d.b().X(this.e).as(new hbj(this, 2));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.c) {
            this.f.o();
            this.b.c().I(efx.q).ag(1L).ap(false).w(new hbj(this, 1)).R();
            this.b.d();
            this.a.c().I(efx.r).ag(1L).ap(false).w(new hbj(this)).R();
        }
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        ayqi.c((AtomicReference) this.h);
    }
}
