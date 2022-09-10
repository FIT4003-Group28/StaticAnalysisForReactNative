package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ciya  reason: default package */
/* loaded from: classes4.dex */
public class ciya implements cixz {
    private final Activity a;
    private final chrx b;
    private final chvo c;

    public ciya(Activity activity, chrx chrxVar, chvo chvoVar) {
        this.a = activity;
        this.b = chrxVar;
        this.c = chvoVar;
    }

    @Override // defpackage.cixz
    public String b() {
        chvo chvoVar = this.c;
        int i = chvoVar.a;
        return (i & 2) == 0 ? (i & 4) != 0 ? this.a.getString(chvoVar.d) : "" : chvoVar.c;
    }

    @Override // defpackage.cixz
    public String c() {
        chvo chvoVar = this.c;
        int i = chvoVar.a;
        return (i & 8) == 0 ? (i & 16) != 0 ? this.a.getString(chvoVar.f) : "" : chvoVar.e;
    }

    @Override // defpackage.cixz
    public cjtd e() {
        cjta b = cjtd.b();
        if (!this.c.k.isEmpty()) {
            b.g(this.c.k);
        }
        int a = chvn.a(this.c.b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1) {
            b.d = dtyc.aI;
            return b.a();
        } else if (i == 2) {
            b.d = dtyd.bG;
            return b.a();
        } else if (i == 3) {
            b.d = dtyd.bH;
            return b.a();
        } else if (i != 4) {
            return cjtd.b;
        } else {
            b.d = dtyd.bn;
            return b.a();
        }
    }

    public boolean equals(@dzsi Object obj) {
        if (!(obj instanceof ciya)) {
            return false;
        }
        ciya ciyaVar = (ciya) obj;
        return dbsd.a(ciyaVar.a, this.a) && dbsd.a(ciyaVar.b, this.b) && dbsd.a(ciyaVar.c, this.c);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // defpackage.cixz
    public cqtd d() {
        chvo chvoVar = this.c;
        if ((chvoVar.a & 32) == 0) {
            return iup.e(R.raw.uncover_missing_info);
        }
        return iup.e(chvoVar.g);
    }

    @Override // defpackage.cixz
    public cqkl a() {
        int a = chvn.a(this.c.b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1) {
            this.b.p(this.c.h);
        } else if (i == 2) {
            this.b.v(this.c.i);
        } else if (i == 3) {
            this.b.w(this.c.j);
        } else if (i == 4) {
            this.b.q();
        }
        return cqkl.a;
    }
}
