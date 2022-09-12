package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bptq  reason: default package */
/* loaded from: classes4.dex */
final class bptq extends bptu {
    public bokk a;
    public bokk b;
    public dbsg<akqi> c;
    private dcdc<akqi> d;
    private bptv e;

    public bptq() {
        this.c = dbpy.a;
    }

    public bptq(bptw bptwVar) {
        this.c = dbpy.a;
        bptr bptrVar = (bptr) bptwVar;
        this.a = bptrVar.a;
        this.d = bptrVar.b;
        this.b = bptrVar.c;
        this.c = bptrVar.d;
        this.e = bptrVar.e;
    }

    @Override // defpackage.bptu
    public final void b(List<akqi> list) {
        this.d = dcdc.r(list);
    }

    @Override // defpackage.bptu
    public final void c(bptv bptvVar) {
        if (bptvVar != null) {
            this.e = bptvVar;
            return;
        }
        throw new NullPointerException("Null mode");
    }

    @Override // defpackage.bptu
    public final bptw a() {
        String str = this.a == null ? " nameModel" : "";
        if (this.d == null) {
            str = str.concat(" featureIds");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" noteModel");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" mode");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bptr(this.a, this.d, this.b, this.c, this.e);
    }
}
