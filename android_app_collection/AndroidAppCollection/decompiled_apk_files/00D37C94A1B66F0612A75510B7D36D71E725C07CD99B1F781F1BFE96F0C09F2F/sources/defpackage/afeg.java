package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afeg  reason: default package */
/* loaded from: classes.dex */
public final class afeg extends afec {
    final /* synthetic */ afeh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afeg(afeh afehVar, aetv aetvVar) {
        super(aetvVar);
        this.a = afehVar;
    }

    @Override // defpackage.afec
    public final void A(long j) {
        if (this.a.k.v()) {
            afeh afehVar = this.a;
            String c = afjt.c();
            StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 42);
            sb.append("onFallbackTransition.");
            sb.append(j);
            sb.append(".");
            sb.append(c);
            afehVar.u(sb.toString());
        }
        super.y(j);
    }

    @Override // defpackage.aesu, defpackage.aeuo
    public final void f() {
        ylr.c();
        if (this.a.k.v()) {
            afeh afehVar = this.a;
            String valueOf = String.valueOf(afjt.c());
            afehVar.u(valueOf.length() != 0 ? "onEnded.".concat(valueOf) : new String("onEnded."));
        }
        super.f();
        this.a.m = false;
        this.a.b.post(new afef(this, 1));
    }

    @Override // defpackage.aesu, defpackage.aeuo
    public final void g(afkn afknVar) {
        ylr.c();
        if (this.a.k.v()) {
            afeh afehVar = this.a;
            String str = "0";
            String str2 = true != afknVar.n() ? str : "1";
            if (true == afknVar.u()) {
                str = "1";
            }
            String c = afjt.c();
            StringBuilder sb = new StringBuilder(str2.length() + 10 + str.length() + String.valueOf(c).length());
            sb.append("onError.");
            sb.append(str2);
            sb.append(".");
            sb.append(str);
            sb.append(".");
            sb.append(c);
            afehVar.u(sb.toString());
        }
        if (afknVar.n()) {
            this.a.E();
        } else if (afknVar.u()) {
            afeh afehVar2 = this.a;
            afehVar2.d.addAll(0, afehVar2.c);
            if (!this.a.c.isEmpty() && ((afgf) this.a.c.get(0)).a != -1) {
                this.a.h = true;
            }
            this.a.c.clear();
            afeh afehVar3 = this.a;
            if (afehVar3.h) {
                afehVar3.b.post(new afef(this));
            }
        }
        super.g(afknVar);
    }

    @Override // defpackage.aesu, defpackage.aeuo
    public final void j(afte afteVar) {
        afeh afehVar = this.a;
        afee afeeVar = afehVar.j;
        if (afeeVar != null) {
            afte afteVar2 = afehVar.i;
            boolean z = false;
            if (afteVar2 != null && !afteVar.equals(afteVar2)) {
                z = true;
            }
            afee.a(z, afeeVar.a, afeeVar.c);
            afee.a(z, afeeVar.b, afeeVar.d);
            this.a.j = null;
        }
        afeh afehVar2 = this.a;
        afehVar2.i = afteVar;
        if (afehVar2.k.v()) {
            afeh afehVar3 = this.a;
            String valueOf = String.valueOf(afjt.c());
            afehVar3.u(valueOf.length() != 0 ? "onLoaded.".concat(valueOf) : new String("onLoaded."));
        }
        super.j(afteVar);
    }

    @Override // defpackage.aesu, defpackage.aeuo
    public final void q() {
        ylr.c();
        if (this.a.k.v()) {
            afeh afehVar = this.a;
            String valueOf = String.valueOf(afjt.c());
            afehVar.u(valueOf.length() != 0 ? "onPlaying.".concat(valueOf) : new String("onPlaying."));
        }
        super.q();
        this.a.m = false;
        this.a.b.post(new afef(this, 2));
    }

    @Override // defpackage.aesu, defpackage.aeuo
    public final void y(long j) {
        ylr.c();
        if (!this.a.c.isEmpty()) {
            if (this.a.k.v()) {
                afeh afehVar = this.a;
                String c = afjt.c();
                StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 34);
                sb.append("onTransition.");
                sb.append(j);
                sb.append(".");
                sb.append(c);
                afehVar.u(sb.toString());
            }
            super.y(j);
            afgf afgfVar = (afgf) this.a.c.remove(0);
            aetw aetwVar = this.a.e;
            String str = aetwVar != null ? aetwVar.d : null;
            String str2 = aetwVar != null ? aetwVar.b.c : null;
            afec afecVar = (afec) afgfVar.b.a();
            if (str != null) {
                afeh afehVar2 = this.a;
                afehVar2.j = new afee(afehVar2.f, afecVar, afgfVar, true, str, str2);
            }
            afeh afehVar3 = this.a;
            aetw aetwVar2 = afehVar3.e;
            if (aetwVar2 != null) {
                aetw aetwVar3 = afgfVar.b;
                aetwVar2.d = aetwVar3.d;
                aetwVar2.b = aetwVar3.b;
                aetwVar2.g = aetwVar3.a();
            } else {
                afehVar3.e = new aetw(afgfVar.b);
            }
            afeh afehVar4 = this.a;
            afehVar4.g = afehVar4.e.a;
            afehVar4.f = afecVar;
            afehVar4.b.post(new afea(afehVar4, 2));
            return;
        }
        super.g(new afkn("player.fatalexception", this.a.g(), "onTransition without queued video"));
        this.a.F(false);
    }
}
