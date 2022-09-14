package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzwb;
import com.google.android.gms.internal.measurement.zzwd;
import com.google.android.gms.internal.measurement.zzwf;
import com.google.android.gms.internal.measurement.zzwh;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
/* JADX INFO: Access modifiers changed from: package-private */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzfb {
    private static final zzdz<com.google.android.gms.internal.measurement.zzm> zzbbd = new zzdz<>(zzgj.zzpj(), true);
    private final DataLayer zzavu;
    private final zzwf zzbbe;
    private final zzbo zzbbf;
    private final Map<String, zzbq> zzbbg;
    private final Map<String, zzbq> zzbbh;
    private final Map<String, zzbq> zzbbi;
    private final zzp<zzwd, zzdz<com.google.android.gms.internal.measurement.zzm>> zzbbj;
    private final zzp<String, zzfh> zzbbk;
    private final Set<zzwh> zzbbl;
    private final Map<String, zzfi> zzbbm;
    private volatile String zzbbn;
    private int zzbbo;

    public zzfb(Context context, zzwf zzwfVar, DataLayer dataLayer, zzan zzanVar, zzan zzanVar2, zzbo zzboVar) {
        if (zzwfVar == null) {
            throw new NullPointerException("resource cannot be null");
        }
        this.zzbbe = zzwfVar;
        this.zzbbl = new HashSet(zzwfVar.zzqz());
        this.zzavu = dataLayer;
        this.zzbbf = zzboVar;
        zzfc zzfcVar = new zzfc(this);
        new zzq();
        this.zzbbj = zzq.zza(PKIFailureInfo.badCertTemplate, zzfcVar);
        zzfd zzfdVar = new zzfd(this);
        new zzq();
        this.zzbbk = zzq.zza(PKIFailureInfo.badCertTemplate, zzfdVar);
        this.zzbbg = new HashMap();
        zzb(new zzm(context));
        zzb(new zzam(zzanVar2));
        zzb(new zzaz(dataLayer));
        zzb(new zzgk(context, dataLayer));
        this.zzbbh = new HashMap();
        zzc(new zzak());
        zzc(new zzbl());
        zzc(new zzbm());
        zzc(new zzbs());
        zzc(new zzbt());
        zzc(new zzde());
        zzc(new zzdf());
        zzc(new zzel());
        zzc(new zzfy());
        this.zzbbi = new HashMap();
        zza(new zze(context));
        zza(new zzf(context));
        zza(new zzh(context));
        zza(new zzi(context));
        zza(new zzj(context));
        zza(new zzk(context));
        zza(new zzl(context));
        zza(new zzt());
        zza(new zzaj(this.zzbbe.getVersion()));
        zza(new zzam(zzanVar));
        zza(new zzas(dataLayer));
        zza(new zzbc(context));
        zza(new zzbd());
        zza(new zzbk());
        zza(new zzbp(this));
        zza(new zzbu());
        zza(new zzbv());
        zza(new zzcv(context));
        zza(new zzcx());
        zza(new zzdd());
        zza(new zzdk());
        zza(new zzdm(context));
        zza(new zzea());
        zza(new zzee());
        zza(new zzei());
        zza(new zzek());
        zza(new zzem(context));
        zza(new zzfj());
        zza(new zzfk());
        zza(new zzge());
        zza(new zzgl());
        this.zzbbm = new HashMap();
        for (zzwh zzwhVar : this.zzbbl) {
            for (int i = 0; i < zzwhVar.zzrx().size(); i++) {
                zzwd zzwdVar = zzwhVar.zzrx().get(i);
                zzfi zzb = zzb(this.zzbbm, zza(zzwdVar));
                zzb.zza(zzwhVar);
                zzb.zza(zzwhVar, zzwdVar);
                zzb.zza(zzwhVar, "Unknown");
            }
            for (int i2 = 0; i2 < zzwhVar.zzry().size(); i2++) {
                zzwd zzwdVar2 = zzwhVar.zzry().get(i2);
                zzfi zzb2 = zzb(this.zzbbm, zza(zzwdVar2));
                zzb2.zza(zzwhVar);
                zzb2.zzb(zzwhVar, zzwdVar2);
                zzb2.zzb(zzwhVar, "Unknown");
            }
        }
        for (Map.Entry<String, List<zzwd>> entry : this.zzbbe.zzrv().entrySet()) {
            for (zzwd zzwdVar3 : entry.getValue()) {
                if (!zzgj.zzg(zzwdVar3.zzrb().get(com.google.android.gms.internal.measurement.zzb.NOT_DEFAULT_MACRO.toString())).booleanValue()) {
                    zzb(this.zzbbm, entry.getKey()).zzb(zzwdVar3);
                }
            }
        }
    }

    private final zzdz<com.google.android.gms.internal.measurement.zzm> zza(com.google.android.gms.internal.measurement.zzm zzmVar, Set<String> set, zzgm zzgmVar) {
        if (!zzmVar.zzqh) {
            return new zzdz<>(zzmVar, true);
        }
        int i = zzmVar.type;
        if (i == 7) {
            com.google.android.gms.internal.measurement.zzm zzk = zzwb.zzk(zzmVar);
            zzk.zzqf = new com.google.android.gms.internal.measurement.zzm[zzmVar.zzqf.length];
            for (int i2 = 0; i2 < zzmVar.zzqf.length; i2++) {
                zzdz<com.google.android.gms.internal.measurement.zzm> zza = zza(zzmVar.zzqf[i2], set, zzgmVar.zzw(i2));
                if (zza == zzbbd) {
                    return zzbbd;
                }
                zzk.zzqf[i2] = zza.getObject();
            }
            return new zzdz<>(zzk, false);
        }
        switch (i) {
            case 2:
                com.google.android.gms.internal.measurement.zzm zzk2 = zzwb.zzk(zzmVar);
                zzk2.zzpy = new com.google.android.gms.internal.measurement.zzm[zzmVar.zzpy.length];
                for (int i3 = 0; i3 < zzmVar.zzpy.length; i3++) {
                    zzdz<com.google.android.gms.internal.measurement.zzm> zza2 = zza(zzmVar.zzpy[i3], set, zzgmVar.zzt(i3));
                    if (zza2 == zzbbd) {
                        return zzbbd;
                    }
                    zzk2.zzpy[i3] = zza2.getObject();
                }
                return new zzdz<>(zzk2, false);
            case 3:
                com.google.android.gms.internal.measurement.zzm zzk3 = zzwb.zzk(zzmVar);
                if (zzmVar.zzpz.length != zzmVar.zzqa.length) {
                    String valueOf = String.valueOf(zzmVar.toString());
                    zzdi.e(valueOf.length() != 0 ? "Invalid serving value: ".concat(valueOf) : new String("Invalid serving value: "));
                    return zzbbd;
                }
                zzk3.zzpz = new com.google.android.gms.internal.measurement.zzm[zzmVar.zzpz.length];
                zzk3.zzqa = new com.google.android.gms.internal.measurement.zzm[zzmVar.zzpz.length];
                for (int i4 = 0; i4 < zzmVar.zzpz.length; i4++) {
                    zzdz<com.google.android.gms.internal.measurement.zzm> zza3 = zza(zzmVar.zzpz[i4], set, zzgmVar.zzu(i4));
                    zzdz<com.google.android.gms.internal.measurement.zzm> zza4 = zza(zzmVar.zzqa[i4], set, zzgmVar.zzv(i4));
                    if (zza3 == zzbbd || zza4 == zzbbd) {
                        return zzbbd;
                    }
                    zzk3.zzpz[i4] = zza3.getObject();
                    zzk3.zzqa[i4] = zza4.getObject();
                }
                return new zzdz<>(zzk3, false);
            case 4:
                if (!set.contains(zzmVar.zzqb)) {
                    set.add(zzmVar.zzqb);
                    zzdz<com.google.android.gms.internal.measurement.zzm> zza5 = zzgn.zza(zza(zzmVar.zzqb, set, zzgmVar.zzoa()), zzmVar.zzqg);
                    set.remove(zzmVar.zzqb);
                    return zza5;
                }
                String str = zzmVar.zzqb;
                String obj = set.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 79 + String.valueOf(obj).length());
                sb.append("Macro cycle detected.  Current macro reference: ");
                sb.append(str);
                sb.append(".  Previous macro references: ");
                sb.append(obj);
                sb.append(".");
                zzdi.e(sb.toString());
                return zzbbd;
            default:
                int i5 = zzmVar.type;
                StringBuilder sb2 = new StringBuilder(25);
                sb2.append("Unknown type: ");
                sb2.append(i5);
                zzdi.e(sb2.toString());
                return zzbbd;
        }
    }

    @VisibleForTesting
    private final zzdz<Boolean> zza(zzwd zzwdVar, Set<String> set, zzen zzenVar) {
        zzdz<com.google.android.gms.internal.measurement.zzm> zza = zza(this.zzbbh, zzwdVar, set, zzenVar);
        Boolean zzg = zzgj.zzg(zza.getObject());
        zzenVar.zza(zzgj.zzj(zzg));
        return new zzdz<>(zzg, zza.zzob());
    }

    private final zzdz<com.google.android.gms.internal.measurement.zzm> zza(String str, Set<String> set, zzdl zzdlVar) {
        zzwd next;
        this.zzbbo++;
        zzfh zzfhVar = this.zzbbk.get(str);
        if (zzfhVar != null) {
            this.zzbbf.zznm();
            zza(zzfhVar.zzop(), set);
            this.zzbbo--;
            return zzfhVar.zzoo();
        }
        zzfi zzfiVar = this.zzbbm.get(str);
        if (zzfiVar == null) {
            String zzon = zzon();
            StringBuilder sb = new StringBuilder(String.valueOf(zzon).length() + 15 + String.valueOf(str).length());
            sb.append(zzon);
            sb.append("Invalid macro: ");
            sb.append(str);
            zzdi.e(sb.toString());
            this.zzbbo--;
            return zzbbd;
        }
        zzdz<Set<zzwd>> zza = zza(zzfiVar.zzoq(), set, new zzfe(this, zzfiVar.zzor(), zzfiVar.zzos(), zzfiVar.zzou(), zzfiVar.zzot()), zzdlVar.zzna());
        if (zza.getObject().isEmpty()) {
            next = zzfiVar.zzov();
        } else {
            if (zza.getObject().size() > 1) {
                String zzon2 = zzon();
                StringBuilder sb2 = new StringBuilder(String.valueOf(zzon2).length() + 37 + String.valueOf(str).length());
                sb2.append(zzon2);
                sb2.append("Multiple macros active for macroName ");
                sb2.append(str);
                zzdi.zzaa(sb2.toString());
            }
            next = zza.getObject().iterator().next();
        }
        if (next == null) {
            this.zzbbo--;
            return zzbbd;
        }
        zzdz<com.google.android.gms.internal.measurement.zzm> zza2 = zza(this.zzbbi, next, set, zzdlVar.zzns());
        zzdz<com.google.android.gms.internal.measurement.zzm> zzdzVar = zza2 == zzbbd ? zzbbd : new zzdz<>(zza2.getObject(), zza.zzob() && zza2.zzob());
        com.google.android.gms.internal.measurement.zzm zzop = next.zzop();
        if (zzdzVar.zzob()) {
            this.zzbbk.zza(str, new zzfh(zzdzVar, zzop));
        }
        zza(zzop, set);
        this.zzbbo--;
        return zzdzVar;
    }

    private final zzdz<com.google.android.gms.internal.measurement.zzm> zza(Map<String, zzbq> map, zzwd zzwdVar, Set<String> set, zzen zzenVar) {
        String sb;
        com.google.android.gms.internal.measurement.zzm zzmVar = zzwdVar.zzrb().get(com.google.android.gms.internal.measurement.zzb.FUNCTION.toString());
        if (zzmVar == null) {
            sb = "No function id in properties";
        } else {
            String str = zzmVar.zzqc;
            zzbq zzbqVar = map.get(str);
            if (zzbqVar == null) {
                sb = String.valueOf(str).concat(" has no backing implementation.");
            } else {
                zzdz<com.google.android.gms.internal.measurement.zzm> zzdzVar = this.zzbbj.get(zzwdVar);
                if (zzdzVar != null) {
                    this.zzbbf.zznm();
                    return zzdzVar;
                }
                HashMap hashMap = new HashMap();
                boolean z = true;
                boolean z2 = true;
                for (Map.Entry<String, com.google.android.gms.internal.measurement.zzm> entry : zzwdVar.zzrb().entrySet()) {
                    zzdz<com.google.android.gms.internal.measurement.zzm> zza = zza(entry.getValue(), set, zzenVar.zzdg(entry.getKey()).zzb(entry.getValue()));
                    if (zza == zzbbd) {
                        return zzbbd;
                    }
                    if (zza.zzob()) {
                        zzwdVar.zza(entry.getKey(), zza.getObject());
                    } else {
                        z2 = false;
                    }
                    hashMap.put(entry.getKey(), zza.getObject());
                }
                if (zzbqVar.zza(hashMap.keySet())) {
                    if (!z2 || !zzbqVar.zzme()) {
                        z = false;
                    }
                    zzdz<com.google.android.gms.internal.measurement.zzm> zzdzVar2 = new zzdz<>(zzbqVar.zzd(hashMap), z);
                    if (z) {
                        this.zzbbj.zza(zzwdVar, zzdzVar2);
                    }
                    zzenVar.zza(zzdzVar2.getObject());
                    return zzdzVar2;
                }
                String valueOf = String.valueOf(zzbqVar.zzno());
                String valueOf2 = String.valueOf(hashMap.keySet());
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 43 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
                sb2.append("Incorrect keys for function ");
                sb2.append(str);
                sb2.append(" required ");
                sb2.append(valueOf);
                sb2.append(" had ");
                sb2.append(valueOf2);
                sb = sb2.toString();
            }
        }
        zzdi.e(sb);
        return zzbbd;
    }

    private final zzdz<Set<zzwd>> zza(Set<zzwh> set, Set<String> set2, zzfg zzfgVar, zzfa zzfaVar) {
        zzdz zzdzVar;
        Set<zzwd> hashSet = new HashSet<>();
        Set<zzwd> hashSet2 = new HashSet<>();
        while (true) {
            boolean z = true;
            for (zzwh zzwhVar : set) {
                zzeq zznz = zzfaVar.zznz();
                Iterator<zzwd> it = zzwhVar.zzre().iterator();
                while (true) {
                    boolean z2 = true;
                    while (true) {
                        if (!it.hasNext()) {
                            Iterator<zzwd> it2 = zzwhVar.zzrd().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    zzgj.zzj(true);
                                    zzdzVar = new zzdz(true, z2);
                                    break;
                                }
                                zzdz<Boolean> zza = zza(it2.next(), set2, zznz.zznu());
                                if (!zza.getObject().booleanValue()) {
                                    zzgj.zzj(false);
                                    zzdzVar = new zzdz(false, zza.zzob());
                                    break;
                                }
                                z2 = z2 && zza.zzob();
                            }
                        } else {
                            zzdz<Boolean> zza2 = zza(it.next(), set2, zznz.zznt());
                            if (zza2.getObject().booleanValue()) {
                                zzgj.zzj(false);
                                zzdzVar = new zzdz(false, zza2.zzob());
                                break;
                            } else if (!z2 || !zza2.zzob()) {
                                z2 = false;
                            }
                        }
                    }
                }
                if (((Boolean) zzdzVar.getObject()).booleanValue()) {
                    zzfgVar.zza(zzwhVar, hashSet, hashSet2, zznz);
                }
                if (!z || !zzdzVar.zzob()) {
                    z = false;
                }
            }
            hashSet.removeAll(hashSet2);
            zzfaVar.zzb(hashSet);
            return new zzdz<>(hashSet, z);
        }
    }

    private static String zza(zzwd zzwdVar) {
        return zzgj.zzc(zzwdVar.zzrb().get(com.google.android.gms.internal.measurement.zzb.INSTANCE_NAME.toString()));
    }

    private final void zza(com.google.android.gms.internal.measurement.zzm zzmVar, Set<String> set) {
        zzdz<com.google.android.gms.internal.measurement.zzm> zza;
        if (zzmVar == null || (zza = zza(zzmVar, set, new zzdx())) == zzbbd) {
            return;
        }
        Object zzh = zzgj.zzh(zza.getObject());
        if (zzh instanceof Map) {
            this.zzavu.push((Map) zzh);
        } else if (!(zzh instanceof List)) {
            zzdi.zzaa("pushAfterEvaluate: value not a Map or List");
        } else {
            for (Object obj : (List) zzh) {
                if (obj instanceof Map) {
                    this.zzavu.push((Map) obj);
                } else {
                    zzdi.zzaa("pushAfterEvaluate: value not a Map");
                }
            }
        }
    }

    @VisibleForTesting
    private final void zza(zzbq zzbqVar) {
        zza(this.zzbbi, zzbqVar);
    }

    private static void zza(Map<String, zzbq> map, zzbq zzbqVar) {
        if (map.containsKey(zzbqVar.zznn())) {
            String valueOf = String.valueOf(zzbqVar.zznn());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Duplicate function type name: ".concat(valueOf) : new String("Duplicate function type name: "));
        } else {
            map.put(zzbqVar.zznn(), zzbqVar);
        }
    }

    private static zzfi zzb(Map<String, zzfi> map, String str) {
        zzfi zzfiVar = map.get(str);
        if (zzfiVar == null) {
            zzfi zzfiVar2 = new zzfi();
            map.put(str, zzfiVar2);
            return zzfiVar2;
        }
        return zzfiVar;
    }

    @VisibleForTesting
    private final void zzb(zzbq zzbqVar) {
        zza(this.zzbbg, zzbqVar);
    }

    @VisibleForTesting
    private final void zzc(zzbq zzbqVar) {
        zza(this.zzbbh, zzbqVar);
    }

    @VisibleForTesting
    private final synchronized void zzdk(String str) {
        this.zzbbn = str;
    }

    private final String zzon() {
        if (this.zzbbo <= 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(this.zzbbo));
        for (int i = 2; i < this.zzbbo; i++) {
            sb.append(' ');
        }
        sb.append(": ");
        return sb.toString();
    }

    public final synchronized void zzco(String str) {
        zzdk(str);
        zzar zznl = this.zzbbf.zzda(str).zznl();
        for (zzwd zzwdVar : zza(this.zzbbl, new HashSet(), new zzff(this), zznl.zzna()).getObject()) {
            zza(this.zzbbg, zzwdVar, new HashSet(), zznl.zzmz());
        }
        zzdk(null);
    }

    public final zzdz<com.google.android.gms.internal.measurement.zzm> zzdj(String str) {
        this.zzbbo = 0;
        return zza(str, new HashSet(), this.zzbbf.zzcz(str).zznk());
    }

    public final synchronized void zzf(List<com.google.android.gms.internal.measurement.zzk> list) {
        com.google.android.gms.internal.measurement.zzf[] zzfVarArr;
        String str;
        Map<String, Object> map;
        for (com.google.android.gms.internal.measurement.zzk zzkVar : list) {
            if (zzkVar.name != null && zzkVar.name.startsWith("gaExperiment:")) {
                DataLayer dataLayer = this.zzavu;
                if (zzkVar.zzpt == null) {
                    zzdi.zzaa("supplemental missing experimentSupplemental");
                } else {
                    for (com.google.android.gms.internal.measurement.zzm zzmVar : zzkVar.zzpt.zzoe) {
                        dataLayer.zzcr(zzgj.zzc(zzmVar));
                    }
                    for (com.google.android.gms.internal.measurement.zzm zzmVar2 : zzkVar.zzpt.zzod) {
                        Object zzh = zzgj.zzh(zzmVar2);
                        if (!(zzh instanceof Map)) {
                            String valueOf = String.valueOf(zzh);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                            sb.append("value: ");
                            sb.append(valueOf);
                            sb.append(" is not a map value, ignored.");
                            zzdi.zzaa(sb.toString());
                            map = null;
                        } else {
                            map = (Map) zzh;
                        }
                        if (map != null) {
                            dataLayer.push(map);
                        }
                    }
                    for (com.google.android.gms.internal.measurement.zzf zzfVar : zzkVar.zzpt.zzof) {
                        if (zzfVar.zzny == null) {
                            str = "GaExperimentRandom: No key";
                        } else {
                            Object obj = dataLayer.get(zzfVar.zzny);
                            Long valueOf2 = !(obj instanceof Number) ? null : Long.valueOf(((Number) obj).longValue());
                            long j = zzfVar.zznz;
                            long j2 = zzfVar.zzoa;
                            if (!zzfVar.zzob || valueOf2 == null || valueOf2.longValue() < j || valueOf2.longValue() > j2) {
                                if (j <= j2) {
                                    obj = Long.valueOf(Math.round((Math.random() * (j2 - j)) + j));
                                } else {
                                    str = "GaExperimentRandom: random range invalid";
                                }
                            }
                            dataLayer.zzcr(zzfVar.zzny);
                            Map<String, Object> zzk = DataLayer.zzk(zzfVar.zzny, obj);
                            if (zzfVar.zzoc > 0) {
                                if (!zzk.containsKey("gtm")) {
                                    zzk.put("gtm", DataLayer.mapOf("lifetime", Long.valueOf(zzfVar.zzoc)));
                                } else {
                                    Object obj2 = zzk.get("gtm");
                                    if (obj2 instanceof Map) {
                                        ((Map) obj2).put("lifetime", Long.valueOf(zzfVar.zzoc));
                                    } else {
                                        zzdi.zzaa("GaExperimentRandom: gtm not a map");
                                    }
                                }
                            }
                            dataLayer.push(zzk);
                        }
                        zzdi.zzaa(str);
                    }
                }
            }
            String valueOf3 = String.valueOf(zzkVar);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 22);
            sb2.append("Ignored supplemental: ");
            sb2.append(valueOf3);
            zzdi.v(sb2.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized String zzom() {
        return this.zzbbn;
    }
}
