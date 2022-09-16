package defpackage;

import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
/* compiled from: PG */
/* renamed from: aibi  reason: default package */
/* loaded from: classes.dex */
public final class aibi implements aibf, airt, ynl {
    private final airr a;
    private final aibg b;

    public aibi(airr airrVar, aibg aibgVar) {
        this.a = airrVar;
        aibgVar.getClass();
        this.b = aibgVar;
        aibgVar.m(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(ahhp ahhpVar) {
        this.b.k(ahhpVar.a());
        if (ahhpVar.a() == null || ahhpVar.a().p() || ahhpVar.a().l()) {
            this.b.e(false);
        } else {
            this.b.e(true);
        }
    }

    public final void c(ahhq ahhqVar) {
        this.b.g(ahhqVar.a());
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.ae(ahja.n, ahja.p).h(aiwv.n(airwVar.aB(), 1048576L)).h(aiwv.l(1)).aa(new aibh(this), aiax.c), airwVar.ae(ahja.n, ahja.o).h(aiwv.n(airwVar.aB(), 1048576L)).h(aiwv.l(1)).aa(new aibh(this, 1), aiax.c)};
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                b((ahhp) obj);
                return null;
            } else if (i == 1) {
                c((ahhq) obj);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ahhp.class, ahhq.class};
    }

    @Override // defpackage.aibf
    public final void pA(SubtitleTrack subtitleTrack) {
        this.a.H(subtitleTrack);
    }
}
