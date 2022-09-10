package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bgsp  reason: default package */
/* loaded from: classes3.dex */
public class bgsp implements bnia, bgsj {
    public final bnjv b;
    public final begg c;
    @dzsi
    public bgrc e;
    private final gga f;
    private final bgrd g;
    @dzsi
    private cjtd h;
    final bgrb a = new bgso(this);
    public final List<jba> d = new ArrayList();

    public bgsp(gga ggaVar, bgrd bgrdVar, bnjv bnjvVar, begg beggVar) {
        this.f = ggaVar;
        this.g = bgrdVar;
        this.b = bnjvVar;
        this.c = beggVar;
    }

    @Override // defpackage.bnia
    public Boolean a() {
        return Boolean.valueOf(!this.d.isEmpty());
    }

    @Override // defpackage.bnia
    public List<jba> b() {
        return this.d;
    }

    @Override // defpackage.bnia
    public String c() {
        return "";
    }

    @Override // defpackage.bnia
    @dzsi
    public cjtd d() {
        return null;
    }

    @Override // defpackage.bnia
    public Boolean e() {
        return true;
    }

    @Override // defpackage.bnia
    public String f() {
        return this.f.getString(R.string.IMAGE_CAROUSEL_VIEW_ALL);
    }

    @Override // defpackage.bnia
    @dzsi
    public cjtd g() {
        return this.h;
    }

    @Override // defpackage.bnia
    @dzsi
    public cjtd h() {
        return null;
    }

    @Override // defpackage.bgsj
    public boolean i() {
        return a().booleanValue();
    }

    @Override // defpackage.bgsj
    public void j(bwrs<ilo> bwrsVar) {
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        this.h = null;
        this.d.clear();
        if (iloVar != null) {
            cjta c = cjtd.c(iloVar.bZ());
            c.d = dtxn.ev;
            this.h = c.a();
            ArrayList arrayList = new ArrayList();
            dwca b = bgsf.b(bwrsVar);
            if (b == null) {
                return;
            }
            for (int i = 0; i < b.a.size() && i < 5; i++) {
                arrayList.add(b.a.get(i).e);
            }
            this.e = this.g.a(this.a, arrayList, iloVar.n(), arrayList);
            new Handler(Looper.getMainLooper()).post(new Runnable(this) { // from class: bgsm
                private final bgsp a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bgrc bgrcVar = this.a.e;
                    if (bgrcVar != null) {
                        bgrcVar.d();
                    }
                }
            });
        }
    }

    @Override // defpackage.bgsj
    public void k() {
        this.h = null;
        this.d.clear();
        this.e = null;
    }

    @Override // defpackage.bnia
    public cqkl l(cjqm cjqmVar) {
        if (this.c.i(bege.DIRECTORY)) {
            this.c.k(bege.DIRECTORY);
        }
        return cqkl.a;
    }

    @Override // defpackage.bnia
    public Boolean m() {
        return false;
    }
}
