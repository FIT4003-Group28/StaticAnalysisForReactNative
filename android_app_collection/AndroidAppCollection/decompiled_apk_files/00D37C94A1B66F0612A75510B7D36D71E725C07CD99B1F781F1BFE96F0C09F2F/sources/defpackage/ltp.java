package defpackage;

import android.content.Context;
import com.google.android.libraries.backup.Backup;
/* compiled from: PG */
/* renamed from: ltp  reason: default package */
/* loaded from: classes3.dex */
public final class ltp {
    @Backup
    public static final String SPATIAL_AUDIO_MEALBAR_SHOWN = "spatial_audio_mealbar_shown";
    private static final amvn a = amvn.r(SPATIAL_AUDIO_MEALBAR_SHOWN);

    private ltp() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ltq a(vlq vlqVar, ltq ltqVar) {
        aopa mo52toBuilder = ltqVar.mo52toBuilder();
        if (vlqVar.e(SPATIAL_AUDIO_MEALBAR_SHOWN)) {
            boolean b = ymf.b(SPATIAL_AUDIO_MEALBAR_SHOWN, vlqVar);
            mo52toBuilder.copyOnWrite();
            ltq ltqVar2 = (ltq) mo52toBuilder.instance;
            ltqVar2.b |= 1;
            ltqVar2.c = b;
        }
        return (ltq) mo52toBuilder.mo39build();
    }

    public static yve b(Context context, azqb azqbVar, ankw ankwVar, String str, yke ykeVar) {
        return ymf.e("spatial_audio_mealbar_proto.pb", context, (vlk) azqbVar.get(), ankwVar, str, lto.a, ltq.a, a, ykeVar);
    }
}
