package defpackage;
/* compiled from: PG */
/* renamed from: atad  reason: default package */
/* loaded from: classes2.dex */
public final class atad implements aajq {
    public static final aajr a = new atac();
    public final ataf b;

    public atad(ataf atafVar) {
        this.b = atafVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        amvl amvlVar = new amvl();
        getActiveSectionInfoModel();
        amvlVar.j(new amvl().g());
        return amvlVar.g();
    }

    @Override // defpackage.aajj
    /* renamed from: b */
    public final atab e() {
        return new atab(this.b.mo52toBuilder());
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
    public final boolean equals(Object obj) {
        return (obj instanceof atad) && this.b.equals(((atad) obj).b);
    }

    public final boolean f() {
        return (this.b.c & 64) != 0;
    }

    public final boolean g() {
        return (this.b.c & 16) != 0;
    }

    public Integer getActiveItemIndex() {
        return Integer.valueOf(this.b.f);
    }

    public atae getActiveSectionInfo() {
        atae ataeVar = this.b.h;
        return ataeVar == null ? atae.a : ataeVar;
    }

    public ataa getActiveSectionInfoModel() {
        atae ataeVar = this.b.h;
        if (ataeVar == null) {
            ataeVar = atae.a;
        }
        return new ataa((atae) ataeVar.mo52toBuilder().mo39build());
    }

    public atag getCurrentSyncMode() {
        atag b = atag.b(this.b.i);
        return b == null ? atag.SYNC_MODE_UNKNOWN : b;
    }

    public String getPanelId() {
        return this.b.e;
    }

    public Boolean getSyncEnabled() {
        return Boolean.valueOf(this.b.g);
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
        sb.append("MarkersEngagementPanelSyncEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
