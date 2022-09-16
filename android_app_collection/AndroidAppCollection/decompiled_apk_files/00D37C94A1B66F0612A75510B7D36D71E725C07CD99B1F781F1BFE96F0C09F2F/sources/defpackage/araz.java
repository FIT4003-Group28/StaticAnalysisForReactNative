package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: araz  reason: default package */
/* loaded from: classes2.dex */
public final class araz implements aajq {
    public static final aajr a = new aray();
    private final aajl b;
    private final arba c;

    public araz(arba arbaVar, aajl aajlVar) {
        this.c = arbaVar;
        this.b = aajlVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        araw arawVar;
        amvl amvlVar = new amvl();
        amzt listIterator = ((amuk) getFormfillFieldResultsModels()).listIterator();
        while (listIterator.hasNext()) {
            arat aratVar = (arat) listIterator.next();
            amvl amvlVar2 = new amvl();
            arav aravVar = aratVar.b;
            if (aravVar.c == 4) {
                arawVar = (araw) aravVar.d;
            } else {
                arawVar = araw.a;
            }
            aopa mo52toBuilder = arawVar.mo52toBuilder();
            aajl aajlVar = aratVar.a;
            new arau((araw) mo52toBuilder.mo39build());
            amvlVar2.j(new amvl().g());
            amvlVar.j(amvlVar2.g());
        }
        return amvlVar.g();
    }

    @Override // defpackage.aajj
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.aajj
    public final String d() {
        return this.c.c;
    }

    @Override // defpackage.aajj
    public final /* bridge */ /* synthetic */ abga e() {
        return new arax(this.c.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof araz) && this.c.equals(((araz) obj).c);
    }

    public List getFormfillFieldResults() {
        return this.c.d;
    }

    public List getFormfillFieldResultsModels() {
        amuf amufVar = new amuf();
        for (arav aravVar : this.c.d) {
            aopa mo52toBuilder = aravVar.mo52toBuilder();
            amufVar.h(new arat((arav) mo52toBuilder.mo39build(), this.b));
        }
        return amufVar.g();
    }

    @Override // defpackage.aajj
    /* renamed from: getType  reason: collision with other method in class */
    public aajr mo145getType() {
        return a;
    }

    @Override // defpackage.aajj
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("FormfillFieldsEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
