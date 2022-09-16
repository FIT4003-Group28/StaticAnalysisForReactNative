package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ajei  reason: default package */
/* loaded from: classes.dex */
public final class ajei implements ajed {
    public final azqb a;
    private final Executor b;
    private final aiix c;
    private final acrr d;

    public ajei(Executor executor, azqb azqbVar, aiix aiixVar, acrr acrrVar) {
        this.b = executor;
        this.a = azqbVar;
        this.c = aiixVar;
        this.d = acrrVar;
    }

    @Override // defpackage.ajed
    public final int a(ajec ajecVar) {
        return 0;
    }

    @Override // defpackage.ajed
    public final int b(final ajec ajecVar) {
        if (ajecVar.b != null) {
            this.b.execute(new Runnable() { // from class: ajeh
                @Override // java.lang.Runnable
                public final void run() {
                    ajei ajeiVar = ajei.this;
                    ajec ajecVar2 = ajecVar;
                    if (!ajecVar2.a()) {
                        aijl d = PlaybackStartDescriptor.d();
                        d.a = ajecVar2.b;
                        ((ajem) ajeiVar.a.get()).d(d.a());
                    }
                }
            });
            ajjh.m(6, 2, ajecVar.a, this.d);
            return 1;
        }
        return 0;
    }

    @Override // defpackage.ajed
    public final aikd c(asaa asaaVar) {
        return null;
    }

    @Override // defpackage.ajed
    public final aikd d(aart aartVar) {
        return null;
    }

    @Override // defpackage.ajed
    public final ajea e() {
        return null;
    }

    @Override // defpackage.ajed
    public final void f(ahhw ahhwVar) {
    }

    @Override // defpackage.ajed
    public final void g(ahhx ahhxVar) {
    }

    @Override // defpackage.ajed
    public final void h(ahia ahiaVar) {
    }

    @Override // defpackage.ajed
    public final void i() {
    }

    @Override // defpackage.ajed
    public final boolean j(ajdy ajdyVar, ajec ajecVar) {
        return ajdyVar != null && (ajdyVar.h || this.c.r()) && ajdyVar.e != null;
    }
}
