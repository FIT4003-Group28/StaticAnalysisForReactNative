package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: dzfm  reason: default package */
/* loaded from: classes6.dex */
public final class dzfm extends Enum<dzfm> implements Callable<List<Object>>, dzba {
    public static final dzfm a;
    private static final /* synthetic */ dzfm[] b;

    static {
        dzfm dzfmVar = new dzfm();
        a = dzfmVar;
        b = new dzfm[]{dzfmVar};
    }

    private dzfm() {
    }

    public static dzfm[] values() {
        return (dzfm[]) b.clone();
    }

    @Override // defpackage.dzba
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        throw null;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: b */
    public final List<Object> call() {
        return new ArrayList();
    }
}
