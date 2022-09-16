package defpackage;

import android.util.SparseArray;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: akyx  reason: default package */
/* loaded from: classes.dex */
public final class akyx extends Enum implements akyw {
    public static final akyx a;
    static final SparseArray b;
    private static final /* synthetic */ akyx[] d;
    public final int c = 1;

    static {
        akyx[] values;
        akyx akyxVar = new akyx();
        a = akyxVar;
        d = new akyx[]{akyxVar};
        b = new SparseArray();
        for (akyx akyxVar2 : values()) {
            b.put(akyxVar2.c, akyxVar2);
        }
    }

    private akyx() {
    }

    public static akyx[] values() {
        return (akyx[]) d.clone();
    }

    @Override // defpackage.akyw
    public final /* bridge */ /* synthetic */ akyw a(int i) {
        return (akyx) b.get(i);
    }

    @Override // defpackage.akyw
    public final String b() {
        return "api";
    }
}
