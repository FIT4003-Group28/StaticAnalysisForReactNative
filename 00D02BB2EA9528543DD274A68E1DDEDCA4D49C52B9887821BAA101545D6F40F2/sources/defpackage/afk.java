package defpackage;
/* compiled from: PG */
/* renamed from: afk  reason: default package */
/* loaded from: classes.dex */
public final class afk {
    public final aim<acl, afj> a = new aim<>();
    public final aik<acl> b = new aik<>();

    public final void a() {
        this.a.clear();
        this.b.i();
    }

    public final void b(acl aclVar, abm abmVar) {
        afj afjVar = this.a.get(aclVar);
        if (afjVar == null) {
            afjVar = afj.a();
            this.a.put(aclVar, afjVar);
        }
        afjVar.b = abmVar;
        afjVar.a |= 4;
    }

    public final boolean c(acl aclVar) {
        afj afjVar = this.a.get(aclVar);
        return (afjVar == null || (afjVar.a & 1) == 0) ? false : true;
    }

    public final abm d(acl aclVar, int i) {
        afj j;
        abm abmVar;
        int g = this.a.g(aclVar);
        if (g >= 0 && (j = this.a.j(g)) != null) {
            int i2 = j.a;
            if ((i2 & i) != 0) {
                int i3 = (i ^ (-1)) & i2;
                j.a = i3;
                if (i == 4) {
                    abmVar = j.b;
                } else if (i == 8) {
                    abmVar = j.c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.a.m(g);
                    afj.b(j);
                }
                return abmVar;
            }
        }
        return null;
    }

    public final void e(long j, acl aclVar) {
        this.b.d(j, aclVar);
    }

    public final void f(acl aclVar, abm abmVar) {
        afj afjVar = this.a.get(aclVar);
        if (afjVar == null) {
            afjVar = afj.a();
            this.a.put(aclVar, afjVar);
        }
        afjVar.c = abmVar;
        afjVar.a |= 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(acl aclVar) {
        afj afjVar = this.a.get(aclVar);
        if (afjVar == null) {
            afjVar = afj.a();
            this.a.put(aclVar, afjVar);
        }
        afjVar.a |= 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(acl aclVar) {
        afj afjVar = this.a.get(aclVar);
        if (afjVar == null) {
            return;
        }
        afjVar.a &= -2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(acl aclVar) {
        int e = this.b.e();
        while (true) {
            e--;
            if (e < 0) {
                break;
            } else if (aclVar == this.b.g(e)) {
                aik<acl> aikVar = this.b;
                if (aikVar.d[e] != aik.a) {
                    aikVar.d[e] = aik.a;
                    aikVar.b = true;
                }
            }
        }
        afj remove = this.a.remove(aclVar);
        if (remove != null) {
            afj.b(remove);
        }
    }
}
