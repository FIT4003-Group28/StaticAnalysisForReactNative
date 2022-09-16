package defpackage;

import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ldz  reason: default package */
/* loaded from: classes3.dex */
public final class ldz implements akio {
    final /* synthetic */ lec a;

    public ldz(lec lecVar) {
        this.a = lecVar;
    }

    @Override // defpackage.akio
    public final void a() {
        lec lecVar = this.a;
        if (lecVar.n || lecVar.q) {
            return;
        }
        lecVar.i();
        lec lecVar2 = this.a;
        lecVar2.c.o(lecVar2.o, lecVar2.p);
    }

    @Override // defpackage.akio
    public final void b(Throwable th) {
        if (th.getMessage() != null) {
            String format = String.format(new Locale("en"), "%s (YtConnectionType = %d)", th.getMessage(), Integer.valueOf(this.a.f.a()));
            afus.c(2, 32, format, th);
            String valueOf = String.valueOf(format);
            zep.d(valueOf.length() != 0 ? "VoiceSearchController error: ".concat(valueOf) : new String("VoiceSearchController error: "), th);
        }
        lec lecVar = this.a;
        if (lecVar.n) {
            lecVar.m();
        }
        this.a.i();
    }

    @Override // defpackage.akio
    public final void c(aoob aoobVar) {
        aoob aoobVar2;
        try {
            awxk awxkVar = (awxk) aopi.parseFrom(awxk.a, aoobVar, aoos.b());
            aaqp aaqpVar = this.a.g;
            if (awxkVar.b == 1) {
                aoobVar2 = (aoob) awxkVar.c;
            } else {
                aoobVar2 = aoob.b;
            }
            arkz arkzVar = (arkz) aaqpVar.a(aoobVar2.I(), arkz.a);
            if (arkzVar == null) {
                return;
            }
            if ((arkzVar.b & 4) != 0 && arkzVar.f.size() <= 0) {
                this.a.h.n(new acte(arkzVar.c.I()));
            }
            if ((arkzVar.b & 128) != 0) {
                this.a.b.g(aoobVar.I());
            } else if (arkzVar.f.size() > 0) {
                lec lecVar = this.a;
                lecVar.r = arkzVar.f;
                lecVar.c();
                lecVar.c.j();
                if (!eog.z(lecVar.a) || !lecVar.i.m(asny.LATENCY_ACTION_VOICE_ASSISTANT)) {
                    return;
                }
                lecVar.i.t("voz_vt", asny.LATENCY_ACTION_VOICE_ASSISTANT);
            } else {
                this.a.i();
                this.a.m();
            }
        } catch (aopx unused) {
        }
    }

    @Override // defpackage.akio
    public final /* synthetic */ void d() {
    }
}
