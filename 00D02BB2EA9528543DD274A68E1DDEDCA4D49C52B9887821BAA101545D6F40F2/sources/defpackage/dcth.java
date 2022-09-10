package defpackage;

import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: dcth  reason: default package */
/* loaded from: classes.dex */
public final class dcth extends dcsh {
    private final dctf a;
    private final dctn b;
    private final dctg c;
    private final dcsg d;

    public dcth() {
        dctf dctfVar = (dctf) dcum.a("flogger.backend_factory", dctf.class);
        this.a = dctfVar == null ? dcti.a : dctfVar;
        dctn dctnVar = (dctn) dcum.a("flogger.logging_context", dctn.class);
        this.b = dctnVar == null ? dcse.a : dctnVar;
        dctg dctgVar = (dctg) dcum.a("flogger.clock", dctg.class);
        this.c = dctgVar == null ? dctm.a : dctgVar;
        this.d = dctl.a;
    }

    @Override // defpackage.dcsh
    protected final dcsg b() {
        return this.d;
    }

    @Override // defpackage.dcsh
    protected final dcrl d(String str) {
        return this.a.a(str);
    }

    @Override // defpackage.dcsh
    protected final dctn f() {
        return this.b;
    }

    @Override // defpackage.dcsh
    protected final boolean h(String str, Level level, boolean z) {
        return false;
    }

    @Override // defpackage.dcsh
    protected final dctw j() {
        return dctw.b;
    }

    @Override // defpackage.dcsh
    protected final long m() {
        return this.c.a();
    }

    @Override // defpackage.dcsh
    protected final String o() {
        String name = getClass().getName();
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.b);
        String valueOf4 = String.valueOf(this.d);
        int length = String.valueOf(name).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 71 + length2 + length3 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("Platform: ");
        sb.append(name);
        sb.append("\nBackendFactory: ");
        sb.append(valueOf);
        sb.append("\nClock: ");
        sb.append(valueOf2);
        sb.append("\nLoggingContext: ");
        sb.append(valueOf3);
        sb.append("\nLogCallerFinder: ");
        sb.append(valueOf4);
        sb.append("\n");
        return sb.toString();
    }
}
