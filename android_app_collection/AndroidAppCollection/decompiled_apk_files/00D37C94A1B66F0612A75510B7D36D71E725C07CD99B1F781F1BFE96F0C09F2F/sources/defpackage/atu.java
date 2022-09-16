package defpackage;

import android.os.Handler;
import androidx.media3.decoder.opus.OpusDecoder;
import androidx.media3.decoder.opus.OpusLibrary;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
/* compiled from: PG */
/* renamed from: atu  reason: default package */
/* loaded from: classes2.dex */
public class atu extends plv {
    public atu() {
        super((Handler) null, (pli) null, new pky[0]);
    }

    @Override // defpackage.plv
    protected final int b(Format format) {
        Class cls = format.E;
        boolean z = cls == null || OpusLibrary.b(cls);
        if (!OpusLibrary.a() || !"audio/opus".equalsIgnoreCase(format.l)) {
            return 0;
        }
        if (!((plv) this).b.v(pxi.w(2, format.y, format.z))) {
            return 1;
        }
        return !z ? 2 : 4;
    }

    @Override // defpackage.plv
    protected final /* bridge */ /* synthetic */ Format c(pmr pmrVar) {
        OpusDecoder opusDecoder = (OpusDecoder) pmrVar;
        return pxi.w(true != opusDecoder.a ? 2 : 4, opusDecoder.b, 48000);
    }

    @Override // defpackage.pkd, defpackage.pke
    public final String d() {
        return "LibopusAudioRenderer";
    }

    @Override // defpackage.plv
    protected final /* bridge */ /* synthetic */ pmr e(Format format, ExoMediaCrypto exoMediaCrypto) {
        int i = pxi.a;
        boolean z = ((plv) this).b.a(pxi.w(4, format.y, format.z)) == 2;
        int i2 = format.m;
        if (i2 == -1) {
            i2 = 5760;
        }
        return new OpusDecoder(i2, format.n, exoMediaCrypto, z);
    }

    public atu(Handler handler, pli pliVar, plo ploVar) {
        super(handler, pliVar, ploVar);
    }

    public atu(Handler handler, pli pliVar, pky... pkyVarArr) {
        super(handler, pliVar, pkyVarArr);
    }
}
