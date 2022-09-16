package defpackage;

import com.google.protos.youtube.api.innertube.InlinePlaybackRendererOuterClass;
import java.util.List;
/* compiled from: PG */
/* renamed from: ggz  reason: default package */
/* loaded from: classes3.dex */
public final class ggz implements ggt {
    public static final ggz a = new ggz();
    public arjw b;
    public Object c;

    private ggz() {
        this.c = null;
        this.b = null;
    }

    public ggz(itt ittVar) {
        ittVar.getClass();
        this.c = ittVar;
        aqyb aqybVar = ittVar.a.h;
        arjw arjwVar = (aqybVar == null ? aqyb.a : aqybVar).f;
        this.b = arjwVar == null ? arjw.a : arjwVar;
    }

    @Override // defpackage.ggt
    public final ggy a() {
        arjm arjmVar;
        arjz arjzVar;
        arjo arjoVar;
        arjy arjyVar;
        arjw arjwVar = this.b;
        if (arjwVar != null) {
            arjmVar = arjm.b(arjwVar.p);
            if (arjmVar == null) {
                arjmVar = arjm.INLINE_AUDIO_CONTROL_UI_STYLE_UNKNOWN;
            }
        } else {
            arjmVar = arjm.INLINE_AUDIO_CONTROL_UI_STYLE_UNKNOWN;
        }
        arjw arjwVar2 = this.b;
        if (arjwVar2 != null) {
            arjzVar = arjz.b(arjwVar2.o);
            if (arjzVar == null) {
                arjzVar = arjz.INLINE_SCRUBBING_UI_STYLE_UNKNOWN;
            }
        } else {
            arjzVar = arjz.INLINE_SCRUBBING_UI_STYLE_UNKNOWN;
        }
        arjw arjwVar3 = this.b;
        if (arjwVar3 != null) {
            arjoVar = arjo.b(arjwVar3.q);
            if (arjoVar == null) {
                arjoVar = arjo.INLINE_PLAYBACK_FULLSCREEN_UI_STYLE_UNKNOWN;
            }
        } else {
            arjoVar = arjo.INLINE_PLAYBACK_FULLSCREEN_UI_STYLE_UNKNOWN;
        }
        arjw arjwVar4 = this.b;
        if (arjwVar4 != null) {
            arjyVar = arjy.b(arjwVar4.r);
            if (arjyVar == null) {
                arjyVar = arjy.INLINE_PLAYBACK_TRIGGER_STYLE_UNKNOWN;
            }
        } else {
            arjyVar = arjy.INLINE_PLAYBACK_TRIGGER_STYLE_UNKNOWN;
        }
        ggx a2 = ggy.a();
        a2.b(arjmVar);
        a2.e(arjzVar);
        a2.c(arjoVar);
        a2.d(arjyVar);
        return a2.a();
    }

    @Override // defpackage.ggt
    public final apzg b() {
        arjw arjwVar = this.b;
        if (arjwVar == null || (arjwVar.b & 512) == 0) {
            return null;
        }
        apzg apzgVar = arjwVar.j;
        return apzgVar == null ? apzg.a : apzgVar;
    }

    @Override // defpackage.ggt
    public final apzg c() {
        arjw arjwVar = this.b;
        if (arjwVar == null || (arjwVar.b & 256) == 0) {
            return null;
        }
        apzg apzgVar = arjwVar.i;
        return apzgVar == null ? apzg.a : apzgVar;
    }

    @Override // defpackage.ggt
    public final arag d() {
        arjw arjwVar = this.b;
        if (arjwVar == null || (arjwVar.b & 16) == 0) {
            return null;
        }
        arag aragVar = arjwVar.f;
        return aragVar == null ? arag.a : aragVar;
    }

    @Override // defpackage.ggt
    public final avhn e() {
        arjw arjwVar = this.b;
        if (arjwVar == null || (arjwVar.b & 2) == 0) {
            return null;
        }
        avhn avhnVar = arjwVar.c;
        return avhnVar == null ? avhn.a : avhnVar;
    }

    @Override // defpackage.ggt
    public final String f() {
        arjw arjwVar = this.b;
        if (arjwVar == null || (arjwVar.b & 1024) == 0) {
            return null;
        }
        return arjwVar.k;
    }

    @Override // defpackage.ggt
    public final List g() {
        arjw arjwVar = this.b;
        if (arjwVar != null) {
            return arjwVar.d;
        }
        return null;
    }

    @Override // defpackage.ggt
    public final boolean h() {
        int T;
        arjw arjwVar = this.b;
        return (arjwVar == null || (T = akel.T(arjwVar.s)) == 0 || T != 2) ? false : true;
    }

    @Override // defpackage.ggt
    public final /* synthetic */ boolean i() {
        return ggs.b(this);
    }

    @Override // defpackage.ggt
    public final /* synthetic */ boolean j() {
        return ggs.c(this);
    }

    @Override // defpackage.ggt
    public final /* synthetic */ boolean k(ggt ggtVar) {
        return ggs.d(this, ggtVar);
    }

    @Override // defpackage.ggt
    public final int l() {
        arjw arjwVar = this.b;
        if (arjwVar != null) {
            asxq asxqVar = arjwVar.l;
            if (asxqVar == null) {
                asxqVar = asxq.a;
            }
            if ((asxqVar.b & 1) != 0) {
                asxq asxqVar2 = this.b.l;
                if (asxqVar2 == null) {
                    asxqVar2 = asxq.a;
                }
                int Z = almu.Z(asxqVar2.c);
                if (Z != 0) {
                    return Z;
                }
                return 1;
            }
        }
        return 1;
    }

    @Override // defpackage.ggt
    public final /* synthetic */ void m() {
        ggs.e(this);
    }

    public ggz(mbf mbfVar) {
        arjw arjwVar;
        mbfVar.getClass();
        this.c = mbfVar;
        aunb aunbVar = mbfVar.a().c;
        if ((aunbVar == null ? aunb.a : aunbVar).qn(InlinePlaybackRendererOuterClass.inlinePlaybackRenderer)) {
            aunb aunbVar2 = mbfVar.a().c;
            arjwVar = (arjw) (aunbVar2 == null ? aunb.a : aunbVar2).qm(InlinePlaybackRendererOuterClass.inlinePlaybackRenderer);
        } else {
            arjwVar = null;
        }
        this.b = arjwVar;
    }

    public ggz(mbg mbgVar) {
        arjw arjwVar;
        mbgVar.getClass();
        this.c = mbgVar;
        aunb aunbVar = mbgVar.a().c;
        if ((aunbVar == null ? aunb.a : aunbVar).qn(InlinePlaybackRendererOuterClass.inlinePlaybackRenderer)) {
            aunb aunbVar2 = mbgVar.a().c;
            arjwVar = (arjw) (aunbVar2 == null ? aunb.a : aunbVar2).qm(InlinePlaybackRendererOuterClass.inlinePlaybackRenderer);
        } else {
            arjwVar = null;
        }
        this.b = arjwVar;
    }

    public ggz(apqk apqkVar) {
        apqkVar.getClass();
        this.c = apqkVar;
        this.b = null;
    }

    public ggz(aqlb aqlbVar) {
        aunb aunbVar;
        arjw arjwVar;
        aunb aunbVar2;
        aqlbVar.getClass();
        this.c = aqlbVar;
        if (aqlbVar.c == 22) {
            aunbVar = (aunb) aqlbVar.d;
        } else {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(InlinePlaybackRendererOuterClass.inlinePlaybackRenderer)) {
            if (aqlbVar.c == 22) {
                aunbVar2 = (aunb) aqlbVar.d;
            } else {
                aunbVar2 = aunb.a;
            }
            arjwVar = (arjw) aunbVar2.qm(InlinePlaybackRendererOuterClass.inlinePlaybackRenderer);
        } else {
            arjwVar = null;
        }
        this.b = arjwVar;
    }

    public ggz(arjw arjwVar) {
        arjwVar.getClass();
        this.c = arjwVar;
        this.b = arjwVar;
    }

    public ggz(arkf arkfVar) {
        arjw arjwVar;
        arkfVar.getClass();
        this.c = arkfVar;
        arke arkeVar = arkfVar.h;
        if ((arkeVar == null ? arke.a : arkeVar).b == 83537025) {
            arke arkeVar2 = arkfVar.h;
            arkeVar2 = arkeVar2 == null ? arke.a : arkeVar2;
            if (arkeVar2.b == 83537025) {
                arjwVar = (arjw) arkeVar2.c;
            } else {
                arjwVar = arjw.a;
            }
        } else {
            arjwVar = null;
        }
        this.b = arjwVar;
    }

    public ggz(auip auipVar) {
        auipVar.getClass();
        this.c = auipVar;
        this.b = null;
    }

    public ggz(auiq auiqVar) {
        auiqVar.getClass();
        this.c = auiqVar;
        this.b = null;
    }

    public ggz(auiw auiwVar) {
        auiwVar.getClass();
        this.c = auiwVar;
        this.b = null;
    }

    public ggz(auix auixVar) {
        auixVar.getClass();
        this.c = auixVar;
        this.b = null;
    }

    public ggz(aujj aujjVar) {
        arjw arjwVar;
        aujjVar.getClass();
        this.c = aujjVar;
        aunb aunbVar = aujjVar.c;
        if ((aunbVar == null ? aunb.a : aunbVar).qn(InlinePlaybackRendererOuterClass.inlinePlaybackRenderer)) {
            aunb aunbVar2 = aujjVar.c;
            arjwVar = (arjw) (aunbVar2 == null ? aunb.a : aunbVar2).qm(InlinePlaybackRendererOuterClass.inlinePlaybackRenderer);
        } else {
            arjwVar = null;
        }
        this.b = arjwVar;
    }
}
