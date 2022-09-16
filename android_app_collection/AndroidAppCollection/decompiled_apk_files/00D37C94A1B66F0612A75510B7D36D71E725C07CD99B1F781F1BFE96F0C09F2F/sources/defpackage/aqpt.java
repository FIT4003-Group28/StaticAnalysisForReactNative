package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aqpt  reason: default package */
/* loaded from: classes2.dex */
public final class aqpt implements aajq {
    public static final aajr a = new aqps();
    private final aajl b;
    private final aqpu c;

    public aqpt(aqpu aqpuVar, aajl aajlVar) {
        this.c = aqpuVar;
        this.b = aajlVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        amvl amvlVar = new amvl();
        aqpu aqpuVar = this.c;
        if ((aqpuVar.c & 64) != 0) {
            amvlVar.c(aqpuVar.j);
        }
        amvlVar.j(getThumbnailModel().a());
        amzt listIterator = ((amuk) getRecommendedDownloadFormatsModels()).listIterator();
        while (listIterator.hasNext()) {
            aqnk aqnkVar = (aqnk) listIterator.next();
            amvlVar.j(aqnk.b());
        }
        return amvlVar.g();
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
        return new aqpr(this.c.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof aqpt) && this.c.equals(((aqpt) obj).c);
    }

    public String getChannelOwner() {
        return this.c.g;
    }

    public List getRecommendedDownloadFormats() {
        return this.c.m;
    }

    public List getRecommendedDownloadFormatsModels() {
        amuf amufVar = new amuf();
        for (aqnl aqnlVar : this.c.m) {
            amufVar.h(aqnk.a(aqnlVar).a());
        }
        return amufVar.g();
    }

    public aoob getScoringTrackingParams() {
        return this.c.n;
    }

    public avhn getThumbnail() {
        avhn avhnVar = this.c.e;
        return avhnVar == null ? avhn.a : avhnVar;
    }

    public avhr getThumbnailModel() {
        avhn avhnVar = this.c.e;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        return avhr.b(avhnVar).a(this.b);
    }

    public String getTitle() {
        return this.c.f;
    }

    @Override // defpackage.aajj
    /* renamed from: getType  reason: collision with other method in class */
    public aajr mo145getType() {
        return a;
    }

    public String getVideoId() {
        return this.c.k;
    }

    public String getVideoLengthAccessibilityText() {
        return this.c.i;
    }

    public Integer getVideoLengthSeconds() {
        return Integer.valueOf(this.c.h);
    }

    public String getViewCountText() {
        return this.c.l;
    }

    @Override // defpackage.aajj
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
        sb.append("DownloadsPageRecommendedVideoEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
