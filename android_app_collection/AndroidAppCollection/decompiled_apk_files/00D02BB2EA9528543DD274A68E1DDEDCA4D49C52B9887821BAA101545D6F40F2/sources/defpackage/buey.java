package defpackage;

import java.util.Date;
/* compiled from: PG */
/* renamed from: buey  reason: default package */
/* loaded from: classes4.dex */
final class buey extends dbma {
    final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public buey(String str) {
        super(null);
        this.a = str;
    }

    @Override // defpackage.dbma
    public final dblw a() {
        return new dblw(this.a, new Date(Long.MAX_VALUE));
    }
}
