package defpackage;
/* compiled from: PG */
/* renamed from: amls  reason: default package */
/* loaded from: classes.dex */
public final class amls extends amlt implements amlr {
    public static final amlt a = new amls(null, new agd(0)).e();

    public amls(amlt amltVar, agd agdVar) {
        super(amltVar, agdVar);
    }

    @Override // defpackage.amlr
    public final void a(antz antzVar, Object obj) {
        aqxo.z(!this.c, "Can't mutate after handing to trace");
        obj.getClass();
        aqxo.z(!h(antzVar), "Key already present");
        this.b.put(antzVar, obj);
    }
}
