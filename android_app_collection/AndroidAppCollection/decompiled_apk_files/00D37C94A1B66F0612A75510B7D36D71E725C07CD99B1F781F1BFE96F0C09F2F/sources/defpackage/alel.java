package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Iterator;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: alel  reason: default package */
/* loaded from: classes.dex */
public final class alel extends aleo {
    public final abdu a;
    private final afvn b;
    private final asfs c;
    private final albc e;
    private final aldn f;
    private final aldl g;
    private final akze h;
    private final albs i;

    public alel(aadd aaddVar, afvn afvnVar, asfs asfsVar, albc albcVar, abdu abduVar, aldn aldnVar, aldl aldlVar, albs albsVar, akze akzeVar, albf albfVar, alht alhtVar) {
        super(aaddVar, avuo.UPLOAD_PROCESSOR_TYPE_CREATE_VIDEO, albfVar, akzeVar, alhtVar);
        this.b = afvnVar;
        this.c = asfsVar;
        this.e = albcVar;
        this.a = abduVar;
        this.f = aldnVar;
        this.g = aldlVar;
        this.h = akzeVar;
        this.i = albsVar;
    }

    @Override // defpackage.algt
    public final albu a(alcw alcwVar) {
        return this.i;
    }

    @Override // defpackage.algt
    public final alct b(alcw alcwVar) {
        alct alctVar = alcwVar.K;
        return alctVar == null ? alct.a : alctVar;
    }

    @Override // defpackage.aleo
    public final ankt c(String str, akzp akzpVar, alcw alcwVar) {
        alcs alcsVar;
        avuy g;
        avuq avuqVar;
        alct c;
        afvm d = this.b.d(alcwVar.e);
        if (d == null) {
            throw akzh.a(avun.UPLOAD_PROCESSOR_FAILURE_REASON_IDENTITY_NOT_FOUND);
        }
        aopa createBuilder = asew.a.createBuilder();
        String str2 = alcwVar.k;
        createBuilder.copyOnWrite();
        asew asewVar = (asew) createBuilder.instance;
        str2.getClass();
        asewVar.b |= 4;
        asewVar.e = str2;
        final avvd avvdVar = null;
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
            asew asewVar2 = (asew) createBuilder.instance;
            asewVar2.g = a;
            asewVar2.b |= 16;
        }
        aopa createBuilder2 = asfa.a.createBuilder();
        aopa createBuilder3 = asez.a.createBuilder();
        createBuilder3.copyOnWrite();
        asez asezVar = (asez) createBuilder3.instance;
        asezVar.b |= 1;
        asezVar.c = true;
        createBuilder2.copyOnWrite();
        asfa asfaVar = (asfa) createBuilder2.instance;
        asez asezVar2 = (asez) createBuilder3.mo39build();
        asezVar2.getClass();
        asfaVar.d = asezVar2;
        asfaVar.b |= 32;
        aopa createBuilder4 = arxa.a.createBuilder();
        createBuilder4.copyOnWrite();
        arxa arxaVar = (arxa) createBuilder4.instance;
        arxaVar.c = 0;
        arxaVar.b |= 1;
        createBuilder2.copyOnWrite();
        asfa asfaVar2 = (asfa) createBuilder2.instance;
        arxa arxaVar2 = (arxa) createBuilder4.mo39build();
        arxaVar2.getClass();
        asfaVar2.c = arxaVar2;
        asfaVar2.b |= 4;
        createBuilder.copyOnWrite();
        asew asewVar3 = (asew) createBuilder.instance;
        asfa asfaVar3 = (asfa) createBuilder2.mo39build();
        asfaVar3.getClass();
        asewVar3.h = asfaVar3;
        asewVar3.b |= 128;
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
        asew asewVar4 = (asew) createBuilder.instance;
        g.getClass();
        asewVar4.d = g;
        asewVar4.b |= 2;
        alcu a2 = alcu.a(alcwVar.l);
        if (a2 == null) {
            a2 = alcu.UNKNOWN_UPLOAD;
        }
        int n = alht.n(a2);
        createBuilder.copyOnWrite();
        asew asewVar5 = (asew) createBuilder.instance;
        asewVar5.f = n - 1;
        asewVar5.b |= 8;
        if ((alcwVar.d & 8) != 0) {
            awbb awbbVar = alcwVar.ao;
            if (awbbVar == null) {
                awbbVar = awbb.a;
            }
            createBuilder.copyOnWrite();
            asew asewVar6 = (asew) createBuilder.instance;
            awbbVar.getClass();
            asewVar6.i = awbbVar;
            asewVar6.b |= 512;
        }
        albc albcVar = this.e;
        alam alamVar = new alam(albcVar.e, d, ((asew) createBuilder.mo39build()).mo52toBuilder());
        alamVar.i();
        asex asexVar = (asex) albcVar.b.d(alamVar);
        asey aseyVar = asexVar.d;
        if (aseyVar == null) {
            aseyVar = asey.a;
        }
        if (aseyVar.b != 64128279) {
            this.h.a("CreateVideoTask UploadFeedbackItem not populated");
            return anlz.q(t(this.d.c(avun.UPLOAD_PROCESSOR_FAILURE_REASON_INVALID_CREATE_VIDEO_RESPONSE_MISSING_FEEDBACK), true));
        }
        asey aseyVar2 = asexVar.d;
        if (aseyVar2 == null) {
            aseyVar2 = asey.a;
        }
        if (aseyVar2.b == 64128279) {
            avuqVar = (avuq) aseyVar2.c;
        } else {
            avuqVar = avuq.a;
        }
        final String str3 = asexVar.c;
        boolean i = alht.i(avuqVar);
        Iterator it = avuqVar.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            avus avusVar = (avus) it.next();
            if ((avusVar.b & 32) != 0) {
                avvdVar = avusVar.d;
                if (avvdVar == null) {
                    avvdVar = avvd.a;
                }
            }
        }
        final avia f = alht.f(avuqVar);
        if (f == null || f.d.isEmpty()) {
            this.h.a("CreateVideoTask feedback continuation not populated");
            c = this.d.c(avun.UPLOAD_PROCESSOR_FAILURE_REASON_INVALID_CREATE_VIDEO_RESPONSE_MISSING_CONTINUATION);
        } else if (TextUtils.isEmpty(str3)) {
            this.h.a("CreateVideoTask video id not populated");
            c = this.d.c(avun.UPLOAD_PROCESSOR_FAILURE_REASON_INVALID_CREATE_VIDEO_RESPONSE_MISSING_VIDEO_ID);
        } else if (!i) {
            this.h.a("CreateVideoTask video registration failed");
            c = this.d.c(avun.UPLOAD_PROCESSOR_FAILURE_REASON_INVALID_CREATE_VIDEO_RESPONSE_REGISTRATION_FAILED);
        } else {
            c = this.d.e();
        }
        return anlz.q(u(c, true, new ayqb() { // from class: alek
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                alel alelVar = alel.this;
                avia aviaVar = f;
                String str4 = str3;
                avvd avvdVar2 = avvdVar;
                aopa aopaVar = (aopa) obj;
                if (aviaVar != null) {
                    String str5 = aviaVar.d;
                    aopaVar.copyOnWrite();
                    alcw alcwVar2 = (alcw) aopaVar.instance;
                    alcw alcwVar3 = alcw.a;
                    str5.getClass();
                    alcwVar2.c |= 16384;
                    alcwVar2.V = str5;
                    alct b = alelVar.d.b(aviaVar.c);
                    aopaVar.copyOnWrite();
                    alcw alcwVar4 = (alcw) aopaVar.instance;
                    b.getClass();
                    alcwVar4.Y = b;
                    alcwVar4.c |= 131072;
                }
                if (!TextUtils.isEmpty(str4)) {
                    aopaVar.copyOnWrite();
                    alcw alcwVar5 = (alcw) aopaVar.instance;
                    alcw alcwVar6 = alcw.a;
                    str4.getClass();
                    alcwVar5.c |= 32768;
                    alcwVar5.W = str4;
                }
                if (avvdVar2 != null) {
                    aopaVar.copyOnWrite();
                    alcw alcwVar7 = (alcw) aopaVar.instance;
                    alcw alcwVar8 = alcw.a;
                    alcwVar7.Z = avvdVar2;
                    alcwVar7.c |= 262144;
                }
            }
        }));
    }

    @Override // defpackage.algt
    public final ankt d(final String str, final akzp akzpVar) {
        return anlz.v(new aniq() { // from class: alej
            @Override // defpackage.aniq
            public final ankt a() {
                alel alelVar = alel.this;
                alcw o = alelVar.o(str, akzpVar, false);
                if ((o.c & 32768) == 0) {
                    throw akzh.a(avun.UPLOAD_PROCESSOR_FAILURE_REASON_INVALID_JOB_STATE);
                }
                abdt b = alelVar.a.b(o.e);
                b.i();
                b.a = o.W;
                if (!alelVar.a.e(b).c) {
                    throw new aart("Video deletion failed");
                }
                return anlz.q(alelVar.t(alelVar.d.e(), false));
            }
        }, anjk.a);
    }

    @Override // defpackage.algt
    public final aypx e() {
        return akxp.n;
    }

    @Override // defpackage.algt
    public final String f() {
        return "CreateVideoTask";
    }

    @Override // defpackage.algt
    public final boolean h() {
        return true;
    }

    @Override // defpackage.aleo
    public final boolean i(alcw alcwVar) {
        int i = alcwVar.b;
        return ((i & 1) == 0 || (i & 64) == 0 || (alcwVar.c & 2) == 0) ? false : true;
    }

    @Override // defpackage.algt
    public final boolean j() {
        return true;
    }

    @Override // defpackage.aleo
    public final akzs k(Throwable th, alcw alcwVar, boolean z) {
        if (th instanceof aart) {
            alht alhtVar = this.d;
            avun avunVar = avun.UPLOAD_PROCESSOR_FAILURE_REASON_INNERTUBE_FAILED;
            alct alctVar = alcwVar.K;
            if (alctVar == null) {
                alctVar = alct.a;
            }
            alctVar.getClass();
            return t(alhtVar.d(avunVar, alctVar, this.c.g, this.h), z);
        }
        return super.k(th, alcwVar, z);
    }

    @Override // defpackage.algt
    public final albu l() {
        return this.i;
    }
}
