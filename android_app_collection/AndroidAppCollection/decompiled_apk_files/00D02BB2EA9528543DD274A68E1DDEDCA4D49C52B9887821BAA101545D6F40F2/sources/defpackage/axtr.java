package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: axtr  reason: default package */
/* loaded from: classes3.dex */
public final class axtr implements baap {
    private final axwu a;
    private final axwq b;
    private final btrm c;
    private final gga d;
    private final dndr e;
    @dzsi
    private final String f;
    @dzsi
    private final String g;
    @dzsi
    private final akqq h;
    @dzsi
    private final String i;
    private final boolean j;
    @dzsi
    private final axvp k;
    private final azvb l;

    public axtr(gga ggaVar, axwq axwqVar, btrm btrmVar, axwu axwuVar, dndr dndrVar, @dzsi String str, @dzsi String str2, @dzsi akqq akqqVar, @dzsi String str3, @dzsi axvp axvpVar, boolean z, azvb azvbVar) {
        this.d = ggaVar;
        this.b = axwqVar;
        this.c = btrmVar;
        dbsk.s(axwuVar);
        dbsk.s(dndrVar);
        dbsk.s(azvbVar);
        this.a = axwuVar;
        this.e = dndrVar;
        this.f = str;
        this.g = str2;
        this.h = akqqVar;
        this.i = str3;
        this.k = axvpVar;
        this.j = z;
        this.l = azvbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(azvb azvbVar, dndr dndrVar, boolean z) {
        dndr dndrVar2 = dndr.UNKNOWN_ALIAS_TYPE;
        azvb azvbVar2 = azvb.UPDATE;
        int ordinal = dndrVar.ordinal();
        if (ordinal == 1 || ordinal == 2 || ordinal == 4) {
            int ordinal2 = azvbVar.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 == 1) {
                    int ordinal3 = dndrVar.ordinal();
                    return ordinal3 != 1 ? ordinal3 != 2 ? true != z ? R.string.FAILED_TO_DELETE_NICKNAME : R.string.NICKNAME_DELETED : true != z ? R.string.FAILED_TO_DELETE_WORK_LOCATION : R.string.WORK_LOCATION_DELETED : true != z ? R.string.FAILED_TO_DELETE_HOME_LOCATION : R.string.HOME_LOCATION_DELETED;
                } else if (ordinal2 == 2) {
                    if (!z) {
                        int ordinal4 = dndrVar.ordinal();
                        return ordinal4 != 1 ? ordinal4 != 2 ? R.string.FAILED_TO_UPDATE_NICKNAME : R.string.FAILED_TO_CHANGE_WORK_STICKER : R.string.FAILED_TO_CHANGE_HOME_STICKER;
                    }
                }
            } else if (!z) {
                int ordinal5 = dndrVar.ordinal();
                return ordinal5 != 1 ? ordinal5 != 2 ? R.string.FAILED_TO_UPDATE_NICKNAME : R.string.FAILED_TO_UPDATE_WORK_LOCATION : R.string.FAILED_TO_UPDATE_HOME_LOCATION;
            }
            z = true;
        }
        throw new IllegalArgumentException(String.format("Not expected to be called with operation %s, aliasType %s and succeeded %s", azvbVar, Integer.valueOf(dndrVar.h), Boolean.valueOf(z)));
    }

    @Override // defpackage.baap
    public final void a(boolean z, @dzsi Long l, @dzsi decq decqVar, @dzsi String str, @dzsi dniu dniuVar, @dzsi String str2) {
        azqv azqvVar;
        fd K;
        bvrj.UI_THREAD.c();
        if (this.a.G()) {
            this.a.F(false);
        }
        azvd azvdVar = null;
        if (z) {
            if (this.j && this.a.G() && (K = this.d.K()) != null && K.U()) {
                this.d.g().e();
            }
            if (str != null) {
                this.b.c(str);
            }
            this.b.r();
            azqu azquVar = new azqu(this.l, this.e);
            azquVar.a = l;
            azquVar.e = decqVar;
            azquVar.f = str2;
            if (dniuVar != null) {
                int i = dniuVar.a;
                if ((i & 4) != 0 && (i & 1) != 0 && (i & 64) != 0) {
                    azquVar.b = dniuVar.d;
                    azquVar.c = dniuVar.b;
                    dnoh dnohVar = dniuVar.g;
                    if (dnohVar == null) {
                        dnohVar = dnoh.d;
                    }
                    azquVar.d = akqq.e(dnohVar);
                    azqvVar = azquVar.a();
                    this.c.b(azqvVar);
                }
            }
            azquVar.b = this.f;
            azquVar.c = this.g;
            azquVar.d = this.h;
            azquVar.g = this.i;
            azqvVar = azquVar.a();
            this.c.b(azqvVar);
        } else {
            String string = this.d.getString(b(this.l, this.e, false));
            if (!dbsj.d(string)) {
                ckos.a(this.d.findViewById(16908290), string, -1).c();
            }
            azqvVar = null;
        }
        axvp axvpVar = this.k;
        if (axvpVar != null) {
            if (azqvVar != null) {
                azvb azvbVar = azqvVar.a;
                dndr dndrVar = azqvVar.b;
                Long l2 = azqvVar.c;
                Long valueOf = Long.valueOf(l2 == null ? 0L : l2.longValue());
                String str3 = azqvVar.e;
                azva a = azva.a(dndrVar, valueOf, str3 == null ? akqi.a : akqi.b(str3), dbsj.e(azqvVar.d), azqvVar.f, dbsj.e(azqvVar.h), azqvVar.g);
                dofx bZ = dofy.i.bZ();
                Long l3 = azqvVar.c;
                if (l3 != null) {
                    dndk bZ2 = dndl.d.bZ();
                    dndr dndrVar2 = azqvVar.b;
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dndl dndlVar = (dndl) bZ2.b;
                    dndlVar.b = dndrVar2.h;
                    dndlVar.a |= 1;
                    String valueOf2 = String.valueOf(l3);
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dndl dndlVar2 = (dndl) bZ2.b;
                    valueOf2.getClass();
                    dndlVar2.a |= 2;
                    dndlVar2.c = valueOf2;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dofy dofyVar = (dofy) bZ.b;
                    dndl bK = bZ2.bK();
                    bK.getClass();
                    dofyVar.b = bK;
                    dofyVar.a |= 1;
                }
                dolj bZ3 = dolk.h.bZ();
                String str4 = azqvVar.e;
                if (str4 != null) {
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dolk dolkVar = (dolk) bZ3.b;
                    str4.getClass();
                    dolkVar.a |= 16;
                    dolkVar.g = str4;
                }
                akqq akqqVar = azqvVar.f;
                if (akqqVar != null) {
                    dnog bZ4 = dnoh.d.bZ();
                    double d = akqqVar.a;
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    dnoh dnohVar2 = (dnoh) bZ4.b;
                    int i2 = dnohVar2.a | 1;
                    dnohVar2.a = i2;
                    dnohVar2.b = d;
                    double d2 = akqqVar.b;
                    dnohVar2.a = i2 | 2;
                    dnohVar2.c = d2;
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dolk dolkVar2 = (dolk) bZ3.b;
                    dnoh bK2 = bZ4.bK();
                    bK2.getClass();
                    dolkVar2.e = bK2;
                    dolkVar2.a |= 4;
                }
                if (!dbsj.d(azqvVar.d)) {
                    String str5 = azqvVar.d;
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dolk dolkVar3 = (dolk) bZ3.b;
                    str5.getClass();
                    dolkVar3.a |= 2;
                    dolkVar3.d = str5;
                }
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dofy dofyVar2 = (dofy) bZ.b;
                dolk bK3 = bZ3.bK();
                bK3.getClass();
                dofyVar2.e = bK3;
                dofyVar2.a |= 8;
                if (!dbsj.d(azqvVar.h)) {
                    String str6 = azqvVar.h;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dofy dofyVar3 = (dofy) bZ.b;
                    str6.getClass();
                    dofyVar3.a |= 4;
                    dofyVar3.d = str6;
                }
                decq decqVar2 = azqvVar.g;
                if (decqVar2 != null) {
                    int i3 = decqVar2.b;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dofy dofyVar4 = (dofy) bZ.b;
                    dofyVar4.a |= 2;
                    dofyVar4.c = i3;
                }
                if (!dbsj.d(azqvVar.i)) {
                    String str7 = azqvVar.i;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dofy dofyVar5 = (dofy) bZ.b;
                    str7.getClass();
                    dofyVar5.a |= 32;
                    dofyVar5.g = str7;
                }
                azvdVar = new azvd(azvbVar, a, new azwz(bZ.bK()).b());
            }
            axvpVar.E(z, azvdVar, this.d);
        }
    }
}
