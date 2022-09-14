package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
/* loaded from: classes.dex */
public abstract class StatsEvent extends com.google.android.gms.common.internal.x.a implements ReflectedParcelable {
    public abstract int q();

    public abstract long r();

    public abstract String s();

    public String toString() {
        long r = r();
        int q = q();
        long w = w();
        String s = s();
        StringBuilder sb = new StringBuilder(String.valueOf(s).length() + 53);
        sb.append(r);
        sb.append("\t");
        sb.append(q);
        sb.append("\t");
        sb.append(w);
        sb.append(s);
        return sb.toString();
    }

    public abstract long w();
}
