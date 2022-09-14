package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bpto  reason: default package */
/* loaded from: classes4.dex */
public class bpto {
    private final dzsj<bnyo> a;
    private final dzsj<btpc> b;
    private final dzsj<bvjj> c;
    private final dzsj<Activity> d;
    private final dzsj<eeu> e;
    private final dzsj<jmx> f;
    private final dzsj<chht> g;

    public bpto(dzsj<bnyo> dzsjVar, dzsj<btpc> dzsjVar2, dzsj<bvjj> dzsjVar3, dzsj<Activity> dzsjVar4, dzsj<eeu> dzsjVar5, dzsj<jmx> dzsjVar6, dzsj<chht> dzsjVar7) {
        c(dzsjVar, 1);
        this.a = dzsjVar;
        c(dzsjVar2, 2);
        this.b = dzsjVar2;
        c(dzsjVar3, 3);
        this.c = dzsjVar3;
        c(dzsjVar4, 4);
        this.d = dzsjVar4;
        c(dzsjVar5, 5);
        this.e = dzsjVar5;
        c(dzsjVar6, 6);
        this.f = dzsjVar6;
        c(dzsjVar7, 7);
        this.g = dzsjVar7;
    }

    private static <T> void c(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final bptn a(bptp bptpVar) {
        c(bptpVar, 1);
        bnyo a = this.a.a();
        c(a, 2);
        btpc a2 = this.b.a();
        c(a2, 3);
        c(this.c.a(), 4);
        Activity activity = (Activity) ((dxjd) this.d).a;
        c(activity, 5);
        eeu a3 = this.e.a();
        c(a3, 6);
        c(this.f.a(), 7);
        chht a4 = this.g.a();
        c(a4, 8);
        return new bptn(bptpVar, bptm.a, a, a2, activity, a3, a4);
    }

    public final bptn b(bptp bptpVar, bptm bptmVar) {
        c(bptpVar, 1);
        c(bptmVar, 2);
        bnyo a = this.a.a();
        c(a, 3);
        btpc a2 = this.b.a();
        c(a2, 4);
        c(this.c.a(), 5);
        Activity activity = (Activity) ((dxjd) this.d).a;
        c(activity, 6);
        eeu a3 = this.e.a();
        c(a3, 7);
        c(this.f.a(), 8);
        chht a4 = this.g.a();
        c(a4, 9);
        return new bptn(bptpVar, bptmVar, a, a2, activity, a3, a4);
    }
}
