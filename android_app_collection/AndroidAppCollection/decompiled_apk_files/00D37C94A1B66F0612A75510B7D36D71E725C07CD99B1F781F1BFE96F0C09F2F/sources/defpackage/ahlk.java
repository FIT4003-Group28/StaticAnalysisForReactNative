package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ahlk  reason: default package */
/* loaded from: classes.dex */
public final class ahlk extends ahjs {
    public boolean e;
    public boolean f;
    public boolean g;
    public String h;
    public String i;
    private final Resources j;
    private final ahni k;
    private final ahjv m;
    private final ahnk n;
    private final ahly o;

    public ahlk(Resources resources, azqb azqbVar, azqb azqbVar2, ahne ahneVar, ahoo ahooVar, ahpt ahptVar) {
        super(new ahli(ahooVar.clone(), 0.0f, 0.0f));
        this.j = resources;
        Bitmap d = ahom.d(resources, R.raw.vr_hq);
        float a = ahom.a(d.getWidth());
        float a2 = ahom.a(d.getHeight());
        ahni ahniVar = new ahni(d, ahon.a(a, a2, ahon.c), ahooVar.clone(), azqbVar);
        this.k = ahniVar;
        ahly ahlyVar = new ahly(ahniVar, 0.5f, 1.0f);
        this.o = ahlyVar;
        ahniVar.a(ahlyVar);
        ahon a3 = ahon.a(a, ahmj.c, ahon.c);
        ahjv ahjvVar = new ahjv(a3, ahooVar.clone(), ahjv.s(ahjv.h(-1695465), a3.f), azqbVar2);
        this.m = ahjvVar;
        ahjvVar.n(0.0f, ((-a2) * 7.0f) / 12.0f, 0.0f);
        ahjvVar.d(new ahme(ahjvVar, new float[]{0.0f, 1.0f, 1.0f}, new float[]{1.0f, 1.0f, 1.0f}));
        ahnk ahnkVar = new ahnk(ahneVar, ahooVar.clone(), azqbVar2, ahniVar, (a2 + a2) / 3.0f);
        this.n = ahnkVar;
        q(ahniVar);
        q(ahjvVar);
        q(ahnkVar);
        p(a, a2);
        ((ahjs) this).c = new ahlj(this, ahptVar);
        a();
    }

    public final void a() {
        String str;
        boolean z = this.e || this.g;
        this.f = z;
        this.o.a = true != z ? 0.5f : 1.0f;
        ahjv ahjvVar = this.m;
        boolean z2 = this.g;
        ahjvVar.h = z2;
        if (!z ? (str = this.h) == null : (str = this.i) == null) {
            str = "";
        }
        this.n.a.y(this.j.getString(true != z2 ? R.string.vr_auto_quality_tooltip : R.string.vr_highest_quality_tooltip, str));
    }
}
