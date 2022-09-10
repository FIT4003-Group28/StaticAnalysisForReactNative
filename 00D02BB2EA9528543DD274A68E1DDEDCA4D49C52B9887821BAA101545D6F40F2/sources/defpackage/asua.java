package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: asua  reason: default package */
/* loaded from: classes2.dex */
public class asua implements asuw {
    public final astz a;
    private final Resources b;
    private final long c;

    public asua(Resources resources, astz astzVar, long j) {
        dbsk.t(resources, "resources");
        this.b = resources;
        dbsk.s(astzVar);
        this.a = astzVar;
        this.c = j;
    }

    @Override // defpackage.asuw
    public String a() {
        return this.b.getString(R.string.DA_CONFIRM_STOP_TEXT);
    }

    @Override // defpackage.asuw
    @dzsi
    public String b() {
        return null;
    }

    @Override // defpackage.asuw
    public Boolean c() {
        return false;
    }

    @Override // defpackage.asuw
    @dzsi
    public String d() {
        return null;
    }

    @Override // defpackage.asuw
    public String e() {
        return this.b.getString(R.string.NO_BUTTON);
    }

    @Override // defpackage.asuw
    public cqkl f() {
        this.a.a();
        return cqkl.a;
    }

    @Override // defpackage.asuw
    public jdu g() {
        return new jdu(this) { // from class: asty
            private final asua a;

            {
                this.a = this;
            }

            @Override // defpackage.jdu
            public final void a() {
                this.a.a.a();
            }
        };
    }

    @Override // defpackage.asuw
    public Boolean h() {
        return true;
    }

    @Override // defpackage.asuw
    public String i() {
        return this.b.getString(R.string.YES_BUTTON);
    }

    @Override // defpackage.asuw
    public cqkl j() {
        asmf asmfVar = (asmf) this.a;
        asmg asmgVar = asmfVar.a;
        if (asmgVar.aD) {
            asmgVar.b.run();
            asmfVar.a.aT();
        }
        return cqkl.a;
    }

    @Override // defpackage.asuw
    public Long k() {
        return Long.valueOf(this.c);
    }

    @Override // defpackage.asuw
    @dzsi
    public cjtd l() {
        return null;
    }

    @Override // defpackage.asuw
    public cjtd m() {
        return cjtd.a(dtxw.aC);
    }

    @Override // defpackage.asuw
    public cjtd n() {
        return cjtd.a(dtxw.aD);
    }
}
