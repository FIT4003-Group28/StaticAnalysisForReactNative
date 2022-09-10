package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: easc  reason: default package */
/* loaded from: classes6.dex */
public final class easc {
    private static easc a;
    private final ease b = new ease(new easb[]{easl.a, easp.a, easa.a, easf.a, eash.a, easi.a});
    private final ease c = new ease(new easb[]{easn.a, easl.a, easp.a, easa.a, easf.a, eash.a, easi.a});
    private final ease d = new ease(new easb[]{eask.a, easm.a, easp.a, eash.a, easi.a});
    private final ease e = new ease(new easb[]{eask.a, easo.a, easm.a, easp.a, easi.a});
    private final ease f = new ease(new easb[]{easm.a, easp.a, easi.a});

    protected easc() {
    }

    public static easc a() {
        if (a == null) {
            a = new easc();
        }
        return a;
    }

    public final easg b(Object obj) {
        easg easgVar = (easg) this.b.a(obj == null ? null : obj.getClass());
        if (easgVar != null) {
            return easgVar;
        }
        String valueOf = String.valueOf(obj == null ? "null" : obj.getClass().getName());
        throw new IllegalArgumentException(valueOf.length() != 0 ? "No instant converter found for type: ".concat(valueOf) : new String("No instant converter found for type: "));
    }

    public final easj c(Object obj) {
        easj easjVar = (easj) this.c.a(obj == null ? null : obj.getClass());
        if (easjVar != null) {
            return easjVar;
        }
        String valueOf = String.valueOf(obj == null ? "null" : obj.getClass().getName());
        throw new IllegalArgumentException(valueOf.length() != 0 ? "No partial converter found for type: ".concat(valueOf) : new String("No partial converter found for type: "));
    }

    public final String toString() {
        int b = this.b.b();
        int b2 = this.c.b();
        int b3 = this.d.b();
        int b4 = this.e.b();
        int b5 = this.f.b();
        StringBuilder sb = new StringBuilder((int) R.styleable.AppCompatTheme_windowActionBarOverlay);
        sb.append("ConverterManager[");
        sb.append(b);
        sb.append(" instant,");
        sb.append(b2);
        sb.append(" partial,");
        sb.append(b3);
        sb.append(" duration,");
        sb.append(b4);
        sb.append(" period,");
        sb.append(b5);
        sb.append(" interval]");
        return sb.toString();
    }
}
