package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioManager;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ahpp  reason: default package */
/* loaded from: classes.dex */
public final class ahpp extends ahlb {
    public final ahnh a;
    public final ahlr b;
    public final ahni c;
    public final ahlk e;
    public final ahqe f;
    public float g;
    public long h;
    public boolean i;
    private final ahnr j;
    private float k;

    public ahpp(Resources resources, AudioManager audioManager, ahof ahofVar, ahne ahneVar, ahoo ahooVar, ahpu ahpuVar, ahpt ahptVar) {
        azqb b = ahofVar.a.b();
        azqb a = ahofVar.a.a();
        float a2 = ahom.a(-40.0f);
        ahnh a3 = ahneVar.a(ahooVar.clone(), 0.0f, ahom.a(40.0f));
        this.a = a3;
        a3.n(-19.0f, a2, 0.0f);
        a3.h(17);
        a3.g(new ahng() { // from class: ahpm
            @Override // defpackage.ahng
            public final void a(float f, float f2) {
                ahpp ahppVar = ahpp.this;
                ahppVar.a.n((f - ahppVar.g) / 2.0f, 0.0f, 0.0f);
                ahppVar.g = f;
                ahppVar.c();
            }
        });
        a3.B(true, false);
        ahqe ahqeVar = new ahqe(a, b, ahooVar.clone(), ahpuVar);
        this.f = ahqeVar;
        ahnr ahnrVar = new ahnr(resources, audioManager, a, b, ahooVar);
        this.j = ahnrVar;
        ahnrVar.n(0.0f, a2, 0.0f);
        ahlr ahlrVar = new ahlr(resources, a, ahneVar, ahooVar.clone(), new ahpl(this, ahpuVar), new ahpn(this));
        this.b = ahlrVar;
        ahlrVar.n((ahlrVar.c() - 38.0f) / 2.0f, a2, 0.0f);
        Bitmap d = ahom.d(resources, R.raw.white_box);
        float a4 = ahom.a(d.getWidth());
        float a5 = ahom.a(d.getHeight());
        ahni ahniVar = new ahni(d, ahon.a(a4, a5, ahon.c), ahooVar.clone(), ahofVar.a.b());
        ahniVar.n((38.0f - a4) / 2.0f, ahom.a(-40.0f), 0.0f);
        ahli ahliVar = ahniVar.g;
        if (ahliVar == null) {
            ahniVar.g = new ahli(((ahjj) ahniVar).a, a4, a5);
        } else {
            ahliVar.b(a4, a5);
        }
        ahme ahmeVar = new ahme(ahniVar, ahme.b(0.5f), ahme.b(1.0f));
        ahniVar.a(new ahly(ahniVar, 0.75f, 1.0f));
        ahniVar.d(ahmeVar);
        ahniVar.e = new ahpo(ahniVar, ahofVar);
        this.c = ahniVar;
        ahniVar.l = true;
        ahlk ahlkVar = new ahlk(resources, b, a, ahneVar, ahooVar, ahptVar);
        this.e = ahlkVar;
        ahlkVar.n(ahom.a(140.0f), a2, 0.0f);
        ahlkVar.l = true;
        q(ahqeVar);
        q(ahlkVar);
        q(a3);
        q(ahlrVar);
        q(ahnrVar);
        q(ahniVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z) {
        this.e.l = !z;
    }

    public final void c() {
        float f;
        if (this.i) {
            f = this.b.c();
        } else {
            f = this.g;
        }
        ahnr ahnrVar = this.j;
        float f2 = ((ahnrVar.f - 38.0f) / 2.0f) + f + 0.5f;
        ahnrVar.n(f2 - this.k, 0.0f, 0.0f);
        this.k = f2;
    }
}
