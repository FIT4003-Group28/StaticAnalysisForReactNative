package defpackage;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ass  reason: default package */
/* loaded from: classes2.dex */
public final class ass extends aqx implements asn {
    final /* synthetic */ ast a;
    private final String b;
    private final String c;
    private boolean d;
    private int e = -1;
    private int f;
    private asm g;
    private int h;

    public ass(ast astVar, String str, String str2) {
        this.a = astVar;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.aqx
    public final void a(int i) {
        asm asmVar = this.g;
        if (asmVar != null) {
            asmVar.d(this.h, i);
            return;
        }
        this.e = i;
        this.f = 0;
    }

    @Override // defpackage.aqx
    public final void b(int i) {
        asm asmVar = this.g;
        if (asmVar != null) {
            asmVar.e(this.h, i);
        } else {
            this.f += i;
        }
    }

    @Override // defpackage.aqx
    public final void c() {
        this.a.p(this);
    }

    @Override // defpackage.asn
    public final int d() {
        return this.h;
    }

    @Override // defpackage.asn
    public final void e(asm asmVar) {
        this.g = asmVar;
        String str = this.b;
        String str2 = this.c;
        int i = asmVar.d;
        asmVar.d = i + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", str);
        bundle.putString("routeGroupId", str2);
        int i2 = asmVar.c;
        asmVar.c = i2 + 1;
        asmVar.g(3, i2, i, null, bundle);
        this.h = i;
        if (this.d) {
            asmVar.b(i);
            int i3 = this.e;
            if (i3 >= 0) {
                asmVar.d(this.h, i3);
                this.e = -1;
            }
            int i4 = this.f;
            if (i4 == 0) {
                return;
            }
            asmVar.e(this.h, i4);
            this.f = 0;
        }
    }

    @Override // defpackage.asn
    public final void f() {
        asm asmVar = this.g;
        if (asmVar != null) {
            asmVar.a(this.h);
            this.g = null;
            this.h = 0;
        }
    }

    @Override // defpackage.aqx
    public final void g() {
        this.d = true;
        asm asmVar = this.g;
        if (asmVar != null) {
            asmVar.b(this.h);
        }
    }

    @Override // defpackage.aqx
    public final void h() {
        i(0);
    }

    @Override // defpackage.aqx
    public final void i(int i) {
        this.d = false;
        asm asmVar = this.g;
        if (asmVar != null) {
            asmVar.c(this.h, i);
        }
    }
}
