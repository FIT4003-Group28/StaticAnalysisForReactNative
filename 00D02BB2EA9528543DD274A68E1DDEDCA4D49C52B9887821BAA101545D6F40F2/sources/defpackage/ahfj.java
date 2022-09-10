package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ahfj  reason: default package */
/* loaded from: classes2.dex */
public class ahfj implements agzs {
    private final gga a;
    private final beqf b;
    @dzsi
    private final jic c;
    @dzsi
    private final String d;
    @dzsi
    private final String e;
    @dzsi
    private final dgep f;
    private final cjta g;
    private final ahfn h;

    public ahfj(gga ggaVar, beqf beqfVar, ahfo ahfoVar, dkzt dkztVar, ddzg ddzgVar) {
        dgev dgevVar;
        this.a = ggaVar;
        this.b = beqfVar;
        djul djulVar = dkztVar.c;
        djulVar = djulVar == null ? djul.o : djulVar;
        if (djulVar.b == 20) {
            dgevVar = (dgev) djulVar.c;
        } else {
            dgevVar = dgev.g;
        }
        dger dgerVar = dgevVar.e;
        String str = (dgerVar == null ? dger.c : dgerVar).b;
        this.c = str.isEmpty() ? null : agxk.h(str, ckqc.FULLY_QUALIFIED);
        djul djulVar2 = dkztVar.c;
        this.d = (djulVar2 == null ? djul.o : djulVar2).f;
        this.e = dgevVar.c;
        dlcx dlcxVar = dkztVar.b;
        this.h = ahfoVar.a(dlcxVar == null ? dlcx.e : dlcxVar, 0, ddzgVar, null, false);
        djul djulVar3 = dkztVar.c;
        if (((djulVar3 == null ? djul.o : djulVar3).a & 4096) != 0) {
            djul djulVar4 = dkztVar.c;
            dgep dgepVar = (djulVar4 == null ? djul.o : djulVar4).m;
            dgepVar = dgepVar == null ? dgep.f : dgepVar;
            this.f = dgepVar;
            beqfVar.b(dgepVar);
        } else {
            this.f = null;
        }
        cjta b = cjtd.b();
        b.g(dkztVar.a);
        b.r(ddzgVar);
        this.g = b;
    }

    @Override // defpackage.agzs
    @dzsi
    public jic a() {
        return this.c;
    }

    @Override // defpackage.agzs
    @dzsi
    public CharSequence b() {
        return this.d;
    }

    @Override // defpackage.agzs
    @dzsi
    public CharSequence c() {
        return this.e;
    }

    @Override // defpackage.agzs
    public CharSequence d() {
        return this.a.getResources().getString(R.string.LOCALSTREAM_OFFER_BADGE_TEXT);
    }

    @Override // defpackage.agzs
    public agwu e() {
        return this.h;
    }

    @Override // defpackage.agzs
    @dzsi
    public CharSequence f() {
        dgep dgepVar = this.f;
        if (dgepVar != null) {
            return this.b.a(this.a, dgepVar);
        }
        return null;
    }

    @Override // defpackage.agzs
    public cqkl g() {
        if (this.f != null && f() != null && this.b.d(this.f) != 2) {
            Toast.makeText(this.a, (int) R.string.UNKNOWN_ERROR, 0).show();
        }
        return cqkl.a;
    }

    @Override // defpackage.agzs
    public cjtd h(ddho ddhoVar) {
        return this.g.b(ddhoVar);
    }
}
