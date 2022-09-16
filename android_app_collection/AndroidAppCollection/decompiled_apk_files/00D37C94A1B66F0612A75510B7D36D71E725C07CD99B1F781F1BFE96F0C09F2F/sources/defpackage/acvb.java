package defpackage;
/* compiled from: PG */
/* renamed from: acvb  reason: default package */
/* loaded from: classes.dex */
public final class acvb implements acvg {
    private final acvh a;
    private final snc b;
    private final asny c;
    private final acva d;
    private final String e;
    private ampq f;
    private boolean g = false;
    private boolean h;
    private long i;

    public acvb(acvh acvhVar, snc sncVar, asny asnyVar, String str, ampq ampqVar, boolean z) {
        this.a = acvhVar;
        this.b = sncVar;
        this.c = asnyVar;
        this.e = str;
        this.f = ampqVar;
        this.h = false;
        acva acvaVar = new acva(z, str);
        this.d = acvaVar;
        if (acvaVar.a) {
            String valueOf = String.valueOf(asnyVar.name());
            acvaVar.b(valueOf.length() != 0 ? "constructor ".concat(valueOf) : new String("constructor "));
        }
        if (this.g) {
            aopa createBuilder = asno.a.createBuilder();
            createBuilder.copyOnWrite();
            asno asnoVar = (asno) createBuilder.instance;
            asnoVar.d = asnyVar.bL;
            asnoVar.b |= 1;
            a((asno) createBuilder.mo39build());
            this.h = true;
        }
        if (ampqVar.h()) {
            String str2 = (String) ampqVar.c();
            if (this.f.h()) {
                ((String) this.f.c()).equals(str2);
            }
            this.f = ampq.j(str2);
            aopa createBuilder2 = asno.a.createBuilder();
            createBuilder2.copyOnWrite();
            asno asnoVar2 = (asno) createBuilder2.instance;
            str.getClass();
            asnoVar2.b |= 2;
            asnoVar2.e = str;
            createBuilder2.copyOnWrite();
            asno asnoVar3 = (asno) createBuilder2.instance;
            asnoVar3.d = asnyVar.bL;
            asnoVar3.b |= 1;
            createBuilder2.copyOnWrite();
            asno asnoVar4 = (asno) createBuilder2.instance;
            asnoVar4.b |= 4;
            asnoVar4.f = str2;
            acvhVar.e((asno) createBuilder2.mo39build());
            if (!acvaVar.a) {
                return;
            }
            acvaVar.b(str2.length() != 0 ? "logClientScreenNonce ".concat(str2) : new String("logClientScreenNonce "));
        }
    }

    @Override // defpackage.acvg
    public final void a(asno asnoVar) {
        if (asnoVar == null) {
            return;
        }
        acvh acvhVar = this.a;
        aopa mo52toBuilder = asnoVar.mo52toBuilder();
        String str = this.e;
        mo52toBuilder.copyOnWrite();
        asno asnoVar2 = (asno) mo52toBuilder.instance;
        str.getClass();
        asnoVar2.b |= 2;
        asnoVar2.e = str;
        acvhVar.e((asno) mo52toBuilder.mo39build());
        acva acvaVar = this.d;
        asny asnyVar = this.c;
        if (!acvaVar.a) {
            return;
        }
        String name = asnyVar.name();
        String a = acva.a(asnoVar);
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 20 + String.valueOf(a).length());
        sb.append("logActionInfo ");
        sb.append(name);
        sb.append(" info ");
        sb.append(a);
        acvaVar.b(sb.toString());
    }

    public final void b(String str, long j) {
        this.a.j(str, this.e, j);
        acva acvaVar = this.d;
        long j2 = this.i;
        if (acvaVar.a) {
            StringBuilder sb = new StringBuilder(23);
            sb.append(j - j2);
            sb.append(" ms");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 9 + String.valueOf(sb2).length());
            sb3.append("logTick ");
            sb3.append(str);
            sb3.append(" ");
            sb3.append(sb2);
            acvaVar.b(sb3.toString());
        }
        if (!this.h) {
            aopa createBuilder = asno.a.createBuilder();
            asny asnyVar = this.c;
            createBuilder.copyOnWrite();
            asno asnoVar = (asno) createBuilder.instance;
            asnoVar.d = asnyVar.bL;
            asnoVar.b |= 1;
            a((asno) createBuilder.mo39build());
            this.h = true;
        }
    }

    @Override // defpackage.acvg
    public final void c(String str) {
        b(str, this.b.c());
    }

    @Override // defpackage.acvg
    public final void d(String str, long j) {
        b(str, j);
    }

    @Override // defpackage.acvg
    public final void e() {
        f(this.b.c());
    }

    @Override // defpackage.acvg
    public final void f(long j) {
        if (!this.g) {
            this.i = j;
            this.a.h(this.e, j);
            this.g = true;
            acva acvaVar = this.d;
            long j2 = this.i;
            if (acvaVar.a) {
                StringBuilder sb = new StringBuilder(32);
                sb.append("logBaseline ");
                sb.append(j2);
                acvaVar.b(sb.toString());
            }
            if (this.h) {
                return;
            }
            aopa createBuilder = asno.a.createBuilder();
            asny asnyVar = this.c;
            createBuilder.copyOnWrite();
            asno asnoVar = (asno) createBuilder.instance;
            asnoVar.d = asnyVar.bL;
            asnoVar.b |= 1;
            a((asno) createBuilder.mo39build());
            this.h = true;
            return;
        }
        this.d.b("Attempted to log multiple Baseline Ticks with a single ActionLogger while disallowing multiple Baselines");
    }
}
