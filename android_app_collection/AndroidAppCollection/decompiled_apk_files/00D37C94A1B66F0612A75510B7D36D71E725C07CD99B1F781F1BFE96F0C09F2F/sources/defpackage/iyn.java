package defpackage;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.youtube.R;
import j$.util.Optional;
/* compiled from: PG */
/* renamed from: iyn  reason: default package */
/* loaded from: classes3.dex */
public final class iyn extends adog implements adny {
    public final adoa a;
    public Optional b;
    public final ImageView c;
    public final ImageView d;

    public iyn(adoa adoaVar, ViewGroup viewGroup) {
        this.a = adoaVar;
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.mdx_loop);
        imageView.getClass();
        this.c = imageView;
        ImageView imageView2 = (ImageView) viewGroup.findViewById(R.id.mdx_shuffle);
        imageView2.getClass();
        this.d = imageView2;
        this.b = Optional.empty();
        iym iymVar = new iym(this);
        imageView.setOnClickListener(iymVar);
        imageView2.setOnClickListener(iymVar);
    }

    @Override // defpackage.adny
    public final void j(adnt adntVar) {
    }

    @Override // defpackage.adny
    public final void k(adnt adntVar) {
        if (!this.b.isPresent()) {
            return;
        }
        ((adnt) this.b.get()).N(this);
        this.b = Optional.empty();
    }

    @Override // defpackage.adny
    public final void l(adnt adntVar) {
        Optional of = Optional.of(adntVar);
        this.b = of;
        ((adnt) of.get()).z(this);
        n();
    }

    @Override // defpackage.adog, defpackage.adnx
    public final void m() {
        n();
    }

    public final void n() {
        if (!this.b.isPresent()) {
            return;
        }
        this.c.setSelected(((adnt) this.b.get()).ac());
        this.d.setSelected(((adnt) this.b.get()).ae());
    }
}
