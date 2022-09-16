package defpackage;

import java.util.ListIterator;
/* compiled from: PG */
/* renamed from: amwm  reason: default package */
/* loaded from: classes.dex */
final class amwm extends amzm {
    final /* synthetic */ amwn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amwm(amwn amwnVar, ListIterator listIterator) {
        super(listIterator);
        this.a = amwnVar;
    }

    @Override // defpackage.amzl
    public final Object a(Object obj) {
        return this.a.b.apply(obj);
    }
}
