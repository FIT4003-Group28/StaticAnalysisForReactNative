package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aimn  reason: default package */
/* loaded from: classes.dex */
public final class aimn {
    public final yni a;
    private final aaqj b;
    private final aimy c;
    private final abec d;
    private final Set e;
    private final aadd f;
    private final aenl g;
    private final aaqf h;
    private final afvn i;

    public aimn(yni yniVar, aaqj aaqjVar, aaqf aaqfVar, afvn afvnVar, aimy aimyVar, Set set, abec abecVar, aadd aaddVar, aenl aenlVar) {
        yniVar.getClass();
        this.a = yniVar;
        aaqjVar.getClass();
        this.b = aaqjVar;
        aimyVar.getClass();
        this.c = aimyVar;
        set.getClass();
        this.e = set;
        abecVar.getClass();
        this.d = abecVar;
        this.f = aaddVar;
        this.g = aenlVar;
        this.h = aaqfVar;
        this.i = afvnVar;
    }

    public final aynx a(aaqk aaqkVar, PlaybackStartDescriptor playbackStartDescriptor, String str, aijp aijpVar) {
        aynx s;
        aanr h = aanr.h(this.f, playbackStartDescriptor.f(), str, playbackStartDescriptor.c(), aijpVar.h, playbackStartDescriptor.z());
        if (h != null && !TextUtils.isEmpty(playbackStartDescriptor.l())) {
            h.f(playbackStartDescriptor.l());
            h.d.set(aouw.ONESIE_REQUEST_TARGET_ENCRYPTED_WATCH_SERVICE_PHASE_TWO);
        }
        String l = playbackStartDescriptor.l();
        final acvg acvgVar = aijpVar.b;
        this.a.d(new ahhc());
        if (acvgVar != null) {
            acvgVar.c("sw_s");
            aopa createBuilder = asno.a.createBuilder();
            if (str != null) {
                createBuilder.copyOnWrite();
                asno asnoVar = (asno) createBuilder.instance;
                asnoVar.b |= 1024;
                asnoVar.j = str;
            }
            String h2 = zgh.h(l);
            createBuilder.copyOnWrite();
            asno asnoVar2 = (asno) createBuilder.instance;
            asnoVar2.b |= 16777216;
            asnoVar2.o = h2;
            acvgVar.a((asno) createBuilder.mo39build());
        }
        aenl aenlVar = this.g;
        if (aenlVar == null || h == null) {
            return aynx.s(new UnsupportedOperationException("requestStreamingWatch only available through onesie."));
        }
        aenk aenkVar = (aenk) aenlVar;
        aflm b = aenkVar.b(acvgVar);
        b.V();
        aeuo a = aenkVar.j.a(h.b);
        aenv aenvVar = new aenv(aenkVar.h, h.b, aenkVar.f);
        aenkVar.g.b(a, h.b);
        if (h.g == null) {
            s = aynx.s(new IllegalArgumentException("Onesie requests must have a non-null videoId."));
        } else {
            try {
                aelb a2 = aenkVar.e.a(h, aenvVar, afeu.g(aeny.i(((aenk) aenlVar).c, ((aenk) aenlVar).i, ((aenk) aenlVar).d)), b, aaqkVar);
                aenkVar.d(h, a, b);
                final aeks aeksVar = (aeks) a2;
                if (aeksVar.g != null) {
                    s = aynx.k(new aynz() { // from class: aekm
                        @Override // defpackage.aynz
                        public final void a(ayny aynyVar) {
                            aeks aeksVar2 = aeks.this;
                            aeksVar2.k = aynyVar.b();
                            aeksVar2.n();
                        }
                    }, aynq.BUFFER).G(azpj.b(aeksVar.b)).v(new aekn(aeksVar, 1)).v(new aekn(aeksVar));
                } else {
                    s = aynx.t(gbb.r);
                }
            } catch (aenw e) {
                int i = e.a;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                if (i2 == 0) {
                    aenvVar.c("unavailable.hotconfig", e);
                } else if (i2 == 1) {
                    aenvVar.c("unavailable.keyexpired", e);
                }
                s = aynx.s(e);
            }
        }
        aynx q = s.q(new ayqb() { // from class: aimm
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                aimn aimnVar = aimn.this;
                acvg acvgVar2 = acvgVar;
                asdd asddVar = (asdd) obj;
                aimnVar.a.d(new ahhb());
                if (acvgVar2 != null) {
                    acvgVar2.c("sw_r");
                }
            }
        });
        ayrd.c(16, "initialCapacity");
        ayui ayuiVar = new ayui(q);
        azqc.j();
        return ayuiVar;
    }

    public final aaqk b(PlaybackStartDescriptor playbackStartDescriptor, String str, aijp aijpVar) {
        aina b = this.c.b(playbackStartDescriptor, -1, this.e, aijpVar.b, str);
        abed a = this.d.a(playbackStartDescriptor.l(), playbackStartDescriptor.k(), playbackStartDescriptor.a(), playbackStartDescriptor.i(), playbackStartDescriptor.y(), new aimt(this.a, aijpVar.b));
        aaqf aaqfVar = this.h;
        afvm c = this.i.c();
        aaqfVar.getClass();
        c.getClass();
        aimv aimvVar = new aimv(aaqfVar, c);
        aimvVar.a = ampq.j(b);
        aimvVar.b = ampq.j(a);
        aimvVar.k(playbackStartDescriptor.y());
        return this.b.a(aimvVar, asdd.a, afzd.a, agvc.j, aery.h);
    }
}
