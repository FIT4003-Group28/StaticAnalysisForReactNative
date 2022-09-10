package defpackage;

import android.view.View;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: ciom  reason: default package */
/* loaded from: classes4.dex */
public class ciom extends cibj implements cioj, chyv {
    public final chrx a;
    public final chxr b;
    public chyu c;
    private final String d;
    private final String e;
    private final String f;

    public ciom(chrx chrxVar, chxl chxlVar, chxk chxkVar) {
        super(chxlVar);
        this.c = chyu.VISIBLE;
        this.a = chrxVar;
        chxr chxrVar = chxlVar.b;
        this.b = chxrVar == null ? chxr.e : chxrVar;
        this.d = chxkVar.e;
        this.e = chxkVar.f;
        dwlh dwlhVar = chxlVar.d;
        this.f = (dwlhVar == null ? dwlh.n : dwlhVar).c;
    }

    @Override // defpackage.chyv
    public chyu a() {
        return this.c;
    }

    @Override // defpackage.chyv
    public boolean b() {
        return chys.b(this);
    }

    @Override // defpackage.chyv
    public chyw c() {
        return chyw.PLACE_REOPEN;
    }

    @Override // defpackage.chyv
    public List d() {
        return dcdc.e();
    }

    @Override // defpackage.cioj
    public String e() {
        return this.d;
    }

    public boolean equals(@dzsi Object obj) {
        return cidc.a(this, obj, new cidd(this) { // from class: ciol
            private final ciom a;

            {
                this.a = this;
            }

            @Override // defpackage.cidd
            public final boolean a(Object obj2) {
                return this.a.b.equals(((ciom) obj2).b);
            }
        });
    }

    @Override // defpackage.cioj
    public String f() {
        return this.e;
    }

    @Override // defpackage.cioj
    public String g() {
        return this.f;
    }

    @Override // defpackage.cioj
    public View.OnClickListener h(final blpo blpoVar) {
        return new View.OnClickListener(this, blpoVar) { // from class: ciok
            private final ciom a;
            private final blpo b;

            {
                this.a = this;
                this.b = blpoVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ciom ciomVar = this.a;
                blpo blpoVar2 = this.b;
                ciomVar.c = chyu.COMPLETED;
                ciomVar.a.t(ciomVar.b, blpoVar2);
            }
        };
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, chxj.PLACE_REOPEN});
    }
}
