package defpackage;
/* compiled from: PG */
/* renamed from: aajn  reason: default package */
/* loaded from: classes.dex */
public final class aajn {
    public aajj a;
    public aajj b;
    private String c;
    private aajk d;
    private aajk e;
    private aajo f;

    public final aajp a() {
        aajk aajkVar;
        aajk aajkVar2;
        aajo aajoVar;
        aajk aajkVar3 = this.d;
        if (!(aajkVar3 == null ? amon.a : ampq.j(aajkVar3)).h()) {
            d(aajk.a);
        }
        aajk aajkVar4 = this.e;
        if (!(aajkVar4 == null ? amon.a : ampq.j(aajkVar4)).h()) {
            b(aajk.a);
        }
        aajo aajoVar2 = this.f;
        if (!(aajoVar2 == null ? amon.a : ampq.j(aajoVar2)).h()) {
            e(aajo.UNKNOWN);
        }
        String str = this.c;
        if (str == null || (aajkVar = this.d) == null || (aajkVar2 = this.e) == null || (aajoVar = this.f) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.c == null) {
                sb.append(" entityKey");
            }
            if (this.d == null) {
                sb.append(" previousMetadata");
            }
            if (this.e == null) {
                sb.append(" currentMetadata");
            }
            if (this.f == null) {
                sb.append(" reason");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        aajp aajpVar = new aajp(str, this.a, this.b, aajkVar, aajkVar2, aajoVar);
        aajj aajjVar = aajpVar.c;
        aajj aajjVar2 = aajpVar.b;
        if (aajjVar2 != null && aajjVar != null) {
            aqxo.z(aajjVar2.getClass().equals(aajjVar.getClass()), "Both current and previous entity should be of the same Entity type");
            aqxo.z(aajjVar2.d().equals(aajjVar.d()), "Both previous and current entities must have the same key");
        }
        if (aajjVar2 != null || aajjVar != null) {
            boolean z = true;
            if ((aajjVar2 == null || !aajpVar.a.equals(aajjVar2.d())) && (aajjVar == null || !aajpVar.a.equals(aajjVar.d()))) {
                z = false;
            }
            aqxo.z(z, "The update's entityKey must match the current or previous entity's key (or both)");
        }
        return aajpVar;
    }

    public final void b(aajk aajkVar) {
        if (aajkVar != null) {
            this.e = aajkVar;
            return;
        }
        throw new NullPointerException("Null currentMetadata");
    }

    public final void c(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null entityKey");
    }

    public final void d(aajk aajkVar) {
        if (aajkVar != null) {
            this.d = aajkVar;
            return;
        }
        throw new NullPointerException("Null previousMetadata");
    }

    public final void e(aajo aajoVar) {
        if (aajoVar != null) {
            this.f = aajoVar;
            return;
        }
        throw new NullPointerException("Null reason");
    }
}
