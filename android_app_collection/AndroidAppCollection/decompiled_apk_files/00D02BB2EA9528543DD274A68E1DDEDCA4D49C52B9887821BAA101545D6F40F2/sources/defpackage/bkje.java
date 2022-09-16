package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bkje  reason: default package */
/* loaded from: classes3.dex */
public class bkje implements bnia {
    private final List<jba> a = dchl.a();
    private final List<String> b = dchl.a();
    private final String c;
    private int d;
    private final gga e;
    private final dzsj<brba> f;

    public bkje(dvww dvwwVar, gga ggaVar, dzsj<begg> dzsjVar, dzsj<brba> dzsjVar2, bnjv bnjvVar) {
        this.e = ggaVar;
        this.f = dzsjVar2;
        this.c = dvwwVar.a;
        for (dvwv dvwvVar : dcft.v(dvwwVar.b, 20)) {
            this.b.add(dvwvVar.b);
            if ((dvwvVar.a & 2) != 0) {
                ily ilyVar = new ily();
                dvyw dvywVar = dvwvVar.c;
                ilyVar.E(dvywVar == null ? dvyw.bv : dvywVar);
                ilo d = ilyVar.d();
                List<jba> list = this.a;
                bnjs a = bnjvVar.a(d);
                a.a = new bkjd(dzsjVar.a(), d);
                cjta c = cjtd.c(d.a());
                c.d = dtya.K;
                a.n = c.a();
                list.add(a.a());
            } else {
                this.d++;
            }
        }
        this.d = Math.min(20 - this.a.size(), this.d);
    }

    @Override // defpackage.bnia
    public Boolean a() {
        return Boolean.valueOf(!b().isEmpty());
    }

    @Override // defpackage.bnia
    public List<jba> b() {
        return this.a;
    }

    @Override // defpackage.bnia
    public String c() {
        return this.c;
    }

    @Override // defpackage.bnia
    public cjtd d() {
        return cjtd.a(dtya.M);
    }

    @Override // defpackage.bnia
    public Boolean e() {
        return Boolean.valueOf(this.d > 0);
    }

    @Override // defpackage.bnia
    public String f() {
        Resources resources = this.e.getResources();
        int i = this.d;
        return resources.getQuantityString(R.plurals.RELATED_PLACES_MORE, i, Integer.valueOf(i));
    }

    @Override // defpackage.bnia
    public cjtd g() {
        return cjtd.a(dtya.L);
    }

    @Override // defpackage.bnia
    public cjtd h() {
        return cjtd.a(dtya.N);
    }

    @Override // defpackage.bnia
    public cqkl l(cjqm cjqmVar) {
        String str = this.c;
        List<String> list = this.b;
        bray d = braz.d();
        d.b(cjqmVar);
        d.c(true);
        this.f.a().t(str, list, d.a());
        return cqkl.a;
    }

    @Override // defpackage.bnia
    public Boolean m() {
        return true;
    }
}
