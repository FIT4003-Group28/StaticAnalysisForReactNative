package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: beoj  reason: default package */
/* loaded from: classes3.dex */
public abstract class beoj extends beol implements benp {
    protected beog a;
    private final cqqw b;
    private cqtv c;

    /* JADX INFO: Access modifiers changed from: protected */
    public beoj(ff ffVar, cqhn cqhnVar, bgyb bgybVar, bepv bepvVar, bwrs<bvrt<benb>> bwrsVar, beid beidVar, bwrs<ilo> bwrsVar2, Executor executor) {
        super(ffVar, cqhnVar, bgybVar, bepvVar, bwrsVar, beidVar, bwrsVar2, executor);
        this.b = new beoi(this);
        this.c = cqrp.c(dcyn.a);
    }

    @Override // defpackage.beol
    public void a() {
        super.a();
        beog beogVar = this.a;
        if (beogVar != null) {
            beogVar.o();
        }
    }

    @Override // defpackage.beol
    public void b() {
        super.b();
        beog beogVar = this.a;
        if (beogVar != null) {
            beogVar.p();
        }
    }

    @Override // defpackage.benp
    @dzsi
    public cqqw d() {
        return this.b;
    }

    @Override // defpackage.benp
    public Boolean e() {
        return Boolean.valueOf(this.a != null);
    }

    @Override // defpackage.benp
    public Boolean f() {
        beog beogVar = this.a;
        boolean z = false;
        if (beogVar != null && beogVar.h().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.benp
    @dzsi
    public awz g() {
        beog beogVar = this.a;
        if (beogVar == null) {
            return null;
        }
        return beogVar.k();
    }

    @Override // defpackage.benp
    @dzsi
    public View.OnAttachStateChangeListener h() {
        beog beogVar = this.a;
        if (beogVar == null) {
            return null;
        }
        return beogVar.l();
    }

    @Override // defpackage.benp
    public cqtv j() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void l(RecyclerView recyclerView, int i, int i2) {
        beog beogVar = this.a;
        if (beogVar != null) {
            beogVar.j(recyclerView, i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void m(View view, @dzsi View view2) {
        if (!(view instanceof RecyclerView) || ((RecyclerView) view).canScrollVertically(-1)) {
            return;
        }
        int bottom = view2 == null ? 0 : view2.getBottom();
        if (this.c.e(this.e) == bottom) {
            return;
        }
        this.c = cqrp.c(bottom);
        cqkx.p(this);
    }
}
