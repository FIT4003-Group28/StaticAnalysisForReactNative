package defpackage;

import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import java.util.List;
/* compiled from: PG */
/* renamed from: cvnm  reason: default package */
/* loaded from: classes5.dex */
public final class cvnm implements cvmv {
    public final Context a;
    public final cvjs b;
    public final cvmk c;
    private final cvnj d;

    public cvnm(Context context, cvjs cvjsVar, cvmk cvmkVar, cvnj cvnjVar) {
        this.a = context;
        this.b = cvjsVar;
        this.c = cvmkVar;
        this.d = cvnjVar;
    }

    public static long c(Context context) {
        return ((UserManager) context.getSystemService("user")).getSerialNumberForUser(Process.myUserHandle());
    }

    public static long d(Context context) {
        long j = -1;
        try {
            long g = cpke.g(context.getContentResolver(), -1L);
            if (g != -1) {
                return g;
            }
            try {
                cvlw.d("TargetCreatorHelperImpl", "Failed to get android ID.", new Object[0]);
                return g;
            } catch (SecurityException unused) {
                j = g;
                cvlw.e("TargetCreatorHelperImpl", "Exception reading GServices key.", new Object[0]);
                return j;
            }
        } catch (SecurityException unused2) {
        }
    }

    @Override // defpackage.cvmv
    public final dsay a() {
        drxy bZ = drxz.f.bZ();
        String packageName = this.a.getApplicationContext().getPackageName();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drxz drxzVar = (drxz) bZ.b;
        packageName.getClass();
        drxzVar.a |= 8;
        drxzVar.d = packageName;
        String a = this.c.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drxz drxzVar2 = (drxz) bZ.b;
        a.getClass();
        drxzVar2.a |= 1;
        drxzVar2.b = a;
        long d = d(this.a);
        if (d != -1) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            drxz drxzVar3 = (drxz) bZ.b;
            drxzVar3.a |= 4;
            drxzVar3.c = d;
        }
        long c = c(this.a);
        if (c != -1) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            drxz drxzVar4 = (drxz) bZ.b;
            drxzVar4.a |= 16;
            drxzVar4.e = c;
        }
        dsax bZ2 = dsay.d.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dsay dsayVar = (dsay) bZ2.b;
        dsayVar.b = 3;
        dsayVar.a |= 1;
        drxr bZ3 = drxs.c.bZ();
        drxz bK = bZ.bK();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        drxs drxsVar = (drxs) bZ3.b;
        bK.getClass();
        drxsVar.b = bK;
        drxsVar.a = 1;
        drxs bK2 = bZ3.bK();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dsay dsayVar2 = (dsay) bZ2.b;
        bK2.getClass();
        dsayVar2.c = bK2;
        dsayVar2.a |= 2;
        return bZ2.bK();
    }

    @Override // defpackage.cvmv
    public final dsba b(String str) {
        dsaz bZ = dsba.f.bZ();
        String packageName = this.a.getApplicationContext().getPackageName();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dsba dsbaVar = (dsba) bZ.b;
        packageName.getClass();
        dsbaVar.a |= 4;
        dsbaVar.d = packageName;
        dsay a = a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dsba dsbaVar2 = (dsba) bZ.b;
        a.getClass();
        dsbaVar2.c = a;
        dsbaVar2.b = 1;
        List<String> a2 = this.d.a();
        if (a2 != null && !a2.isEmpty()) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dsba dsbaVar3 = (dsba) bZ.b;
            dsrj<String> dsrjVar = dsbaVar3.e;
            if (!dsrjVar.a()) {
                dsbaVar3.e = dsqw.cl(dsrjVar);
            }
            dsod.bv(a2, dsbaVar3.e);
        }
        return bZ.bK();
    }
}
