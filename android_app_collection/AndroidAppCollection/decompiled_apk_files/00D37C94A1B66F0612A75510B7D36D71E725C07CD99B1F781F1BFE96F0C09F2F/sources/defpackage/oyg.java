package defpackage;

import android.util.Pair;
import com.google.android.exoplayer.MediaFormat;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: oyg  reason: default package */
/* loaded from: classes4.dex */
final class oyg extends oyk {
    private boolean c;
    private boolean d;

    public oyg(oyf oyfVar) {
        super(oyfVar);
    }

    @Override // defpackage.oyk
    protected final void a(pct pctVar, long j) {
        int h = pctVar.h();
        if (h != 0) {
            if (h != 1) {
                return;
            }
            int a = pctVar.a();
            this.a.f(pctVar, a);
            this.a.g(j, 1, a, 0, null);
        } else if (this.d) {
        } else {
            int a2 = pctVar.a();
            byte[] bArr = new byte[a2];
            pctVar.u(bArr, 0, a2);
            Pair a3 = pcf.a(bArr);
            this.a.d(MediaFormat.b(null, "audio/mp4a-latm", -1, -1, this.b, ((Integer) a3.second).intValue(), ((Integer) a3.first).intValue(), Collections.singletonList(bArr), null));
            this.d = true;
        }
    }

    @Override // defpackage.oyk
    protected final boolean b(pct pctVar) {
        if (!this.c) {
            int h = pctVar.h() >> 4;
            if (h == 10) {
                this.c = true;
            } else {
                StringBuilder sb = new StringBuilder(39);
                sb.append("Audio format not supported: ");
                sb.append(h);
                throw new oyj(sb.toString());
            }
        } else {
            pctVar.A(1);
        }
        return true;
    }
}
