package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ojv  reason: default package */
/* loaded from: classes3.dex */
public final class ojv {
    public final akfg a;
    public final snc b;
    public final yni c;
    public final fnf d;
    public final long e;
    private final fnk f;
    private final acrr g;
    private final dt h;
    private final boolean i;
    private final boolean j;
    private final boolean k;

    public ojv(aacz aaczVar, akfg akfgVar, fnk fnkVar, snc sncVar, acrr acrrVar, fnf fnfVar, yni yniVar, dt dtVar) {
        apgs ah = eog.ah(aaczVar);
        long j = 0;
        boolean z = false;
        if (ah == null) {
            this.i = false;
            this.j = false;
            this.k = false;
        } else {
            this.i = ah.b;
            this.j = ah.c;
            if (ah.d && ah.e > 0) {
                z = true;
            }
            this.k = z;
            j = ah.e;
        }
        this.e = j;
        this.a = akfgVar;
        this.f = fnkVar;
        this.b = sncVar;
        this.g = acrrVar;
        this.d = fnfVar;
        this.c = yniVar;
        this.h = dtVar;
    }

    public final void a() {
        yni yniVar = this.c;
        final fnf fnfVar = this.d;
        fnfVar.getClass();
        yniVar.a(fnfVar, ahhx.class, new ynj() { // from class: ojs
            @Override // defpackage.ynj
            public final void a(Object obj) {
                fnf.this.b((ahhx) obj);
            }
        });
    }

    public final void b(long j, String str, boolean z) {
        aunt a = aunu.a();
        a.copyOnWrite();
        aunu.c((aunu) a.instance, j);
        a.copyOnWrite();
        aunu.d((aunu) a.instance, str);
        a.copyOnWrite();
        aunu.e((aunu) a.instance, z);
        arrf a2 = arrh.a();
        a2.copyOnWrite();
        ((arrh) a2.instance).dA((aunu) a.mo39build());
        this.g.c((arrh) a2.mo39build());
    }

    public final void c(final Context context, final aafo aafoVar) {
        ankt a;
        dt dtVar = this.h;
        if (!this.i || !this.j || !this.k) {
            a = this.f.a(false);
        } else {
            ankt b = ylx.b(dtVar, anii.h(((yve) this.f.a.get()).a(), fcq.n, anjk.a), new ampg() { // from class: ojt
                @Override // defpackage.ampg
                public final Object apply(Object obj) {
                    final ojv ojvVar = ojv.this;
                    Context context2 = context;
                    final aafo aafoVar2 = aafoVar;
                    final fnj fnjVar = (fnj) obj;
                    if (fnjVar.f || TextUtils.isEmpty(fnjVar.a) || fnjVar.e <= 0 || ojvVar.b.d() - fnjVar.e >= TimeUnit.SECONDS.toMillis(ojvVar.e)) {
                        return false;
                    }
                    final long seconds = TimeUnit.MILLISECONDS.toSeconds(ojvVar.b.d() - fnjVar.e);
                    fvg fvgVar = (fvg) ojvVar.a.l();
                    fvgVar.k(context2.getString(R.string.restore_video_crashed_message));
                    fvgVar.m(context2.getString(R.string.restore_video_resume_watching), new View.OnClickListener() { // from class: ojr
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ojv ojvVar2 = ojv.this;
                            fnj fnjVar2 = fnjVar;
                            aafo aafoVar3 = aafoVar2;
                            long j = seconds;
                            aafoVar3.c(aikb.f(fnjVar2.a, fnjVar2.b, fnjVar2.c, (float) TimeUnit.MILLISECONDS.toSeconds(fnjVar2.d)), null);
                            ojvVar2.b(j, fnjVar2.a, true);
                        }
                    });
                    ojvVar.a.n(fvgVar.b());
                    ojvVar.b(seconds, fnjVar.a, false);
                    return true;
                }
            });
            final fnk fnkVar = this.f;
            fnkVar.getClass();
            a = anii.i(b, new anir() { // from class: oju
                @Override // defpackage.anir
                public final ankt a(Object obj) {
                    return fnk.this.a(((Boolean) obj).booleanValue());
                }
            }, anjk.a);
        }
        ylx.n(dtVar, a, mbi.f, ylx.b);
    }
}
