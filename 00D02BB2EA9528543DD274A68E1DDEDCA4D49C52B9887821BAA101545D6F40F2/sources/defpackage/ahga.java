package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ahga  reason: default package */
/* loaded from: classes2.dex */
public class ahga extends agxc implements agzw {
    public ahbb a;
    private final gga b;
    private final dxio<bsvm> c;
    private final dxio<bbnd> d;

    public ahga(gga ggaVar, dxio<bsvm> dxioVar, dxio<bbnd> dxioVar2) {
        this.b = ggaVar;
        this.c = dxioVar;
        this.d = dxioVar2;
    }

    @Override // defpackage.agyr
    public agyt a() {
        ahbb ahbbVar = this.a;
        dbsk.s(ahbbVar);
        return ahbbVar;
    }

    @Override // defpackage.agzw
    public CharSequence b() {
        return this.b.getString(R.string.LOCALSTREAM_PREFERENCE_CAROUSEL_HEADER_TEXT);
    }

    @Override // defpackage.agzw
    public Boolean c() {
        return Boolean.valueOf(n());
    }

    @Override // defpackage.agzw
    public CharSequence h() {
        return this.b.getString(R.string.LOCALSTREAM_PREFERENCE_THANK_YOU_HEADER_TEXT);
    }

    @Override // defpackage.agzw
    public CharSequence i() {
        return this.b.getString(R.string.LOCALSTREAM_PREFERENCE_THANK_YOU_TEXT);
    }

    @Override // defpackage.agzw
    public CharSequence j() {
        return this.b.getString(R.string.LOCALSTREAM_PREFERENCE_THANK_YOU_MANAGEMENT_PAGE_LINK);
    }

    @Override // defpackage.agzw
    public cjtd k() {
        return cjtd.b().b(dtxu.bH);
    }

    @Override // defpackage.agzw
    public cqkl l() {
        this.c.a().B();
        return cqkl.a;
    }

    public void m() {
        ahbb ahbbVar = this.a;
        if (ahbbVar != null) {
            for (cqix<?> cqixVar : ahbbVar.a()) {
                ahft ahftVar = (ahft) cqixVar.b();
                if ((ahftVar.e().a & 1) != 0 && this.d.a().b(ahftVar.e().b)) {
                    ahftVar.g(this.d.a().a.get(ahftVar.e().b));
                }
            }
        }
    }

    public final boolean n() {
        while (true) {
            boolean z = true;
            for (cqix<?> cqixVar : this.a.a()) {
                if (!z || ((ahft) cqixVar.b()).f() < 0) {
                    z = false;
                }
            }
            return z;
        }
    }
}
