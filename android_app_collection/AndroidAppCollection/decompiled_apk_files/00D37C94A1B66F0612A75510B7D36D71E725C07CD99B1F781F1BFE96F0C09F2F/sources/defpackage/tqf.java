package defpackage;
/* compiled from: PG */
/* renamed from: tqf  reason: default package */
/* loaded from: classes4.dex */
public final class tqf {
    public Boolean a;
    public ampq b;
    private Boolean c;
    private ampq d;
    private ampq e;

    public tqf() {
    }

    public tqf(byte[] bArr) {
        this.b = amon.a;
        this.d = amon.a;
        this.e = amon.a;
    }

    public final void b(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    public final tqg a() {
        Boolean bool = this.c;
        if (bool == null || this.a == null) {
            StringBuilder sb = new StringBuilder();
            if (this.c == null) {
                sb.append(" includeAllGroups");
            }
            if (this.a == null) {
                sb.append(" groupWithNoAccountOnly");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        tqg tqgVar = new tqg(bool.booleanValue(), this.a.booleanValue(), this.b, this.d, this.e);
        if (!tqgVar.a) {
            aqxo.q(tqgVar.c.h(), "Request must provide a group name or source to filter by");
        } else {
            aqxo.p(!tqgVar.c.h());
            aqxo.p(true);
            aqxo.p(true);
        }
        if (tqgVar.b) {
            aqxo.p(true);
        }
        return tqgVar;
    }
}
