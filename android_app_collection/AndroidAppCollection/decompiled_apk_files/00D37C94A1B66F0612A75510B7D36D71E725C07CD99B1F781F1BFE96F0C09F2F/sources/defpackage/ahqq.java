package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ahqq  reason: default package */
/* loaded from: classes.dex */
public final class ahqq extends ahlb {
    public static final /* synthetic */ int e = 0;
    private static final float f = ahom.a(64.0f);
    public ControlsOverlayStyle a = ControlsOverlayStyle.a;
    public boolean b;
    public boolean c;
    private final ahjs g;
    private final ahjs h;
    private final ahjs i;
    private final ahjs j;
    private final ahjs k;

    public ahqq(Resources resources, ahoo ahooVar, ahpv ahpvVar, ahof ahofVar) {
        azqb b = ahofVar.a.b();
        Bitmap d = ahom.d(resources, R.raw.vr_button_fill);
        ahjs ahjsVar = new ahjs(ahooVar.clone(), b, d, 9.2f, ahom.d(resources, R.raw.vr_play));
        this.h = ahjsVar;
        ahjsVar.c = new ahqp(ahpvVar, 1);
        ahjs ahjsVar2 = new ahjs(ahooVar.clone(), b, d, 9.2f, ahom.d(resources, R.raw.vr_replay_white_24dp));
        this.i = ahjsVar2;
        ahjsVar2.c = new ahqp(ahpvVar);
        ahjsVar2.l = true;
        ahjs ahjsVar3 = new ahjs(ahooVar.clone(), b, d, 9.2f, ahom.d(resources, R.raw.vr_pause));
        this.g = ahjsVar3;
        ahjsVar3.c = new ahqp(ahpvVar, 2);
        ahoo clone = ahooVar.clone();
        float f2 = f;
        ahjs ahjsVar4 = new ahjs(clone, b, d, f2, ahom.d(resources, R.raw.vr_next));
        this.j = ahjsVar4;
        ahjsVar4.c = new ahqp(ahpvVar, 3);
        ahjs ahjsVar5 = new ahjs(ahooVar, b, d, f2, ahom.d(resources, R.raw.vr_prev));
        this.k = ahjsVar5;
        ahjsVar5.c = new ahqp(ahpvVar, 4);
        float a = ahom.a(120.0f);
        ahjsVar5.n(-a, 0.0f, 0.0f);
        ahjsVar4.n(a, 0.0f, 0.0f);
        c(2);
        q(ahjsVar);
        q(ahjsVar2);
        q(ahjsVar3);
        q(ahjsVar5);
        q(ahjsVar4);
    }

    public final void a() {
        ahjs ahjsVar;
        boolean z;
        boolean z2;
        if (!this.a.u || (!(z2 = this.b) && !this.c)) {
            ahjsVar = this.j;
            z = true;
        } else {
            this.j.k(z2);
            this.k.k(this.c);
            ahjsVar = this.j;
            z = false;
        }
        ahjsVar.l = z;
        this.k.l = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(int i) {
        boolean z = false;
        this.h.l = i != 1;
        this.g.l = i != 2;
        ahjs ahjsVar = this.i;
        if (i != 3) {
            z = true;
        }
        ahjsVar.l = z;
    }
}
