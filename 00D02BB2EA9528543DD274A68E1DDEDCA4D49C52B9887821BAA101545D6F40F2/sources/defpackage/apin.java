package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: apin  reason: default package */
/* loaded from: classes2.dex */
class apin implements aphw {
    final /* synthetic */ apio b;

    public apin(apio apioVar) {
        this.b = apioVar;
    }

    @Override // defpackage.aphw
    public CharSequence c() {
        apio apioVar = this.b;
        return apioVar.b.b(apioVar.a.size(), 1);
    }

    @Override // defpackage.aphw
    public Boolean d() {
        return true;
    }

    @Override // defpackage.aphw
    public CharSequence e() {
        if (!((aovt) this.b.c).aR.booleanValue()) {
            return this.b.d.getString(R.string.SEARCH_SORT_BY);
        }
        apio apioVar = this.b;
        return aoxs.a(apioVar.d, ((aovt) apioVar.c).aS);
    }

    @Override // defpackage.aphw
    public CharSequence f() {
        apio apioVar = this.b;
        return apioVar.b.a(((aovt) apioVar.c).aR.booleanValue(), ((aovt) this.b.c).aS);
    }

    @Override // defpackage.aphw
    public cqkl g() {
        this.b.c.aR();
        return cqkl.a;
    }

    @Override // defpackage.aphw
    public Boolean h() {
        return true;
    }
}
