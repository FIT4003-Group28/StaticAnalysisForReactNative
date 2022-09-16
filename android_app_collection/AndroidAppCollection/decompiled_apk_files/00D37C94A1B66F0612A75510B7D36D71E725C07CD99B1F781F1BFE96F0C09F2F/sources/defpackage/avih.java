package defpackage;
/* compiled from: PG */
/* renamed from: avih  reason: default package */
/* loaded from: classes2.dex */
public final class avih implements aajq {
    public static final aajr a = new avig();
    public final avii b;
    private final aajl c;

    public avih(avii aviiVar, aajl aajlVar) {
        this.b = aviiVar;
        this.c = aajlVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        amvl amvlVar = new amvl();
        avib timedListDataModel = getTimedListDataModel();
        amvl amvlVar2 = new amvl();
        amuf amufVar = new amuf();
        for (avim avimVar : timedListDataModel.b.b) {
            aopa mo52toBuilder = avimVar.mo52toBuilder();
            amufVar.h(new avil((avim) mo52toBuilder.mo39build(), timedListDataModel.a));
        }
        amzt listIterator = amufVar.g().listIterator();
        while (listIterator.hasNext()) {
            avil avilVar = (avil) listIterator.next();
            amvl amvlVar3 = new amvl();
            amuf amufVar2 = new amuf();
            for (avio avioVar : avilVar.b.b) {
                aopa mo52toBuilder2 = avioVar.mo52toBuilder();
                aajl aajlVar = avilVar.a;
                amufVar2.h(new avin((avio) mo52toBuilder2.mo39build()));
            }
            amzt listIterator2 = amufVar2.g().listIterator();
            while (listIterator2.hasNext()) {
                avin avinVar = (avin) listIterator2.next();
                amvlVar3.j(new amvl().g());
            }
            amvlVar2.j(amvlVar3.g());
        }
        amvlVar.j(amvlVar2.g());
        return amvlVar.g();
    }

    @Override // defpackage.aajj
    public final byte[] c() {
        return this.b.toByteArray();
    }

    @Override // defpackage.aajj
    public final String d() {
        return this.b.c;
    }

    @Override // defpackage.aajj
    public final /* bridge */ /* synthetic */ abga e() {
        return new avif(this.b.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof avih) && this.b.equals(((avih) obj).b);
    }

    public avic getTimedListData() {
        avic avicVar = this.b.d;
        return avicVar == null ? avic.a : avicVar;
    }

    public avib getTimedListDataModel() {
        avic avicVar = this.b.d;
        if (avicVar == null) {
            avicVar = avic.a;
        }
        aopa mo52toBuilder = avicVar.mo52toBuilder();
        return new avib((avic) mo52toBuilder.mo39build(), this.c);
    }

    @Override // defpackage.aajj
    /* renamed from: getType  reason: collision with other method in class */
    public aajr mo145getType() {
        return a;
    }

    @Override // defpackage.aajj
    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
        sb.append("TimedMarkersListSyncEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
