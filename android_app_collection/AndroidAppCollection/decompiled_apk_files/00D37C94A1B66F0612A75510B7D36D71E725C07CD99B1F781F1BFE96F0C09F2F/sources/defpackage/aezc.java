package defpackage;

import com.google.android.exoplayer2.Format;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: aezc  reason: default package */
/* loaded from: classes.dex */
public class aezc implements bab {
    private bab a = new azd();
    public volatile IOException c;

    @Override // defpackage.bab
    public final /* synthetic */ int a(ast astVar, int i, boolean z) {
        return iy.d(this, astVar, i, z);
    }

    @Override // defpackage.bab
    public /* synthetic */ void c(pwu pwuVar, int i) {
        iy.e(this, pwuVar, i);
    }

    @Override // defpackage.bab
    public final void d(pwu pwuVar, int i, int i2) {
        this.a.c(pwuVar, i);
    }

    @Override // defpackage.bab
    public void e(long j, int i, int i2, int i3, baa baaVar) {
        this.a.e(j, i, i2, i3, baaVar);
    }

    @Override // defpackage.bab
    public final int f(ast astVar, int i, boolean z) {
        if (this.c != null) {
            IOException iOException = this.c;
            this.c = null;
            throw iOException;
        }
        return this.a.a(astVar, i, z);
    }

    public final void g(bab babVar) {
        this.a = babVar;
        this.c = null;
    }

    @Override // defpackage.bab
    public final void rx(Format format) {
        this.a.rx(format);
    }
}
