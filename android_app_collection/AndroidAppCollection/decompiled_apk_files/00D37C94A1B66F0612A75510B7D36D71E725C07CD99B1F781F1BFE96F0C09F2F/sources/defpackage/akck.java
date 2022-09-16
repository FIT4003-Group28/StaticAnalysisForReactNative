package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.youtube.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: akck  reason: default package */
/* loaded from: classes.dex */
public final class akck extends xo {
    public List d;
    public apzg e;
    private final acti g;
    private final ajvj h;
    private final ajmy i;
    private final aafo j;
    private View l;
    public akch f = null;
    private final akch k = new akcg(this);

    public akck(acti actiVar, ajmy ajmyVar, ajvj ajvjVar, aafo aafoVar) {
        this.g = actiVar;
        this.h = ajvjVar;
        this.i = ajmyVar;
        this.j = aafoVar;
    }

    private static final acte x(int i) {
        aopc aopcVar = (aopc) asvv.b.createBuilder();
        aopa createBuilder = apxf.a.createBuilder();
        int i2 = actj.SPONSORSHIPS_EMOJI_UPSELL_EMOJI.II;
        createBuilder.copyOnWrite();
        apxf apxfVar = (apxf) createBuilder.instance;
        apxfVar.b |= 1;
        apxfVar.c = i2;
        createBuilder.copyOnWrite();
        apxf apxfVar2 = (apxf) createBuilder.instance;
        apxfVar2.b |= 4;
        apxfVar2.e = i;
        aopcVar.copyOnWrite();
        asvv asvvVar = (asvv) aopcVar.instance;
        apxf apxfVar3 = (apxf) createBuilder.mo39build();
        apxfVar3.getClass();
        asvvVar.h = apxfVar3;
        asvvVar.c |= 8;
        aopa createBuilder2 = awbr.a.createBuilder();
        createBuilder2.copyOnWrite();
        awbr awbrVar = (awbr) createBuilder2.instance;
        awbrVar.b |= 1;
        awbrVar.c = 1L;
        aopcVar.copyOnWrite();
        asvv asvvVar2 = (asvv) aopcVar.instance;
        awbr awbrVar2 = (awbr) createBuilder2.mo39build();
        awbrVar2.getClass();
        asvvVar2.e = awbrVar2;
        asvvVar2.c |= 2;
        return new acte((asvv) aopcVar.mo39build());
    }

    @Override // defpackage.xo
    public final int b() {
        return this.d.size();
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ yo f(ViewGroup viewGroup, int i) {
        this.l = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.emoji_upsell_holder, viewGroup, false);
        return new akcj(new akci(this.k, x(i), this.g), this.l, this.h);
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ void o(yo yoVar, int i) {
        akcj akcjVar = (akcj) yoVar;
        if (this.d.size() > i) {
            int i2 = akcj.v;
            this.i.h(akcjVar.t, this.h.b((String) this.d.get(i)));
            akcjVar.t.setContentDescription(akcjVar.u.c((String) this.d.get(i)));
        }
        this.g.n(x(i));
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ void p(yo yoVar) {
        int i = akcj.v;
        ImageView imageView = ((akcj) yoVar).t;
        if (imageView != null) {
            this.i.e(imageView);
        }
    }

    public final void w() {
        apzg apzgVar = this.e;
        if (apzgVar != null) {
            this.j.a(apzgVar);
        }
    }
}
