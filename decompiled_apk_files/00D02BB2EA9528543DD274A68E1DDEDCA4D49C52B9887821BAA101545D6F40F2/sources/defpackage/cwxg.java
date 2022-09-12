package defpackage;

import android.content.Context;
import android.provider.Settings;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
/* compiled from: PG */
/* renamed from: cwxg  reason: default package */
/* loaded from: classes5.dex */
final class cwxg {
    public final cqat a;
    private final String b = cwuu.d();
    private final String c;
    private final dxio<cwwz> d;

    public cwxg(cqat cqatVar, dxio<cwwz> dxioVar, Context context) {
        this.a = cqatVar;
        this.c = Settings.Secure.getString(context.getContentResolver(), "android_id");
        this.d = dxioVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final Long a(long j) {
        int i = 0;
        Random random = new Random(Objects.hash(Long.valueOf(j), this.c, this.b));
        double nextDouble = random.nextDouble();
        if (this.d.a().g() >= 1.0d) {
            double g = this.d.a().g();
            i = (int) Math.min(Math.round((g + g) * nextDouble), 2147483646L);
        } else if (nextDouble < this.d.a().g()) {
            i = 1;
        }
        long j2 = 31557600000L + j;
        int d = this.d.a().d();
        long j3 = (j2 - j) - (d + d);
        TreeSet treeSet = new TreeSet();
        while (treeSet.size() < i) {
            long abs = (Math.abs(Math.max(random.nextLong(), -9223372036854775807L)) % j3) + j;
            long d2 = this.d.a().d();
            long j4 = d2 + d2;
            if (treeSet.subSet(Long.valueOf(abs - j4), Long.valueOf(j4 + abs)).isEmpty()) {
                treeSet.add(Long.valueOf(abs));
            }
        }
        Long l = (Long) treeSet.ceiling(Long.valueOf(System.currentTimeMillis() + 100));
        if (l == null) {
            if (j >= System.currentTimeMillis()) {
                return null;
            }
            return a(j2);
        }
        return l;
    }
}
