package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
/* compiled from: PG */
/* renamed from: ajdp  reason: default package */
/* loaded from: classes.dex */
public final class ajdp implements ajed {
    public String a;
    private final aiix b;
    private final ahfm c;
    private final ajea d;

    public ajdp(String str, aiix aiixVar, ahfm ahfmVar) {
        this.b = aiixVar;
        ahfmVar.getClass();
        this.c = ahfmVar;
        this.a = null;
        this.d = new ajdo(this, str);
    }

    private static int k(ajec ajecVar) {
        asaa asaaVar = ajecVar.a;
        if (asaaVar == null) {
            return 4;
        }
        if (aijr.i(asaaVar)) {
            return 0;
        }
        int cj = awwc.cj(asaaVar.c);
        return (cj != 0 && cj == 2) ? 4 : 2;
    }

    @Override // defpackage.ajed
    public final int a(ajec ajecVar) {
        return k(ajecVar);
    }

    @Override // defpackage.ajed
    public final int b(ajec ajecVar) {
        return k(ajecVar);
    }

    @Override // defpackage.ajed
    public final aikd c(asaa asaaVar) {
        int cj;
        if (aijr.i(asaaVar)) {
            return null;
        }
        if (asaaVar != null && ((cj = awwc.cj(asaaVar.c)) == 0 || cj != 2)) {
            return new aikd(9, true, asaaVar.d);
        }
        return new aikd(7, null);
    }

    @Override // defpackage.ajed
    public final aikd d(aart aartVar) {
        return new aikd(8, aartVar);
    }

    @Override // defpackage.ajed
    public final ajea e() {
        return this.d;
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
        this.a = null;
    }

    @Override // defpackage.ajed
    public final boolean j(ajdy ajdyVar, ajec ajecVar) {
        if (ajdyVar != null && (ajdyVar.h || this.b.r())) {
            arzt arztVar = ajdyVar.e;
            VideoStreamingData videoStreamingData = ajdyVar.d;
            boolean z = videoStreamingData != null && videoStreamingData.v;
            byte[] bArr = ajdyVar.b;
            if (arztVar != null) {
                this.a = arztVar.c;
            }
            if (this.c.d && arztVar != null && !arztVar.c.isEmpty() && arztVar.d > 0 && arztVar.e != 0 && bArr != null && bArr.length > 0 && (!z || arztVar.h)) {
                return true;
            }
        }
        return false;
    }
}
