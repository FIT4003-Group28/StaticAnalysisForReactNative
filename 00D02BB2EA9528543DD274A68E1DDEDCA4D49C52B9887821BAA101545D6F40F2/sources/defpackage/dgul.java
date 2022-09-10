package defpackage;

import com.google.gson.internal.Excluder;
/* compiled from: PG */
/* renamed from: dgul  reason: default package */
/* loaded from: classes6.dex */
public final class dgul extends dgtl {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ dgsx c;
    final /* synthetic */ dgxd d;
    final /* synthetic */ Excluder e;
    private dgtl f;

    public dgul(Excluder excluder, boolean z, boolean z2, dgsx dgsxVar, dgxd dgxdVar) {
        this.e = excluder;
        this.a = z;
        this.b = z2;
        this.c = dgsxVar;
        this.d = dgxdVar;
    }

    private final dgtl d() {
        dgtl dgtlVar = this.f;
        if (dgtlVar != null) {
            return dgtlVar;
        }
        dgtl c = this.c.c(this.e, this.d);
        this.f = c;
        return c;
    }

    @Override // defpackage.dgtl
    public final Object a(dgxe dgxeVar) {
        if (this.a) {
            dgxeVar.n();
            return null;
        }
        return d().a(dgxeVar);
    }

    @Override // defpackage.dgtl
    public final void b(dgxg dgxgVar, Object obj) {
        if (this.b) {
            dgxgVar.f();
        } else {
            d().b(dgxgVar, obj);
        }
    }
}
