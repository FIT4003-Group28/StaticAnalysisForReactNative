package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aqqv  reason: default package */
/* loaded from: classes2.dex */
public final class aqqv implements aajq {
    public static final aajr a = new aqqu();
    public final aqqy b;

    public aqqv(aqqy aqqyVar) {
        this.b = aqqyVar;
    }

    public static aqqt b(aqqy aqqyVar) {
        return new aqqt(aqqyVar.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final amvn a() {
        amvl amvlVar = new amvl();
        aqqy aqqyVar = this.b;
        if ((aqqyVar.c & 8) != 0) {
            amvlVar.c(aqqyVar.h);
        }
        amzt listIterator = ((amuk) getLicensesModels()).listIterator();
        while (listIterator.hasNext()) {
            aqqw aqqwVar = (aqqw) listIterator.next();
            amvlVar.j(new amvl().g());
        }
        getErrorModel();
        amvlVar.j(new amvl().g());
        return amvlVar.g();
    }

    @Override // defpackage.aajj
    public final byte[] c() {
        return this.b.toByteArray();
    }

    @Override // defpackage.aajj
    public final String d() {
        return this.b.d;
    }

    @Override // defpackage.aajj
    public final /* bridge */ /* synthetic */ abga e() {
        return new aqqt(this.b.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof aqqv) && this.b.equals(((aqqv) obj).b);
    }

    public aqqx getError() {
        aqqx aqqxVar = this.b.i;
        return aqqxVar == null ? aqqx.a : aqqxVar;
    }

    public aqqs getErrorModel() {
        aqqx aqqxVar = this.b.i;
        if (aqqxVar == null) {
            aqqxVar = aqqx.a;
        }
        return new aqqs((aqqx) aqqxVar.mo52toBuilder().mo39build());
    }

    public Long getLicenseExpirySeconds() {
        return Long.valueOf(this.b.g);
    }

    public List getLicenses() {
        return this.b.e;
    }

    public List getLicensesModels() {
        amuf amufVar = new amuf();
        for (aqqz aqqzVar : this.b.e) {
            amufVar.h(new aqqw((aqqz) aqqzVar.mo52toBuilder().mo39build()));
        }
        return amufVar.g();
    }

    public Long getPlaybackStartSeconds() {
        return Long.valueOf(this.b.f);
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("DrmLicenseEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
