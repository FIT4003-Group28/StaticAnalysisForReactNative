package defpackage;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: advr  reason: default package */
/* loaded from: classes.dex */
public final class advr {
    public static final String a = zep.a("MDX.user");
    static final long b = TimeUnit.DAYS.toMillis(1);
    public final azqb c;
    public final snc d;
    public final int[] e;
    public final int[] f;
    public long g;

    public advr(azqb azqbVar, snc sncVar) {
        int[] iArr = new int[28];
        this.e = iArr;
        int[] iArr2 = new int[28];
        this.f = iArr2;
        this.c = azqbVar;
        this.d = sncVar;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.g = 0L;
    }

    public static void a(String str, int[] iArr) {
        String[] split = str.split(",");
        int length = split.length;
        if (length != 28) {
            String.format(Locale.US, "Expected %d values in the storage but found %d values", 28, Integer.valueOf(length));
        }
        for (int i = 0; i < Math.min(split.length, 28); i++) {
            if (!TextUtils.isEmpty(split[i])) {
                iArr[i] = Integer.parseInt(split[i]);
            }
        }
    }

    public static void d(List list, int[] iArr) {
        if (list.size() != 28) {
            String.format(Locale.US, "Expected %d values in the storage but found %d values", 28, Integer.valueOf(list.size()));
        }
        for (int i = 0; i < Math.min(list.size(), 28); i++) {
            iArr[i] = ((Integer) list.get(i)).intValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(int[] iArr, int[] iArr2, int i) {
        f(iArr, iArr2, i, amon.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(final int[] iArr, final int[] iArr2, final int i, final ampq ampqVar) {
        if (this.g != 0) {
            System.arraycopy(iArr, 0, this.e, 0, 28);
            System.arraycopy(iArr2, 0, this.f, 0, 28);
        }
        ylx.m(((yve) this.c.get()).b(new ampg() { // from class: advp
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                advr advrVar = advr.this;
                ampq ampqVar2 = ampqVar;
                int i2 = i;
                int[] iArr3 = iArr;
                int[] iArr4 = iArr2;
                aopa mo52toBuilder = ((awub) obj).mo52toBuilder();
                if (ampqVar2.h()) {
                    long longValue = ((Long) ampqVar2.c()).longValue();
                    mo52toBuilder.copyOnWrite();
                    awub awubVar = (awub) mo52toBuilder.instance;
                    awubVar.b |= 2;
                    awubVar.d = longValue;
                }
                if (i2 == 2) {
                    long c = advrVar.d.c();
                    mo52toBuilder.copyOnWrite();
                    awub awubVar2 = (awub) mo52toBuilder.instance;
                    awubVar2.b |= 1;
                    awubVar2.c = c;
                }
                long j = advrVar.g;
                if (j != 0) {
                    mo52toBuilder.copyOnWrite();
                    awub awubVar3 = (awub) mo52toBuilder.instance;
                    awubVar3.b |= 4;
                    awubVar3.g = j;
                    mo52toBuilder.copyOnWrite();
                    ((awub) mo52toBuilder.instance).e = awub.emptyIntList();
                    mo52toBuilder.be(almu.x(iArr3));
                    mo52toBuilder.copyOnWrite();
                    ((awub) mo52toBuilder.instance).f = awub.emptyIntList();
                    mo52toBuilder.bd(almu.x(iArr4));
                }
                return (awub) mo52toBuilder.mo39build();
            }
        }), adkd.o);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g() {
        long c = this.d.c();
        long j = this.g;
        long j2 = b;
        if (c - j < j2) {
            return false;
        }
        int i = (int) ((c - j) / j2);
        this.g = j + (i * j2);
        int min = Math.min(i, 28);
        for (int i2 = 27; i2 >= min; i2--) {
            int[] iArr = this.e;
            int i3 = i2 - min;
            iArr[i2] = iArr[i3];
            int[] iArr2 = this.f;
            iArr2[i2] = iArr2[i3];
        }
        Arrays.fill(this.e, 0, min, 0);
        Arrays.fill(this.f, 0, min, 0);
        return true;
    }
}
