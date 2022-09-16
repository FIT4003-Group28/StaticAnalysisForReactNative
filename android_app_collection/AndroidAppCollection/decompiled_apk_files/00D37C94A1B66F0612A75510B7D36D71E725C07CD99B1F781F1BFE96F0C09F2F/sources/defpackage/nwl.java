package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: nwl  reason: default package */
/* loaded from: classes3.dex */
public final class nwl extends fdm implements fpc, ezg {
    public static final long a = TimeUnit.HOURS.toMillis(1);
    public final oet b;
    public final akfo c;
    public final snc d;
    public final apy e;
    public final nwm f;
    private final ezh g;

    public nwl(feh fehVar, ezh ezhVar, oet oetVar, snc sncVar, nwm nwmVar, akfo akfoVar, apy apyVar) {
        super(fehVar);
        this.g = ezhVar;
        this.b = oetVar;
        this.d = sncVar;
        this.f = nwmVar;
        this.c = akfoVar;
        this.e = apyVar;
    }

    @Override // defpackage.fpc
    public final int c() {
        throw null;
    }

    @Override // defpackage.fpc
    public final void d() {
    }

    @Override // defpackage.fpc
    public final void e() {
        throw null;
    }

    @Override // defpackage.feg
    public final void kF() {
        this.g.j(this);
    }

    @Override // defpackage.feg
    public final void nr() {
        this.g.i(this);
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pa(ezx ezxVar) {
    }

    @Override // defpackage.ezg
    public final void pb(ezx ezxVar, ezx ezxVar2) {
        if (ezxVar2 != ezx.WATCH_WHILE_MINIMIZED || ezxVar == ezx.NONE) {
            return;
        }
        ylx.o(this.e, this.f.a.a(), mbi.c, new zdt() { // from class: nwj
            @Override // defpackage.zdt
            public final void a(Object obj) {
                oeu oeuVar;
                nwa nwaVar;
                nwl nwlVar = nwl.this;
                nwo nwoVar = (nwo) obj;
                if (nwoVar.d >= 2) {
                    return;
                }
                snc sncVar = nwlVar.d;
                long j = nwoVar.c;
                if ((j > 0 && sncVar.c() - j < nwl.a) || (oeuVar = nwlVar.b.a) == null || (nwaVar = ((DefaultWatchPanelViewController) oeuVar).i) == null) {
                    return;
                }
                akfo akfoVar = nwlVar.c;
                View view = ((nvp) nwaVar).d;
                String string = view.getResources().getString(R.string.floaty_bar_tutorial_description);
                akfp a2 = nwlVar.c.a();
                a2.a = view;
                a2.c = string;
                a2.h(1);
                a2.c(3);
                a2.f = new nwk(nwlVar);
                akfoVar.c(a2.a());
            }
        });
    }
}
