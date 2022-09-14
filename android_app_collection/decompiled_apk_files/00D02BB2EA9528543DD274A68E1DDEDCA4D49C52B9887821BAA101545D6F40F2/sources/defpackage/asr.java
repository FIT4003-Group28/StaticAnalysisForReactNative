package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: asr  reason: default package */
/* loaded from: classes2.dex */
final class asr extends aqu implements asn {
    final /* synthetic */ ast a;
    private final String b;
    private boolean c;
    private int e;
    private asm f;
    private int d = -1;
    private int g = -1;

    public asr(ast astVar, String str) {
        this.a = astVar;
        this.b = str;
    }

    @Override // defpackage.aqx
    public final void a(int i) {
        asm asmVar = this.f;
        if (asmVar != null) {
            asmVar.d(this.g, i);
            return;
        }
        this.d = i;
        this.e = 0;
    }

    @Override // defpackage.aqx
    public final void b(int i) {
        asm asmVar = this.f;
        if (asmVar != null) {
            asmVar.e(this.g, i);
        } else {
            this.e += i;
        }
    }

    @Override // defpackage.aqx
    public final void c() {
        this.a.p(this);
    }

    @Override // defpackage.asn
    public final int d() {
        return this.g;
    }

    @Override // defpackage.asn
    public final void e(asm asmVar) {
        asq asqVar = new asq();
        this.f = asmVar;
        String str = this.b;
        int i = asmVar.d;
        asmVar.d = i + 1;
        int i2 = asmVar.c;
        asmVar.c = i2 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", str);
        asmVar.g(11, i2, i, null, bundle);
        asmVar.g.put(i2, asqVar);
        this.g = i;
        if (this.c) {
            asmVar.b(i);
            int i3 = this.d;
            if (i3 >= 0) {
                asmVar.d(this.g, i3);
                this.d = -1;
            }
            int i4 = this.e;
            if (i4 == 0) {
                return;
            }
            asmVar.e(this.g, i4);
            this.e = 0;
        }
    }

    @Override // defpackage.asn
    public final void f() {
        asm asmVar = this.f;
        if (asmVar != null) {
            asmVar.a(this.g);
            this.f = null;
            this.g = 0;
        }
    }

    @Override // defpackage.aqx
    public final void g() {
        this.c = true;
        asm asmVar = this.f;
        if (asmVar != null) {
            asmVar.b(this.g);
        }
    }

    @Override // defpackage.aqx
    public final void h() {
        i(0);
    }

    @Override // defpackage.aqx
    public final void i(int i) {
        this.c = false;
        asm asmVar = this.f;
        if (asmVar != null) {
            asmVar.c(this.g, i);
        }
    }
}
