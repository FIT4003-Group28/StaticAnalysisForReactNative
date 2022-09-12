package defpackage;

import android.app.Activity;
import android.text.format.DateUtils;
/* compiled from: PG */
/* renamed from: aenm  reason: default package */
/* loaded from: classes2.dex */
class aenm implements aenf {
    final /* synthetic */ aeno a;
    private final int b;

    public aenm(aeno aenoVar, int i) {
        this.a = aenoVar;
        this.b = i;
    }

    @Override // defpackage.aenf
    public cqkl b() {
        if (a().booleanValue()) {
            if (this.b == 1) {
                aeno aenoVar = this.a;
                aenn aennVar = aenoVar.i;
                if (aennVar != null) {
                    aennVar.a(aenoVar.d.q(1));
                }
            } else {
                aeno aenoVar2 = this.a;
                aenn aennVar2 = aenoVar2.i;
                if (aennVar2 != null) {
                    aennVar2.a(aenoVar2.d.p(1));
                }
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.aenf
    public CharSequence c() {
        String charSequence;
        long time;
        if (this.b == 1) {
            aeno aenoVar = this.a;
            charSequence = aenoVar.k.a(aenoVar.a.getApplicationContext()).toString();
        } else {
            aeno aenoVar2 = this.a;
            charSequence = aenoVar2.l.a(aenoVar2.a.getApplicationContext()).toString();
        }
        Object[] objArr = new Object[1];
        aeno aenoVar3 = this.a;
        Activity activity = aenoVar3.a;
        if (this.b == 1) {
            time = aenoVar3.d.q(1).n().getTime();
        } else {
            time = aenoVar3.d.p(1).n().getTime();
        }
        objArr[0] = DateUtils.formatDateTime(activity, time, this.a.b);
        return String.format(charSequence, objArr);
    }

    @Override // defpackage.aenf
    public cjtd d() {
        ddho ddhoVar = this.b == 1 ? this.a.g : this.a.h;
        cjta cjtaVar = this.a.j;
        if (cjtaVar != null) {
            cjtaVar.d = ddhoVar;
            return cjtaVar.a();
        }
        return cjtd.a(ddhoVar);
    }

    @Override // defpackage.aenf
    public Boolean a() {
        if (this.b == 1) {
            aeno aenoVar = this.a;
            eapg eapgVar = aenoVar.e;
            if (eapgVar != null) {
                return Boolean.valueOf(eapgVar.C(aenoVar.d));
            }
        } else {
            aeno aenoVar2 = this.a;
            eapg eapgVar2 = aenoVar2.f;
            if (eapgVar2 != null) {
                return Boolean.valueOf(eapgVar2.B(aenoVar2.d));
            }
        }
        return false;
    }
}
