package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.text.Html;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cjad  reason: default package */
/* loaded from: classes4.dex */
public class cjad implements cjaa {
    private final Resources a;
    private final cjab b;
    private final chrx c;
    private chum d;

    public cjad(cqhn cqhnVar, Resources resources, cjab cjabVar, chrx chrxVar, chum chumVar) {
        this.a = resources;
        this.b = cjabVar;
        this.c = chrxVar;
        this.d = chumVar;
    }

    @Override // defpackage.cjaa
    public String a() {
        int i = i();
        if (i != 0) {
            if (i == 1) {
                return this.a.getString(R.string.WEEKLY_TODOLIST_LAST_WEEK);
            }
            eaol q = eaol.a().q(1);
            int i2 = -i;
            if (i2 != 0) {
                q = q.e(q.b.F().e(q.a, i2));
            }
            eaol q2 = q.q(7);
            return Build.VERSION.SDK_INT >= 24 ? this.b.a(q, q2) : String.format("%s - %s", this.b.b(q), this.b.b(q2));
        }
        return this.a.getString(R.string.WEEKLY_TODOLIST_THIS_WEEK);
    }

    @Override // defpackage.cjaa
    public CharSequence b() {
        return this.d.m ? Html.fromHtml(this.a.getString(R.string.WEEKLY_TODOLIST_PROGRESS, Integer.valueOf(j()), Integer.valueOf(k()))) : "";
    }

    @Override // defpackage.cjaa
    public Boolean c() {
        return Boolean.valueOf(this.d.m);
    }

    @Override // defpackage.cjaa
    public Boolean d() {
        return Boolean.valueOf(!this.d.o);
    }

    @Override // defpackage.cjaa
    public Boolean e() {
        return Boolean.valueOf(this.d.b != 0);
    }

    @Override // defpackage.cjaa
    public cqkl f() {
        this.c.Y(this.d.b + 1);
        return cqkl.a;
    }

    @Override // defpackage.cjaa
    public cqkl g() {
        this.c.Y(this.d.b - 1);
        return cqkl.a;
    }

    @Override // defpackage.cjaa
    public cjtd h(ddho ddhoVar) {
        cjta b = cjtd.b();
        b.d = ddhoVar;
        chum chumVar = this.d;
        if ((chumVar.a & 4096) != 0) {
            b.g(chumVar.n);
        }
        return b.a();
    }

    public int hashCode() {
        return cjaa.class.hashCode();
    }

    public int i() {
        return this.d.b;
    }

    public int j() {
        chum chumVar = this.d;
        return chumVar.d + chumVar.h;
    }

    public int k() {
        return this.d.c;
    }

    public void l(chum chumVar) {
        this.d = chumVar;
        cqkx.p(this);
    }
}
