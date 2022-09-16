package defpackage;
/* compiled from: PG */
/* renamed from: apzw  reason: default package */
/* loaded from: classes2.dex */
public final class apzw implements aajq {
    public static final aajr a = new apzv();
    private final apzx b;

    public apzw(apzx apzxVar) {
        this.b = apzxVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        return new amvl().g();
    }

    @Override // defpackage.aajj
    /* renamed from: b */
    public final apzu e() {
        return new apzu(this.b.mo52toBuilder());
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
        return (obj instanceof apzw) && this.b.equals(((apzw) obj).b);
    }

    public Boolean getIsEmojiPickerEnabled() {
        return Boolean.valueOf(this.b.h);
    }

    public Boolean getIsEmojiPickerToggled() {
        return Boolean.valueOf(this.b.i);
    }

    public Boolean getIsSendButtonEnabled() {
        return Boolean.valueOf(this.b.f);
    }

    public Boolean getIsSending() {
        return Boolean.valueOf(this.b.g);
    }

    public Boolean getIsTimestampButtonEnabled() {
        return Boolean.valueOf(this.b.e);
    }

    public Boolean getIsTimestampButtonSupported() {
        return Boolean.valueOf(this.b.j);
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
        sb.append("CommentComposerButtonStateEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
