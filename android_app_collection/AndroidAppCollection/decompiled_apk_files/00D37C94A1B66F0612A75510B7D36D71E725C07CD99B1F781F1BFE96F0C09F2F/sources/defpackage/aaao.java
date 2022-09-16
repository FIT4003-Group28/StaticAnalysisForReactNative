package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aaao  reason: default package */
/* loaded from: classes.dex */
public final class aaao implements aaan {
    private final Map a;

    public aaao(Map map) {
        this.a = map;
    }

    @Override // defpackage.aaan
    public final yo a(Context context, ViewGroup viewGroup, zyz zyzVar, boolean z) {
        return ((aaan) this.a.get(zyzVar)).a(context, viewGroup, zyzVar, z);
    }

    @Override // defpackage.aaan
    public final void b(Context context, zza zzaVar, yo yoVar, aaar aaarVar) {
        ((aaan) this.a.get(zzaVar.b)).b(context, zzaVar, yoVar, aaarVar);
    }
}
