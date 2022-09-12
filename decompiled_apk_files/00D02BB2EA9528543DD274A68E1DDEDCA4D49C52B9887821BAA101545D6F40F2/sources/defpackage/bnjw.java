package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: bnjw  reason: default package */
/* loaded from: classes3.dex */
public class bnjw implements bnil {
    private final CharSequence a;
    @dzsi
    private final acpa b;
    @dzsi
    private final cjtd c;

    public bnjw(CharSequence charSequence, @dzsi acpa acpaVar, @dzsi cjtd cjtdVar) {
        this.b = acpaVar;
        this.a = charSequence;
        this.c = cjtdVar;
    }

    @Override // defpackage.bnil
    @dzsi
    public acpa a() {
        return this.b;
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd d() {
        return null;
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return false;
    }

    public boolean equals(@dzsi Object obj) {
        if (!(obj instanceof bnjw)) {
            return false;
        }
        bnjw bnjwVar = (bnjw) obj;
        return this.a.toString().contentEquals(bnjwVar.a) && dbsd.a(this.b, bnjwVar.b) && dbsd.a(this.c, bnjwVar.c);
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        return cqkl.a;
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd g() {
        return null;
    }

    @Override // defpackage.jbf
    @dzsi
    public cjtd h() {
        return this.c;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // defpackage.jbf
    @dzsi
    public CharSequence l() {
        return null;
    }

    @Override // defpackage.jbi
    @dzsi
    public CharSequence m() {
        return this.a;
    }
}
