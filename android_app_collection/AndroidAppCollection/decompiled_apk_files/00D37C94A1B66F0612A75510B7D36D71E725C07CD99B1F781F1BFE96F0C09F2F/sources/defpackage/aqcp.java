package defpackage;
/* compiled from: PG */
/* renamed from: aqcp  reason: default package */
/* loaded from: classes2.dex */
public final class aqcp implements aajq {
    public static final aajr a = new aqco();
    private final aajl b;
    private final aqcq c;

    public aqcp(aqcq aqcqVar, aajl aajlVar) {
        this.c = aqcqVar;
        this.b = aajlVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        aqcw aqcwVar;
        amvl amvlVar = new amvl();
        aqcr commerceAcquisitionClientPayloadModel = getCommerceAcquisitionClientPayloadModel();
        amvl amvlVar2 = new amvl();
        aqcu aqcuVar = commerceAcquisitionClientPayloadModel.a;
        if (aqcuVar.b == 1) {
            aqcwVar = (aqcw) aqcuVar.c;
        } else {
            aqcwVar = aqcw.a;
        }
        aqcs aqcsVar = new aqcs((aqcw) aqcwVar.mo52toBuilder().mo39build());
        amvl amvlVar3 = new amvl();
        amuf amufVar = new amuf();
        for (aqcv aqcvVar : aqcsVar.a.b) {
            amufVar.h(new aqct((aqcv) aqcvVar.mo52toBuilder().mo39build()));
        }
        amzt listIterator = amufVar.g().listIterator();
        while (listIterator.hasNext()) {
            aqct aqctVar = (aqct) listIterator.next();
            amvlVar3.j(new amvl().g());
        }
        amvlVar2.j(amvlVar3.g());
        amvlVar.j(amvlVar2.g());
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
        return new aqcn(this.c.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof aqcp) && this.c.equals(((aqcp) obj).c);
    }

    public aqcu getCommerceAcquisitionClientPayload() {
        aqcu aqcuVar = this.c.d;
        return aqcuVar == null ? aqcu.a : aqcuVar;
    }

    public aqcr getCommerceAcquisitionClientPayloadModel() {
        aqcu aqcuVar = this.c.d;
        if (aqcuVar == null) {
            aqcuVar = aqcu.a;
        }
        return new aqcr((aqcu) aqcuVar.mo52toBuilder().mo39build());
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
        sb.append("CommerceAcquisitionClientPayloadEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
