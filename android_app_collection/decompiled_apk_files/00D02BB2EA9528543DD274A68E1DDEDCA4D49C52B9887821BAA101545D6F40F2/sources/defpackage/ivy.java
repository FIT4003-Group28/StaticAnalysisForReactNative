package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ivy  reason: default package */
/* loaded from: classes.dex */
public class ivy implements izc {
    @dzsi
    public alts a;
    public final alsq b;
    public final dxio<araj> c;
    private final cqkq<izc> f;
    private int g;
    @dzsi
    private akqh h;
    private final Activity j;
    private boolean e = false;
    private boolean i = false;
    private final Set<altv> k = dcnm.c();
    private final List<iza> d = dchl.a();

    public ivy(Activity activity, alsq alsqVar, dxio<araj> dxioVar, cqkq<izc> cqkqVar) {
        this.j = activity;
        this.b = alsqVar;
        this.c = dxioVar;
        this.f = cqkqVar;
    }

    public static boolean j(@dzsi alts altsVar) {
        return altsVar != null && altsVar.b.size() >= 2;
    }

    private final void k() {
        alsq alsqVar = this.b;
        if (alsqVar != null) {
            f(alsqVar.i());
            this.f.a(this);
        }
    }

    private final void l() {
        Iterator<iza> it = this.d.iterator();
        while (it.hasNext()) {
            ivx ivxVar = (ivx) it.next();
            altu altuVar = ivxVar.a;
            if (altuVar != null) {
                altv altvVar = altuVar.d;
                synchronized (this.k) {
                    if (this.k.contains(altvVar)) {
                        ivxVar.c = true;
                    }
                }
            }
            ivxVar.c = false;
        }
    }

    @Override // defpackage.izc
    public Boolean a() {
        return Boolean.valueOf(j(this.a));
    }

    @Override // defpackage.izc
    public List<iza> b() {
        return this.d;
    }

    @Override // defpackage.izc
    public Boolean c() {
        return false;
    }

    @Override // defpackage.izc
    @dzsi
    public View.OnClickListener d() {
        return null;
    }

    public void e(@dzsi alts altsVar, @dzsi altu altuVar) {
        bvrj.UI_THREAD.c();
        if (dbsd.a(this.a, altsVar)) {
            return;
        }
        this.a = altsVar;
        boolean isEmpty = this.d.isEmpty();
        this.d.clear();
        this.e = !isEmpty;
        alts altsVar2 = this.a;
        if (altsVar2 != null) {
            dcdc<altu> dcdcVar = altsVar2.b;
            int size = dcdcVar.size();
            for (int i = 0; i < size; i++) {
                this.d.add(new ivx(this.j, dcdcVar.get(i), this));
                this.e = true;
            }
        }
        if (!this.k.isEmpty()) {
            l();
        }
        if (altuVar != null && g(altuVar.b())) {
            return;
        }
        k();
    }

    public void f(Set<altv> set) {
        bvrj.UI_THREAD.c();
        synchronized (this.k) {
            if (dbsd.a(this.k, set)) {
                return;
            }
            this.k.clear();
            this.k.addAll(set);
            l();
            k();
        }
    }

    public final boolean g(akqh akqhVar) {
        int a;
        int i;
        alts altsVar = this.a;
        if (altsVar == null || (a = altsVar.a(akqhVar)) == -1 || ((i = this.g) == a && this.d.get(i).a().booleanValue())) {
            return false;
        }
        this.g = a;
        Iterator<iza> it = this.d.iterator();
        while (it.hasNext()) {
            ivx ivxVar = (ivx) it.next();
            ivxVar.b = akqhVar.equals(ivxVar.a.b());
        }
        k();
        return true;
    }

    public void h(amqo amqoVar) {
        bvrj.UI_THREAD.c();
        GmmLocation a = amqoVar.a();
        akqh akqhVar = null;
        altv altvVar = a != null ? a.i : null;
        if (altvVar != null) {
            akqhVar = altvVar.a;
        }
        if (!dbsd.a(akqhVar, this.h) || this.e) {
            Iterator<iza> it = this.d.iterator();
            while (it.hasNext()) {
                ivx ivxVar = (ivx) it.next();
                if (ivxVar.a.b().equals(this.h)) {
                    ivxVar.d = true;
                } else {
                    ivxVar.d = false;
                }
            }
            this.e = true;
        }
        this.h = akqhVar;
        if (this.i && akqhVar != null && !g(akqhVar)) {
            this.e = true;
        }
        if (this.e) {
            k();
            this.e = false;
        }
    }

    public void i(amwe amweVar) {
        bvrj.UI_THREAD.c();
        this.i = amweVar.a != amwd.OFF;
    }
}
