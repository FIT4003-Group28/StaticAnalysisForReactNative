package defpackage;

import android.util.SparseArray;
/* compiled from: PG */
/* renamed from: akza  reason: default package */
/* loaded from: classes.dex */
public enum akza implements akyw {
    UNKNOWN(0),
    NORMAL(1),
    REELS(2),
    FEEDBACK_ONLY(3),
    LIVE_HIGHLIGHT(5);
    
    static final SparseArray f = new SparseArray();
    private final int h;

    static {
        akza[] values;
        for (akza akzaVar : values()) {
            f.put(akzaVar.h, akzaVar);
        }
    }

    akza(int i) {
        this.h = i;
    }

    public static String c(alcu alcuVar) {
        alcu alcuVar2 = alcu.UNKNOWN_UPLOAD;
        int ordinal = alcuVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return FEEDBACK_ONLY.d();
            }
            if (ordinal == 3) {
                return REELS.d();
            }
            if (ordinal == 4) {
                return LIVE_HIGHLIGHT.d();
            }
            if (ordinal != 5) {
                return UNKNOWN.d();
            }
        }
        return NORMAL.d();
    }

    @Override // defpackage.akyw
    public final /* bridge */ /* synthetic */ akyw a(int i) {
        return (akza) f.get(i);
    }

    @Override // defpackage.akyw
    public final String b() {
        return "ut";
    }

    public final String d() {
        int i = this.h;
        StringBuilder sb = new StringBuilder(14);
        sb.append("ut=");
        sb.append(i);
        return sb.toString();
    }
}
