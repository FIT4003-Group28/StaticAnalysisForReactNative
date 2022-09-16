package defpackage;
/* compiled from: PG */
/* renamed from: ajjk  reason: default package */
/* loaded from: classes.dex */
public final class ajjk extends tdh {
    public final acti a;
    public final asjj b;

    public ajjk(tdq tdqVar, acti actiVar, asjj asjjVar) {
        super(tdqVar);
        this.a = actiVar;
        this.b = asjjVar;
    }

    public static tdi v(final acti actiVar) {
        return new tdi() { // from class: ajji
            @Override // defpackage.tdi
            public final tdh a(tdq tdqVar) {
                return new ajjk(tdqVar, acti.this, null);
            }
        };
    }

    public static acti w(tdq tdqVar) {
        if (tdqVar instanceof ajjk) {
            return ((ajjk) tdqVar).a;
        }
        return null;
    }
}
