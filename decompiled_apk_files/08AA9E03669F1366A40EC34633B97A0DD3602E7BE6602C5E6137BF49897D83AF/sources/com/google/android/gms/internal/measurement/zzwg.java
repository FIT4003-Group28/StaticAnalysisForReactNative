package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tagmanager.zzgj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzwg {
    private String version;
    private final List<zzwh> zzblb;
    private final Map<String, List<zzwd>> zzblc;
    private int zzow;

    private zzwg() {
        this.zzblb = new ArrayList();
        this.zzblc = new HashMap();
        this.version = "";
        this.zzow = 0;
    }

    public final zzwg zzad(int i) {
        this.zzow = i;
        return this;
    }

    public final zzwg zzb(zzwh zzwhVar) {
        this.zzblb.add(zzwhVar);
        return this;
    }

    public final zzwg zzc(zzwd zzwdVar) {
        String zzc = zzgj.zzc(zzwdVar.zzrb().get(zzb.INSTANCE_NAME.toString()));
        List<zzwd> list = this.zzblc.get(zzc);
        if (list == null) {
            list = new ArrayList<>();
            this.zzblc.put(zzc, list);
        }
        list.add(zzwdVar);
        return this;
    }

    public final zzwg zzes(String str) {
        this.version = str;
        return this;
    }

    public final zzwf zzrw() {
        return new zzwf(this.zzblb, this.zzblc, this.version, this.zzow);
    }
}
