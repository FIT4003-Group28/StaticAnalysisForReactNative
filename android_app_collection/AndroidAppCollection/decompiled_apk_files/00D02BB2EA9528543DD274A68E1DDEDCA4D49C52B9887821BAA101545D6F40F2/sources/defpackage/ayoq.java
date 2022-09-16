package defpackage;
/* compiled from: PG */
/* renamed from: ayoq  reason: default package */
/* loaded from: classes3.dex */
public class ayoq implements aymq {
    private final aymr a;
    private final aymr b;
    private final cjtd c;
    private final cjtd d;
    private final ayop e;
    private final ayop f;
    private aymr g;
    private Boolean h;

    public ayoq(aymr aymrVar, aymr aymrVar2, cjtd cjtdVar, cjtd cjtdVar2, ayop ayopVar, ayop ayopVar2, ayoo ayooVar) {
        this.a = aymrVar;
        this.b = aymrVar2;
        this.c = cjtdVar;
        this.d = cjtdVar2;
        this.e = ayopVar;
        this.f = ayopVar2;
        this.g = ayooVar != ayoo.INITIAL ? aymrVar2 : aymrVar;
        this.h = Boolean.valueOf(ayooVar == ayoo.LOADING);
    }

    @Override // defpackage.aymq
    public Boolean a() {
        return this.h;
    }

    @Override // defpackage.aymq
    public cjtd b() {
        return this.g == this.a ? this.c : this.d;
    }

    @Override // defpackage.aymq
    public cqkl c() {
        (this.g == this.a ? this.e : this.f).a(i());
        return cqkl.a;
    }

    @Override // defpackage.aymr
    public cqtd d() {
        return this.g.d();
    }

    @Override // defpackage.aymr
    public cqsn e() {
        return this.g.e();
    }

    @Override // defpackage.aymr
    public cqsn f() {
        return this.g.f();
    }

    @Override // defpackage.aymr
    public Boolean g() {
        return this.g.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(ayoo ayooVar) {
        ayoo ayooVar2 = ayoo.INITIAL;
        int ordinal = ayooVar.ordinal();
        if (ordinal == 0) {
            if (this.g == this.a && !this.h.booleanValue()) {
                return;
            }
            this.g = this.a;
            this.h = false;
            cqkx.p(this);
        } else if (ordinal == 1) {
            if (this.h.booleanValue()) {
                return;
            }
            this.h = true;
            cqkx.p(this);
        } else if (ordinal != 2) {
        } else {
            if (this.g == this.b && !this.h.booleanValue()) {
                return;
            }
            this.g = this.b;
            this.h = false;
            cqkx.p(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ayon i() {
        return new ayon(this);
    }
}
