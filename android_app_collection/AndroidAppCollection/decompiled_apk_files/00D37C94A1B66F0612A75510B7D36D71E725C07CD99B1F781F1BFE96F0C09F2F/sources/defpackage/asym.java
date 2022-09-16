package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: asym  reason: default package */
/* loaded from: classes2.dex */
public final class asym implements aajq {
    public static final aajr a = new asyl();
    private final asyn b;

    public asym(asyn asynVar) {
        this.b = asynVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        amvl amvlVar = new amvl();
        asyn asynVar = this.b;
        if ((asynVar.b & 4) != 0) {
            amvlVar.c(asynVar.d);
        }
        if (this.b.e.size() > 0) {
            amvlVar.j(this.b.e);
        }
        asyn asynVar2 = this.b;
        if ((asynVar2.b & 8) != 0) {
            amvlVar.c(asynVar2.g);
        }
        amzt listIterator = ((amuk) getFormatsModels()).listIterator();
        while (listIterator.hasNext()) {
            aqnk aqnkVar = (aqnk) listIterator.next();
            amvlVar.j(aqnk.b());
        }
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
        return new asyk(this.b.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof asym) && this.b.equals(((asym) obj).b);
    }

    public List getFormats() {
        return this.b.f;
    }

    public List getFormatsModels() {
        amuf amufVar = new amuf();
        for (aqnl aqnlVar : this.b.f) {
            amufVar.h(aqnk.a(aqnlVar).a());
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
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
        sb.append("MainRecommendedDownloadPlaylistEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
