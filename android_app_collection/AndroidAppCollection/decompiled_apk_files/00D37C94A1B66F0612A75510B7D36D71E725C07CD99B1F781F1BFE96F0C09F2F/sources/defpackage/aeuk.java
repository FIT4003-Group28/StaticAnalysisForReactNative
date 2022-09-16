package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
/* compiled from: PG */
/* renamed from: aeuk  reason: default package */
/* loaded from: classes.dex */
public class aeuk implements aeul {
    public VideoStreamingData b;
    public aess c;
    public String d;
    public PlayerConfigModel e;
    public afmu f;
    public aeuo g;
    public aeun h;
    public float i;
    public float j;
    public int k;
    public aflm l;
    public afhz m;
    byte[] n;

    public aeuk() {
    }

    public aeuk(final aeul aeulVar) {
        this.b = aeulVar.i();
        this.c = aeulVar.j();
        this.d = aeulVar.n();
        this.e = aeulVar.h();
        this.f = aeulVar.b();
        this.g = aeulVar.k();
        aeulVar.getClass();
        this.h = new aeun() { // from class: aeuj
            @Override // defpackage.aeun
            public final Uri a(FormatStreamModel formatStreamModel, long j, long j2) {
                return aeul.this.g(formatStreamModel, j, j2);
            }
        };
        this.i = aeulVar.e();
        this.j = aeulVar.d();
        this.k = aeulVar.f();
        this.l = aeulVar.m();
        this.m = aeulVar.l();
        this.n = aeulVar.p();
    }

    @Override // defpackage.aeul
    public afmu b() {
        return this.f;
    }

    @Override // defpackage.aeul
    public final float d() {
        return this.j;
    }

    @Override // defpackage.aeul
    public final float e() {
        return this.i;
    }

    @Override // defpackage.aeul
    public final int f() {
        return this.k;
    }

    @Override // defpackage.aeul
    public final Uri g(FormatStreamModel formatStreamModel, long j, long j2) {
        return this.h.a(formatStreamModel, j, j2);
    }

    @Override // defpackage.aeul
    public final PlayerConfigModel h() {
        return this.e;
    }

    @Override // defpackage.aeul
    public final VideoStreamingData i() {
        return this.b;
    }

    @Override // defpackage.aeul
    public final aess j() {
        return this.c;
    }

    @Override // defpackage.aeul
    public final aeuo k() {
        return this.g;
    }

    @Override // defpackage.aeul
    public final afhz l() {
        return this.m;
    }

    @Override // defpackage.aeul
    public final aflm m() {
        return this.l;
    }

    @Override // defpackage.aeul
    public final String n() {
        return this.d;
    }

    @Override // defpackage.aeul
    public final /* synthetic */ boolean o(int i) {
        return afmg.bb(this, i);
    }

    @Override // defpackage.aeul
    public final byte[] p() {
        return this.n;
    }

    public final void q(VideoStreamingData videoStreamingData, aess aessVar, String str, PlayerConfigModel playerConfigModel, afmu afmuVar, aeuo aeuoVar, aeun aeunVar, float f, float f2, int i, aflm aflmVar, afhz afhzVar, byte[] bArr) {
        this.b = videoStreamingData;
        this.c = aessVar;
        this.d = str;
        this.e = playerConfigModel;
        this.f = afmuVar;
        this.g = aeuoVar;
        this.h = aeunVar;
        this.i = f;
        this.j = f2;
        this.k = i;
        this.l = aflmVar;
        this.m = afhzVar;
        this.n = bArr;
    }

    public final void r(Integer num) {
        this.k = num.intValue() | this.k;
    }

    public final void s(Integer num) {
        this.k = num.intValue();
    }

    public final void t(Float f) {
        this.j = f.floatValue();
    }

    public final void u(Float f) {
        this.i = f.floatValue();
    }
}
