package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bwoq  reason: default package */
/* loaded from: classes4.dex */
public class bwoq implements bwny {
    protected final eeu a;
    final /* synthetic */ bwov b;
    private final String c;
    private final String d;
    private final dpvf e;
    private final cqtd f;
    private final ddho g;
    private final boolean h;

    public bwoq(bwov bwovVar, eeu eeuVar, bwop bwopVar) {
        this.b = bwovVar;
        this.a = eeuVar;
        String str = bwopVar.a;
        this.c = str;
        this.f = bwopVar.d;
        this.g = bwopVar.e;
        this.d = bwopVar.b;
        this.e = bwopVar.c;
        this.h = str.trim().indexOf(32) == -1;
    }

    @Override // defpackage.bwny
    public CharSequence a() {
        return this.c;
    }

    @Override // defpackage.bwny
    public Boolean b() {
        boolean z = true;
        if (this.b.c != bwou.IN_NAV && this.b.c != bwou.FREE_NAV) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bwny
    public Boolean c() {
        return Boolean.valueOf(this.h);
    }

    @Override // defpackage.bwny
    public cqtd d() {
        return this.f;
    }

    @Override // defpackage.bwny
    public Boolean e() {
        return false;
    }

    @Override // defpackage.bwny
    public cqkl f(cjqm cjqmVar) {
        if (!this.a.b()) {
            return cqkl.a;
        }
        if (!b().booleanValue()) {
            cjsb cjsbVar = new cjsb();
            cjsbVar.i(this.g);
            if (cjqmVar.a().a()) {
                cjsbVar.f(cjqmVar.a().b());
            }
            brba a = this.b.a.a();
            dpvd bZ = dpvg.d.bZ();
            String str = this.d;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dpvg dpvgVar = (dpvg) bZ.b;
            str.getClass();
            int i = dpvgVar.a | 2;
            dpvgVar.a = i;
            dpvgVar.c = str;
            dpvgVar.b = this.e.an;
            dpvgVar.a = i | 1;
            a.n(bZ.bK(), cjsbVar.a());
        } else {
            astd s = aste.s();
            assw asswVar = (assw) s;
            asswVar.a = cjqmVar.a().f();
            asswVar.b = this.d;
            asswVar.c = this.e;
            s.d(this.c);
            s.f(this.g);
            this.b.b.a().l(s.a());
        }
        return cqkl.a;
    }

    @Override // defpackage.bwny
    public cjtd g() {
        return cjtd.a(this.g);
    }
}
