package defpackage;

import java.util.Collection;
/* compiled from: PG */
/* renamed from: smu  reason: default package */
/* loaded from: classes4.dex */
public final class smu implements smt {
    final /* synthetic */ Collection a;

    public smu(Collection collection) {
        this.a = collection;
    }

    @Override // defpackage.smt
    public final boolean a(String str) {
        return this.a.contains(str);
    }
}
