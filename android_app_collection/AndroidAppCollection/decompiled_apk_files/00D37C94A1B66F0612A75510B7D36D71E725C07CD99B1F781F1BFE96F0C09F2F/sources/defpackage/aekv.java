package defpackage;

import com.google.android.exoplayer.MediaFormat;
import java.io.IOException;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aekv  reason: default package */
/* loaded from: classes.dex */
public final class aekv implements Runnable, ovc {
    final /* synthetic */ aekw a;
    private MediaFormat b;
    private oye c;
    private final int d;
    private final String e;
    private final byte[] f;
    private final boolean g;

    public aekv(aekw aekwVar, int i, String str, byte[] bArr, boolean z) {
        this.a = aekwVar;
        this.d = i;
        this.e = str;
        this.f = bArr;
        this.g = z;
    }

    @Override // defpackage.ovc
    public final void b(owx owxVar) {
    }

    @Override // defpackage.ovc
    public final void c(oye oyeVar) {
        this.c = oyeVar;
    }

    @Override // defpackage.oyf
    public final void d(MediaFormat mediaFormat) {
        this.b = mediaFormat;
    }

    @Override // defpackage.oyf
    public final void f(pct pctVar, int i) {
    }

    @Override // defpackage.oyf
    public final void g(long j, int i, int i2, int i3, byte[] bArr) {
    }

    @Override // defpackage.oyf
    public final int j(oxn oxnVar, int i, boolean z) {
        return 0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oxq ozdVar;
        pbn pbnVar = new pbn(aekw.a);
        pbi pbiVar = new pbi(this.f);
        if (!((Set) aank.bl.get()).contains(Integer.valueOf(this.d))) {
            ozdVar = new ozd();
        } else if (this.g) {
            ozdVar = new pbe(2);
        } else {
            ozdVar = new pbe(new pay(), 0);
        }
        ovd ovdVar = new ovd(ozdVar);
        try {
            oxn oxnVar = new oxn(pbiVar, pbnVar.c, pbiVar.b(pbnVar));
            ovdVar.e(this);
            do {
            } while (ovdVar.i(oxnVar) == 0);
        } catch (IOException | InterruptedException unused) {
        }
        if (this.b == null) {
            afus.b(2, 8, "Failed to extract a media format from init segment.");
            return;
        }
        String b = ovm.b(this.d, this.e);
        String str = this.a.b;
        MediaFormat mediaFormat = this.b;
        this.a.l(new aeku(pbiVar, pbnVar, new ovm(b, str, mediaFormat.h, mediaFormat.i, -1.0f, mediaFormat.q, mediaFormat.r, -1, null, null), this.b, this.c, this.f.length));
    }
}
