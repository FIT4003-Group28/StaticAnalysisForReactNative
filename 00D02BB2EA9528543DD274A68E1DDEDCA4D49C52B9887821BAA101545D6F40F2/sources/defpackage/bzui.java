package defpackage;

import java.util.EnumSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bzui  reason: default package */
/* loaded from: classes4.dex */
public final class bzui {
    public final dxio<btvo> a;
    private final dxio<ckcw> b;
    private final bzuh c;
    private final bzuf d;

    public bzui(dxio<ckcw> dxioVar, dxio<btvo> dxioVar2, dxio<akfa> dxioVar3, dxio<bztp> dxioVar4) {
        this.b = dxioVar;
        this.a = dxioVar2;
        this.c = new bzuh(dxioVar2, dxioVar3);
        this.d = new bzuf(dxioVar2, dxioVar4, dxioVar3);
    }

    private final void b(int i) {
        ((ckco) this.b.a().a(ckdz.M)).a(i - 1);
    }

    public final Set<dvll> a() {
        int i;
        int i2;
        EnumSet noneOf = EnumSet.noneOf(dvll.class);
        bzuf bzufVar = this.d;
        if (bzufVar.c.a().j() == null) {
            i = 72;
        } else if (!dchl.k(bzufVar.a.a().getPhotoTakenNotificationParameters().b, bzue.a).contains(dvll.SERVER_TRIGGERED_SLF)) {
            i = 69;
        } else {
            i = !bzufVar.b.a().a().booleanValue() ? 71 : 66;
        }
        bzuh bzuhVar = this.c;
        if (bzuhVar.b.a().j() == null) {
            i2 = 5;
        } else {
            List k = dchl.k(bzuhVar.a.a().getPhotoTakenNotificationParameters().b, bzug.a);
            i2 = (k.contains(dvll.CLIENT_TRIGGERED_REGULAR) || k.isEmpty()) ? 2 : 3;
        }
        if (i == 66) {
            noneOf.add(dvll.SERVER_TRIGGERED_SLF);
        }
        if (i2 == 2) {
            noneOf.add(dvll.CLIENT_TRIGGERED_REGULAR);
        }
        b(i);
        b(i2);
        return noneOf;
    }
}
