package defpackage;

import com.google.android.apps.gmm.directions.api.GmmNotice;
import java.util.List;
/* compiled from: PG */
/* renamed from: xiy  reason: default package */
/* loaded from: classes7.dex */
public class xiy {
    public final dzsj<eeu> a;
    public final dzsj<dxio<qbt>> b;
    public final dzsj<btvo> c;
    public final dzsj<zrt> d;

    public xiy(dzsj<eeu> dzsjVar, dzsj<dxio<qbt>> dzsjVar2, dzsj<btvo> dzsjVar3, dzsj<zrt> dzsjVar4) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
    }

    public static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final xix a(List<GmmNotice> list, @dzsi CharSequence charSequence, @dzsi cjtd cjtdVar) {
        eeu a = this.a.a();
        b(a, 1);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 2);
        btvo a3 = this.c.a();
        b(a3, 3);
        zrt a4 = this.d.a();
        b(a4, 4);
        b(list, 5);
        return new xix(a, a2, a3, a4, list, charSequence, cjtdVar, null);
    }
}
