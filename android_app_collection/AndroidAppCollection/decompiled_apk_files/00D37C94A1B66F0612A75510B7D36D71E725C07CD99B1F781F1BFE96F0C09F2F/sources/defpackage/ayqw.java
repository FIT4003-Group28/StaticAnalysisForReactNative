package defpackage;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: ayqw  reason: default package */
/* loaded from: classes2.dex */
public final class ayqw extends Enum implements Callable {
    public static final ayqw a;
    private static final /* synthetic */ ayqw[] b;

    static {
        ayqw ayqwVar = new ayqw();
        a = ayqwVar;
        b = new ayqw[]{ayqwVar};
    }

    private ayqw() {
    }

    public static ayqw[] values() {
        return (ayqw[]) b.clone();
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a */
    public final Set call() {
        return new HashSet();
    }
}
