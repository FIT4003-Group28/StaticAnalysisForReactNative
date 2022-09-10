package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: apwp  reason: default package */
/* loaded from: classes2.dex */
public final class apwp implements brva {
    private final dzsj<Activity> a;
    private final dzsj<btvo> b;
    private final dzsj<dxio<apyz>> c;
    private final dzsj<dxio<bhjg>> d;
    private final dzsj<bebu> e;
    private final dzsj<brsc> f;

    public apwp(dzsj<Activity> dzsjVar, dzsj<btvo> dzsjVar2, dzsj<dxio<apyz>> dzsjVar3, dzsj<dxio<bhjg>> dzsjVar4, dzsj<bebu> dzsjVar5, dzsj<brsc> dzsjVar6) {
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
        b(dzsjVar6, 6);
        this.f = dzsjVar6;
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

    @Override // defpackage.brva
    public final /* bridge */ /* synthetic */ brvb a(jba jbaVar, brrx brrxVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        btvo a = this.b.a();
        b(a, 2);
        dxio a2 = ((dxjh) this.c).a();
        b(a2, 3);
        dxio a3 = ((dxjh) this.d).a();
        b(a3, 4);
        bebu a4 = this.e.a();
        b(a4, 5);
        brsc a5 = this.f.a();
        b(a5, 6);
        b(jbaVar, 7);
        b(brrxVar, 8);
        return new apwo(activity, a, a2, a3, a4, a5, jbaVar, brrxVar);
    }
}
