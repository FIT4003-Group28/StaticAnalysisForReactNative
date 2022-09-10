package defpackage;
/* compiled from: PG */
/* renamed from: aqwx  reason: default package */
/* loaded from: classes2.dex */
public final class aqwx {
    public static apzn a(aqxf aqxfVar) {
        int i;
        apzi apziVar = new apzi();
        aqxk aqxkVar = aqxfVar.a;
        if (aqxkVar == null) {
            aqxkVar = aqxk.e;
        }
        aqxj b = aqxj.b(aqxkVar.a);
        if (b == null) {
            b = aqxj.UNRECOGNIZED;
        }
        int ordinal = b.ordinal();
        int i2 = 0;
        if (ordinal == 1) {
            i = 1;
        } else if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal == 4) {
                    i = 4;
                } else if (ordinal != 5) {
                    i = 0;
                }
            }
            i = 3;
        } else {
            i = 2;
        }
        apziVar.a = Integer.valueOf(i);
        aqxk aqxkVar2 = aqxfVar.a;
        if (aqxkVar2 == null) {
            aqxkVar2 = aqxk.e;
        }
        aqxi b2 = aqxi.b(aqxkVar2.d);
        if (b2 == null) {
            b2 = aqxi.UNRECOGNIZED;
        }
        apziVar.b = Boolean.valueOf(b2.equals(aqxi.GMM));
        aqxk aqxkVar3 = aqxfVar.a;
        if (aqxkVar3 == null) {
            aqxkVar3 = aqxk.e;
        }
        aqxh b3 = aqxh.b(aqxkVar3.b);
        if (b3 == null) {
            b3 = aqxh.UNRECOGNIZED;
        }
        switch (b3.ordinal()) {
            case 1:
                i2 = 1;
                break;
            case 2:
                i2 = 2;
                break;
            case 3:
                i2 = 3;
                break;
            case 4:
                i2 = 4;
                break;
            case 5:
                i2 = 5;
                break;
            case 6:
                i2 = 6;
                break;
        }
        apziVar.c = Integer.valueOf(i2);
        apziVar.d = Boolean.valueOf(aqxfVar.b);
        String str = apziVar.a == null ? " merchantMessagingState" : "";
        if (apziVar.b == null) {
            str = str.concat(" notificationsEnabled");
        }
        if (apziVar.c == null) {
            str = String.valueOf(str).concat(" disableReason");
        }
        if (apziVar.d == null) {
            str = String.valueOf(str).concat(" isReadReceiptsEnabled");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new apzj(apziVar.a.intValue(), apziVar.b.booleanValue(), apziVar.c.intValue(), apziVar.d.booleanValue());
    }
}
