package defpackage;
/* compiled from: PG */
/* renamed from: avhr  reason: default package */
/* loaded from: classes2.dex */
public final class avhr {
    private final aajl a;
    private final avhn b;

    public avhr(avhn avhnVar, aajl aajlVar) {
        this.b = avhnVar;
        this.a = aajlVar;
    }

    public static avhq b(avhn avhnVar) {
        return new avhq((aopc) avhnVar.mo52toBuilder());
    }

    public final amvn a() {
        amvl amvlVar = new amvl();
        amuf amufVar = new amuf();
        for (avhm avhmVar : this.b.c) {
            amufVar.h(new avhs((avhm) avhmVar.mo52toBuilder().mo39build()));
        }
        amzt listIterator = amufVar.g().listIterator();
        while (listIterator.hasNext()) {
            avhs avhsVar = (avhs) listIterator.next();
            amvlVar.j(new amvl().g());
        }
        aovs aovsVar = this.b.d;
        if (aovsVar == null) {
            aovsVar = aovs.a;
        }
        amvlVar.j(aovq.b(aovsVar).a(this.a).a());
        avhk avhkVar = this.b.e;
        if (avhkVar == null) {
            avhkVar = avhk.a;
        }
        avho avhoVar = new avho((avhk) avhkVar.mo52toBuilder().mo39build());
        amvl amvlVar2 = new amvl();
        asws aswsVar = avhoVar.a.b;
        if (aswsVar == null) {
            aswsVar = asws.a;
        }
        new aswt((asws) aswsVar.mo52toBuilder().mo39build());
        amvlVar2.j(new amvl().g());
        amvlVar.j(amvlVar2.g());
        avhl avhlVar = this.b.g;
        if (avhlVar == null) {
            avhlVar = avhl.a;
        }
        new avhp((avhl) avhlVar.mo52toBuilder().mo39build());
        amvlVar.j(new amvl().g());
        asos asosVar = this.b.h;
        if (asosVar == null) {
            asosVar = asos.a;
        }
        asor.a(asosVar).a();
        amvlVar.j(asor.b());
        asos asosVar2 = this.b.i;
        if (asosVar2 == null) {
            asosVar2 = asos.a;
        }
        asor.a(asosVar2).a();
        amvlVar.j(asor.b());
        return amvlVar.g();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof avhr) && this.b.equals(((avhr) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("ThumbnailDetailsModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
