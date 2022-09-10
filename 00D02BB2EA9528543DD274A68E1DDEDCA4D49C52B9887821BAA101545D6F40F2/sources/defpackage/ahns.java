package defpackage;

import android.location.Location;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahns  reason: default package */
/* loaded from: classes2.dex */
public final class ahns {
    public final ckcw a;

    public ahns(ckcw ckcwVar) {
        this.a = ckcwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double c(Location location, Location location2) {
        return akqo.e(new akqq(location.getLatitude(), location.getLongitude()), new akqq(location2.getLatitude(), location2.getLongitude()));
    }

    static final dzpp<ahnq> d(List<GmmLocation> list) {
        dzpp<ahnq> dzppVar = new dzpp<>();
        int i = 0;
        for (ahnq ahnqVar : ahnq.values()) {
            dzppVar.a(ahnqVar, 0);
        }
        while (i < list.size() - 1) {
            int i2 = i + 1;
            double c = c(list.get(i), list.get(i2));
            if (c <= 0.05d) {
                dzppVar.a(ahnq.ZERO, dzppVar.g(ahnq.ZERO) + 1);
            } else if (c <= 1.0d) {
                dzppVar.a(ahnq.ZERO_TO_ONE, dzppVar.g(ahnq.ZERO_TO_ONE) + 1);
            } else if (c >= 128.0d) {
                dzppVar.a(ahnq.GREATER_THAN_HUNDRED_AND_TWENTY_EIGHT, dzppVar.g(ahnq.GREATER_THAN_HUNDRED_AND_TWENTY_EIGHT) + 1);
            } else {
                switch ((int) (Math.log(c) / Math.log(2.0d))) {
                    case 0:
                        dzppVar.a(ahnq.ONE_TO_TWO, dzppVar.g(ahnq.ONE_TO_TWO) + 1);
                        continue;
                    case 1:
                        dzppVar.a(ahnq.TWO_TO_FOUR, dzppVar.g(ahnq.TWO_TO_FOUR) + 1);
                        continue;
                    case 2:
                        dzppVar.a(ahnq.FOUR_TO_EIGHT, dzppVar.g(ahnq.FOUR_TO_EIGHT) + 1);
                        continue;
                    case 3:
                        dzppVar.a(ahnq.EIGHT_TO_SIXTEEN, dzppVar.g(ahnq.EIGHT_TO_SIXTEEN) + 1);
                        continue;
                    case 4:
                        dzppVar.a(ahnq.SIXTEEN_TO_THIRTY_TWO, dzppVar.g(ahnq.SIXTEEN_TO_THIRTY_TWO) + 1);
                        continue;
                    case 5:
                        dzppVar.a(ahnq.THIRTY_TWO_TO_SIXTY_FOUR, dzppVar.g(ahnq.THIRTY_TWO_TO_SIXTY_FOUR) + 1);
                        continue;
                    case 6:
                        dzppVar.a(ahnq.SIXTY_FOUR_TO_HUNDRED_AND_TWENTY_EIGHT, dzppVar.g(ahnq.SIXTY_FOUR_TO_HUNDRED_AND_TWENTY_EIGHT) + 1);
                        continue;
                }
            }
            i = i2;
        }
        return dzppVar;
    }

    static final long e(List<GmmLocation> list) {
        double d = dcyn.a;
        int i = 0;
        while (i < list.size() - 1) {
            int i2 = i + 1;
            d += c(list.get(i), list.get(i2));
            i = i2;
        }
        return (long) d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(List<GmmLocation> list, ckgu ckguVar, List<GmmLocation> list2, ckgu ckguVar2) {
        try {
            long e = e(list);
            long e2 = e(list2);
            ((ckcn) this.a.a(ckguVar)).b(e);
            ((ckcn) this.a.a(ckguVar2)).b(e2);
        } catch (Exception e3) {
            bvoo.j(e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(List<GmmLocation> list, ckgz ckgzVar, List<GmmLocation> list2, ckgz ckgzVar2) {
        ahnq[] values;
        try {
            dzpp<ahnq> d = d(list);
            dzpp<ahnq> d2 = d(list2);
            for (ahnq ahnqVar : ahnq.values()) {
                for (int i = 0; i < d.g(ahnqVar); i++) {
                    ((ckco) this.a.a(ckgzVar)).a(ahnqVar.k);
                }
                for (int i2 = 0; i2 < d2.g(ahnqVar); i2++) {
                    ((ckco) this.a.a(ckgzVar2)).a(ahnqVar.k);
                }
            }
        } catch (Exception e) {
            bvoo.j(e);
        }
    }
}
