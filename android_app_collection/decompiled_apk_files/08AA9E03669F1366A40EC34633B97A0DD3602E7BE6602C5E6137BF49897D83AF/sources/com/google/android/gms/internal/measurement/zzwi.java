package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class zzwi {
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

    private zzwi() {
        this.zzblf = new ArrayList();
        this.zzblg = new ArrayList();
        this.zzblh = new ArrayList();
        this.zzbli = new ArrayList();
        this.zzbml = new ArrayList();
        this.zzbmm = new ArrayList();
        this.zzbmn = new ArrayList();
        this.zzbmo = new ArrayList();
        this.zzbmp = new ArrayList();
        this.zzbmq = new ArrayList();
    }

    public final zzwi zzd(zzwd zzwdVar) {
        this.zzblf.add(zzwdVar);
        return this;
    }

    public final zzwi zze(zzwd zzwdVar) {
        this.zzblg.add(zzwdVar);
        return this;
    }

    public final zzwi zzet(String str) {
        this.zzbmp.add(str);
        return this;
    }

    public final zzwi zzeu(String str) {
        this.zzbmq.add(str);
        return this;
    }

    public final zzwi zzev(String str) {
        this.zzbmn.add(str);
        return this;
    }

    public final zzwi zzew(String str) {
        this.zzbmo.add(str);
        return this;
    }

    public final zzwi zzf(zzwd zzwdVar) {
        this.zzblh.add(zzwdVar);
        return this;
    }

    public final zzwi zzg(zzwd zzwdVar) {
        this.zzbli.add(zzwdVar);
        return this;
    }

    public final zzwi zzh(zzwd zzwdVar) {
        this.zzbml.add(zzwdVar);
        return this;
    }

    public final zzwi zzi(zzwd zzwdVar) {
        this.zzbmm.add(zzwdVar);
        return this;
    }

    public final zzwh zzrz() {
        return new zzwh(this.zzblf, this.zzblg, this.zzblh, this.zzbli, this.zzbml, this.zzbmm, this.zzbmn, this.zzbmo, this.zzbmp, this.zzbmq);
    }
}
