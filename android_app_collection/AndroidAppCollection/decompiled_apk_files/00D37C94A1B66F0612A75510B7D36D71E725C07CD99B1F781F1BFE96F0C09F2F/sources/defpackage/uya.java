package defpackage;
/* compiled from: PG */
/* renamed from: uya  reason: default package */
/* loaded from: classes4.dex */
public final class uya {
    public uyj a;
    public Boolean b;
    public ampq c;
    public int d;
    private Integer e;

    public uya() {
    }

    public uya(byte[] bArr) {
        this.c = amon.a;
    }

    public final void b(int i) {
        this.e = Integer.valueOf(i);
    }

    public final void c(boolean z) {
        this.d = true != z ? 2 : 3;
    }

    public final uyb a() {
        Integer num;
        int i = this.d;
        if (i == 0 || (num = this.e) == null || this.b == null) {
            StringBuilder sb = new StringBuilder();
            if (this.d == 0) {
                sb.append(" enablement");
            }
            if (this.e == null) {
                sb.append(" batchSize");
            }
            if (this.b == null) {
                sb.append(" enableUrlAutoSanitization");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        uyb uybVar = new uyb(i, num.intValue(), this.a, this.b.booleanValue(), this.c);
        boolean z = true;
        if (uybVar.b != null && uybVar.c) {
            z = false;
        }
        aqxo.q(z, "only one of auto url auto sanitization and custom url sanitizer can be enabled.");
        return uybVar;
    }
}
