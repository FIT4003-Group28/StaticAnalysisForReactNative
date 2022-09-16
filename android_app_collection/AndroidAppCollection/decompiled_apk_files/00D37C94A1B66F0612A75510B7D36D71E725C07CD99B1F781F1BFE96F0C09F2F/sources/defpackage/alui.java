package defpackage;

import android.os.SystemClock;
import java.util.List;
/* compiled from: PG */
/* renamed from: alui  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class alui implements Runnable {
    public final /* synthetic */ alum a;
    public final /* synthetic */ long b;
    public final /* synthetic */ List c;
    public final /* synthetic */ List d;
    private final /* synthetic */ int e;

    public /* synthetic */ alui(alum alumVar, long j, List list, List list2) {
        this.a = alumVar;
        this.b = j;
        this.c = list;
        this.d = list2;
    }

    public /* synthetic */ alui(alum alumVar, List list, List list2, long j, int i) {
        this.e = i;
        this.a = alumVar;
        this.c = list;
        this.d = list2;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.e == 0) {
            alum alumVar = this.a;
            long j = this.b;
            List list = this.c;
            List list2 = this.d;
            long j2 = j / 3;
            long j3 = 0;
            int i = 0;
            while (i < 3) {
                j3 = Math.min(j, j3 + j2);
                int i2 = i;
                alumVar.e(2, 0, Long.valueOf(j3), Long.valueOf(j), null, null, null);
                SystemClock.sleep(alum.a);
                int i3 = alumVar.c().b;
                if (i3 == 9 || i3 == 7 || i3 == 6) {
                    return;
                }
                i = i2 + 1;
            }
            alumVar.e.execute(new alui(alumVar, list, list2, j, 1));
            return;
        }
        alum alumVar2 = this.a;
        List list3 = this.c;
        List list4 = this.d;
        long j4 = this.b;
        if (alumVar2.i.get()) {
            alumVar2.e(6, -6, null, null, null, null, null);
        } else if (alumVar2.f.a() != null) {
            alumVar2.f.a().a();
        } else {
            alumVar2.g.addAll(list3);
            alumVar2.h.addAll(list4);
            Long valueOf = Long.valueOf(j4);
            alumVar2.e(5, 0, valueOf, valueOf, null, null, null);
        }
    }
}
