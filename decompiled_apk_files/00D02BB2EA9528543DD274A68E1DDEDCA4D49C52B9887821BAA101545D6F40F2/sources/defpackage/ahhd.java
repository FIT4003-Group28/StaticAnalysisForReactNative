package defpackage;
/* compiled from: PG */
/* renamed from: ahhd  reason: default package */
/* loaded from: classes2.dex */
public class ahhd extends agxc implements agzz {
    private final agwt a;
    @dzsi
    private final cqkn<agzz> b;
    @dzsi
    private final CharSequence c;
    private final cjtd d;

    public ahhd(agwt agwtVar, @dzsi cqkn<agzz> cqknVar, @dzsi CharSequence charSequence, cjtd cjtdVar) {
        this.a = agwtVar;
        this.b = cqknVar;
        this.c = charSequence;
        this.d = cjtdVar;
        boolean z = false;
        if (cqknVar == null || (!cjtd.b.equals(cjtdVar) && cjtdVar.g != null)) {
            z = true;
        }
        dbsk.a(z);
    }

    @Override // defpackage.agzz
    public agwt a() {
        return this.a;
    }

    @Override // defpackage.agzz
    @dzsi
    public CharSequence b() {
        return this.c;
    }

    @Override // defpackage.agzz
    public Boolean c() {
        return Boolean.valueOf(this.b != null);
    }

    @Override // defpackage.agzz
    @dzsi
    public cqkn<agzz> h() {
        return this.b;
    }

    @Override // defpackage.agzz
    public cjtd i() {
        return this.d;
    }
}
