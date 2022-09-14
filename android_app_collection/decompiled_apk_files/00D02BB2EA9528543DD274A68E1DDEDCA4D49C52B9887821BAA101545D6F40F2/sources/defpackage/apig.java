package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: apig  reason: default package */
/* loaded from: classes2.dex */
class apig implements aphw {
    final /* synthetic */ apih b;

    public apig(apih apihVar) {
        this.b = apihVar;
    }

    @Override // defpackage.aphw
    public CharSequence c() {
        apih apihVar = this.b;
        return apihVar.b.b(apihVar.a.size(), 2);
    }

    @Override // defpackage.aphw
    public Boolean d() {
        return true;
    }

    @Override // defpackage.aphw
    public CharSequence e() {
        if (!this.b.c.aS().booleanValue()) {
            return this.b.d.getString(R.string.SEARCH_SORT_BY);
        }
        apih apihVar = this.b;
        return aoxs.a(apihVar.d, apihVar.c.aT());
    }

    @Override // defpackage.aphw
    public CharSequence f() {
        apih apihVar = this.b;
        return apihVar.b.a(apihVar.c.aS().booleanValue(), this.b.c.aT());
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
