package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import j$.util.Optional;
/* compiled from: PG */
/* renamed from: gam  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gam implements ayqe {
    private final /* synthetic */ int v;
    public static final /* synthetic */ gam u = new gam(20);
    public static final /* synthetic */ gam t = new gam(19);
    public static final /* synthetic */ gam s = new gam(18);
    public static final /* synthetic */ gam r = new gam(17);
    public static final /* synthetic */ gam q = new gam(16);
    public static final /* synthetic */ gam p = new gam(15);
    public static final /* synthetic */ gam o = new gam(14);
    public static final /* synthetic */ gam n = new gam(13);
    public static final /* synthetic */ gam m = new gam(12);
    public static final /* synthetic */ gam l = new gam(11);
    public static final /* synthetic */ gam k = new gam(10);
    public static final /* synthetic */ gam j = new gam(9);
    public static final /* synthetic */ gam i = new gam(8);
    public static final /* synthetic */ gam h = new gam(7);
    public static final /* synthetic */ gam g = new gam(6);
    public static final /* synthetic */ gam f = new gam(5);
    public static final /* synthetic */ gam e = new gam(4);
    public static final /* synthetic */ gam d = new gam(3);
    public static final /* synthetic */ gam c = new gam(2);
    public static final /* synthetic */ gam b = new gam(1);
    public static final /* synthetic */ gam a = new gam();

    private /* synthetic */ gam() {
    }

    private /* synthetic */ gam(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ayqe
    public final Object a(Object obj) {
        boolean z = false;
        switch (this.v) {
            case 0:
                return ampq.j((Integer) obj);
            case 1:
                ahic ahicVar = (ahic) obj;
                return ahicVar.a().V().C(new ibq(ahicVar, 1));
            case 2:
                gbd gbdVar = (gbd) obj;
                return ayoi.T(Optional.empty());
            case 3:
                return (byte[]) ((ampq) obj).c();
            case 4:
                try {
                    return (avgi) aopi.parseFrom(avgi.a, (byte[]) obj, aoos.b());
                } catch (aopx e2) {
                    throw new RuntimeException(e2);
                }
            case 5:
                return ((Context) obj).getApplicationContext();
            case 6:
                return ghs.a((Context) obj);
            case 7:
                return Boolean.valueOf(zew.y((Context) obj));
            case 8:
                return Boolean.valueOf(((zbb) obj) instanceof zbe);
            case 9:
                if (((Integer) obj).intValue() != 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 10:
                if (((Integer) obj).intValue() == 2) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 11:
                return Optional.of((aajj) obj);
            case 12:
                return (ayoi) obj;
            case 13:
                return new hqi(Optional.ofNullable(obj), Optional.empty());
            case 14:
                Throwable th = (Throwable) obj;
                if (th instanceof cff) {
                    return new hqi(Optional.empty(), Optional.of((cff) th));
                }
                throw new zhw(th);
            case 15:
                ahic ahicVar2 = (ahic) obj;
                int i2 = ico.bD;
                return ahicVar2.a().A().C(new ibq(ahicVar2));
            case 16:
                return Optional.of((PlayerResponseModel) obj);
            case 17:
                return Boolean.valueOf(eog.W((arhd) obj));
            case 18:
                return (byte[]) ((ampq) obj).c();
            case 19:
                try {
                    return ayoi.T((atfi) aopi.parseFrom(atfi.a, (byte[]) obj, aoos.b()));
                } catch (aopx e3) {
                    return ayoi.H(e3);
                }
            default:
                ilo iloVar = (ilo) obj;
                avvb avvbVar = iloVar.a;
                avvb avvbVar2 = iloVar.b;
                if (avvbVar2 == null) {
                    return ilr.NONE;
                }
                if (avvbVar == null) {
                    if (avvbVar2.getNumVideosFailed().intValue() > 0) {
                        return ilr.ERROR_STATE;
                    }
                    if (avvbVar2.getNumVideosInProgress().intValue() > 0) {
                        return ilr.PROGRESS_STATE;
                    }
                    if (avvbVar2.getNumVideosCompleted().intValue() > 0) {
                        return ilr.COMPLETE_STATE;
                    }
                    return ilr.NONE;
                } else if (avvbVar2.getNumVideosFailed().intValue() > avvbVar.getNumVideosFailed().intValue()) {
                    return ilr.ERROR_STATE;
                } else {
                    if (avvbVar2.getNumVideosInProgress().intValue() > avvbVar.getNumVideosInProgress().intValue()) {
                        return ilr.PROGRESS_STATE;
                    }
                    if (avvbVar2.getNumVideosCompleted().intValue() > avvbVar.getNumVideosCompleted().intValue()) {
                        return ilr.COMPLETE_STATE;
                    }
                    return ilr.NONE;
                }
        }
    }
}
