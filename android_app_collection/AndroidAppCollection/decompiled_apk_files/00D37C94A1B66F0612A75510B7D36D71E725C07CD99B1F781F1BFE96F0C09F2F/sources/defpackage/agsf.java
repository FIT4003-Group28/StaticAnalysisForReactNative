package defpackage;

import android.util.Pair;
import java.util.Comparator;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
/* compiled from: PG */
/* renamed from: agsf  reason: default package */
/* loaded from: classes.dex */
public final class agsf implements Comparator {
    private final /* synthetic */ int a;

    public agsf() {
    }

    public agsf(int i) {
        this.a = i;
    }

    public static final int a(alcw alcwVar, alcw alcwVar2) {
        return amss.g(almu.p(alcwVar.h, alcwVar2.h)).c(alcwVar.e, alcwVar2.e).a();
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                return ((Long) obj2).compareTo((Long) obj);
            } else if (i == 2) {
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                if (((Integer) pair2.first).intValue() == ((Integer) pair.first).intValue()) {
                    return ((Long) pair.second).compareTo((Long) pair2.second);
                }
                return ((Integer) pair2.first).compareTo((Integer) pair.first);
            } else if (i == 3) {
                return a((alcw) obj, (alcw) obj2);
            } else {
                CronetProvider cronetProvider = (CronetProvider) obj;
                CronetProvider cronetProvider2 = (CronetProvider) obj2;
                if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(cronetProvider.getName())) {
                    return 1;
                }
                if (!CronetProvider.PROVIDER_NAME_FALLBACK.equals(cronetProvider2.getName())) {
                    return -CronetEngine.Builder.compareVersions(cronetProvider.getVersion(), cronetProvider2.getVersion());
                }
                return -1;
            }
        }
        agrv agrvVar = (agrv) obj;
        agrv agrvVar2 = (agrv) obj2;
        atrc atrcVar = agrvVar.c.e;
        if (atrcVar == null) {
            atrcVar = atrc.b;
        }
        int i2 = atrcVar.d;
        atrc atrcVar2 = agrvVar2.c.e;
        if (atrcVar2 == null) {
            atrcVar2 = atrc.b;
        }
        int i3 = i2 - atrcVar2.d;
        if (i3 != 0) {
            return i3;
        }
        long j = agrvVar.d;
        long j2 = agrvVar2.d;
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }
}
