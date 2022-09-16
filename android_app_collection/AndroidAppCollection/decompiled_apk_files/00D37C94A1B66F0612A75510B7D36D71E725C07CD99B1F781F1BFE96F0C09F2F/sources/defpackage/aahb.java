package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: aahb  reason: default package */
/* loaded from: classes.dex */
public final class aahb implements aajs {
    public final aagu a;
    public final List b = new ArrayList();
    public final AtomicBoolean c = new AtomicBoolean();
    public aorw d = aajz.a;

    public aahb(aagu aaguVar) {
        this.a = aaguVar;
    }

    public static aynr c() {
        return aynr.s(new IllegalStateException("already committed"));
    }

    @Override // defpackage.aajs
    public final aajs a(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aajs
    public final aynr b() {
        if (this.c.getAndSet(true)) {
            return c();
        }
        return this.a.k(this.b, true);
    }

    @Override // defpackage.aajs
    public final void d(final aajj aajjVar) {
        final aorw aorwVar = this.d;
        this.b.add(new aaha() { // from class: aagw
            @Override // defpackage.aaha
            public final void a() {
                aahb aahbVar = aahb.this;
                aajj aajjVar2 = aajjVar;
                aorw aorwVar2 = aorwVar;
                aagu aaguVar = aahbVar.a;
                aagf b = aaguVar.c.b(aajjVar2.d());
                if (aagu.o(b.b, aorwVar2)) {
                    aorw aorwVar3 = b.b.d;
                    if (aorwVar3 == null) {
                        aorwVar3 = aorw.a;
                    }
                    aorw c = aajz.c(aorwVar2, aorwVar3);
                    aagg aaggVar = aaguVar.c;
                    aajj b2 = aajz.b(aaguVar.b, b.a, aajjVar2);
                    aopa mo52toBuilder = b.b.mo52toBuilder();
                    mo52toBuilder.copyOnWrite();
                    awsz awszVar = (awsz) mo52toBuilder.instance;
                    c.getClass();
                    awszVar.d = c;
                    awszVar.b |= 2;
                    aaggVar.h(b2, (awsz) mo52toBuilder.mo39build());
                }
            }
        });
    }

    @Override // defpackage.aajs
    public final void e(final aajj aajjVar, final aajk aajkVar) {
        final aorw aorwVar = this.d;
        this.b.add(new aaha() { // from class: aagv
            @Override // defpackage.aaha
            public final void a() {
                aahb aahbVar = aahb.this;
                aajj aajjVar2 = aajjVar;
                aajk aajkVar2 = aajkVar;
                aorw aorwVar2 = aorwVar;
                aagu aaguVar = aahbVar.a;
                aagf b = aaguVar.c.b(aajjVar2.d());
                if (aagu.o(b.b, aorwVar2)) {
                    aorw aorwVar3 = b.b.d;
                    if (aorwVar3 == null) {
                        aorwVar3 = aorw.a;
                    }
                    aorw c = aajz.c(aorwVar2, aorwVar3);
                    aagg aaggVar = aaguVar.c;
                    aajj b2 = aajz.b(aaguVar.b, b.a, aajjVar2);
                    aopa mo52toBuilder = b.b.mo52toBuilder();
                    mo52toBuilder.copyOnWrite();
                    awsz awszVar = (awsz) mo52toBuilder.instance;
                    c.getClass();
                    awszVar.d = c;
                    awszVar.b |= 2;
                    aqwb aqwbVar = aajkVar2.b;
                    mo52toBuilder.copyOnWrite();
                    awsz awszVar2 = (awsz) mo52toBuilder.instance;
                    awszVar2.c = aqwbVar;
                    awszVar2.b |= 1;
                    aaggVar.h(b2, (awsz) mo52toBuilder.mo39build());
                }
            }
        });
    }

    @Override // defpackage.aajs
    public final void f(final String str, final aajk aajkVar) {
        final aorw aorwVar = this.d;
        this.b.add(new aaha() { // from class: aagx
            @Override // defpackage.aaha
            public final void a() {
                aahb aahbVar = aahb.this;
                String str2 = str;
                aajk aajkVar2 = aajkVar;
                aorw aorwVar2 = aorwVar;
                aagu aaguVar = aahbVar.a;
                aagf b = aaguVar.c.b(str2);
                if (b.a == null) {
                    throw new aakb("Cannot commit metadata without an existing entity");
                }
                if (!aagu.o(b.b, aorwVar2)) {
                    return;
                }
                aorw aorwVar3 = b.b.d;
                if (aorwVar3 == null) {
                    aorwVar3 = aorw.a;
                }
                aorw c = aajz.c(aorwVar2, aorwVar3);
                aagg aaggVar = aaguVar.c;
                aajj aajjVar = b.a;
                aopa mo52toBuilder = b.b.mo52toBuilder();
                mo52toBuilder.copyOnWrite();
                awsz awszVar = (awsz) mo52toBuilder.instance;
                c.getClass();
                awszVar.d = c;
                awszVar.b |= 2;
                aqwb aqwbVar = aajkVar2.b;
                mo52toBuilder.copyOnWrite();
                awsz awszVar2 = (awsz) mo52toBuilder.instance;
                awszVar2.c = aqwbVar;
                awszVar2.b |= 1;
                aaggVar.h(aajjVar, (awsz) mo52toBuilder.mo39build());
            }
        });
    }

    @Override // defpackage.aajs
    public final void g(final String str) {
        final aorw aorwVar = this.d;
        this.b.add(new aaha() { // from class: aagy
            @Override // defpackage.aaha
            public final void a() {
                aahb aahbVar = aahb.this;
                String str2 = str;
                aorw aorwVar2 = aorwVar;
                aagu aaguVar = aahbVar.a;
                if (aagu.o(aaguVar.c.b(str2).b, aorwVar2)) {
                    aaguVar.c.a.set(str2, null);
                }
            }
        });
    }

    @Override // defpackage.aajs
    public final /* synthetic */ void h(aajj aajjVar) {
        aaji.b(this, aajjVar);
    }

    @Override // defpackage.aajs
    public final void i(final String str, final aqvy aqvyVar, byte[] bArr) {
        final aoob x = aoob.x(bArr);
        final aorw aorwVar = this.d;
        this.b.add(new aaha() { // from class: aagz
            @Override // defpackage.aaha
            public final void a() {
                aahb aahbVar = aahb.this;
                String str2 = str;
                aqvy aqvyVar2 = aqvyVar;
                aoob aoobVar = x;
                aorw aorwVar2 = aorwVar;
                aagu aaguVar = aahbVar.a;
                aagf b = aaguVar.c.b(str2);
                if (aagu.o(b.b, aorwVar2)) {
                    aorw aorwVar3 = b.b.d;
                    if (aorwVar3 == null) {
                        aorwVar3 = aorw.a;
                    }
                    aorw c = aajz.c(aorwVar2, aorwVar3);
                    aajj a = aajz.a(aaguVar.a, aqvyVar2, str2, b.a, aoobVar.I());
                    if (a != null) {
                        aagg aaggVar = aaguVar.c;
                        aajj b2 = aajz.b(aaguVar.b, b.a, a);
                        aopa mo52toBuilder = b.b.mo52toBuilder();
                        mo52toBuilder.copyOnWrite();
                        awsz awszVar = (awsz) mo52toBuilder.instance;
                        c.getClass();
                        awszVar.d = c;
                        awszVar.b |= 2;
                        aaggVar.h(b2, (awsz) mo52toBuilder.mo39build());
                        return;
                    }
                    throw new aakb("update could not be applied");
                }
            }
        });
    }

    @Override // defpackage.aajs
    public final void j(abga abgaVar) {
        d(abgaVar.a(this.a));
    }
}
