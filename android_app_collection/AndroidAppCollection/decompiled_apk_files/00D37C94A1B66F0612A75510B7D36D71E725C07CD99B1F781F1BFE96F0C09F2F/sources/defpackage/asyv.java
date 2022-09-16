package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: asyv  reason: default package */
/* loaded from: classes2.dex */
public final class asyv implements aajq {
    public static final aajr a = new asyu();
    public final aajl b;
    public final asyx c;

    public asyv(asyx asyxVar, aajl aajlVar) {
        this.c = asyxVar;
        this.b = aajlVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        amvl amvlVar = new amvl();
        asyx asyxVar = this.c;
        if ((asyxVar.c & 4) != 0) {
            amvlVar.c(asyxVar.f);
        }
        amzt listIterator = ((amuk) getItemsModels()).listIterator();
        while (listIterator.hasNext()) {
            asys asysVar = (asys) listIterator.next();
            amvl amvlVar2 = new amvl();
            asyw asywVar = asysVar.a;
            if (asywVar.b == 1) {
                amvlVar2.c((String) asywVar.c);
            }
            asyw asywVar2 = asysVar.a;
            if (asywVar2.b == 2) {
                amvlVar2.c((String) asywVar2.c);
            }
            amvlVar.j(amvlVar2.g());
        }
        return amvlVar.g();
    }

    @Override // defpackage.aajj
    /* renamed from: b */
    public final asyt e() {
        return new asyt(this.c.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.aajj
    public final String d() {
        return this.c.d;
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof asyv) && this.c.equals(((asyv) obj).c);
    }

    public List getItems() {
        return this.c.e;
    }

    public List getItemsModels() {
        amuf amufVar = new amuf();
        for (asyw asywVar : this.c.e) {
            aopa mo52toBuilder = asywVar.mo52toBuilder();
            amufVar.h(new asys((asyw) mo52toBuilder.mo39build(), this.b));
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
        sb.append("MainRecommendedDownloadsListEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
