package defpackage;

import android.view.View;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: zze  reason: default package */
/* loaded from: classes4.dex */
final class zze implements View.OnClickListener {
    final /* synthetic */ arjf a;
    final /* synthetic */ aaar b;
    final /* synthetic */ zzf c;
    private final /* synthetic */ int d;

    public zze(arjf arjfVar, aaar aaarVar, zzf zzfVar) {
        this.a = arjfVar;
        this.b = aaarVar;
        this.c = zzfVar;
    }

    public zze(arjf arjfVar, zzf zzfVar, aaar aaarVar, int i) {
        this.d = i;
        this.a = arjfVar;
        this.c = zzfVar;
        this.b = aaarVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.d != 0) {
            if ((this.a.b & 2) == 0) {
                return;
            }
            HashMap hashMap = new HashMap(2);
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.a);
            hashMap.put("MacrosConverters.CustomConvertersKey", new afzn[]{this.c.j});
            aafo aafoVar = this.b.z;
            apzg apzgVar = this.a.d;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, hashMap);
        } else if ((this.a.b & 128) == 0 || !this.b.r) {
        } else {
            HashMap hashMap2 = new HashMap(2);
            hashMap2.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.a);
            hashMap2.put("MacrosConverters.CustomConvertersKey", new afzn[]{this.c.j});
            aafo aafoVar2 = this.b.z;
            apzg apzgVar2 = this.a.i;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            aafoVar2.c(apzgVar2, hashMap2);
        }
    }
}
