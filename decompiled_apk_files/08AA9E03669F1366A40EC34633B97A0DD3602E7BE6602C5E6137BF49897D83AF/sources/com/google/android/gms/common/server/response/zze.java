package com.google.android.gms.common.server.response;

import com.google.android.gms.common.server.response.FastParser;
import java.io.BufferedReader;
/* loaded from: classes.dex */
final class zze implements FastParser.zza<Boolean> {
    @Override // com.google.android.gms.common.server.response.FastParser.zza
    public final /* synthetic */ Boolean zzh(FastParser fastParser, BufferedReader bufferedReader) {
        boolean zza;
        zza = fastParser.zza(bufferedReader, false);
        return Boolean.valueOf(zza);
    }
}
