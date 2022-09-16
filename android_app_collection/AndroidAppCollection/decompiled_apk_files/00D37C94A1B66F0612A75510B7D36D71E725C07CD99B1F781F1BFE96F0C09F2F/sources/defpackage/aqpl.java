package defpackage;
/* compiled from: PG */
/* renamed from: aqpl  reason: default package */
/* loaded from: classes2.dex */
public final class aqpl implements aajq {
    public static final aajr a = new aqpk();
    private final aajl b;
    private final aqpn c;

    public aqpl(aqpn aqpnVar, aajl aajlVar) {
        this.c = aqpnVar;
        this.b = aajlVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        amvl amvlVar = new amvl();
        aqpn aqpnVar = this.c;
        if ((aqpnVar.c & 256) != 0) {
            amvlVar.c(aqpnVar.l);
        }
        amvlVar.j(getPlaylistThumbnailModel().a());
        aqpi playlistCollageThumbnailModel = getPlaylistCollageThumbnailModel();
        amvl amvlVar2 = new amvl();
        amuf amufVar = new amuf();
        for (avhn avhnVar : playlistCollageThumbnailModel.b.c) {
            amufVar.h(avhr.b(avhnVar).a(playlistCollageThumbnailModel.a));
        }
        amzt listIterator = amufVar.g().listIterator();
        while (listIterator.hasNext()) {
            amvlVar2.j(((avhr) listIterator.next()).a());
        }
        amuf amufVar2 = new amuf();
        for (avhn avhnVar2 : playlistCollageThumbnailModel.b.d) {
            amufVar2.h(avhr.b(avhnVar2).a(playlistCollageThumbnailModel.a));
        }
        amzt listIterator2 = amufVar2.g().listIterator();
        while (listIterator2.hasNext()) {
            amvlVar2.j(((avhr) listIterator2.next()).a());
        }
        amvlVar.j(amvlVar2.g());
        return amvlVar.g();
    }

    @Override // defpackage.aajj
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.aajj
    public final String d() {
        return this.c.f;
    }

    @Override // defpackage.aajj
    public final /* bridge */ /* synthetic */ abga e() {
        return new aqpj(this.c.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof aqpl) && this.c.equals(((aqpl) obj).c);
    }

    public String getChannelOwnerName() {
        return this.c.i;
    }

    public String getLastSyncedTimeText() {
        return this.c.o;
    }

    public aqpm getPlaylistCollageThumbnail() {
        aqpn aqpnVar = this.c;
        if (aqpnVar.d == 7) {
            return (aqpm) aqpnVar.e;
        }
        return aqpm.a;
    }

    public aqpi getPlaylistCollageThumbnailModel() {
        aqpm aqpmVar;
        aqpn aqpnVar = this.c;
        if (aqpnVar.d == 7) {
            aqpmVar = (aqpm) aqpnVar.e;
        } else {
            aqpmVar = aqpm.a;
        }
        return new aqph(aqpmVar.mo52toBuilder()).a(this.b);
    }

    public String getPlaylistId() {
        return this.c.g;
    }

    public avhn getPlaylistThumbnail() {
        aqpn aqpnVar = this.c;
        if (aqpnVar.d == 6) {
            return (avhn) aqpnVar.e;
        }
        return avhn.a;
    }

    public avhr getPlaylistThumbnailModel() {
        avhn avhnVar;
        aqpn aqpnVar = this.c;
        if (aqpnVar.d == 6) {
            avhnVar = (avhn) aqpnVar.e;
        } else {
            avhnVar = avhn.a;
        }
        return avhr.b(avhnVar).a(this.b);
    }

    public String getShareText() {
        return this.c.m;
    }

    public String getTitle() {
        return this.c.h;
    }

    @Override // defpackage.aajj
    /* renamed from: getType  reason: collision with other method in class */
    public aajr mo145getType() {
        return a;
    }

    public Integer getUiType() {
        return Integer.valueOf(this.c.n);
    }

    public Integer getVideoCount() {
        return Integer.valueOf(this.c.k);
    }

    public String getVideoCountText() {
        return this.c.j;
    }

    @Override // defpackage.aajj
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("DownloadsPagePlaylistEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
