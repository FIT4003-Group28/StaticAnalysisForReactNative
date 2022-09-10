package defpackage;

import android.content.Context;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: bpdm  reason: default package */
/* loaded from: classes3.dex */
public class bpdm implements bpvx {
    private final bpdc a;
    private final boxe b;
    private final Context c;

    public bpdm(bpdc bpdcVar, boxe boxeVar) {
        this.a = bpdcVar;
        this.b = boxeVar;
        this.c = bpdcVar.J();
    }

    @Override // defpackage.bpvx
    public cqkl a() {
        bpdc bpdcVar = this.a;
        boxe boxeVar = this.b;
        Bundle bundle = new Bundle();
        bundle.putSerializable("SCHEDULE_MODEL_KEY", boxeVar);
        bpdi bpdiVar = new bpdi();
        bpdiVar.B(bundle);
        bpdiVar.Nz(bpdcVar);
        bpdiVar.aJ(bpdcVar.J());
        return cqkl.a;
    }

    @Override // defpackage.bpvx
    public Boolean b() {
        return Boolean.valueOf(this.b.a);
    }

    @Override // defpackage.bpvx
    public CharSequence c() {
        return bpve.a(this.c, this.b.c.a);
    }

    @Override // defpackage.bpvx
    public CharSequence d() {
        return bpve.b(this.c, this.b.c.a);
    }

    @Override // defpackage.bpvx
    public CharSequence e() {
        return bpve.a(this.c, this.b.d.a);
    }

    @Override // defpackage.bpvx
    public CharSequence f() {
        return bpve.b(this.c, this.b.d.a);
    }
}
