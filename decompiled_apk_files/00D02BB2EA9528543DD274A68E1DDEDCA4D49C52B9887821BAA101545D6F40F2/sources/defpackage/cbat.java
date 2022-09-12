package defpackage;

import android.content.Context;
import java.util.Calendar;
/* compiled from: PG */
/* renamed from: cbat  reason: default package */
/* loaded from: classes4.dex */
public class cbat {
    private final Context a;
    private final cqat b;
    private final cbbc c;
    private final cqkj d;
    private final cbqg e;
    private final caza f;

    public cbat(Context context, cqat cqatVar, cbbc cbbcVar, cqkj cqkjVar, cbqg cbqgVar, caza cazaVar) {
        this.a = context;
        this.b = cqatVar;
        this.c = cbbcVar;
        this.d = cqkjVar;
        this.e = cbqgVar;
        this.f = cazaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final cbqs a(@dzsi dpvi dpviVar, @dzsi dpvi dpviVar2, boolean z, cbbs cbbsVar, Runnable runnable, @dzsi dpvi dpviVar3, @dzsi cbau cbauVar, cayn caynVar, ges gesVar, boolean z2) {
        cayp cazbVar;
        if (this.e.c()) {
            caza cazaVar = this.f;
            Context context = this.a;
            cqkj cqkjVar = this.d;
            caza.a(context, 1);
            caza.a(cbbsVar, 4);
            caza.a(cqkjVar, 5);
            caza.a(gesVar, 8);
            cbqg a = cazaVar.a.a();
            caza.a(a, 10);
            cazbVar = new cayz(context, dpviVar2, cbauVar, cbbsVar, cqkjVar, z, dpviVar3, gesVar, z2, a);
        } else {
            cazbVar = new cazb(this.a, dpviVar2, cbbsVar, this.d, z, dpviVar3, gesVar);
        }
        return cbdi.a(dpviVar, cazbVar, new cbdw(this.a, dpviVar2, cbbsVar, this.d, z, this.e.b(), true), z, this.a, this.c, runnable, caynVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dpvi b() {
        dpvi s;
        Calendar calendar = Calendar.getInstance();
        synchronized (calendar) {
            calendar.setTimeInMillis(this.b.b());
            s = cbdh.s(calendar.get(1), calendar.get(2) + 1, calendar.get(5), Math.min(calendar.get(11) + 1, 23), 0);
        }
        return s;
    }
}
