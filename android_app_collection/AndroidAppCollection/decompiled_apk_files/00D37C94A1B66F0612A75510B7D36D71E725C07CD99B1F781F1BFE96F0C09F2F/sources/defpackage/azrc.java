package defpackage;
/* compiled from: PG */
/* renamed from: azrc  reason: default package */
/* loaded from: classes2.dex */
public final class azrc extends azsu implements azsg {
    private final /* synthetic */ int g;
    public static final azrc f = new azrc(5);
    public static final azrc e = new azrc(4);
    public static final azrc d = new azrc(3);
    public static final azrc c = new azrc(2);
    public static final azrc b = new azrc(1);
    public static final azrc a = new azrc();

    public azrc() {
        super(2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azrc(int i) {
        super(2);
        this.g = i;
    }

    @Override // defpackage.azsg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.g;
        if (i == 0) {
            azrd azrdVar = (azrd) obj;
            azra azraVar = (azra) obj2;
            azrdVar.getClass();
            azrd minusKey = azrdVar.minusKey(azraVar.getKey());
            if (minusKey == azre.a) {
                return azraVar;
            }
            azqz azqzVar = (azqz) minusKey.get(azqz.a);
            if (azqzVar == null) {
                return new azqx(minusKey, azraVar);
            }
            azrd minusKey2 = minusKey.minusKey(azqz.a);
            if (minusKey2 == azre.a) {
                return new azqx(azraVar, azqzVar);
            }
            return new azqx(new azqx(minusKey2, azraVar), azqzVar);
        } else if (i == 1) {
            String str = (String) obj;
            azra azraVar2 = (azra) obj2;
            str.getClass();
            if (str.length() == 0) {
                return azraVar2.toString();
            }
            return str + ", " + azraVar2;
        } else if (i == 2) {
            azra azraVar3 = (azra) obj2;
            return Integer.valueOf(((Number) obj).intValue() + 1);
        } else {
            Integer num = null;
            if (i == 3) {
                azra azraVar4 = (azra) obj2;
                if (!(azraVar4 instanceof azuu)) {
                    return obj;
                }
                if (obj instanceof Integer) {
                    num = (Integer) obj;
                }
                int intValue = num == null ? 1 : num.intValue();
                return intValue == 0 ? azraVar4 : Integer.valueOf(intValue + 1);
            } else if (i == 4) {
                azuu azuuVar = (azuu) obj;
                azra azraVar5 = (azra) obj2;
                if (azuuVar != null) {
                    return azuuVar;
                }
                if (!(azraVar5 instanceof azuu)) {
                    return null;
                }
                return (azuu) azraVar5;
            } else {
                azyj azyjVar = (azyj) obj;
                azra azraVar6 = (azra) obj2;
                azyjVar.getClass();
                if (azraVar6 instanceof azuu) {
                    azuu azuuVar2 = (azuu) azraVar6;
                    Object a2 = azuuVar2.a(azyjVar.a);
                    Object[] objArr = azyjVar.b;
                    int i2 = azyjVar.c;
                    objArr[i2] = a2;
                    azuu[] azuuVarArr = azyjVar.d;
                    azyjVar.c = i2 + 1;
                    azuuVarArr[i2] = azuuVar2;
                }
                return azyjVar;
            }
        }
    }
}
