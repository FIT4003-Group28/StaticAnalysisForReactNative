package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: altp  reason: default package */
/* loaded from: classes.dex */
final class altp implements Runnable {
    final /* synthetic */ altv a;
    final /* synthetic */ altq b;

    public altp(altq altqVar, altv altvVar) {
        this.b = altqVar;
        this.a = altvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        altn altnVar = this.b.a;
        altv altvVar = this.a;
        List list = altvVar.a;
        List c = altq.c(altvVar.b);
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", 0);
        bundle.putInt("status", 5);
        bundle.putInt("error_code", 0);
        if (!list.isEmpty()) {
            bundle.putStringArrayList("module_names", new ArrayList<>(list));
        }
        if (!c.isEmpty()) {
            bundle.putStringArrayList("languages", new ArrayList<>(c));
        }
        bundle.putLong("total_bytes_to_download", 0L);
        bundle.putLong("bytes_downloaded", 0L);
        altnVar.f(altz.b(bundle));
    }
}
