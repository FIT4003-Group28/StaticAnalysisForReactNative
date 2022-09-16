package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
/* compiled from: PG */
/* renamed from: vtx  reason: default package */
/* loaded from: classes4.dex */
public final class vtx extends oud {
    public boolean i;
    private final vtt j;

    public vtx(vtz vtzVar, Context context, oui ouiVar, Handler handler, vtw vtwVar) {
        super(context, ouiVar, otm.a, 100L, null, false, handler, vtwVar, Integer.MAX_VALUE);
        boolean z = false;
        this.i = false;
        vtt vttVar = vtzVar.h;
        vttVar.getClass();
        this.j = vttVar;
        viu.d(vttVar.a.f == null ? true : z);
        vtz vtzVar2 = vttVar.a;
        vtzVar2.f = this;
        vtzVar2.d();
    }

    @Override // defpackage.oud, defpackage.ots
    protected final boolean F() {
        return super.F() && this.j.b();
    }

    @Override // defpackage.oud, defpackage.ouo, defpackage.osy
    public final void k(int i, Object obj) {
        super.k(i, obj);
        if (i == 1) {
            Surface surface = (Surface) obj;
            vtz vtzVar = this.j.a;
            if (vtzVar.e == surface) {
                return;
            }
            vtzVar.e = surface;
            vtzVar.g = true;
            vtzVar.d();
        }
    }

    @Override // defpackage.oud, defpackage.ots
    protected final void n(MediaCodec mediaCodec, boolean z, MediaFormat mediaFormat, MediaCrypto mediaCrypto) {
        viu.d(this.j.b());
        super.n(mediaCodec, z, mediaFormat, mediaCrypto);
    }

    @Override // defpackage.oud, defpackage.ouj, defpackage.ouo
    protected final void pO(int i, long j, boolean z) {
        viu.b(i == 0);
        super.pO(i, j, z);
        this.i = true;
        this.j.a.d();
    }

    @Override // defpackage.oud, defpackage.ots, defpackage.ouj, defpackage.ouo
    public final void q() {
        super.q();
        vtt vttVar = this.j;
        vtz vtzVar = vttVar.a;
        vtzVar.b.a(vtzVar);
        vttVar.a.d();
    }
}
