package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: cfum  reason: default package */
/* loaded from: classes4.dex */
public class cfum {
    public final dzsj<cftt> a;
    public final dzsj<dxio<aesb>> b;
    public final dzsj<dxio<bqji>> c;
    public final dzsj<Resources> d;

    public cfum(dzsj<cftt> dzsjVar, dzsj<dxio<aesb>> dzsjVar2, dzsj<dxio<bqji>> dzsjVar3, dzsj<Resources> dzsjVar4) {
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

    public final cful a(CharSequence charSequence, CharSequence charSequence2) {
        cftt a = this.a.a();
        b(a, 1);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 2);
        dxio a3 = ((dxjh) this.c).a();
        b(a3, 3);
        Resources a4 = this.d.a();
        b(a4, 4);
        b(charSequence, 5);
        b(charSequence2, 6);
        return new cful(a, a2, a3, a4, charSequence, charSequence2);
    }
}
