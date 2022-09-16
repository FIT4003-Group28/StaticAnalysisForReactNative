package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aqqg  reason: default package */
/* loaded from: classes2.dex */
public final class aqqg implements aajq {
    public static final aajr a = new aqqf();
    private final aajl b;
    private final aqqh c;

    public aqqg(aqqh aqqhVar, aajl aajlVar) {
        this.c = aqqhVar;
        this.b = aajlVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        amvl amvlVar = new amvl();
        aqqh aqqhVar = this.c;
        if ((aqqhVar.c & 64) != 0) {
            amvlVar.c(aqqhVar.j);
        }
        amvlVar.j(getThumbnailModel().a());
        amzt listIterator = ((amuk) getBadgeInfoModels()).listIterator();
        while (listIterator.hasNext()) {
            apls aplsVar = (apls) listIterator.next();
            amvlVar.j(new amvl().g());
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
        return new aqqe(this.c.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof aqqg) && this.c.equals(((aqqg) obj).c);
    }

    public List getBadgeInfo() {
        return this.c.r;
    }

    public List getBadgeInfoModels() {
        amuf amufVar = new amuf();
        for (aplt apltVar : this.c.r) {
            amufVar.h(new apls((aplt) apltVar.mo52toBuilder().mo39build()));
        }
        return amufVar.g();
    }

    public String getChannelOwner() {
        return this.c.g;
    }

    public Boolean getIsAndroid() {
        return Boolean.valueOf(this.c.m);
    }

    public Boolean getIsLargeFormFactor() {
        return Boolean.valueOf(this.c.n);
    }

    public Integer getPlaybackPositionSeconds() {
        return Integer.valueOf(this.c.k);
    }

    public String getPublishedTimeText() {
        return this.c.q;
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

    public Integer getUiType() {
        return Integer.valueOf(this.c.o);
    }

    public String getVideoId() {
        return this.c.l;
    }

    public String getVideoLengthAccessibilityText() {
        return this.c.i;
    }

    public Integer getVideoLengthSeconds() {
        return Integer.valueOf(this.c.h);
    }

    public String getViewCountText() {
        return this.c.p;
    }

    @Override // defpackage.aajj
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("DownloadsPageVideoEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
