package defpackage;

import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: cieh  reason: default package */
/* loaded from: classes4.dex */
public class cieh extends cibj implements cied, chyv {
    private final chxk a;
    @dzsi
    private final ciec b;

    public cieh(final ciek ciekVar, final chrx chrxVar, final chxl chxlVar, chxk chxkVar) {
        super(chxlVar);
        chvy chvyVar;
        this.a = chxkVar;
        if (chxkVar.b == 9) {
            chvyVar = (chvy) chxkVar.c;
        } else {
            chvyVar = chvy.b;
        }
        this.b = (ciec) dcbg.b(chvyVar.a).u().h(new dbrn(ciekVar, chrxVar, chxlVar) { // from class: ciee
            private final ciek a;
            private final chrx b;
            private final chxl c;

            {
                this.a = ciekVar;
                this.b = chrxVar;
                this.c = chxlVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                ciek ciekVar2 = this.a;
                chrx chrxVar2 = this.b;
                chxl chxlVar2 = this.c;
                djao djaoVar = (djao) obj;
                ciek.a(chrxVar2, 1);
                ciek.a(djaoVar, 2);
                ciek.a(chxlVar2, 3);
                ciej a = ciekVar2.a.a();
                ciek.a(a, 4);
                return new cieg(chrxVar2, djaoVar, chxlVar2, a);
            }
        }).f();
    }

    @Override // defpackage.chyv
    public chyu a() {
        return chys.a(this);
    }

    @Override // defpackage.chyv
    public boolean b() {
        return chys.b(this);
    }

    @Override // defpackage.chyv
    public chyw c() {
        return chyw.UNKNOWN;
    }

    @Override // defpackage.chyv
    public List d() {
        return dcdc.e();
    }

    @Override // defpackage.cied
    @dzsi
    public ciec e() {
        return this.b;
    }

    public boolean equals(@dzsi Object obj) {
        return (obj instanceof cieh) && this.a.equals(((cieh) obj).a);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{cieh.class, this.a});
    }
}
