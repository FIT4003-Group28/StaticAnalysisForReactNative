package com.google.android.gms.common.server.response;

import com.google.android.gms.common.server.response.FastParser;
import java.io.BufferedReader;
/* loaded from: classes.dex */
final class zzd implements FastParser.zza<Double> {
    @Override // com.google.android.gms.common.server.response.FastParser.zza
    public final /* synthetic */ Double zzh(FastParser fastParser, BufferedReader bufferedReader) {
        double zzh;
        zzh = fastParser.zzh(bufferedReader);
        return Double.valueOf(zzh);
    }
}
