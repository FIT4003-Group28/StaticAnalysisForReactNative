package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bxyp  reason: default package */
/* loaded from: classes4.dex */
public final class bxyp {
    public final Activity a;
    public final cqat b;

    public bxyp(Activity activity, cqat cqatVar) {
        this.a = activity;
        this.b = cqatVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final cjtd c(ddey ddeyVar, bxyn bxynVar) {
        ddho ddhoVar;
        byeb byebVar = byeb.PERMANENTLY_CLOSED;
        bxym bxymVar = bxym.INITIAL_PAGE;
        int ordinal = bxynVar.d().ordinal();
        if (ordinal == 0) {
            ddhoVar = dtyb.cp;
        } else if (ordinal == 1) {
            ddhoVar = dtyb.cm;
        } else if (ordinal == 2) {
            String valueOf = String.valueOf(bxynVar.d());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
            sb.append("(gmm-suggest-nyc) Invalid page type: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        } else {
            ddhoVar = null;
        }
        dbsk.s(ddhoVar);
        cjta b = cjtd.b();
        b.d = ddhoVar;
        ddes bZ = ddet.D.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddet ddetVar = (ddet) bZ.b;
        ddfb bK = ddeyVar.bK();
        bK.getClass();
        ddetVar.v = bK;
        ddetVar.a |= 33554432;
        b.s(bZ.bK());
        return b.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ddey a(bxyn bxynVar) {
        ddey bZ = ddfb.g.bZ();
        int a = bxynVar.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddfb ddfbVar = (ddfb) bZ.b;
        ddfbVar.a |= 4;
        ddfbVar.d = a;
        int c = bxyt.c(bxynVar.b(), bvtb.s(this.b.b()));
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddfb ddfbVar2 = (ddfb) bZ.b;
        ddfbVar2.a |= 16;
        ddfbVar2.e = c;
        return bZ;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final jau b(bxyn bxynVar) {
        if (bxynVar.c() != null) {
            return new bxyo(this, bxynVar);
        }
        return null;
    }
}
