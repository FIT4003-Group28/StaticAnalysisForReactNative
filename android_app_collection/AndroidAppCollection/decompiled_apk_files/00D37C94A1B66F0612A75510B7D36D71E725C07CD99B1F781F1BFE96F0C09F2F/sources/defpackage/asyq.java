package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: asyq  reason: default package */
/* loaded from: classes2.dex */
public final class asyq implements aajq {
    public static final aajr a = new asyp();
    private final aajl b;
    private final asyr c;

    public asyq(asyr asyrVar, aajl aajlVar) {
        this.c = asyrVar;
        this.b = aajlVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        amvl amvlVar = new amvl();
        asyr asyrVar = this.c;
        if ((asyrVar.c & 4) != 0) {
            amvlVar.c(asyrVar.e);
        }
        asyr asyrVar2 = this.c;
        if ((asyrVar2.c & 8) != 0) {
            amvlVar.c(asyrVar2.g);
        }
        amzt listIterator = ((amuk) getFormatsModels()).listIterator();
        while (listIterator.hasNext()) {
            aqnk aqnkVar = (aqnk) listIterator.next();
            amvlVar.j(aqnk.b());
        }
        getLocalizedStringsModel();
        amvlVar.j(awkt.b());
        return amvlVar.g();
    }

    public final awkx b() {
        aajj b = this.b.b(this.c.g);
        boolean z = true;
        if (b != null && !(b instanceof awkx)) {
            z = false;
        }
        aqxo.z(z, "entityFromStore is not instance of YtMainVideoEntityModel, key=video");
        return (awkx) b;
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
    public final /* bridge */ /* synthetic */ abga e() {
        return new asyo(this.c.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof asyq) && this.c.equals(((asyq) obj).c);
    }

    public List getFormats() {
        return this.c.f;
    }

    public List getFormatsModels() {
        amuf amufVar = new amuf();
        for (aqnl aqnlVar : this.c.f) {
            amufVar.h(aqnk.a(aqnlVar).a());
        }
        return amufVar.g();
    }

    public awku getLocalizedStrings() {
        awku awkuVar = this.c.h;
        return awkuVar == null ? awku.a : awkuVar;
    }

    public awkt getLocalizedStringsModel() {
        awku awkuVar = this.c.h;
        if (awkuVar == null) {
            awkuVar = awku.a;
        }
        return awkt.a(awkuVar).a();
    }

    public aoob getScoringTrackingParams() {
        return this.c.i;
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
        sb.append("MainRecommendedDownloadVideoEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
