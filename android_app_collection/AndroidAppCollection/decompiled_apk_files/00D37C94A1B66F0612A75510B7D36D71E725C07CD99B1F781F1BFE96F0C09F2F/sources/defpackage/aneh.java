package defpackage;

import java.nio.charset.Charset;
/* compiled from: PG */
/* renamed from: aneh  reason: default package */
/* loaded from: classes.dex */
public final class aneh extends anhh {
    final Charset a;
    final /* synthetic */ anhg b;

    public aneh(anhg anhgVar, Charset charset, byte[] bArr, byte[] bArr2) {
        this.b = anhgVar;
        charset.getClass();
        this.a = charset;
    }

    @Override // defpackage.anhh
    public final String a() {
        return new String(this.b.b(), this.a);
    }

    public final String toString() {
        String obj = this.b.toString();
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 15 + String.valueOf(valueOf).length());
        sb.append(obj);
        sb.append(".asCharSource(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
