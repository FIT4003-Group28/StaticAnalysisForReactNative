package defpackage;
/* compiled from: PG */
/* renamed from: awlt  reason: default package */
/* loaded from: classes2.dex */
public final class awlt {
    private final aajl a;
    private final awma b;

    public awlt(awma awmaVar, aajl aajlVar) {
        this.b = awmaVar;
        this.a = aajlVar;
    }

    public static awls b(awma awmaVar) {
        return new awls(awmaVar.mo52toBuilder());
    }

    public final amvn a() {
        amvl amvlVar = new amvl();
        amuf amufVar = new amuf();
        for (awmb awmbVar : this.b.e) {
            amufVar.h(new awlu((awmb) ((aopc) awmbVar.mo52toBuilder()).mo39build(), this.a));
        }
        amzt listIterator = amufVar.g().listIterator();
        while (listIterator.hasNext()) {
            awlu awluVar = (awlu) listIterator.next();
            amvl amvlVar2 = new amvl();
            awmt awmtVar = awluVar.b.e;
            if (awmtVar == null) {
                awmtVar = awmt.a;
            }
            awmo a = awmp.a(awmtVar);
            aajl aajlVar = awluVar.a;
            a.a();
            amvlVar2.j(awmp.b());
            awmt awmtVar2 = awluVar.b.f;
            if (awmtVar2 == null) {
                awmtVar2 = awmt.a;
            }
            awmo a2 = awmp.a(awmtVar2);
            aajl aajlVar2 = awluVar.a;
            a2.a();
            amvlVar2.j(awmp.b());
            awmw awmwVar = awluVar.b.g;
            if (awmwVar == null) {
                awmwVar = awmw.a;
            }
            awmr b = awms.b(awmwVar);
            aajl aajlVar3 = awluVar.a;
            amvlVar2.j(b.a().a());
            awmw awmwVar2 = awluVar.b.h;
            if (awmwVar2 == null) {
                awmwVar2 = awmw.a;
            }
            awmr b2 = awms.b(awmwVar2);
            aajl aajlVar4 = awluVar.a;
            amvlVar2.j(b2.a().a());
            amvlVar.j(amvlVar2.g());
        }
        amuf amufVar2 = new amuf();
        for (awmd awmdVar : this.b.f) {
            amufVar2.h(new awlx((awmd) ((aopc) awmdVar.mo52toBuilder()).mo39build(), this.a));
        }
        amzt listIterator2 = amufVar2.g().listIterator();
        while (listIterator2.hasNext()) {
            awlx awlxVar = (awlx) listIterator2.next();
            amvl amvlVar3 = new amvl();
            awme awmeVar = awlxVar.b.m;
            if (awmeVar == null) {
                awmeVar = awme.a;
            }
            aajl aajlVar5 = awlxVar.a;
            new awlw((awme) ((aopc) awmeVar.mo52toBuilder()).mo39build());
            amvlVar3.j(new amvl().g());
            amvlVar.j(amvlVar3.g());
        }
        amuf amufVar3 = new amuf();
        for (awlz awlzVar : this.b.g) {
            amufVar3.h(new awlr((awlz) awlzVar.mo52toBuilder().mo39build()));
        }
        amzt listIterator3 = amufVar3.g().listIterator();
        while (listIterator3.hasNext()) {
            awlr awlrVar = (awlr) listIterator3.next();
            amvlVar.j(new amvl().g());
        }
        amuf amufVar4 = new amuf();
        for (awmc awmcVar : this.b.h) {
            aopa mo52toBuilder = awmcVar.mo52toBuilder();
            amufVar4.h(new awlv((awmc) mo52toBuilder.mo39build(), this.a));
        }
        amzt listIterator4 = amufVar4.g().listIterator();
        while (listIterator4.hasNext()) {
            awlv awlvVar = (awlv) listIterator4.next();
            amvl amvlVar4 = new amvl();
            awmf awmfVar = awlvVar.b.b;
            if (awmfVar == null) {
                awmfVar = awmf.a;
            }
            aajl aajlVar6 = awlvVar.a;
            new awly((awmf) ((aopc) awmfVar.mo52toBuilder()).mo39build());
            amvlVar4.j(new amvl().g());
            amvlVar.j(amvlVar4.g());
        }
        return amvlVar.g();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awlt) && this.b.equals(((awlt) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("AttributedStringModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
