package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: amwr  reason: default package */
/* loaded from: classes.dex */
final class amwr extends amzl {
    public amwr(Iterator it) {
        super(it);
    }

    @Override // defpackage.amzl
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return ((Map.Entry) obj).getValue();
    }
}
