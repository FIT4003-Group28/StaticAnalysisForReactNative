package defpackage;
/* compiled from: PG */
/* renamed from: atre  reason: default package */
/* loaded from: classes2.dex */
public final class atre {
    private final aajl a;
    private final atrf b;

    public atre(atrf atrfVar, aajl aajlVar) {
        this.b = atrfVar;
        this.a = aajlVar;
    }

    public static atrd b(atrf atrfVar) {
        return new atrd(atrfVar.mo52toBuilder());
    }

    public final amvn a() {
        amvl amvlVar = new amvl();
        atrc atrcVar = this.b.e;
        if (atrcVar == null) {
            atrcVar = atrc.b;
        }
        new atrb((atrc) ((aopc) atrcVar.mo52toBuilder()).mo39build());
        amvlVar.j(new amvl().g());
        amuf amufVar = new amuf();
        for (atrf atrfVar : this.b.f) {
            amufVar.h(b(atrfVar).a(this.a));
        }
        amzt listIterator = amufVar.g().listIterator();
        while (listIterator.hasNext()) {
            amvlVar.j(((atre) listIterator.next()).a());
        }
        amuf amufVar2 = new amuf();
        for (atrf atrfVar2 : this.b.g) {
            amufVar2.h(b(atrfVar2).a(this.a));
        }
        amzt listIterator2 = amufVar2.g().listIterator();
        while (listIterator2.hasNext()) {
            amvlVar.j(((atre) listIterator2.next()).a());
        }
        return amvlVar.g();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof atre) && this.b.equals(((atre) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
        sb.append("OfflineOrchestrationActionModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
