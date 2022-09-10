package defpackage;

import android.app.Activity;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.SpinnerAdapter;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: vrn  reason: default package */
/* loaded from: classes7.dex */
public abstract class vrn implements Serializable, vqy {
    public transient SpinnerAdapter a;
    public vqx b;
    private final dcdc<vqx> c;
    private final boolean d;
    private final cjtd e;
    private final transient AdapterView.OnItemSelectedListener f;

    public vrn(Activity activity, dowl dowlVar, dcdc<vqx> dcdcVar, boolean z, cjtd cjtdVar) {
        this.c = dcdcVar;
        this.d = z;
        this.e = cjtdVar;
        this.a = i(activity, dcdcVar, z);
        int i = 0;
        this.b = dcdcVar.get(0);
        int size = dcdcVar.size();
        while (true) {
            if (i >= size) {
                break;
            }
            vqx vqxVar = dcdcVar.get(i);
            i++;
            if (vqxVar.a == dowlVar) {
                this.b = vqxVar;
                break;
            }
        }
        this.f = new vrl(this, dcdcVar);
    }

    private static BaseAdapter i(Activity activity, dcdc<vqx> dcdcVar, boolean z) {
        return new vrm(dcdcVar, activity, z);
    }

    @Override // defpackage.jbg
    public AdapterView.OnItemSelectedListener Rs() {
        return this.f;
    }

    @Override // defpackage.jbg
    public Integer Rt() {
        return Integer.valueOf(this.c.indexOf(this.b));
    }

    @Override // defpackage.jbg
    public SpinnerAdapter Rv() {
        return this.a;
    }

    @Override // defpackage.vqy
    public Boolean d() {
        return Boolean.valueOf(!vph.a(this.b.a));
    }

    @Override // defpackage.vqy
    public dowl e() {
        return this.b.a;
    }

    @Override // defpackage.vqy
    public cqkl f() {
        this.b = this.c.get(0);
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.vqy
    public cjtd g() {
        return this.e;
    }

    public void h(Activity activity) {
        this.a = i(activity, this.c, this.d);
    }
}
