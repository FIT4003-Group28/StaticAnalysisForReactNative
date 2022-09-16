package defpackage;
/* compiled from: PG */
/* renamed from: bslc  reason: default package */
/* loaded from: classes4.dex */
class bslc implements dbrn<dpol, duhc> {
    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ duhc a(dpol dpolVar) {
        dpol dpolVar2 = dpolVar;
        dpol dpolVar3 = dpol.DAY_OF_WEEK_UNSPECIFIED;
        switch (dpolVar2.ordinal()) {
            case 0:
                return duhc.DAY_OF_WEEK_UNSPECIFIED;
            case 1:
                return duhc.MONDAY;
            case 2:
                return duhc.TUESDAY;
            case 3:
                return duhc.WEDNESDAY;
            case 4:
                return duhc.THURSDAY;
            case 5:
                return duhc.FRIDAY;
            case 6:
                return duhc.SATURDAY;
            case 7:
                return duhc.SUNDAY;
            default:
                String valueOf = String.valueOf(dpolVar2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("unknown enum value: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
        }
    }
}
