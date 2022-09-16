package defpackage;
/* compiled from: PG */
/* renamed from: bpdq  reason: default package */
/* loaded from: classes3.dex */
public class bpdq implements bpvy {
    public final gga a;
    public final bpdc b;
    public final bpsw c;
    public final boxb d;
    public final bnyc e;
    public final bptn f;
    private final bpdp g = new bpdp(this);
    private final bpvx h;
    private final bpvv i;
    private final jbg j;
    private final boqg k;

    public bpdq(bpdc bpdcVar, gga ggaVar, cqhn cqhnVar, bpdn bpdnVar, booa booaVar, bnyd bnydVar, bpto bptoVar, bptg bptgVar, bpsw bpswVar, boxb boxbVar) {
        this.b = bpdcVar;
        this.a = ggaVar;
        this.c = bpswVar;
        this.d = boxbVar;
        boxe boxeVar = boxbVar.a;
        bpdn.a(bpdcVar, 1);
        bpdn.a(boxeVar, 2);
        this.h = new bpdm(bpdcVar, boxeVar);
        this.i = bpdg.a(ggaVar, cqhnVar, boxbVar.b);
        this.j = new bpcz(ggaVar, boxbVar);
        this.k = booaVar;
        gn gnVar = bpdcVar.A;
        dbsk.s(gnVar);
        this.e = bnydVar.a(gnVar, dtya.cI, dtya.cX);
        this.f = bptoVar.a(bptgVar);
    }

    @Override // defpackage.bpvy
    public bpvx a() {
        return this.h;
    }

    @Override // defpackage.bpvy
    public bpvv b() {
        return this.i;
    }

    @Override // defpackage.bpvy
    public jbg c() {
        return this.j;
    }

    @Override // defpackage.bpvy
    /* renamed from: d */
    public ivn h() {
        return this.g;
    }

    @Override // defpackage.bpvy
    @dzsi
    public CharSequence e() {
        return this.d.d;
    }

    @Override // defpackage.bpvy
    public cqgl f() {
        return new cqgl(this) { // from class: bpdo
            private final bpdq a;

            {
                this.a = this;
            }

            @Override // defpackage.cqgl
            public final void a(CharSequence charSequence) {
                this.a.d.d = charSequence.toString();
            }
        };
    }

    @Override // defpackage.bpvy
    public boqg g() {
        return this.k;
    }
}
