package defpackage;

import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: aueu  reason: default package */
/* loaded from: classes.dex */
public final class aueu implements aufc {
    public final dbsg<btsa> a;
    public boolean b;
    private final crzo<aufa> c;
    private final crzo<aufb> d;
    private auff e;

    public aueu(bvjj bvjjVar, crzo<aufb> crzoVar, @dzsi btsa btsaVar) {
        crzo<aufa> crzoVar2 = new crzo<>(aufa.AUTO);
        this.c = crzoVar2;
        crzoVar2.b((aufa) bvjjVar.H(bvjk.aS, aufa.class, aufa.AUTO));
        this.e = new auet(h() == aufa.FORCE_NIGHT);
        this.d = crzoVar;
        this.a = dbsg.j(btsaVar);
    }

    private final void j(auff auffVar) {
        this.e.b();
        this.e = auffVar;
        auffVar.a(this);
        g();
    }

    private final void k(bvqg<String> bvqgVar) {
        String str;
        bvqgVar.NU("NightModeController:");
        String valueOf = String.valueOf(h());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("  getForceNightMode(): ");
        sb.append(valueOf);
        bvqgVar.NU(sb.toString());
        boolean e = this.e.e();
        StringBuilder sb2 = new StringBuilder(44);
        sb2.append("  nightModeResolver.allowsNightMode(): ");
        sb2.append(e);
        bvqgVar.NU(sb2.toString());
        boolean d = this.e.d();
        StringBuilder sb3 = new StringBuilder(40);
        sb3.append("  nightModeResolver.isNightMode(): ");
        sb3.append(d);
        bvqgVar.NU(sb3.toString());
        auff auffVar = this.e;
        if (!(auffVar instanceof auet)) {
            int hashCode = auffVar.hashCode();
            StringBuilder sb4 = new StringBuilder(17);
            sb4.append("yes (");
            sb4.append(hashCode);
            sb4.append(")");
            str = sb4.toString();
        } else {
            str = "no";
        }
        String valueOf2 = String.valueOf(str);
        bvqgVar.NU(valueOf2.length() != 0 ? "  resolver set: ".concat(valueOf2) : new String("  resolver set: "));
        dbsg<btsa> dbsgVar = this.a;
        StringBuilder sb5 = new StringBuilder(21);
        sb5.append("  isRegistered: ");
        sb5.append(dbsgVar.a());
        bvqgVar.NU(sb5.toString());
    }

    private final void l() {
        final StringBuilder sb = new StringBuilder();
        k(new bvqg(sb) { // from class: aues
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

    @Override // defpackage.btph
    public final void NX(final String str, final PrintWriter printWriter) {
        k(new bvqg(printWriter, str) { // from class: auer
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

    @Override // defpackage.aufc
    public final void a() {
        if (this.b) {
            bvor.a(this.a, new mw(this) { // from class: aueq
                private final aueu a;

                {
                    this.a = this;
                }

                @Override // defpackage.mw
                public final void a(Object obj) {
                    aueu aueuVar = this.a;
                    aueuVar.i().c(((btsa) obj).a);
                    aueuVar.b = false;
                }
            });
        }
        j(new auet(this.e.d()));
    }

    @Override // defpackage.aufe
    public final boolean b() {
        if (!this.e.e()) {
            return false;
        }
        return f();
    }

    @Override // defpackage.aufc
    public final void d(auff auffVar) {
        l();
        if (auffVar == this.e) {
            return;
        }
        j(auffVar);
        l();
    }

    @Override // defpackage.aufc
    public final void e(aufa aufaVar) {
        if (h() == aufaVar) {
            return;
        }
        this.c.b(aufaVar);
        g();
    }

    @Override // defpackage.aufc
    public final boolean f() {
        aufa aufaVar = aufa.AUTO;
        int ordinal = h().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return false;
            }
            if (ordinal == 2) {
                return true;
            }
            String valueOf = String.valueOf(h());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
            sb.append("Unknown state: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
        return this.e.d();
    }

    @Override // defpackage.aufc
    public final void g() {
        aufb aufbVar = b() ? aufb.NIGHT : aufb.DAY;
        crzo<aufb> crzoVar = this.d;
        if (crzoVar != null) {
            crzoVar.b(aufbVar);
        }
    }

    final aufa h() {
        return this.c.a.l();
    }

    @Override // defpackage.aufc
    public final crzm<aufb> i() {
        return this.d.a;
    }
}
