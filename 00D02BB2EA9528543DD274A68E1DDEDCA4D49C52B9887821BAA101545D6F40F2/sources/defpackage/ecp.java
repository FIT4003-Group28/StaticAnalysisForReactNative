package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ecp  reason: default package */
/* loaded from: classes6.dex */
public final class ecp implements jad {
    static final dcdn<dkgc, Integer> a = dcdn.k(dkgc.TODO_LIST, Integer.valueOf((int) R.string.CALL_TO_ACTION_CONTRIBUTE_MORE));
    private final cafi b;
    private final Resources c;
    private final chnm d;
    private final ceet e;
    private final dkgd f;
    private final cjtd g;

    public ecp(cafi cafiVar, Resources resources, chnm chnmVar, ceet ceetVar, dkgd dkgdVar, cjtd cjtdVar) {
        this.b = cafiVar;
        this.c = resources;
        this.d = chnmVar;
        this.e = ceetVar;
        this.f = dkgdVar;
        cjta c = cjtd.c(cjtdVar);
        c.d = dtxk.a;
        this.g = c.a();
    }

    private final int b() {
        dcdn<dkgc, Integer> dcdnVar = a;
        dkgc b = dkgc.b(this.f.a);
        if (b == null) {
            b = dkgc.UNKNOWN_TYPE;
        }
        return dcdnVar.getOrDefault(b, -1).intValue();
    }

    @Override // defpackage.jad
    public Boolean a() {
        return Boolean.valueOf(b() != -1);
    }

    @Override // defpackage.jad
    public cqkl c() {
        dkgc b = dkgc.b(this.f.a);
        if (b == null) {
            b = dkgc.UNKNOWN_TYPE;
        }
        if (b == dkgc.TODO_LIST) {
            if (this.e.e()) {
                this.d.f();
            } else {
                this.b.e();
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.jad
    public cjtd d() {
        return this.g;
    }

    @Override // defpackage.jad
    public CharSequence e() {
        return b() == -1 ? "" : this.c.getString(b());
    }

    @Override // defpackage.jad
    public CharSequence f() {
        return "";
    }

    @Override // defpackage.jad
    public cqkl g(cjqm cjqmVar) {
        return jac.b(this);
    }

    @Override // defpackage.jad
    public Boolean h() {
        return jac.a();
    }

    @Override // defpackage.jad
    public cqtd i() {
        return null;
    }
}
