package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aann  reason: default package */
/* loaded from: classes2.dex */
public class aann implements aanf {
    private final diub a;
    private final List<aane> b;

    public aann(diub diubVar, List<aane> list) {
        this.a = diubVar;
        this.b = list;
    }

    @Override // defpackage.aanf
    public CharSequence a() {
        return this.a.a;
    }

    @Override // defpackage.aanf
    public CharSequence b() {
        return this.a.b;
    }

    @Override // defpackage.aanf
    public List<aane> c() {
        return this.b;
    }

    @Override // defpackage.aanf
    public CharSequence d() {
        return this.a.d;
    }
}
