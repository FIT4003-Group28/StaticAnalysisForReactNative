package defpackage;
/* compiled from: PG */
/* renamed from: apzf  reason: default package */
/* loaded from: classes2.dex */
public final class apzf {
    private final aajl a;
    private final apzg b;

    public apzf(apzg apzgVar, aajl aajlVar) {
        this.b = apzgVar;
        this.a = aajlVar;
    }

    public static apze b(apzg apzgVar) {
        return new apze((aopc) apzgVar.mo52toBuilder());
    }

    public final amvn a() {
        amvl amvlVar = new amvl();
        amuf amufVar = new amuf();
        for (aswg aswgVar : this.b.d) {
            aopa mo52toBuilder = aswgVar.mo52toBuilder();
            amufVar.h(new aswc((aswg) mo52toBuilder.mo39build(), this.a));
        }
        amzt listIterator = amufVar.g().listIterator();
        while (listIterator.hasNext()) {
            aswc aswcVar = (aswc) listIterator.next();
            amvl amvlVar2 = new amvl();
            amuf amufVar2 = new amuf();
            for (aswf aswfVar : aswcVar.b.d) {
                aopa mo52toBuilder2 = aswfVar.mo52toBuilder();
                aajl aajlVar = aswcVar.a;
                amufVar2.h(new aswb((aswf) mo52toBuilder2.mo39build()));
            }
            amzt listIterator2 = amufVar2.g().listIterator();
            while (listIterator2.hasNext()) {
                aswb aswbVar = (aswb) listIterator2.next();
                amvlVar2.j(new amvl().g());
            }
            amuf amufVar3 = new amuf();
            for (aswh aswhVar : aswcVar.b.e) {
                aopa mo52toBuilder3 = aswhVar.mo52toBuilder();
                aajl aajlVar2 = aswcVar.a;
                amufVar3.h(new aswd((aswh) mo52toBuilder3.mo39build()));
            }
            amzt listIterator3 = amufVar3.g().listIterator();
            while (listIterator3.hasNext()) {
                aswd aswdVar = (aswd) listIterator3.next();
                amvlVar2.j(new amvl().g());
            }
            amvlVar.j(amvlVar2.g());
        }
        apzh apzhVar = this.b.e;
        if (apzhVar == null) {
            apzhVar = apzh.a;
        }
        new apzd((apzh) ((aopc) apzhVar.mo52toBuilder()).mo39build());
        amvlVar.j(new amvl().g());
        return amvlVar.g();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof apzf) && this.b.equals(((apzf) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("CommandModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
