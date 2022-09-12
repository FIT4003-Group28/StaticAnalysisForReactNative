package defpackage;

import java.util.HashSet;
/* compiled from: PG */
/* renamed from: bxwh  reason: default package */
/* loaded from: classes4.dex */
public final class bxwh implements bxjq {
    public final HashSet<Integer> a = new HashSet<>();
    public final HashSet<Integer> b = new HashSet<>();

    @Override // defpackage.bxjq
    public final boolean a(int i) {
        return this.a.contains(Integer.valueOf(i));
    }

    @Override // defpackage.bxjq
    public final boolean b(int i) {
        return this.b.contains(Integer.valueOf(i));
    }
}
