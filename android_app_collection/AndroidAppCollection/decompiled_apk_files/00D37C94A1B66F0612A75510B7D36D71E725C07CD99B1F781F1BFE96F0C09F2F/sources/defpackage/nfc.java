package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: nfc  reason: default package */
/* loaded from: classes3.dex */
public final class nfc extends nez implements ngh {
    private final Handler a;
    private final airr b;
    private final ViewGroup c;
    private final mqb d;
    private final Runnable e;

    public nfc(Context context, Handler handler, final ngi ngiVar, airr airrVar, mqc mqcVar, aacz aaczVar) {
        this.a = handler;
        this.b = airrVar;
        if (eog.am(aaczVar)) {
            this.c = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.slim_video_scrollable_action_bar_reduced_margins, (ViewGroup) null);
        } else {
            this.c = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.slim_video_scrollable_action_bar, (ViewGroup) null);
        }
        this.d = mqcVar.a((ViewGroup) this.c.findViewById(R.id.button_container), new azqb() { // from class: nfb
            @Override // defpackage.azqb
            public final Object get() {
                return nfc.this.j.a;
            }
        });
        this.e = new Runnable() { // from class: nfa
            @Override // java.lang.Runnable
            public final void run() {
                nfc nfcVar = nfc.this;
                ngiVar.b(nfcVar, nfcVar.j.a);
            }
        };
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    @Override // defpackage.nez
    protected final void d() {
        this.d.e(((auxo) this.k).c, this.l.c(), this.j);
        this.d.g();
        this.a.post(this.e);
    }

    @Override // defpackage.nez
    protected final void e() {
        this.a.removeCallbacks(this.e);
        this.d.f();
    }

    @Override // defpackage.ngh
    public final View g() {
        return this.d.a();
    }

    @Override // defpackage.ngh
    public final View h() {
        return this.d.b();
    }

    @Override // defpackage.ngh
    public final argj i() {
        mpt c = this.d.c();
        if (c != null) {
            return c.j();
        }
        return null;
    }

    @Override // defpackage.ngh
    public final argj j() {
        auxo auxoVar = (auxo) this.k;
        if ((auxoVar.b & 2) != 0) {
            auxa auxaVar = auxoVar.e;
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
        auxo auxoVar = (auxo) this.k;
        if ((auxoVar.b & 1) != 0) {
            auxa auxaVar = auxoVar.d;
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
        return this.d.d(this.l.c()) != null;
    }

    @Override // defpackage.ngh
    public final boolean o() {
        return this.c.isShown();
    }
}
