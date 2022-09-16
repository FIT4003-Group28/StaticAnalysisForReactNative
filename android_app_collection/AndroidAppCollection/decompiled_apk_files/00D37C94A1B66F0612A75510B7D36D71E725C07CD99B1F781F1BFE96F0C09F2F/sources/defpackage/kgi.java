package defpackage;

import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
/* compiled from: PG */
/* renamed from: kgi  reason: default package */
/* loaded from: classes3.dex */
public final class kgi implements kbk, ezb {
    public final ezh a;
    public final ajhl b;
    public final ezd c;
    public final boolean d;
    public final aypf e;
    public final airw f;
    public long g;
    public boolean h;
    public boolean i;
    public yye j;
    private final ajrs k;
    private final axnm l;
    private boolean m;
    private boolean n;

    public kgi(ezh ezhVar, ajhl ajhlVar, axnm axnmVar, acti actiVar, airw airwVar, ezd ezdVar, axxu axxuVar) {
        Boolean bool;
        this.a = ezhVar;
        this.b = ajhlVar;
        ajrs ajrsVar = new ajrs();
        this.k = ajrsVar;
        ajrsVar.a(actiVar);
        this.l = axnmVar;
        this.e = new aypf();
        this.f = airwVar;
        this.c = ezdVar;
        aqxe aqxeVar = axxuVar.b.b().C;
        aqxeVar = aqxeVar == null ? aqxe.a : aqxeVar;
        boolean z = false;
        if (aqxeVar.a(45358110L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45358110L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45358110L);
            bool = Boolean.valueOf(aqxfVar.b == 1 ? ((Boolean) aqxfVar.c).booleanValue() : z);
        } else {
            bool = false;
        }
        this.d = bool.booleanValue();
    }

    @Override // defpackage.kbk
    public final void b(boolean z) {
        this.m = false;
        a(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(aqtb aqtbVar) {
        this.n = false;
        if (aqtbVar != null) {
            this.n = true;
            ajhl ajhlVar = this.b;
            ajrs ajrsVar = this.k;
            ajin ajinVar = (ajin) this.l.get();
            ajhlVar.oK(ajrsVar, ajhh.a(aqtbVar));
        }
        a(false);
    }

    @Override // defpackage.ezb
    public final void h(ezw ezwVar) {
        c(null);
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void i(ControlsOverlayStyle controlsOverlayStyle) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void j(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void k(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void l(ezx ezxVar) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void m(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void nG(zbb zbbVar) {
    }

    @Override // defpackage.kbk
    public final void nL(boolean z) {
        this.m = true;
        a(z);
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void nx(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void od(ControlsState controlsState) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void oe(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void og(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void p(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void q(boolean z) {
    }

    public final void a(boolean z) {
        yye yyeVar;
        if (!this.d || (yyeVar = this.j) == null) {
            return;
        }
        if (!this.i || !this.n || !this.h) {
            yyeVar.k(8);
            yyeVar.b(false);
        } else if (this.m) {
            yyeVar.c(z);
        } else {
            yyeVar.k(4);
            yyeVar.b(z);
        }
    }
}
