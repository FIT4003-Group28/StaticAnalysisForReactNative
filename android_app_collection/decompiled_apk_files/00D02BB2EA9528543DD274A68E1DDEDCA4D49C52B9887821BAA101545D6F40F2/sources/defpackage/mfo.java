package defpackage;

import android.content.res.Configuration;
import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: mfo  reason: default package */
/* loaded from: classes7.dex */
public final class mfo implements auff, btph {
    @dzsi
    private aufc b;
    private boolean c = false;
    public boolean a = false;
    @dzsi
    private Configuration d = null;

    private final void i(bvqg<String> bvqgVar) {
        int hashCode = hashCode();
        StringBuilder sb = new StringBuilder(35);
        sb.append("CarNightModeResolver: (");
        sb.append(hashCode);
        sb.append(")");
        bvqgVar.NU(sb.toString());
        Configuration configuration = this.d;
        String valueOf = String.valueOf(configuration == null ? null : Integer.valueOf(configuration.uiMode));
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb2.append("  configuration.uiMode: ");
        sb2.append(valueOf);
        bvqgVar.NU(sb2.toString());
        boolean z = this.c;
        StringBuilder sb3 = new StringBuilder(22);
        sb3.append("  uiModeIsNight: ");
        sb3.append(z);
        bvqgVar.NU(sb3.toString());
        boolean z2 = this.a;
        StringBuilder sb4 = new StringBuilder(26);
        sb4.append("  oemWantsNightMode: ");
        sb4.append(z2);
        bvqgVar.NU(sb4.toString());
    }

    @Override // defpackage.btph
    public final void NX(final String str, final PrintWriter printWriter) {
        i(new bvqg(printWriter, str) { // from class: mfm
            private final PrintWriter a;
            private final String b;

            {
                this.a = printWriter;
                this.b = str;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                PrintWriter printWriter2 = this.a;
                String str2 = this.b;
                String str3 = (String) obj;
                StringBuilder sb = new StringBuilder(str2.length() + 1 + String.valueOf(str3).length());
                sb.append(str2);
                sb.append(str3);
                sb.append('\n');
                printWriter2.print(sb.toString());
            }
        });
    }

    @Override // defpackage.auff
    public final void a(aufc aufcVar) {
        dbsk.t(this.d, "Configuration must be initialized before starting.");
        this.b = aufcVar;
        g();
    }

    @Override // defpackage.auff
    public final void b() {
        this.b = null;
    }

    @Override // defpackage.auff
    public final boolean d() {
        return this.c || this.a;
    }

    @Override // defpackage.auff
    public final boolean e() {
        return true;
    }

    public final void f(Configuration configuration) {
        h();
        this.d = configuration;
        boolean z = (configuration.uiMode & 48) == 32;
        if (this.c != z) {
            this.c = z;
            g();
        }
        h();
    }

    public final void g() {
        aufc aufcVar = this.b;
        if (aufcVar != null) {
            aufcVar.g();
            h();
            return;
        }
        h();
    }

    public final void h() {
        final StringBuilder sb = new StringBuilder();
        i(new bvqg(sb) { // from class: mfn
            private final StringBuilder a;

            {
                this.a = sb;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                StringBuilder sb2 = this.a;
                sb2.append((String) obj);
                sb2.append("; ");
            }
        });
        sb.toString();
    }
}
