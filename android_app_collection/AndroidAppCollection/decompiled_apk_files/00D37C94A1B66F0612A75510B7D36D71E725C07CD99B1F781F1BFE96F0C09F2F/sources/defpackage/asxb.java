package defpackage;
/* compiled from: PG */
/* renamed from: asxb  reason: default package */
/* loaded from: classes2.dex */
public final class asxb implements aajq {
    public static final aajr a = new asxa();
    private final aajl b;
    private final asxc c;

    public asxb(asxc asxcVar, aajl aajlVar) {
        this.c = asxcVar;
        this.b = aajlVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        amvl amvlVar = new amvl();
        asxe markersListModel = getMarkersListModel();
        amvl amvlVar2 = new amvl();
        amzt listIterator = ((amuk) markersListModel.b()).listIterator();
        while (listIterator.hasNext()) {
            aswx aswxVar = (aswx) listIterator.next();
            amvl amvlVar3 = new amvl();
            arag aragVar = aswxVar.b.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            amvlVar3.j(arad.b(aragVar).a(aswxVar.a).a());
            avhn avhnVar = aswxVar.b.f;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            amvlVar3.j(avhr.b(avhnVar).a(aswxVar.a).a());
            awmt awmtVar = aswxVar.b.g;
            if (awmtVar == null) {
                awmtVar = awmt.a;
            }
            awmo a2 = awmp.a(awmtVar);
            aajl aajlVar = aswxVar.a;
            a2.a();
            amvlVar3.j(awmp.b());
            awmt awmtVar2 = aswxVar.b.h;
            if (awmtVar2 == null) {
                awmtVar2 = awmt.a;
            }
            awmo a3 = awmp.a(awmtVar2);
            aajl aajlVar2 = aswxVar.a;
            a3.a();
            amvlVar3.j(awmp.b());
            awmt awmtVar3 = aswxVar.b.i;
            if (awmtVar3 == null) {
                awmtVar3 = awmt.a;
            }
            awmo a4 = awmp.a(awmtVar3);
            aajl aajlVar3 = aswxVar.a;
            a4.a();
            amvlVar3.j(awmp.b());
            amvlVar2.j(amvlVar3.g());
        }
        arag aragVar2 = markersListModel.b.e;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        amvlVar2.j(arad.b(aragVar2).a(markersListModel.a).a());
        arag aragVar3 = markersListModel.b.f;
        if (aragVar3 == null) {
            aragVar3 = arag.a;
        }
        amvlVar2.j(arad.b(aragVar3).a(markersListModel.a).a());
        awmt awmtVar4 = markersListModel.b.g;
        if (awmtVar4 == null) {
            awmtVar4 = awmt.a;
        }
        awmp.a(awmtVar4).a();
        amvlVar2.j(awmp.b());
        awmt awmtVar5 = markersListModel.b.h;
        if (awmtVar5 == null) {
            awmtVar5 = awmt.a;
        }
        awmp.a(awmtVar5).a();
        amvlVar2.j(awmp.b());
        awmt awmtVar6 = markersListModel.b.i;
        if (awmtVar6 == null) {
            awmtVar6 = awmt.a;
        }
        awmp.a(awmtVar6).a();
        amvlVar2.j(awmp.b());
        amvlVar.j(amvlVar2.g());
        return amvlVar.g();
    }

    public final boolean b() {
        return (this.c.b & 8) != 0;
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
        return new aswz(this.c.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof asxb) && this.c.equals(((asxb) obj).c);
    }

    public String getExternalVideoId() {
        return this.c.d;
    }

    public aswy getMarkersList() {
        aswy aswyVar = this.c.e;
        return aswyVar == null ? aswy.a : aswyVar;
    }

    public asxe getMarkersListModel() {
        aswy aswyVar = this.c.e;
        if (aswyVar == null) {
            aswyVar = aswy.a;
        }
        aopa mo52toBuilder = aswyVar.mo52toBuilder();
        return new asxe((aswy) mo52toBuilder.mo39build(), this.b);
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
        sb.append("MacroMarkersListEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
