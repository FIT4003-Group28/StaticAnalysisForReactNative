package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: auog  reason: default package */
/* loaded from: classes2.dex */
public final class auog implements aajq {
    public static final aajr a = new auof();
    private final auoh b;

    public auog(auoh auohVar) {
        this.b = auohVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        return new amvl().g();
    }

    @Override // defpackage.aajj
    /* renamed from: b */
    public final auoe e() {
        return new auoe(this.b.mo52toBuilder());
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
    public final boolean equals(Object obj) {
        return (obj instanceof auog) && this.b.equals(((auog) obj).b);
    }

    public List getPlaylistIds() {
        return this.b.d;
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("SaveToPlaylistListEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
