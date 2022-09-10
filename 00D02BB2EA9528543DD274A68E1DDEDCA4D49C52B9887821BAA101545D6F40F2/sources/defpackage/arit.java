package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: arit  reason: default package */
/* loaded from: classes2.dex */
public class arit implements arje {
    public final dvcl a;
    private final arfm b;
    private dcdc<arjf> c = j(true);
    @dzsi
    private CharSequence d;

    public arit(Activity activity, arfm arfmVar, dvcl dvclVar) {
        this.b = arfmVar;
        this.a = dvclVar;
        int size = dvclVar.f.size() - this.c.size();
        this.d = size > 0 ? activity.getString(R.string.MY_MAPS_DETAILS_MORE_LEGENDS_LABEL, new Object[]{Integer.valueOf(size)}) : null;
    }

    private final dcdc<arjf> j(boolean z) {
        dccx F = dcdc.F();
        for (int i = 0; i < this.a.f.size(); i++) {
            F.g(new ariu(this.a, i));
            if (z && i == 3) {
                break;
            }
        }
        return F.f();
    }

    @Override // defpackage.arje
    public String a() {
        return this.a.e;
    }

    @Override // defpackage.arje
    public Boolean b() {
        return Boolean.valueOf(this.b.C().c().d(g()));
    }

    @Override // defpackage.arje
    public cqkl c() {
        this.b.n(g(), !b().booleanValue());
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.arje
    public List<arjf> d() {
        return this.c;
    }

    @Override // defpackage.arje
    @dzsi
    public CharSequence e() {
        return this.d;
    }

    public boolean equals(@dzsi Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof arit)) {
            return false;
        }
        arit aritVar = (arit) obj;
        return dbsd.a(this.b, aritVar.b) && dbsd.a(this.a.bR(), aritVar.a.bR());
    }

    @Override // defpackage.arje
    public cqkl f() {
        this.c = j(false);
        this.d = null;
        cqkx.p(this);
        return cqkl.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String g() {
        dxdm dxdmVar = this.a.b;
        if (dxdmVar == null) {
            dxdmVar = dxdm.e;
        }
        return dxdmVar.d;
    }

    @Override // defpackage.arje
    public cjtd h() {
        return cjtd.a(dtxv.ex);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a.bR()});
    }

    @Override // defpackage.arje
    public cjtd i() {
        return cjtd.a(dtxv.ew);
    }
}
