package defpackage;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amtc  reason: default package */
/* loaded from: classes.dex */
public final class amtc extends amtf {
    final /* synthetic */ Iterable a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amtc(Iterable iterable, Iterable iterable2) {
        super(iterable);
        this.a = iterable2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
