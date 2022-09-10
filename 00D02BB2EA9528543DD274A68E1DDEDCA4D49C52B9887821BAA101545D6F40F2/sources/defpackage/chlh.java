package defpackage;

import android.content.res.Resources;
import com.google.android.apps.gmm.ugc.disclosure.PublicDisclosureLayout$PublicDisclosureViewModelImpl;
/* compiled from: PG */
/* renamed from: chlh  reason: default package */
/* loaded from: classes4.dex */
public final class chlh {
    public final dzsj<cafi> a;
    public final dzsj<chnm> b;
    public final dzsj<cqhn> c;
    public final dzsj<Resources> d;
    public final dzsj<chkv> e;
    public final dzsj<chix> f;
    public final dzsj<chgz> g;
    public final dzsj<PublicDisclosureLayout$PublicDisclosureViewModelImpl> h;
    public final dzsj<caxn> i;

    public chlh(dzsj<cafi> dzsjVar, dzsj<chnm> dzsjVar2, dzsj<cqhn> dzsjVar3, dzsj<Resources> dzsjVar4, dzsj<chkv> dzsjVar5, dzsj<chix> dzsjVar6, dzsj<chgz> dzsjVar7, dzsj<PublicDisclosureLayout$PublicDisclosureViewModelImpl> dzsjVar8, dzsj<caxn> dzsjVar9) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.d = dzsjVar4;
        a(dzsjVar5, 5);
        this.e = dzsjVar5;
        a(dzsjVar6, 6);
        this.f = dzsjVar6;
        a(dzsjVar7, 7);
        this.g = dzsjVar7;
        a(dzsjVar8, 8);
        this.h = dzsjVar8;
        a(dzsjVar9, 9);
        this.i = dzsjVar9;
    }

    public static <T> void a(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
