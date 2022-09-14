package defpackage;

import java.lang.reflect.Field;
/* compiled from: PG */
/* renamed from: dgvn  reason: default package */
/* loaded from: classes6.dex */
public final class dgvn extends dgvp {
    final /* synthetic */ Field a;
    final /* synthetic */ boolean b;
    final /* synthetic */ dgtl c;
    final /* synthetic */ dgsx d;
    final /* synthetic */ dgxd e;
    final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgvn(String str, boolean z, boolean z2, Field field, boolean z3, dgtl dgtlVar, dgsx dgsxVar, dgxd dgxdVar, boolean z4) {
        super(str, z, z2);
        this.a = field;
        this.b = z3;
        this.c = dgtlVar;
        this.d = dgsxVar;
        this.e = dgxdVar;
        this.f = z4;
    }

    @Override // defpackage.dgvp
    public final void a(dgxg dgxgVar, Object obj) {
        (this.b ? this.c : new dgvu(this.d, this.c, this.e.b)).b(dgxgVar, this.a.get(obj));
    }

    @Override // defpackage.dgvp
    public final void b(dgxe dgxeVar, Object obj) {
        Object a = this.c.a(dgxeVar);
        if (a != null || !this.f) {
            this.a.set(obj, a);
        }
    }

    @Override // defpackage.dgvp
    public final boolean c(Object obj) {
        return this.h && this.a.get(obj) != obj;
    }
}
