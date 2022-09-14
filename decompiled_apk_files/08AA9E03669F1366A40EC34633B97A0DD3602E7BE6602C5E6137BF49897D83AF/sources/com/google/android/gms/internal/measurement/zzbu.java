package com.google.android.gms.internal.measurement;

import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public final class zzbu {
    private final zzat zzqm;
    private volatile Boolean zzxz;
    private String zzya;
    private Set<Integer> zzyb;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzbu(zzat zzatVar) {
        Preconditions.checkNotNull(zzatVar);
        this.zzqm = zzatVar;
    }

    public static boolean zzdt() {
        return zzcc.zzyl.get().booleanValue();
    }

    public static int zzdu() {
        return zzcc.zzzi.get().intValue();
    }

    public static long zzdv() {
        return zzcc.zzyt.get().longValue();
    }

    public static long zzdw() {
        return zzcc.zzyw.get().longValue();
    }

    public static int zzdx() {
        return zzcc.zzyy.get().intValue();
    }

    public static int zzdy() {
        return zzcc.zzyz.get().intValue();
    }

    @VisibleForTesting
    public static String zzdz() {
        return zzcc.zzzb.get();
    }

    @VisibleForTesting
    public static String zzea() {
        return zzcc.zzza.get();
    }

    public static String zzeb() {
        return zzcc.zzzc.get();
    }

    public static long zzed() {
        return zzcc.zzzq.get().longValue();
    }

    public final boolean zzds() {
        if (this.zzxz == null) {
            synchronized (this) {
                if (this.zzxz == null) {
                    ApplicationInfo applicationInfo = this.zzqm.getContext().getApplicationInfo();
                    String myProcessName = ProcessUtils.getMyProcessName();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.zzxz = Boolean.valueOf(str != null && str.equals(myProcessName));
                    }
                    if ((this.zzxz == null || !this.zzxz.booleanValue()) && "com.google.android.gms.analytics".equals(myProcessName)) {
                        this.zzxz = Boolean.TRUE;
                    }
                    if (this.zzxz == null) {
                        this.zzxz = Boolean.TRUE;
                        this.zzqm.zzbu().zzt("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.zzxz.booleanValue();
    }

    public final Set<Integer> zzec() {
        String str = zzcc.zzzl.get();
        if (this.zzyb == null || this.zzya == null || !this.zzya.equals(str)) {
            String[] split = TextUtils.split(str, ",");
            HashSet hashSet = new HashSet();
            for (String str2 : split) {
                try {
                    hashSet.add(Integer.valueOf(Integer.parseInt(str2)));
                } catch (NumberFormatException unused) {
                }
            }
            this.zzya = str;
            this.zzyb = hashSet;
        }
        return this.zzyb;
    }
}
