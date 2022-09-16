package defpackage;

import android.net.Uri;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: alfe  reason: default package */
/* loaded from: classes.dex */
public final class alfe extends aleo {
    private final afvn a;
    private final albc b;
    private final akze c;
    private final albs e;
    private final aldn f;
    private final aldl g;
    private final asfs h;

    public alfe(aadd aaddVar, afvn afvnVar, albc albcVar, albs albsVar, akze akzeVar, aldn aldnVar, aldl aldlVar, asfs asfsVar, albf albfVar, alht alhtVar) {
        super(aaddVar, avuo.UPLOAD_PROCESSOR_TYPE_PROCESS_VIDEO, albfVar, akzeVar, alhtVar);
        this.a = afvnVar;
        this.b = albcVar;
        this.c = akzeVar;
        this.e = albsVar;
        this.f = aldnVar;
        this.g = aldlVar;
        this.h = asfsVar;
    }

    @Override // defpackage.algt
    public final albu a(alcw alcwVar) {
        return this.e;
    }

    @Override // defpackage.algt
    public final alct b(alcw alcwVar) {
        alct alctVar = alcwVar.ai;
        return alctVar == null ? alct.a : alctVar;
    }

    @Override // defpackage.aleo
    public final ankt c(String str, akzp akzpVar, alcw alcwVar) {
        alcs alcsVar;
        avuy g;
        afvm d = this.a.d(alcwVar.e);
        if (d == null) {
            throw akzh.a(avun.UPLOAD_PROCESSOR_FAILURE_REASON_IDENTITY_NOT_FOUND);
        }
        aopa createBuilder = asfb.a.createBuilder();
        String str2 = alcwVar.k;
        createBuilder.copyOnWrite();
        asfb asfbVar = (asfb) createBuilder.instance;
        str2.getClass();
        asfbVar.b |= 2;
        asfbVar.d = str2;
        String str3 = alcwVar.W;
        createBuilder.copyOnWrite();
        asfb asfbVar2 = (asfb) createBuilder.instance;
        str3.getClass();
        asfbVar2.b |= 4;
        asfbVar2.e = str3;
        if ((alcwVar.c & CellularSignalStrengthError.ERROR_NOT_SUPPORTED) != 0) {
            alcsVar = alcwVar.al;
            if (alcsVar == null) {
                alcsVar = alcs.a;
            }
        } else {
            alcsVar = null;
        }
        apxd a = alco.a(alcsVar);
        if (a != null) {
            createBuilder.copyOnWrite();
            asfb asfbVar3 = (asfb) createBuilder.instance;
            asfbVar3.g = a;
            asfbVar3.b |= 32;
        }
        Uri parse = Uri.parse(alcwVar.f);
        if (this.g.c(parse)) {
            g = this.g.a(parse, alcwVar.F, alcwVar.aj);
        } else {
            aldn aldnVar = this.f;
            int A = araa.A(alcwVar.r);
            if (A == 0) {
                A = 1;
            }
            g = aldnVar.d(A, parse, null).g(alcwVar.F, alcwVar.aj);
        }
        createBuilder.copyOnWrite();
        asfb asfbVar4 = (asfb) createBuilder.instance;
        g.getClass();
        asfbVar4.f = g;
        asfbVar4.b |= 8;
        albc albcVar = this.b;
        aarl aarlVar = albcVar.i;
        alap alapVar = new alap(albcVar.e, d, ((asfb) createBuilder.mo39build()).mo52toBuilder());
        alapVar.i = aadf.b(albcVar.j);
        alapVar.i();
        int H = akzj.H(((asfc) aarlVar.d(alapVar)).c);
        if (H == 0) {
            H = 1;
        }
        int i = H - 1;
        if (i == 1) {
            return anlz.q(t(this.d.e(), true));
        }
        if (i == 2) {
            return anlz.q(t(this.d.c(avun.UPLOAD_PROCESSOR_FAILURE_REASON_INNERTUBE_FAILED), true));
        }
        if (i == 3) {
            alht alhtVar = this.d;
            avun avunVar = avun.UPLOAD_PROCESSOR_FAILURE_REASON_INNERTUBE_FAILED;
            alct alctVar = alcwVar.ai;
            if (alctVar == null) {
                alctVar = alct.a;
            }
            alctVar.getClass();
            return anlz.q(t(alhtVar.d(avunVar, alctVar, this.h.m, this.c), true));
        }
        this.c.a("ProcessVideoTaskUnknown processVideo response status.");
        return anlz.q(t(this.d.c(avun.UPLOAD_PROCESSOR_FAILURE_REASON_UNKNOWN), true));
    }

    @Override // defpackage.algt
    public final aypx e() {
        return akxp.q;
    }

    @Override // defpackage.algt
    public final String f() {
        return "ProcessVideoTask";
    }

    @Override // defpackage.algt
    public final boolean h() {
        return true;
    }

    @Override // defpackage.aleo
    public final boolean i(alcw alcwVar) {
        int i = alcwVar.c;
        if ((32768 & i) != 0 && (i & 2) != 0 && (i & 1) != 0) {
            alcu a = alcu.a(alcwVar.l);
            if (a == null) {
                a = alcu.UNKNOWN_UPLOAD;
            }
            if (a != alcu.REELS_UPLOAD) {
                return true;
            }
            alct alctVar = alcwVar.M;
            if (alctVar == null) {
                alctVar = alct.a;
            }
            int z = araa.z(alctVar.c);
            if (z != 0 && z == 2) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aleo
    public final akzs k(Throwable th, alcw alcwVar, boolean z) {
        if (th instanceof aart) {
            alht alhtVar = this.d;
            avun avunVar = avun.UPLOAD_PROCESSOR_FAILURE_REASON_INNERTUBE_FAILED;
            alct alctVar = alcwVar.ai;
            if (alctVar == null) {
                alctVar = alct.a;
            }
            alctVar.getClass();
            return t(alhtVar.d(avunVar, alctVar, this.h.m, this.c), z);
        }
        return super.k(th, alcwVar, z);
    }
}
