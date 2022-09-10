package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cdqd  reason: default package */
/* loaded from: classes4.dex */
public final class cdqd extends cdqa {
    private volatile transient dbsg<cdjd> a;
    private volatile transient dbsg<cdjd> b;

    public cdqd(bvrt<dmau> bvrtVar) {
        super(bvrtVar);
    }

    @Override // defpackage.cdqs
    public final dbsg<cdjd> b() {
        dbsg<cdjd> dbsgVar;
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    dmbw dmbwVar = super.d().b;
                    if (dmbwVar == null) {
                        dmbwVar = dmbw.d;
                    }
                    if ((dmbwVar.a & 1) != 0) {
                        dmbw dmbwVar2 = super.d().b;
                        if (dmbwVar2 == null) {
                            dmbwVar2 = dmbw.d;
                        }
                        dmbc dmbcVar = dmbwVar2.b;
                        if (dmbcVar == null) {
                            dmbcVar = dmbc.h;
                        }
                        dbsgVar = dbsg.i(new cdsa(dmbcVar));
                    } else {
                        dbsgVar = dbpy.a;
                    }
                    this.a = dbsgVar;
                    if (this.a == null) {
                        throw new NullPointerException("publishedPost() cannot return null");
                    }
                }
            }
        }
        return this.a;
    }

    @Override // defpackage.cdqs
    public final dbsg<cdjd> c() {
        dbsg<cdjd> dbsgVar;
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    dmbw dmbwVar = super.d().b;
                    if (dmbwVar == null) {
                        dmbwVar = dmbw.d;
                    }
                    if ((dmbwVar.a & 2) != 0) {
                        dmbw dmbwVar2 = super.d().b;
                        if (dmbwVar2 == null) {
                            dmbwVar2 = dmbw.d;
                        }
                        dmbc dmbcVar = dmbwVar2.c;
                        if (dmbcVar == null) {
                            dmbcVar = dmbc.h;
                        }
                        dbsgVar = dbsg.i(new cdsa(dmbcVar));
                    } else {
                        dbsgVar = dbpy.a;
                    }
                    this.b = dbsgVar;
                    if (this.b == null) {
                        throw new NullPointerException("draftPost() cannot return null");
                    }
                }
            }
        }
        return this.b;
    }
}
