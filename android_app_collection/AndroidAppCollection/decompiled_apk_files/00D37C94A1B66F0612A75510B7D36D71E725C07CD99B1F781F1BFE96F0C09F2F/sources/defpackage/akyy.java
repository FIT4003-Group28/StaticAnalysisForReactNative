package defpackage;

import android.util.SparseArray;
/* compiled from: PG */
/* renamed from: akyy  reason: default package */
/* loaded from: classes.dex */
public enum akyy implements akyw {
    UNKNOWN(0),
    LEGACY(1),
    EXTERNAL(2),
    SHORTS(3);
    
    static final SparseArray e = new SparseArray();
    private final int g;

    static {
        akyy[] values;
        for (akyy akyyVar : values()) {
            e.put(akyyVar.g, akyyVar);
        }
    }

    akyy(int i) {
        this.g = i;
    }

    public static String c(avui avuiVar) {
        int ordinal = avuiVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return LEGACY.d();
            }
            if (ordinal == 2) {
                return EXTERNAL.d();
            }
            if (ordinal == 3) {
                return SHORTS.d();
            }
            return UNKNOWN.d();
        }
        return UNKNOWN.d();
    }

    @Override // defpackage.akyw
    public final /* bridge */ /* synthetic */ akyw a(int i) {
        return (akyy) e.get(i);
    }

    @Override // defpackage.akyw
    public final String b() {
        return "cf";
    }

    public final String d() {
        int i = this.g;
        StringBuilder sb = new StringBuilder(14);
        sb.append("cf=");
        sb.append(i);
        return sb.toString();
    }
}
