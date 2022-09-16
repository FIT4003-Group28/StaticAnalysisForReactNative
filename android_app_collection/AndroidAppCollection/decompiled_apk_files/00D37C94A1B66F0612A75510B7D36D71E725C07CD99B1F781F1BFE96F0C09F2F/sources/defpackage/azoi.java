package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: azoi  reason: default package */
/* loaded from: classes2.dex */
public final class azoi extends Enum implements Callable, ayqe {
    public static final azoi a;
    private static final /* synthetic */ azoi[] b;

    static {
        azoi azoiVar = new azoi();
        a = azoiVar;
        b = new azoi[]{azoiVar};
    }

    private azoi() {
    }

    public static azoi[] values() {
        return (azoi[]) b.clone();
    }

    @Override // defpackage.ayqe
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new ArrayList();
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: b */
    public final List call() {
        return new ArrayList();
    }
}
