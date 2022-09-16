package defpackage;

import java.util.Random;
/* compiled from: PG */
/* renamed from: azsy  reason: default package */
/* loaded from: classes2.dex */
public final class azsy extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return new Random();
    }
}
