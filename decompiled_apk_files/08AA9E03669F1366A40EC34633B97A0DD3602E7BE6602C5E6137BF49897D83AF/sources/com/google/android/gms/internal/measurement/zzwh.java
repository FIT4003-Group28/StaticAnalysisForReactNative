package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class zzwh {
    private final List<zzwd> zzblf;
    private final List<zzwd> zzblg;
    private final List<zzwd> zzblh;
    private final List<zzwd> zzbli;
    private final List<zzwd> zzbml;
    private final List<zzwd> zzbmm;
    private final List<String> zzbmn;
    private final List<String> zzbmo;
    private final List<String> zzbmp;
    private final List<String> zzbmq;

    private zzwh(List<zzwd> list, List<zzwd> list2, List<zzwd> list3, List<zzwd> list4, List<zzwd> list5, List<zzwd> list6, List<String> list7, List<String> list8, List<String> list9, List<String> list10) {
        this.zzblf = Collections.unmodifiableList(list);
        this.zzblg = Collections.unmodifiableList(list2);
        this.zzblh = Collections.unmodifiableList(list3);
        this.zzbli = Collections.unmodifiableList(list4);
        this.zzbml = Collections.unmodifiableList(list5);
        this.zzbmm = Collections.unmodifiableList(list6);
        this.zzbmn = Collections.unmodifiableList(list7);
        this.zzbmo = Collections.unmodifiableList(list8);
        this.zzbmp = Collections.unmodifiableList(list9);
        this.zzbmq = Collections.unmodifiableList(list10);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzblf);
        String valueOf2 = String.valueOf(this.zzblg);
        String valueOf3 = String.valueOf(this.zzblh);
        String valueOf4 = String.valueOf(this.zzbli);
        String valueOf5 = String.valueOf(this.zzbml);
        String valueOf6 = String.valueOf(this.zzbmm);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 102 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("Positive predicates: ");
        sb.append(valueOf);
        sb.append("  Negative predicates: ");
        sb.append(valueOf2);
        sb.append("  Add tags: ");
        sb.append(valueOf3);
        sb.append("  Remove tags: ");
        sb.append(valueOf4);
        sb.append("  Add macros: ");
        sb.append(valueOf5);
        sb.append("  Remove macros: ");
        sb.append(valueOf6);
        return sb.toString();
    }

    public final List<zzwd> zzrd() {
        return this.zzblf;
    }

    public final List<zzwd> zzre() {
        return this.zzblg;
    }

    public final List<zzwd> zzrf() {
        return this.zzblh;
    }

    public final List<zzwd> zzrg() {
        return this.zzbli;
    }

    public final List<zzwd> zzrx() {
        return this.zzbml;
    }

    public final List<zzwd> zzry() {
        return this.zzbmm;
    }
}
