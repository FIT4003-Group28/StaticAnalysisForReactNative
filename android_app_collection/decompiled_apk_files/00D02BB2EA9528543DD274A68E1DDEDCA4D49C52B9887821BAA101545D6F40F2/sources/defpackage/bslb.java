package defpackage;
/* compiled from: PG */
/* renamed from: bslb  reason: default package */
/* loaded from: classes4.dex */
abstract class bslb implements dbrn<djjn, dugu> {
    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ dugu a(djjn djjnVar) {
        djjn djjnVar2 = djjnVar;
        djjn djjnVar3 = djjn.UNKNOWN_ATTRACTION_CATEGORY;
        int ordinal = djjnVar2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return dugu.ARTS_AND_CULTURE;
            }
            if (ordinal == 2) {
                return dugu.HISTORY;
            }
            if (ordinal == 3) {
                return dugu.OUTDOORS;
            }
            String valueOf = String.valueOf(djjnVar2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("unknown enum value: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return b();
    }

    public abstract dugu b();
}
