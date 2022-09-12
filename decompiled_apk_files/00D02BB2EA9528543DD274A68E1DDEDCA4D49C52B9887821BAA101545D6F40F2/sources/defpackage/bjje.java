package defpackage;

import com.google.android.apps.gmm.ugc.disclosure.PublicDisclosureLayout$PublicDisclosureViewModelImpl;
/* compiled from: PG */
/* renamed from: bjje  reason: default package */
/* loaded from: classes3.dex */
public final class bjje {
    public final dzsj<cqhn> a;
    public final dzsj<bjgu> b;
    public final dzsj<bvff> c;
    public final dzsj<btrm> d;
    public final dzsj<chhr> e;
    public final dzsj<chht> f;
    public final dzsj<bjhc> g;
    public final dzsj<cafi> h;
    public final dzsj<bjgi> i;
    public final dzsj<PublicDisclosureLayout$PublicDisclosureViewModelImpl> j;

    public bjje(dzsj<cqhn> dzsjVar, dzsj<bjgu> dzsjVar2, dzsj<bvff> dzsjVar3, dzsj<btrm> dzsjVar4, dzsj<chhr> dzsjVar5, dzsj<chht> dzsjVar6, dzsj<bjhc> dzsjVar7, dzsj<cafi> dzsjVar8, dzsj<bjgi> dzsjVar9, dzsj<PublicDisclosureLayout$PublicDisclosureViewModelImpl> dzsjVar10) {
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
        a(dzsjVar10, 10);
        this.j = dzsjVar10;
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
