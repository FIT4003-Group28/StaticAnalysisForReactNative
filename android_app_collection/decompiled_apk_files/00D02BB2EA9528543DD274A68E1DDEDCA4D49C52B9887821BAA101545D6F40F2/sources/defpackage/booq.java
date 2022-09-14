package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.Arrays;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: booq  reason: default package */
/* loaded from: classes3.dex */
public class booq implements boqi {
    private final boop a;
    private final Context b;
    @dzsi
    private bonn c;

    public booq(Context context, boop boopVar, @dzsi bonn bonnVar) {
        this.b = context;
        this.a = boopVar;
        this.c = bonnVar;
    }

    @dzsi
    public bonn a() {
        return this.c;
    }

    @Override // defpackage.boqi
    public Boolean b() {
        bonn bonnVar = this.c;
        boolean z = false;
        if (bonnVar != null && bonnVar.f()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.boqi
    public String c() {
        bonn bonnVar = this.c;
        if (bonnVar == null) {
            return "";
        }
        if (bonnVar.f()) {
            return this.b.getString(R.string.BUSINESS_HOURS_OPEN_24_HOURS_SUMMARY_EXPANSION);
        }
        return bvtb.j(this.b, this.c.a(), this.c.b(), 0).replaceAll("\\s", " ");
    }

    @Override // defpackage.boqi
    public String d() {
        bonn bonnVar = this.c;
        return (bonnVar == null || bonnVar.f()) ? "" : bvtb.j(this.b, this.c.c(), this.c.d(), 0).replaceAll("\\s", " ");
    }

    @Override // defpackage.boqi
    public cqkl e() {
        boof boofVar = ((bood) this.a).a;
        bonq bonqVar = (bonq) boofVar.a;
        bonqVar.a.b.c(boou.e(bonqVar.a.a, this, boofVar instanceof bopd, true, true), this);
        return cqkl.a;
    }

    public boolean equals(@dzsi Object obj) {
        if (obj instanceof booq) {
            return dbsd.a(this.c, ((booq) obj).c);
        }
        return false;
    }

    @Override // defpackage.boqi
    public cqkl f() {
        if (!b().booleanValue() && this.c != null) {
            boof boofVar = ((bood) this.a).a;
            bonq bonqVar = (bonq) boofVar.a;
            bonqVar.a.b.c(boou.e(bonqVar.a.a, this, boofVar instanceof bopd, false, true), this);
        }
        return cqkl.a;
    }

    @Override // defpackage.boqi
    public cqkl g() {
        boop boopVar = this.a;
        if (a() != null) {
            ((bood) boopVar).a.c.addFirst(this);
        }
        bood boodVar = (bood) boopVar;
        boodVar.a.b.remove(this);
        if (boodVar.a.f().booleanValue()) {
            boof boofVar = boodVar.a;
            if (boofVar.d) {
                boofVar.q();
                boof boofVar2 = boodVar.a;
                boofVar2.a.a(boofVar2);
                return cqkl.a;
            }
        }
        boodVar.a.i();
        cqkx.p(boodVar.a);
        boof boofVar22 = boodVar.a;
        boofVar22.a.a(boofVar22);
        return cqkl.a;
    }

    public void h(@dzsi bonn bonnVar) {
        if (bonnVar == null) {
            ((bood) this.a).a.b.clear();
        }
        bonn bonnVar2 = this.c;
        this.c = bonnVar;
        cqkx.p(this);
        if (!dbsd.a(bonnVar2, bonnVar)) {
            bood boodVar = (bood) this.a;
            if (boodVar.a.c()) {
                dcft.y(boodVar.a.b, new booc());
            } else {
                Collections.sort(boodVar.a.b, boof.f);
            }
            boodVar.a.i();
            cqkx.p(boodVar.a);
            boof boofVar = boodVar.a;
            boofVar.a.a(boofVar);
        }
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.c});
    }

    /* renamed from: i */
    public booq clone() {
        return new booq(this.b, this.a, this.c);
    }

    public String toString() {
        bonn bonnVar = this.c;
        if (bonnVar == null) {
            return "";
        }
        if (bonnVar.f()) {
            return this.b.getString(R.string.BUSINESS_HOURS_OPEN_24_HOURS_SUMMARY_EXPANSION);
        }
        return this.b.getString(R.string.BUSINESS_HOURS_TIMESPAN_SUMMARY, c(), d());
    }
}
