package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: atjj  reason: default package */
/* loaded from: classes2.dex */
public final class atjj implements aajq {
    public static final aajr a = new atji();
    private final atjk b;

    public atjj(atjk atjkVar) {
        this.b = atjkVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        return new amvl().g();
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
        return new atjh(this.b.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof atjj) && this.b.equals(((atjj) obj).b);
    }

    public List getSelectedVideoIds() {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 51);
        sb.append("MultiSelectVideoItemFeedSelectionStateEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
