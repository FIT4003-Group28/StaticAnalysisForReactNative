package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: akwk  reason: default package */
/* loaded from: classes.dex */
public final class akwk extends akws {
    public Boolean a;
    public Boolean b;
    public dcdc<Integer> c;
    public Boolean d;
    public Integer e;
    public Boolean f;
    public Boolean g;
    public String h;
    public Boolean i;

    @Override // defpackage.akws
    public final void a(boolean z) {
        this.g = Boolean.valueOf(z);
    }

    @Override // defpackage.akws
    public final void b(List<Integer> list) {
        this.c = dcdc.r(list);
    }

    @Override // defpackage.akws
    public final void c(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    @Override // defpackage.akws
    public final void d(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    @Override // defpackage.akws
    public final void e(String str) {
        if (str != null) {
            this.h = str;
            return;
        }
        throw new NullPointerException("Null iconBaseUrl");
    }

    @Override // defpackage.akws
    public final void f(boolean z) {
        this.a = Boolean.valueOf(z);
    }

    @Override // defpackage.akws
    public final void g(int i) {
        this.e = Integer.valueOf(i);
    }

    @Override // defpackage.akws
    public final void h(boolean z) {
        this.d = Boolean.valueOf(z);
    }
}
