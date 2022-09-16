package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afdi  reason: default package */
/* loaded from: classes.dex */
public class afdi implements ovi {
    final /* synthetic */ afdv a;

    public afdi(afdv afdvVar) {
        this.a = afdvVar;
    }

    @Override // defpackage.ova
    public final void a(int i, ovm ovmVar, int i2, long j) {
        if (i == this.a.u()) {
            afdv afdvVar = this.a;
            if (afdvVar.t == null || afdvVar.G == null || !agpr.q(i2)) {
                return;
            }
            String str = ovmVar.a;
            FormatStreamModel h = this.a.t.h(ovm.a(str), ovm.c(str));
            if (h == null) {
                return;
            }
            if (h.P()) {
                afdv afdvVar2 = this.a;
                afdvVar2.H = h;
                affr b = afdvVar2.m.b(j);
                afdv afdvVar3 = this.a;
                afdvVar3.f40J = b.b;
                afdvVar3.L = b.c;
                afdvVar3.M = i2;
            } else if (!h.C()) {
                return;
            } else {
                afdv afdvVar4 = this.a;
                afdvVar4.I = h;
                if (afdvVar4.y) {
                    afdvVar4.M = i2;
                }
            }
            g();
        }
    }

    @Override // defpackage.ova
    public void b(int i, IOException iOException) {
        if (i != this.a.u()) {
            return;
        }
        if ((iOException instanceof afkp) && this.a.g() + 1000 < this.a.f()) {
            return;
        }
        afdv afdvVar = this.a;
        afkn a = afdvVar.l.a(iOException, afdvVar.g(), this.a.b, afkl.DEFAULT, this.a.t);
        if (this.a.O.z()) {
            String i2 = a.i();
            String valueOf = String.valueOf(this.a.f.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 3 + String.valueOf(valueOf).length());
            sb.append(i2);
            sb.append(";c.");
            sb.append(valueOf);
            this.a.f.i("fberr", new aest(sb.toString()));
        }
        this.a.f.g(a);
    }

    @Override // defpackage.ova
    public final void c() {
    }

    @Override // defpackage.ova
    public final void d() {
    }

    @Override // defpackage.ova
    public void e() {
    }

    @Override // defpackage.ova
    public final void f() {
    }

    public final void g() {
        afdv afdvVar = this.a;
        boolean z = afdvVar.y;
        boolean z2 = false;
        if (!z && afdvVar.H != null && afdvVar.I != null) {
            z2 = true;
        }
        if ((!z || afdvVar.I == null) && !z2) {
            return;
        }
        if (afdvVar.K == null) {
            afdvVar.K = afdvVar.G.c;
        }
        aetv aetvVar = afdvVar.f;
        FormatStreamModel formatStreamModel = afdvVar.H;
        FormatStreamModel formatStreamModel2 = afdvVar.I;
        FormatStreamModel formatStreamModel3 = afdvVar.K;
        aegu aeguVar = afdvVar.G;
        VideoQuality[] videoQualityArr = aeguVar.d;
        aalv[] aalvVarArr = aeguVar.e;
        aegx aegxVar = afdvVar.L;
        int i = afdvVar.M;
        aepk aepkVar = afdvVar.f40J;
        aetvVar.h(new aesr(formatStreamModel, formatStreamModel2, formatStreamModel3, videoQualityArr, aalvVarArr, aegxVar, i, aepkVar.b, aepkVar.c, aesq.a(afdvVar.f(), this.a.g(), this.a.b())));
    }
}
