package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acgl  reason: default package */
/* loaded from: classes2.dex */
public class acgl implements jas {
    final /* synthetic */ acgm a;

    public acgl(acgm acgmVar) {
        this.a = acgmVar;
    }

    private final String k(int i) {
        return this.a.a.J() != null ? this.a.a.J().getString(i) : "";
    }

    @Override // defpackage.jas
    public CharSequence a() {
        return k(R.string.CANCEL_BUTTON);
    }

    @Override // defpackage.jas
    public CharSequence b() {
        return k(R.string.NEXT);
    }

    @Override // defpackage.jas
    public Boolean c() {
        return true;
    }

    @Override // defpackage.jas
    public Boolean d() {
        return Boolean.valueOf(this.a.b.c != null);
    }

    @Override // defpackage.jas
    public cqkl e() {
        ges gesVar = this.a.a;
        if (!gesVar.aD || gesVar.J() == null) {
            return cqkl.a;
        }
        jmw.d(this.a.a.J(), null);
        gn gnVar = this.a.a.A;
        dbsk.s(gnVar);
        gnVar.f();
        return cqkl.a;
    }

    @Override // defpackage.jas
    public cqkl f() {
        acgm acgmVar = this.a;
        ges gesVar = acgmVar.a;
        if (!gesVar.aD || gesVar.aE == null) {
            return cqkl.a;
        }
        acgmVar.c.l(acgmVar.b.toString());
        gn gnVar = this.a.a.A;
        dbsk.s(gnVar);
        gnVar.f();
        return cqkl.a;
    }

    @Override // defpackage.jas
    @dzsi
    public cjtd g() {
        return null;
    }

    @Override // defpackage.jas
    @dzsi
    public cjtd h() {
        return null;
    }

    @Override // defpackage.jas
    public Boolean i() {
        return true;
    }

    @Override // defpackage.jas
    public Boolean j() {
        return false;
    }
}
