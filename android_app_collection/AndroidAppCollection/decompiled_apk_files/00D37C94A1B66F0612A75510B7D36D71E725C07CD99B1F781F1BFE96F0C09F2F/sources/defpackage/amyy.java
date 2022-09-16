package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: amyy  reason: default package */
/* loaded from: classes.dex */
final class amyy extends amzl {
    final /* synthetic */ amyz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amyy(amyz amyzVar, Iterator it) {
        super(it);
        this.a = amyzVar;
    }

    @Override // defpackage.amzl
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new amyx(this, (Map.Entry) obj);
    }
}
