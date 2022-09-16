package defpackage;
/* compiled from: PG */
/* renamed from: aijt  reason: default package */
/* loaded from: classes.dex */
public final class aijt {
    public int a;
    private Integer b;

    public final void b(int i) {
        this.b = Integer.valueOf(i);
    }

    public final aiju a() {
        Integer num;
        int i = this.a;
        if (i == 0 || (num = this.b) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == 0) {
                sb.append(" prefetchReason");
            }
            if (this.b == null) {
                sb.append(" playbackBeginsInSeconds");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new aiju(i, num.intValue());
    }
}
