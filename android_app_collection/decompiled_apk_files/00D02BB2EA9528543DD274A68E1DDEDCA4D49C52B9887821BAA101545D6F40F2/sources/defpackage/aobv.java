package defpackage;

import android.app.Application;
import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: aobv  reason: default package */
/* loaded from: classes2.dex */
public class aobv implements aobu {
    private final Application a;
    private final View.OnClickListener b;
    private CharSequence c = "";
    private dcdc<jho> d = dcdc.e();

    public aobv(Application application, apjz apjzVar, apjv apjvVar) {
        this.a = application;
        this.b = apjvVar.g();
    }

    @Override // defpackage.aobu
    public CharSequence a() {
        return this.c;
    }

    @Override // defpackage.aobu
    public cqkl b() {
        this.b.onClick(new View(this.a));
        return cqkl.a;
    }

    @Override // defpackage.aobu
    public List<jho> c() {
        return this.d;
    }

    public void d(String str) {
        this.c = str;
    }

    public void e(eapy eapyVar) {
        d(apjz.e(eapyVar));
    }

    public void f(dcdc<jho> dcdcVar) {
        this.d = dcdcVar;
    }
}
