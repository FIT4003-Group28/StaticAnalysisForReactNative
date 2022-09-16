package defpackage;
/* compiled from: PG */
/* renamed from: adwe  reason: default package */
/* loaded from: classes.dex */
public final class adwe {
    public CharSequence a;
    public CharSequence b;
    public avhn c;
    private Integer d;
    private Integer e;

    public adwe() {
    }

    public adwe(adwf adwfVar) {
        this.a = adwfVar.a;
        this.b = adwfVar.b;
        this.d = Integer.valueOf(adwfVar.c);
        this.e = Integer.valueOf(adwfVar.d);
        this.c = adwfVar.e;
    }

    public final void b(int i) {
        this.d = Integer.valueOf(i);
    }

    public final void c(int i) {
        this.e = Integer.valueOf(i);
    }

    public final adwf a() {
        Integer num = this.d;
        if (num == null || this.e == null) {
            StringBuilder sb = new StringBuilder();
            if (this.d == null) {
                sb.append(" adProgressMillis");
            }
            if (this.e == null) {
                sb.append(" skippableState");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new adwf(this.a, this.b, num.intValue(), this.e.intValue(), this.c);
    }
}
