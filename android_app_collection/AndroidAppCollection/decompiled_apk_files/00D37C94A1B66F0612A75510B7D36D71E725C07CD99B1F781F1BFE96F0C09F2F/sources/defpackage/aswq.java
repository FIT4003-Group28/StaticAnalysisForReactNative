package defpackage;
/* compiled from: PG */
/* renamed from: aswq  reason: default package */
/* loaded from: classes2.dex */
public final class aswq {
    private final aajl a;
    private final aswj b;

    public aswq(aswj aswjVar, aajl aajlVar) {
        this.b = aswjVar;
        this.a = aajlVar;
    }

    public static aswp b(aswj aswjVar) {
        return new aswp(aswjVar.mo52toBuilder());
    }

    public final amvn a() {
        arhs arhsVar;
        avhn avhnVar;
        aswr aswrVar;
        amvl amvlVar = new amvl();
        aswj aswjVar = this.b;
        if (aswjVar.b == 1) {
            arhsVar = (arhs) aswjVar.c;
        } else {
            arhsVar = arhs.a;
        }
        new arhq((arhs) ((aopc) arhsVar.mo52toBuilder()).mo39build());
        amvlVar.j(new amvl().g());
        aswj aswjVar2 = this.b;
        if (aswjVar2.b == 2) {
            avhnVar = (avhn) aswjVar2.c;
        } else {
            avhnVar = avhn.a;
        }
        amvlVar.j(avhr.b(avhnVar).a(this.a).a());
        aswj aswjVar3 = this.b;
        if (aswjVar3.b == 3) {
            aswrVar = (aswr) aswjVar3.c;
        } else {
            aswrVar = aswr.a;
        }
        new aswo((aswr) aswrVar.mo52toBuilder().mo39build());
        amvlVar.j(new amvl().g());
        return amvlVar.g();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aswq) && this.b.equals(((aswq) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("OneofIconOrThumbnailModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
