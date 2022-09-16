package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioManager;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ahnr  reason: default package */
/* loaded from: classes.dex */
public final class ahnr extends ahjs implements ahmi {
    public final ahmj e;
    public final float f;
    private final ahjs g;
    private final float[] h;
    private final AudioManager i;
    private final ahni j;
    private final ahni k;
    private final ahni m;
    private float n;
    private boolean o;

    public ahnr(Resources resources, AudioManager audioManager, azqb azqbVar, azqb azqbVar2, ahoo ahooVar) {
        super(new ahli(ahooVar.clone(), 0.0f, 0.0f));
        this.i = audioManager;
        this.h = r10;
        ahmj ahmjVar = new ahmj(azqbVar, new int[]{-1695465, -5723992}, 8.0f, ahooVar.clone(), this);
        this.e = ahmjVar;
        ahji ahnqVar = new ahnq(this);
        ahji ahnlVar = new ahnl(ahmjVar, new float[]{0.0f, 0.0f, 0.0f}, new float[]{4.0f, 0.0f, 0.0f});
        l(ahnqVar);
        l(ahnlVar);
        Bitmap d = ahom.d(resources, R.raw.vr_volume_speaker);
        float a = ahom.a(d.getWidth());
        float a2 = ahom.a(d.getHeight());
        ahjs ahjsVar = new ahjs(new ahli(ahooVar.clone(), a, a2));
        this.g = ahjsVar;
        ahni ahniVar = new ahni(d, ahon.a(a, a2, ahon.c), ahooVar.clone(), azqbVar2);
        ahniVar.a(new ahly(ahniVar, 0.5f, 1.0f));
        ahni ahniVar2 = new ahni(ahom.d(resources, R.raw.vr_volume_low), ahon.a(a, a2, ahon.c), ahooVar.clone(), azqbVar2);
        this.j = ahniVar2;
        ahniVar2.a(new ahly(ahniVar2, 0.5f, 1.0f));
        ahni ahniVar3 = new ahni(ahom.d(resources, R.raw.vr_volume_high), ahon.a(a, a2, ahon.c), ahooVar.clone(), azqbVar2);
        this.k = ahniVar3;
        ahniVar3.a(new ahly(ahniVar3, 0.5f, 1.0f));
        ahni ahniVar4 = new ahni(ahom.d(resources, R.raw.vr_volume_mute), ahon.a(a, a2, ahon.c), ahooVar.clone(), azqbVar2);
        this.m = ahniVar4;
        ahniVar4.a(new ahly(ahniVar4, 0.5f, 1.0f));
        this.n = g();
        t();
        ahjsVar.q(ahniVar);
        ahjsVar.q(ahniVar2);
        ahjsVar.q(ahniVar3);
        ahjsVar.q(ahniVar4);
        ahjsVar.n(-4.0f, 0.0f, 0.0f);
        ahmjVar.n(((-8.0f) + a) / 2.0f, 0.0f, 0.0f);
        float[] fArr = {g(), 1.0f - fArr[0]};
        ahmjVar.g(fArr);
        float f = ahmjVar.h + a;
        this.f = f;
        p(f + 1.0f, a2);
        q(ahmjVar);
        q(ahjsVar);
    }

    private final float g() {
        return this.i.getStreamVolume(3) / this.i.getStreamMaxVolume(3);
    }

    private final void t() {
        ahni ahniVar = this.j;
        boolean z = this.o;
        ahniVar.l = z || this.n < 0.25f;
        this.k.l = z || this.n < 0.75f;
        this.m.l = !z;
        float f = z ? 0.0f : this.n;
        float[] fArr = this.h;
        fArr[0] = f;
        fArr[1] = 1.0f - f;
        this.e.g(fArr);
    }

    @Override // defpackage.ahmi
    public final void a(float f) {
    }

    @Override // defpackage.ahmi
    public final void c() {
        t();
    }

    @Override // defpackage.ahmi
    public final void d(float f) {
        this.n = f;
        this.o = false;
        h();
        t();
    }

    @Override // defpackage.ahjs, defpackage.ahlb, defpackage.ahmf
    public final void j(ahjy ahjyVar) {
        super.j(ahjyVar);
        this.e.j(ahjyVar);
        if (this.g.o(ahjyVar)) {
            this.o = !this.o;
            t();
            h();
            t();
        }
    }

    @Override // defpackage.ahjs, defpackage.ahlb, defpackage.ahmf
    public final void qR(boolean z, ahjy ahjyVar) {
        super.qR(z, ahjyVar);
        this.e.qR(z, ahjyVar);
    }

    private final void h() {
        this.i.setStreamVolume(3, this.o ? 0 : (int) (this.n * this.i.getStreamMaxVolume(3)), 0);
    }
}
