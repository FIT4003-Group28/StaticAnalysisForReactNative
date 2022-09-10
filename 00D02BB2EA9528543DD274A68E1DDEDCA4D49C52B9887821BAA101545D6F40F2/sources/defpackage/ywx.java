package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: ywx  reason: default package */
/* loaded from: classes7.dex */
public final class ywx {
    private final dzsj<Activity> a;
    private final dzsj<qbt> b;
    private final dzsj<cqat> c;
    private final dzsj<cqhn> d;
    private final dzsj<xaz> e;

    public ywx(dzsj<Activity> dzsjVar, dzsj<qbt> dzsjVar2, dzsj<cqat> dzsjVar3, dzsj<cqhn> dzsjVar4, dzsj<xaz> dzsjVar5) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
        b(dzsjVar5, 5);
        this.e = dzsjVar5;
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final yww a(@dzsi eaol eaolVar, @dzsi eaol eaolVar2, @dzsi donz donzVar, @dzsi String str, @dzsi CharSequence charSequence, dpjb dpjbVar, @dzsi String str2, @dzsi eapq eapqVar, @dzsi dqea dqeaVar, @dzsi doza dozaVar, akqi akqiVar, dpce dpceVar, @dzsi dpce dpceVar2, akqi akqiVar2, cjtd cjtdVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        qbt a = this.b.a();
        b(a, 2);
        cqat a2 = this.c.a();
        b(a2, 3);
        cqhn a3 = this.d.a();
        b(a3, 4);
        xaz a4 = this.e.a();
        b(a4, 5);
        b(dpjbVar, 11);
        b(akqiVar, 16);
        b(dpceVar, 17);
        b(akqiVar2, 19);
        b(cjtdVar, 20);
        return new yww(activity, a, a2, a3, a4, eaolVar, eaolVar2, donzVar, str, charSequence, dpjbVar, str2, eapqVar, dqeaVar, dozaVar, akqiVar, dpceVar, dpceVar2, akqiVar2, cjtdVar);
    }
}
