package defpackage;

import java.util.Arrays;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bjop  reason: default package */
/* loaded from: classes3.dex */
public class bjop implements bjoo {
    private final bjln a;
    private final ilo b;

    public bjop(ilo iloVar, bjln bjlnVar) {
        this.b = iloVar;
        this.a = bjlnVar;
    }

    @Override // defpackage.bjoo
    public jic a() {
        String str;
        if (this.b.bF().a.size() > 0) {
            str = this.b.bF().a.get(0).h;
        } else {
            str = (String) dbsg.j(this.b.aL()).c("");
        }
        return new jic(str, ckqc.FULLY_QUALIFIED, (cqtd) null, 250);
    }

    @Override // defpackage.bjoo
    public String b() {
        return this.b.n();
    }

    @Override // defpackage.bjoo
    public String c() {
        return !this.b.ae() ? "" : String.format(Locale.getDefault(), "%.1f", Float.valueOf(this.b.af()));
    }

    @Override // defpackage.bjoo
    public String d() {
        return this.b.ar();
    }

    @Override // defpackage.bjoo
    public cqkl e() {
        bjmi bjmiVar = (bjmi) this.a;
        begj begjVar = new begj();
        begjVar.b(bjmiVar.p);
        begjVar.c = jjn.EXPANDED;
        begjVar.e = null;
        begjVar.n = true;
        bjmiVar.l.a().o(begjVar, false, null);
        return cqkl.a;
    }

    public boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bjop) {
            return this.b.equals(((bjop) obj).b);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{bjop.class, this.b});
    }
}
