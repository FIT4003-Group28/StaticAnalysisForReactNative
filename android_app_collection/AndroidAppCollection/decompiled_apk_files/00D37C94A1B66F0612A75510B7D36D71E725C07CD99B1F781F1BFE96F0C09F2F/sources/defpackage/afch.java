package defpackage;

import android.os.Build;
import android.os.Trace;
import com.google.android.exoplayer2.Format;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: afch  reason: default package */
/* loaded from: classes.dex */
final class afch implements bab {
    private final bab a;
    private final afcj b;
    private final int c;

    public afch(bab babVar, afcj afcjVar, int i) {
        this.a = babVar;
        this.b = afcjVar;
        this.c = i;
    }

    @Override // defpackage.bab
    public final /* synthetic */ int a(ast astVar, int i, boolean z) {
        return iy.d(this, astVar, i, z);
    }

    @Override // defpackage.bab
    public final /* synthetic */ void c(pwu pwuVar, int i) {
        iy.e(this, pwuVar, i);
    }

    @Override // defpackage.bab
    public final void d(pwu pwuVar, int i, int i2) {
        this.a.c(pwuVar, i);
    }

    @Override // defpackage.bab
    public final void e(long j, int i, int i2, int i3, baa baaVar) {
        afcj afcjVar = this.b;
        int i4 = this.c;
        if (TimeUnit.MICROSECONDS.toMillis(j) > afcjVar.e && !afcjVar.b) {
            boolean z = true;
            if (i4 == 1) {
                if (!afcjVar.c) {
                    afcjVar.a.e();
                    afcjVar.c = true;
                    if (Build.VERSION.SDK_INT >= 29) {
                        Trace.endAsyncSection("ParsingAudio", afcjVar.f);
                    }
                }
            } else if (!afcjVar.d) {
                afcjVar.a.av();
                afcjVar.d = true;
                if (Build.VERSION.SDK_INT >= 29) {
                    Trace.endAsyncSection("ParsingVideo", afcjVar.f);
                }
            }
            if (!afcjVar.d || !afcjVar.c) {
                z = false;
            }
            afcjVar.b = z;
        }
        this.a.e(j, i, i2, i3, baaVar);
    }

    @Override // defpackage.bab
    public final int f(ast astVar, int i, boolean z) {
        return this.a.a(astVar, i, z);
    }

    @Override // defpackage.bab
    public final void rx(Format format) {
        this.a.rx(format);
    }
}
