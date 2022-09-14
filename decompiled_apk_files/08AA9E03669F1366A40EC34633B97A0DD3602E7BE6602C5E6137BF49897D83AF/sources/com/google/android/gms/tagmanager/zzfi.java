package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.zzwd;
import com.google.android.gms.internal.measurement.zzwh;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
final class zzfi {
    private zzwd zzbbz;
    private final Set<zzwh> zzbbl = new HashSet();
    private final Map<zzwh, List<zzwd>> zzbbv = new HashMap();
    private final Map<zzwh, List<String>> zzbbx = new HashMap();
    private final Map<zzwh, List<zzwd>> zzbbw = new HashMap();
    private final Map<zzwh, List<String>> zzbby = new HashMap();

    public final void zza(zzwh zzwhVar) {
        this.zzbbl.add(zzwhVar);
    }

    public final void zza(zzwh zzwhVar, zzwd zzwdVar) {
        List<zzwd> list = this.zzbbv.get(zzwhVar);
        if (list == null) {
            list = new ArrayList<>();
            this.zzbbv.put(zzwhVar, list);
        }
        list.add(zzwdVar);
    }

    public final void zza(zzwh zzwhVar, String str) {
        List<String> list = this.zzbbx.get(zzwhVar);
        if (list == null) {
            list = new ArrayList<>();
            this.zzbbx.put(zzwhVar, list);
        }
        list.add(str);
    }

    public final void zzb(zzwd zzwdVar) {
        this.zzbbz = zzwdVar;
    }

    public final void zzb(zzwh zzwhVar, zzwd zzwdVar) {
        List<zzwd> list = this.zzbbw.get(zzwhVar);
        if (list == null) {
            list = new ArrayList<>();
            this.zzbbw.put(zzwhVar, list);
        }
        list.add(zzwdVar);
    }

    public final void zzb(zzwh zzwhVar, String str) {
        List<String> list = this.zzbby.get(zzwhVar);
        if (list == null) {
            list = new ArrayList<>();
            this.zzbby.put(zzwhVar, list);
        }
        list.add(str);
    }

    public final Set<zzwh> zzoq() {
        return this.zzbbl;
    }

    public final Map<zzwh, List<zzwd>> zzor() {
        return this.zzbbv;
    }

    public final Map<zzwh, List<String>> zzos() {
        return this.zzbbx;
    }

    public final Map<zzwh, List<String>> zzot() {
        return this.zzbby;
    }

    public final Map<zzwh, List<zzwd>> zzou() {
        return this.zzbbw;
    }

    public final zzwd zzov() {
        return this.zzbbz;
    }
}
