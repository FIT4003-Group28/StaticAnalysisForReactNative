package defpackage;

import android.content.res.Resources;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: aicj  reason: default package */
/* loaded from: classes.dex */
public class aicj implements aicg, airt, ynl {
    protected final aich a;
    private final Resources b;
    private final airr c;

    public aicj(Resources resources, airr airrVar, aich aichVar) {
        resources.getClass();
        this.b = resources;
        this.c = airrVar;
        aichVar.getClass();
        this.a = aichVar;
        aichVar.q(this);
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().k.h(aiwv.n(airwVar.aB(), 4194304L)).h(aiwv.l(0)).aa(new ayqb() { // from class: aici
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                aicj.this.h((aesr) obj);
            }
        }, aiax.e)};
    }

    public void h(aesr aesrVar) {
        if (aesrVar.f() == null) {
            return;
        }
        this.a.pG(aesrVar.j());
        if (!aesrVar.j()) {
            return;
        }
        VideoQuality[] l = aesrVar.l();
        int length = l.length;
        int i = length + 1;
        VideoQuality[] videoQualityArr = new VideoQuality[i];
        boolean z = false;
        videoQualityArr[0] = new VideoQuality(-2, this.b.getString(R.string.quality_auto), false);
        System.arraycopy(l, 0, videoQualityArr, 1, length);
        int i2 = -1;
        int f = aesrVar.f() != null ? aesrVar.f().f() : -1;
        int i3 = 0;
        while (true) {
            if (i3 >= i) {
                break;
            } else if (videoQualityArr[i3].a == f) {
                i2 = i3;
                break;
            } else {
                i3++;
            }
        }
        if (aesrVar.g() == null || !aesrVar.g().d()) {
            z = true;
        }
        this.a.pH(videoQualityArr, i2, z);
    }

    @Override // defpackage.ynl
    public Class[] ky(Class cls, Object obj, int i) {
        return ahfe.b(this, obj, i);
    }

    @Override // defpackage.aicg
    public final void w(int i) {
        ajah ajahVar = this.c.q.a;
        if (ajahVar == null) {
            return;
        }
        ajahVar.Q(i);
    }

    @Override // defpackage.aicg
    public final void x(awan awanVar) {
        ajah ajahVar = this.c.q.a;
        if (ajahVar == null) {
            return;
        }
        ajahVar.R(awanVar);
    }
}
