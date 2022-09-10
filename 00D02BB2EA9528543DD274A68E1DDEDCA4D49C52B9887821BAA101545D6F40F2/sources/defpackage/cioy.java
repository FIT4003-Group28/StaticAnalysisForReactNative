package defpackage;

import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: cioy  reason: default package */
/* loaded from: classes4.dex */
public class cioy extends cibj implements ciou, chyv {
    public final bvrb a;
    public final chrx b;
    public final chxr c;
    public final boolean d;
    public Integer e;
    public boolean f;
    private final String g;

    public cioy(bvrb bvrbVar, chrx chrxVar, boolean z, chxl chxlVar) {
        super(chxlVar);
        this.a = bvrbVar;
        this.b = chrxVar;
        chxr chxrVar = chxlVar.b;
        this.c = chxrVar == null ? chxr.e : chxrVar;
        this.e = Integer.valueOf(chxlVar.k);
        this.d = z;
        dwlh dwlhVar = chxlVar.d;
        this.g = (dwlhVar == null ? dwlh.n : dwlhVar).c;
    }

    @Override // defpackage.chyv
    public chyu a() {
        return (this.e.intValue() <= 0 || !this.d) ? chyu.VISIBLE : chyu.COMPLETED;
    }

    @Override // defpackage.chyv
    public boolean b() {
        return chys.b(this);
    }

    @Override // defpackage.chyv
    public chyw c() {
        return chyw.RATING;
    }

    @Override // defpackage.chyv
    public List d() {
        return dcdc.e();
    }

    @Override // defpackage.ciou
    public String e() {
        return this.g;
    }

    public boolean equals(@dzsi Object obj) {
        return cidc.a(this, obj, new cidd(this) { // from class: ciow
            private final cioy a;

            {
                this.a = this;
            }

            @Override // defpackage.cidd
            public final boolean a(Object obj2) {
                cioy cioyVar = this.a;
                cioy cioyVar2 = (cioy) obj2;
                return dbsd.a(cioyVar.c, cioyVar2.c) && dbsd.a(cioyVar.e, cioyVar2.e) && dbsd.a(Boolean.valueOf(cioyVar.d), Boolean.valueOf(cioyVar2.d));
            }
        });
    }

    @Override // defpackage.ciou
    public Integer f() {
        return 0;
    }

    @Override // defpackage.ciou
    public jez g() {
        return new jez(this) { // from class: ciov
            private final cioy a;

            {
                this.a = this;
            }

            @Override // defpackage.jez
            public final void a(cjqm cjqmVar, float f) {
                final cioy cioyVar = this.a;
                if (cioyVar.f) {
                    return;
                }
                cioyVar.f = true;
                cioyVar.e = Integer.valueOf((int) f);
                cioyVar.a.a(new Runnable(cioyVar) { // from class: ciox
                    private final cioy a;

                    {
                        this.a = cioyVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        cioy cioyVar2 = this.a;
                        if (cioyVar2.d) {
                            cioyVar2.b.G(cioyVar2.c, cioyVar2.e.intValue());
                        } else {
                            cioyVar2.b.I(cioyVar2.c, cioyVar2.e.intValue());
                        }
                        cioyVar2.f = false;
                    }
                }, bvrj.UI_THREAD, chyx.a() * 250.0f);
            }
        };
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, chxj.RATING, this.e, Boolean.valueOf(this.d)});
    }
}
