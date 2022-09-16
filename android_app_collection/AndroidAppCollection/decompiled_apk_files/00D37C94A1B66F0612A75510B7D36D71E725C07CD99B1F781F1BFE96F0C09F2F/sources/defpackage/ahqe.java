package defpackage;

import android.graphics.Bitmap;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
/* compiled from: PG */
/* renamed from: ahqe  reason: default package */
/* loaded from: classes.dex */
public final class ahqe extends ahlb {
    public final ahmj a;
    public final ahni b;
    public final ahjv c;
    public final float[] e = new float[3];
    public final Bitmap f;
    public long g;
    public long h;
    public float i;
    public float j;
    public ControlsOverlayStyle k;
    public boolean m;

    public ahqe(azqb azqbVar, azqb azqbVar2, ahoo ahooVar, ahpu ahpuVar) {
        ahmj ahmjVar = new ahmj(azqbVar, new int[]{-1695465, -5723992, -1}, 38.0f, ahooVar.clone(), new ahqd(this, ahpuVar));
        this.a = ahmjVar;
        Bitmap c = ahom.c();
        this.f = c;
        ahom.h(c, zgh.i(this.g / 1000));
        ahni ahniVar = new ahni(c, ahon.a(ahom.a(71.0f), ahom.a(30.0f), ahon.c), ahooVar.clone(), azqbVar2);
        this.b = ahniVar;
        ahniVar.a(new ahly(ahniVar, 0.0f, 1.0f));
        ahniVar.n((-ahmjVar.h) / 2.0f, ahom.a(35.0f), 0.0f);
        ahon c2 = ahon.c(ahom.a(8.0f));
        ahjv ahjvVar = new ahjv(c2, ahooVar.clone(), ahjv.s(ahjv.h(-1695465), c2.f), azqbVar);
        this.c = ahjvVar;
        ahjvVar.n((-ahmjVar.h) / 2.0f, 0.0f, 0.0f);
        ahjvVar.a(new ahly(ahjvVar, 0.0f, 1.0f));
        ahjvVar.a(new ahme(ahjvVar, ahme.b(0.0f), ahme.b(1.0f)));
        q(ahmjVar);
        q(ahjvVar);
        q(ahniVar);
    }

    public final boolean a() {
        return this.m && this.k != ControlsOverlayStyle.k;
    }

    @Override // defpackage.ahlb, defpackage.ahmf
    public final void m(ahjy ahjyVar) {
        super.m(ahjyVar);
        boolean k = this.a.k();
        this.b.b = k;
        this.c.b = k;
    }
}
