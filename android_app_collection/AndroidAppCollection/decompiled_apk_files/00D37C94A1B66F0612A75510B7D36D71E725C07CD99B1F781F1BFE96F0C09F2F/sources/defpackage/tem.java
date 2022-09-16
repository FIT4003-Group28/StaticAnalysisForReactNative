package defpackage;
/* compiled from: PG */
/* renamed from: tem  reason: default package */
/* loaded from: classes4.dex */
public final class tem {
    public Integer a;
    public Boolean b;
    public Boolean c;
    private Float d;
    private Boolean e;

    public tem() {
    }

    public tem(ten tenVar) {
        this.a = Integer.valueOf(tenVar.a);
        this.d = Float.valueOf(tenVar.b);
        this.b = Boolean.valueOf(tenVar.c);
        this.c = Boolean.valueOf(tenVar.d);
        this.e = Boolean.valueOf(tenVar.e);
    }

    public final void b(float f) {
        this.d = Float.valueOf(f);
    }

    public final void c(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    public final ten a() {
        Integer num = this.a;
        if (num == null || this.d == null || this.b == null || this.c == null || this.e == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" initRangeSize");
            }
            if (this.d == null) {
                sb.append(" rangeRatio");
            }
            if (this.b == null) {
                sb.append(" computeRangeOnSyncLayout");
            }
            if (this.c == null) {
                sb.append(" recyclerViewItemPrefetch");
            }
            if (this.e == null) {
                sb.append(" useLegacyVisible");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new ten(num.intValue(), this.d.floatValue(), this.b.booleanValue(), this.c.booleanValue(), this.e.booleanValue());
    }
}
