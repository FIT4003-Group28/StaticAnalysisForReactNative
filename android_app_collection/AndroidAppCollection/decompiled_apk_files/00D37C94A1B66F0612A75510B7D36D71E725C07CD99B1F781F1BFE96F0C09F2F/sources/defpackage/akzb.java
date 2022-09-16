package defpackage;

import android.util.SparseArray;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: akzb  reason: default package */
/* loaded from: classes.dex */
public final class akzb extends Enum implements akyw {
    public static final akzb a;
    static final SparseArray b;
    private static final /* synthetic */ akzb[] d;
    public final int c = 3;

    static {
        akzb[] values;
        akzb akzbVar = new akzb();
        a = akzbVar;
        d = new akzb[]{akzbVar};
        b = new SparseArray();
        for (akzb akzbVar2 : values()) {
            b.put(akzbVar2.c, akzbVar2);
        }
    }

    private akzb() {
    }

    public static akzb[] values() {
        return (akzb[]) d.clone();
    }

    @Override // defpackage.akyw
    public final /* bridge */ /* synthetic */ akyw a(int i) {
        return (akzb) b.get(i);
    }

    @Override // defpackage.akyw
    public final String b() {
        return "v";
    }
}
