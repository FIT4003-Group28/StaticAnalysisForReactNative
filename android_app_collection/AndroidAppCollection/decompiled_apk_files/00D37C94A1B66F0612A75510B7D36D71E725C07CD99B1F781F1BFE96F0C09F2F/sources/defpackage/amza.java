package defpackage;

import java.util.Collection;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: amza  reason: default package */
/* loaded from: classes.dex */
final class amza extends amzl {
    final /* synthetic */ amzb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amza(amzb amzbVar, Iterator it) {
        super(it);
        this.a = amzbVar;
    }

    @Override // defpackage.amzl
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return ancv.h((Collection) obj, this.a.g);
    }
}
