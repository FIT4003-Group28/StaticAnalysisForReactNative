package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
class zzm extends zzgh {
    private static final String ID = com.google.android.gms.internal.measurement.zza.ARBITRARY_PIXEL.toString();
    private static final String URL = com.google.android.gms.internal.measurement.zzb.URL.toString();
    private static final String zzavn = com.google.android.gms.internal.measurement.zzb.ADDITIONAL_PARAMS.toString();
    private static final String zzavo = com.google.android.gms.internal.measurement.zzb.UNREPEATABLE.toString();
    private static final String zzavp;
    private static final Set<String> zzavq;
    private final zza zzavr;
    private final Context zzqx;

    /* loaded from: classes.dex */
    public interface zza {
        zzbx zzmf();
    }

    static {
        String str = ID;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 17);
        sb.append("gtm_");
        sb.append(str);
        sb.append("_unrepeatable");
        zzavp = sb.toString();
        zzavq = new HashSet();
    }

    public zzm(Context context) {
        this(context, new zzn(context));
    }

    @VisibleForTesting
    private zzm(Context context, zza zzaVar) {
        super(ID, URL);
        this.zzavr = zzaVar;
        this.zzqx = context;
    }

    private final synchronized boolean zzcl(String str) {
        if (zzavq.contains(str)) {
            return true;
        }
        if (!this.zzqx.getSharedPreferences(zzavp, 0).contains(str)) {
            return false;
        }
        zzavq.add(str);
        return true;
    }

    @Override // com.google.android.gms.tagmanager.zzgh
    public final void zzf(Map<String, com.google.android.gms.internal.measurement.zzm> map) {
        String zzc = map.get(zzavo) != null ? zzgj.zzc(map.get(zzavo)) : null;
        if (zzc == null || !zzcl(zzc)) {
            Uri.Builder buildUpon = Uri.parse(zzgj.zzc(map.get(URL))).buildUpon();
            com.google.android.gms.internal.measurement.zzm zzmVar = map.get(zzavn);
            if (zzmVar != null) {
                Object zzh = zzgj.zzh(zzmVar);
                if (!(zzh instanceof List)) {
                    String valueOf = String.valueOf(buildUpon.build().toString());
                    zzdi.e(valueOf.length() != 0 ? "ArbitraryPixel: additional params not a list: not sending partial hit: ".concat(valueOf) : new String("ArbitraryPixel: additional params not a list: not sending partial hit: "));
                    return;
                }
                for (Object obj : (List) zzh) {
                    if (!(obj instanceof Map)) {
                        String valueOf2 = String.valueOf(buildUpon.build().toString());
                        zzdi.e(valueOf2.length() != 0 ? "ArbitraryPixel: additional params contains non-map: not sending partial hit: ".concat(valueOf2) : new String("ArbitraryPixel: additional params contains non-map: not sending partial hit: "));
                        return;
                    }
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        buildUpon.appendQueryParameter(entry.getKey().toString(), entry.getValue().toString());
                    }
                }
            }
            String uri = buildUpon.build().toString();
            this.zzavr.zzmf().zzcy(uri);
            String valueOf3 = String.valueOf(uri);
            zzdi.v(valueOf3.length() != 0 ? "ArbitraryPixel: url = ".concat(valueOf3) : new String("ArbitraryPixel: url = "));
            if (zzc == null) {
                return;
            }
            synchronized (zzm.class) {
                zzavq.add(zzc);
                zzft.zza(this.zzqx, zzavp, zzc, "true");
            }
        }
    }
}
