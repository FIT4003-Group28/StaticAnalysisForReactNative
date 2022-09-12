package defpackage;

import java.io.ObjectInputStream;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: aaco  reason: default package */
/* loaded from: classes2.dex */
public final class aaco implements Serializable {
    public transient dbsg<btzy> a;
    private final dbsg<bvrt<dilu>> b;

    public aaco() {
        this.b = dbpy.a;
        this.a = dbpy.a;
    }

    public aaco(btzy btzyVar) {
        this.b = dbpy.a;
        this.a = dbsg.i(btzyVar);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.a = dbpy.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        return this.b.a() || this.a.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dbsg<dilu> b() {
        return !this.b.a() ? dbpy.a : dbsg.i(this.b.b().e((dssr) dilu.f.cu(7), dilu.f));
    }

    public aaco(dilu diluVar) {
        this.b = dbsg.i(bvrt.b(diluVar));
        this.a = dbpy.a;
    }
}
