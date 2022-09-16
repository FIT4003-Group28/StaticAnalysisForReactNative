package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: jzp  reason: default package */
/* loaded from: classes3.dex */
public final class jzp extends aigq implements View.OnLayoutChangeListener, ahin, ezb, ezg, aiby {
    private final ghd a;
    private final aadd b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jzp(ghd ghdVar, aadd aaddVar, jzn jznVar, axnm axnmVar, aacz aaczVar) {
        super(jznVar, new jzo(axnmVar));
        axnmVar.getClass();
        this.a = ghdVar;
        this.b = aaddVar;
        asxj asxjVar = aaczVar.b().e;
        if (!(asxjVar == null ? asxj.a : asxjVar).ce) {
            axnmVar.get();
        }
    }

    private final boolean l() {
        arhd a;
        if (this.c) {
            return true;
        }
        if ((!this.e && !this.d) || (a = this.b.a()) == null) {
            return false;
        }
        asxp asxpVar = a.e;
        if (asxpVar == null) {
            asxpVar = asxp.a;
        }
        return asxpVar.z;
    }

    @Override // defpackage.ahin
    public final void a(boolean z) {
        if (this.c != z) {
            this.c = z;
            k();
        }
    }

    @Override // defpackage.aigq
    protected final int b(aika aikaVar) {
        if (aikaVar != aika.ENDED || this.c || this.g) {
            return (aikaVar == null || !aikaVar.c(aika.READY)) ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aigq
    public final boolean c() {
        return !l() && this.f && super.c();
    }

    @Override // defpackage.ezb
    public final void h(ezw ezwVar) {
        j();
    }

    @Override // defpackage.aiby
    public final void nt(int i, long j) {
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        this.g = z;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i8 - i6;
        int i10 = i3 - i;
        int i11 = i4 - i2;
        if (i7 - i5 == i10 && i9 == i11) {
            return;
        }
        boolean z = false;
        if (this.d == (i11 > i10) && this.e == this.a.isInMultiWindowMode()) {
            return;
        }
        boolean l = l();
        if (i11 > i10) {
            z = true;
        }
        this.d = z;
        this.e = this.a.isInMultiWindowMode();
        if (l == l()) {
            return;
        }
        k();
    }

    @Override // defpackage.ezg
    public final void pa(ezx ezxVar) {
        boolean z = this.f;
        boolean z2 = false;
        if (ezxVar.b() && !ezxVar.e()) {
            z2 = true;
        }
        this.f = z2;
        if (z2 != z) {
            k();
        }
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pb(ezx ezxVar, ezx ezxVar2) {
        hqb.m(this, ezxVar2);
    }
}
