package defpackage;

import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bcnh  reason: default package */
/* loaded from: classes3.dex */
public class bcnh extends acoi implements bcma {
    public final cjqy b;
    public final cjtd c;
    public final bckv d;
    private final dcdc<bclv> e;
    public final List<bclz> a = new ArrayList();
    private final bbb f = new bcne(this);

    public bcnh(List<bclv> list, bckv bckvVar, cjqy cjqyVar, cjtd cjtdVar) {
        this.e = dcdc.r(list);
        for (int i = 0; i < list.size(); i++) {
            bclv bclvVar = list.get(i);
            this.a.add(new bcng(this, bclvVar.a(), i, bclvVar.g()));
        }
        this.b = cjqyVar;
        this.c = cjtdVar;
        this.d = bckvVar;
        Y(new bcnf(this));
    }

    @Override // defpackage.bcma
    public void a(int i) {
        Z(i);
    }

    @Override // defpackage.bcma
    public bbb c() {
        return this.f;
    }

    @Override // defpackage.bcma
    public List<bclz> d() {
        return this.a;
    }

    @Override // defpackage.bclw
    public void e(@dzsi ilo iloVar) {
        dcdc<bclv> dcdcVar = this.e;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dcdcVar.get(i).B(iloVar);
        }
    }

    @Override // defpackage.bclw
    public bclv f() {
        return this.e.get(Os().intValue());
    }

    @Override // defpackage.bclw
    public List<bclv> g() {
        return this.e;
    }

    @Override // defpackage.bclw
    public void h(Map<String, Parcelable> map) {
        dcdc<bclv> dcdcVar = this.e;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            bclv bclvVar = dcdcVar.get(i);
            bclvVar.q(map.get(bclvVar.a()));
        }
    }

    @Override // defpackage.bcma
    public List<bclv> i() {
        return dcdc.r(this.e);
    }

    @Override // defpackage.bcma
    public Boolean j() {
        boolean z = true;
        if (this.e.size() <= 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
