package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alhd  reason: default package */
/* loaded from: classes.dex */
public final class alhd {
    public String a;
    private amvn b;
    private ampq c;

    public alhd() {
    }

    public alhd(byte[] bArr) {
        this.c = amon.a;
    }

    public final void b(ampq ampqVar) {
        if (ampqVar != null) {
            this.c = ampqVar;
            return;
        }
        throw new NullPointerException("Null retryTime");
    }

    public final void c(amvn amvnVar) {
        if (amvnVar != null) {
            this.b = amvnVar;
            return;
        }
        throw new NullPointerException("Null unmetRequirements");
    }

    public final alhe a() {
        amvn amvnVar;
        String str = this.a;
        if (str == null || (amvnVar = this.b) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" id");
            }
            if (this.b == null) {
                sb.append(" unmetRequirements");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new alhe(str, amvnVar, this.c);
    }
}
