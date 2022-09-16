package defpackage;

import android.media.MediaFormat;
import com.google.android.exoplayer2.Format;
/* compiled from: PG */
/* renamed from: pkk  reason: default package */
/* loaded from: classes4.dex */
public final class pkk implements pxt, pkb {
    private pxt a;

    @Override // defpackage.pxt
    public final void a(long j, long j2, Format format, MediaFormat mediaFormat) {
        pxt pxtVar = this.a;
        if (pxtVar != null) {
            pxtVar.a(j, j2, format, mediaFormat);
        }
    }

    @Override // defpackage.pkb
    public final void ad(int i, Object obj) {
        if (i == 7) {
            this.a = (pxt) obj;
        } else if (i != 8) {
            if (i != 10000 || ((pym) obj) == null) {
                return;
            }
            throw null;
        } else {
            pkk pkkVar = (pkk) obj;
        }
    }
}
