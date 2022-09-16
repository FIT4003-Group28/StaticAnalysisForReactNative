package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ahrc  reason: default package */
/* loaded from: classes.dex */
public final class ahrc extends ahlb implements ahlz, ahnv {
    public final ajmy a;
    public final ahni b;
    public final ahob c;
    public final ahno e;
    public final ahjp f;
    private final ahli g;

    public ahrc(Context context, ahof ahofVar, ahob ahobVar, ajmy ajmyVar, ViewGroup viewGroup, ahrd ahrdVar) {
        ahofVar.getClass();
        ahobVar.getClass();
        this.c = ahobVar;
        this.a = ajmyVar;
        this.g = new ahli(ahofVar.c.clone(), 40.0f, 30.0f);
        ahoo clone = ahobVar.a().clone();
        Resources resources = context.getResources();
        Bitmap d = ahom.d(resources, R.raw.white_box);
        ahon a = ahon.a(80.0f, 45.0f, ahon.c);
        azqb b = ahofVar.a.b();
        ahni ahniVar = new ahni(d, a, clone.clone(), b);
        this.b = ahniVar;
        ahniVar.n(0.0f, 7.0f, 0.0f);
        ahniVar.k = 0.3f;
        q(ahniVar);
        ahno ahnoVar = new ahno(clone.clone(), ahobVar.b);
        this.e = ahnoVar;
        String string = resources.getString(R.string.up_next);
        if (TextUtils.isEmpty(string)) {
            ahnoVar.a.y("");
            ahnoVar.a.qS(true);
        } else {
            ahnoVar.a.y(string);
            ahnoVar.a.qS(false);
        }
        ahnoVar.n(0.0f, 14.0f, 0.0f);
        q(ahnoVar);
        final ahmv ahmvVar = new ahmv(ahobVar, clone.clone(), b);
        final ahni a2 = ahmv.a(ahom.d(resources, R.raw.vr_rect_solid_white), ahmv.c(1.0f, false), ahmvVar);
        final ahni a3 = ahmv.a(ahom.d(resources, R.raw.vr_semicircle_solid_white), ahmv.c(2.0f, false), ahmvVar);
        final ahni a4 = ahmv.a(ahom.d(resources, R.raw.vr_semicircle_solid_white), ahmv.c(2.0f, true), ahmvVar);
        ahmvVar.l(new ahme(a3, ahme.b(1.0f), ahme.b(1.1f)));
        ahmvVar.l(new ahme(a4, ahme.b(1.0f), ahme.b(1.1f)));
        ahmvVar.f = new ahme(a2, ahme.b(1.0f), ahme.b(1.1f));
        ahmvVar.l(ahmvVar.f);
        float[] fArr = {0.0f, 0.0f, 0.0f};
        ahmvVar.g = new ahnl(a3, fArr, fArr);
        ahmvVar.h = new ahnl(a4, fArr, fArr);
        ahmvVar.l(ahmvVar.g);
        ahmvVar.l(ahmvVar.h);
        ahmvVar.e.g(new ahng() { // from class: ahmu
            @Override // defpackage.ahng
            public final void a(float f, float f2) {
                ahni ahniVar2 = ahni.this;
                ahmv ahmvVar2 = ahmvVar;
                ahni ahniVar3 = a3;
                ahni ahniVar4 = a4;
                float f3 = f * 0.9f;
                ahniVar2.rT(f3, 1.0f, 1.0f);
                float f4 = (f3 + 2.0f) / 2.0f;
                float f5 = f4 - ahmvVar2.i;
                ahniVar3.n(-f5, 0.0f, 0.0f);
                ahniVar4.n(f5, 0.0f, 0.0f);
                ahmvVar2.i = f4;
                ahmvVar2.p(4.0f + f3, f2);
                ahme ahmeVar = ahmvVar2.f;
                ahmeVar.a = new float[]{f3, 1.0f, 1.0f};
                ahmeVar.b = new float[]{f3 * 1.1f, 1.1f, 1.1f};
                float f6 = ((f3 * 0.100000024f) + 0.20000005f) / 2.0f;
                ahmvVar2.g.a = new float[]{-f6, 0.0f, 0.0f};
                ahmvVar2.h.a = new float[]{f6, 0.0f, 0.0f};
            }
        });
        ahmvVar.q(a3);
        ahmvVar.q(a2);
        ahmvVar.q(a4);
        ahmvVar.q(ahmvVar.e);
        ahmvVar.e.y(context.getString(R.string.cancel));
        ahmvVar.n(0.0f, -ahom.a(30.0f), 0.0f);
        Handler handler = new Handler(Looper.getMainLooper());
        ((ahjs) ahmvVar).c = new ahqz(handler, ahrdVar, ahobVar, 1);
        q(ahmvVar);
        ahjs ahjsVar = new ahjs(clone.clone(), b, ahom.d(resources, R.raw.vr_button_fill), 9.2f, ahom.d(resources, R.raw.vr_play));
        ahjsVar.c = new ahqz(handler, ahrdVar, ahobVar);
        ahjsVar.n(0.0f, 7.0f, 0.0f);
        q(ahjsVar);
        ahjp ahjpVar = new ahjp(viewGroup, context, handler, clone.clone(), ahofVar.a.c(), 9.2f, false);
        this.f = ahjpVar;
        ahjpVar.n(0.0f, 7.0f, 0.0f);
        q(ahjpVar);
        this.l = true;
    }

    @Override // defpackage.ahlz
    public final boolean f(ahjy ahjyVar) {
        return !v() && this.g.a(ahjyVar).b();
    }

    @Override // defpackage.ahlz
    public final boolean g(ahjy ahjyVar) {
        return false;
    }

    @Override // defpackage.ahlz
    public final boolean h(ahjy ahjyVar) {
        return !s();
    }
}
