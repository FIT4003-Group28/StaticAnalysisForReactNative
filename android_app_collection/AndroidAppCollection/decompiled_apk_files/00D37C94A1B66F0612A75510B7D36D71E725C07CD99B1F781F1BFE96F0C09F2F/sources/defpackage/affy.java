package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: affy  reason: default package */
/* loaded from: classes.dex */
public class affy {
    protected final adzz c;
    public aeub d = aeub.a;
    public final afjz e;

    public affy(adzz adzzVar, afjz afjzVar) {
        this.c = adzzVar;
        this.e = afjzVar;
    }

    public final void c(aeub aeubVar, VideoStreamingData videoStreamingData) {
        this.d = aeubVar;
        boolean D = videoStreamingData.D();
        boolean z = true;
        boolean z2 = false;
        if (D) {
            Iterator it = videoStreamingData.p.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (d((FormatStreamModel) it.next())) {
                        z2 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            Iterator it2 = videoStreamingData.o.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = z2;
                    break;
                } else if (d((FormatStreamModel) it2.next())) {
                    break;
                }
            }
        } else {
            z = false;
        }
        afki afkiVar = afki.ABR;
        if (!this.e.n().N) {
            aeubVar.f(D, z);
        }
    }

    public final boolean d(FormatStreamModel formatStreamModel) {
        aead h;
        if (formatStreamModel.J()) {
            aeai aeaiVar = (aeai) this.c;
            amvn p = amvn.p((Collection) aeaiVar.b.get());
            String l = aeai.l(p, formatStreamModel.b, formatStreamModel.e);
            if (l != null && (h = aeaiVar.h(p, l)) != null && h.c() != null && aeai.m(p, l, 0L, h.c()[0]) && !this.c.f(formatStreamModel)) {
                return true;
            }
        }
        return false;
    }
}
