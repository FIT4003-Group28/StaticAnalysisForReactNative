package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.ui.SlimMetadataButtonContainerLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: neo  reason: default package */
/* loaded from: classes3.dex */
public final class neo extends nez implements ngh {
    private final Handler a;
    private final airr b;
    private final ViewGroup c;
    private final SlimMetadataButtonContainerLayout d;
    private final mqb e;
    private final bnk f;
    private final Runnable g;

    public neo(Context context, Handler handler, final ngi ngiVar, airr airrVar, mqc mqcVar) {
        this.a = handler;
        this.b = airrVar;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.slim_video_action_bar, (ViewGroup) null);
        this.c = viewGroup;
        SlimMetadataButtonContainerLayout slimMetadataButtonContainerLayout = (SlimMetadataButtonContainerLayout) viewGroup.findViewById(R.id.button_container);
        this.d = slimMetadataButtonContainerLayout;
        this.e = mqcVar.a(slimMetadataButtonContainerLayout, new azqb() { // from class: nen
            @Override // defpackage.azqb
            public final Object get() {
                return neo.this.j.a;
            }
        });
        bnr bnrVar = new bnr();
        fqs fqsVar = new fqs();
        fqsVar.y(R.id.container);
        bnrVar.f(fqsVar);
        bnb bnbVar = new bnb();
        bnbVar.A();
        bnrVar.f(bnbVar);
        bne bneVar = new bne();
        bneVar.A();
        bnrVar.f(bneVar);
        this.f = bnrVar;
        this.g = new Runnable() { // from class: nem
            @Override // java.lang.Runnable
            public final void run() {
                neo neoVar = neo.this;
                ngiVar.b(neoVar, neoVar.j.a);
            }
        };
        boolean y = zew.y(context);
        slimMetadataButtonContainerLayout.b = y;
        slimMetadataButtonContainerLayout.requestLayout();
        slimMetadataButtonContainerLayout.a = true != y ? 5 : 6;
        slimMetadataButtonContainerLayout.requestLayout();
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    @Override // defpackage.nez
    protected final void d() {
        this.d.a(!this.l.f);
        this.e.e(((auxj) this.k).c, this.l.c(), this.j);
        this.e.g();
        this.a.post(this.g);
    }

    @Override // defpackage.nez
    protected final void e() {
        bno.c(this.c);
        this.a.removeCallbacks(this.g);
        this.e.f();
    }

    @Override // defpackage.ngh
    public final View g() {
        return this.e.a();
    }

    @Override // defpackage.ngh
    public final View h() {
        return this.e.b();
    }

    @Override // defpackage.ngh
    public final argj i() {
        mpt c = this.e.c();
        if (c != null) {
            return c.j();
        }
        return null;
    }

    @Override // defpackage.ngh
    public final argj j() {
        auxj auxjVar = (auxj) this.k;
        if ((auxjVar.b & 2) != 0) {
            auxa auxaVar = auxjVar.e;
            if (auxaVar == null) {
                auxaVar = auxa.a;
            }
            if (auxaVar.b == 102716411) {
                return (argj) auxaVar.c;
            }
            return argj.a;
        }
        return null;
    }

    @Override // defpackage.ngh
    public final argj k() {
        auxj auxjVar = (auxj) this.k;
        if ((auxjVar.b & 1) != 0) {
            auxa auxaVar = auxjVar.d;
            if (auxaVar == null) {
                auxaVar = auxa.a;
            }
            if (auxaVar.b == 102716411) {
                return (argj) auxaVar.c;
            }
            return argj.a;
        }
        return null;
    }

    @Override // defpackage.ngh
    public final String l() {
        return this.l.c();
    }

    @Override // defpackage.ngh
    public final boolean m() {
        attp b = fcw.b(this.b);
        return b != null && b.c;
    }

    @Override // defpackage.ngh
    public final boolean n() {
        return this.e.d(this.l.c()) != null;
    }

    @Override // defpackage.ngh
    public final boolean o() {
        return this.c.isShown();
    }

    @Override // defpackage.nez, defpackage.odj
    public final void oT() {
        bno.b(this.c, this.f);
        this.d.a(!this.l.f);
    }
}
